import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.SocketException;
import java.util.ArrayList;

public class ClientManagerThread extends Thread {
    //해당 소켓과 그 소켓의 채팅 ID를 변수로 사용
    private Socket m_socket;
    private String m_ID;
    private Database database;


    public void sendMessage(String message){
        try {
            PrintWriter pw = new PrintWriter(m_socket.getOutputStream());
            pw.println(message);
            pw.flush();
        }catch(Exception e){}
    }

    public String STATE() throws Exception {
        return "STATE/" + (database.isOpen() ? 1:0);
    }

    public void SendMessageAll(String message){
        ArrayList<PrintWriter> arr = MainServer.m_OutputList;
        for(int i=0;i<MainServer.m_OutputList.size();i++){
            arr.get(i).println(message);
            arr.get(i).flush();
        }
    }
    public void run(){
        super.run();

        try {
            sendMessage(database.getMenuList());
            sendMessage(STATE());
            sendMessage("TITLE/Kiosk " + MainServer.m_OutputList.size());
            BufferedReader tmpbuffer = new BufferedReader(new InputStreamReader(m_socket.getInputStream()));

            String text;
            String message;


            while (true) {
                text = tmpbuffer.readLine();
               // System.out.println("Received : " + text);
                if (text == null) {
                    System.out.println("종료됨");
                }
//                //해당 소켓이 나갔는지 안나갔는지 체크
//                if (text == null) {
//                   // System.out.println(m_ID + "이(가) 나갔습니다.");
//                    //특정 ID가 나갔다는 것을 모든 클라이언트에게 알려줌
//                    //m_OutputList 사용 이유 : 한 클라이언트의 메시지를 다른 클라이언트들에게 전달하기 위함
//                    for (int i = 0; i < MainServer.m_OutputList.size(); ++i) {
//                        MainServer.m_OutputList.get(i).println(m_ID + "이(가) 나갔습니다.");
//                        MainServer.m_OutputList.get(i).flush();
//                    }
//                    break;
//                }
                //해당 클라이언트가 입장했다고 체크

                String[] split = text.split("/");


                if (split[0].equals("PAYMENT_LIST")) {
                    sendMessage(database.getPaymentList());
                } else if (split[0].equals("OPEN")) {
                    message = database.open();
                    sendMessage(message);
                    SendMessageAll(STATE());
                    System.out.println("open message");
                } else if (split[0].equals("CLOSE")) {
                    message = database.close();
                    sendMessage(message);
                    SendMessageAll(STATE());
                } else if (split[0].equals("PAY")) {
                    Boolean success = true;
                    for (int i = 2; i < split.length; i++) {
                        if (database.getActiv(split[i]) == 0) {
                            success = false;
                            break;
                        }
                    }
                    if (success) {
                        String[] data = split[1].split(",");
                        database.pay(data[0], Integer.parseInt(data[1]));
                        SendMessageAll(database.getPaymentList());
                        sendMessage("PAY/success");
                    } else {
                        sendMessage("PAY/failed");
                    }
                    SendMessageAll(database.closeUpDetails());
                } else if (split[0].equals("CANCEL")) {
                    database.cancel(Integer.parseInt(split[1]));
                    SendMessageAll(database.getPaymentList());
                    SendMessageAll(database.closeUpDetails());
                } else if (split[0].equals("USE")) {
                    String[] info = split[1].split(",");
                    database.setActivMenu(info[0], info[1], Integer.parseInt(info[2]));
                    SendMessageAll(text);
                } else if (split[0].equals("EXIT")) {
                    SendMessageAll(text);
                } else if (split[0].equals("CLOSEMSG")) {
                    sendMessage(database.closeUpDetails());
                } else if (split[0].equals("STATE")) {
                    sendMessage(STATE());
                } else if (split[0].equals("ADMINCHK")) {
                    sendMessage(database.adminchk(split[1]));
                } else if (split[0].equals("PASSWORD")) {
                    database.setPassword(split[1]);
                }


//                if (split.length == 2 && split[0].equals("ID")) {
//                    //iD알려줌
//                    m_ID = split[1];
//                    System.out.println(m_ID + "이(가) 입장했습니다.");
//                    //모든 클라이언트에게 해당 ID가 입장했다고 알려줌
//                    for (int i = 0; i < MainServer.m_OutputList.size(); ++i) {
//                        MainServer.m_OutputList.get(i).println(m_ID + "이(가) 입장하였습니다.");
//                        MainServer.m_OutputList.get(i).flush();
//                    }
//                    continue;
//                }
//                //그 밖의 나머니 일반 메시지를 모든 클라이언트에 전달
//                for (int i = 0; i < MainServer.m_OutputList.size(); ++i) {
//                    MainServer.m_OutputList.get(i).println(m_ID + "> " + text);
//                    MainServer.m_OutputList.get(i).flush();
//                }
            }
            //스레드가 종료하면 m_OutputList에서 해당 소켓의 OutputStream을 제거하고 소켓 닫음
            //     MainServer.m_OutputList.remove(new PrintWriter(m_socket.getOutputStream()));
            //   m_socket.close();
            }catch(SocketException soe){
                // 무시.
            }catch(Exception e){
                e.printStackTrace();
            }
        }

        public void PAYMENT_LIST(){
            String message;
            message =  database.getPaymentList();
            sendMessage(message);
            System.out.println("PAYMENT_LIST패킷 생성해서 m_socket에 전송");
        }
        public void setDatabase(Database database){
            this.database = database;
        }
        public void setSocket(Socket _socket){
            m_socket = _socket;
        }
    }
