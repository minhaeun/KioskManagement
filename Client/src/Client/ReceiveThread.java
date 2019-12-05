package Client;

import Client.GUI.Kiosk;
import Client.GUI.MenuItem;
import Client.GUI.MenuManagementItem;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.HashMap;

public class ReceiveThread extends Thread{

    private Socket m_Socket;
    Kiosk kiosk;
   Category category;
    public void run(){
        super.run();

        try{
            BufferedReader tmpbuf = new BufferedReader(new InputStreamReader(m_Socket.getInputStream()));

            String receiveString;
            String[] split;

            //MENU_LIST/COFFEE,americano,1500/
            while(true) {
                receiveString = tmpbuf.readLine();
                split = receiveString.split("/");
                String flag = split[0];
                if (flag.equals("MENU_LIST")) {
                    for (int i = 1; i < split.length; i++) {
                        String[] info = split[i].split(",");
                        kiosk.addMenu(info[0], info[1], Integer.parseInt(info[2]), Integer.parseInt(info[3]));
                    }
                    kiosk.getPanel_menu_coffee().repaint();
                } else if(flag.equals("TITLE")){
                    kiosk.setTitle(split[1]);
                }else if (flag.equals("USE")) {
                    String[] info  = split[1].split(",");

                    MenuItem item = kiosk.menus.get(info[1]);
                    item.setActiv_num(Integer.parseInt(info[2]));

                    Component[] comp = kiosk.getPanel_menuManagement().getComponents();
                    for(Component c: comp){
                        ((MenuManagementItem)c).setData(info[0],info[1],Integer.parseInt(info[2]));
                    }
                //add 하면 "준비중"이라는 말 없애기 & 버튼 활성화
                }else if(flag.equals("CLOSE")) {
                    String[] info = split[1].split(",");
                    if(info[0].equals("already")){
                            JOptionPane.showMessageDialog(kiosk.getManager(),"이미 업무 마감 : "+ info[1],"알림",JOptionPane.WARNING_MESSAGE);
                        //이미 마감했음을 알려줌
                    }else{
                        String closetime = info[1];
                        kiosk.getPanel_closeUp().setVisible(true);
                        JOptionPane.showMessageDialog(kiosk.getManager(),"업무 마감 완료 : "+ closetime,"알림", JOptionPane.INFORMATION_MESSAGE);
                        //closetime 띄우고 업무 마감
                    }
                }else if(flag.equals("OPEN")) {
                    String[] info = split[1].split(",");
                    if(info[0].equals("already")){
                        JOptionPane.showMessageDialog(kiosk.getManager(),"이미 업무 개시 : "+ info[1],"알림",JOptionPane.WARNING_MESSAGE);
                        // 이미 업무개시시작했음을 알려줌
                    }else{
                        String opentime = info[1];
                        JOptionPane.showMessageDialog(kiosk.getManager(),"업무 개시 완료 : "+ opentime,"알림",JOptionPane.INFORMATION_MESSAGE);
                        // opentime 띄우고 업무개시 시작
                    }
                }else if(flag.equals("PAYMENT_LIST")) {
                    DefaultTableModel model = kiosk.getTableModel();
                    for (int i = model.getRowCount() - 1; i >= 0; i--) {
                        model.removeRow(i);
                    }

                    for (int i = 1; i < split.length; i++) {
                        // pno, cno, price, paymenttime, canceltime
                        String[] info = split[i].split(",");
                        model.addRow(info);
                    }
                    //표에추가
                }else if(flag.equals("EXIT")){
                    //모든 클라이언트 종료
                    System.exit(0);
                }else if(flag.equals("CLOSEMSG")){
                    String[] info = split[1].split(",");
                    kiosk.getLabel_total().setText(info[0]);
                    kiosk.getLabel_cancel().setText(info[1]);
                    kiosk.getLabel_real().setText(info[2]);
                    kiosk.getLabel_paymentCount().setText(info[3]);
                    kiosk.getLabel_cancelCount().setText(info[4]);
                } else if(flag.equals("STATE")){
                    kiosk.setState(Integer.parseInt(split[1]) == 1 ? true :false);
                } else if(flag.equals("ADMINCHK")){ // 관리자 비밀번호 확인 메세지
                    if(Integer.parseInt(split[1]) == 1){
                        kiosk.getPanel_managerLogin().setVisible(false);
                        kiosk.getPanel_managerMenu().setVisible(true);
                    } else {
                        kiosk.getManager().setVisible(false);
                        kiosk.showSystemCheck();
                    }
                    kiosk.getPasswordField1().setText("");
                }else if(flag.equals("PAY")){
                    if(split[1].equals("success")){
                        kiosk.getLabel_complete().setText("결제에 성공했습니다.");
                    }  else {
                        kiosk.getLabel_complete().setText("결제에 실패했습니다.");
                    }
                }

                // ADMINCHK/1,0
                //메시지를 받아왔을 때 해당 메시지의 ID가 자기 자신이라면 콘솔창에 출력을 막아줌
                //자기자신이 쓴 메시지를 서버에 보내고 서버에서는 모든 클라이언트에게 전달하기 때문에 다시 돌려받음
                //그러므로 자기자신의 메시지는 뿌려줄 필요가 없음에 걸러줌

//                split = receiveString.split(">");
//                if(split.length >= 2 && split[0].equals(MainClient.UserID)){
//                    continue;
//                }

              //  System.out.println(receiveString);
            }
        }catch(IOException e){

        }
    }

    public void setKiosk(Kiosk _kiosk){
        kiosk = _kiosk;
    }
    public void setSocket(Socket _socket){
        m_Socket = _socket;
    }
}
