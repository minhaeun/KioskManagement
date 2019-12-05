import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.*;
import java.util.ArrayList;
import java.io.IOException;
import java.util.Calendar;

public class MainServer {
    public static ArrayList<PrintWriter> m_OutputList;

   public static void main(String[] args){
       // 서버로 접속하는 클라이언트의 "Output"을 모아둔 배열
       m_OutputList = new ArrayList<PrintWriter>();
        try{
            Database db = new Database();
            db.connect();

            ServerSocket s_socket = new ServerSocket(8888);
            //ServerSocket은 클라이언트 연결요청이 있을 때까지 대기

            while(true) {

                Socket c_socket = s_socket.accept();    //c_socket이 클라이언트와 1:1 연결된 소켓
                //수신쓰레드 생성, 소켓 전달
                ClientManagerThread c_thread = new ClientManagerThread();
                //ReceiveThread rec_thread = new ReceiveThread();
                c_thread.setDatabase(db);
                c_thread.setSocket(c_socket);
                //송신쓰레드 생성, 소켓 전달
               // SendThread send_thread = new SendThread();
                //send_thread.setSocket(c_socket);

                //클라이언트가 접속하게 되면, 클라이언트의 "OutputStream"만 이 객체에 모아둠둠
               m_OutputList.add(new PrintWriter(c_socket.getOutputStream()));

                //실행
                c_thread.start();
            //send_thread.start();

            }
        }catch(IOException e){
            e.printStackTrace();
        }


   }
}
