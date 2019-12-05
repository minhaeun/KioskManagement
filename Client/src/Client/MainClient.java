package Client;

import Client.GUI.Kiosk;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MainClient {
    public static String UserID;
    public static void main(String[] args) {

//
//        JFrame kiosk = new Kiosk(null);
//
//        ((Kiosk) kiosk).addMenu("COFFEE","아메리카노",1500,1);
//
//        ((Kiosk) kiosk).addMenu("COFFEE","카페라떼",2000,1);
//
//        ((Kiosk) kiosk).addMenu("COFFEE","모카커피",2000,0);
//
//        ((Kiosk) kiosk).addMenu("COFFEE","카라멜마끼야또",2300,1);
//
//        ((Kiosk) kiosk).addMenu("COFFEE","흑당커피",2300,1);
//
//        ((Kiosk) kiosk).addMenu("COFFEE","룽고커피",2500,1);
//
//        ((Kiosk) kiosk).addMenu("COFFEE","제주 말차 샷 라떼",1000,0);
//        ((Kiosk) kiosk).addMenu("COFFEE","벌꿀라떼",2300,1);
//
//        ((Kiosk) kiosk).addMenu("COFFEE","콜드브루",2000,1);
//
//        ((Kiosk) kiosk).addMenu("COFFEE","americano",2000,1);
//
//        ((Kiosk) kiosk).addMenu("COFFEE","americano",2000,0);
//
//        ((Kiosk) kiosk).addMenu("COFFEE","americano",2000,1);
//
//        ((Kiosk) kiosk).addMenu("COFFEE","americano",2000,1);
//
//
//
//        ((Kiosk) kiosk).addMenu("BEVERAGE","밀크티",1500,1);
//
//        ((Kiosk) kiosk).addMenu("BEVERAGE","흑당밀크티",2000,1);
//
//        ((Kiosk) kiosk).addMenu("BEVERAGE","딸기요거트",2000,0);
//
//        ((Kiosk) kiosk).addMenu("BEVERAGE","봄딸기우유",2300,1);
//
//        ((Kiosk) kiosk).addMenu("BEVERAGE","애플망고요거트",2300,1);
//
//        ((Kiosk) kiosk).addMenu("BEVERAGE","룽고커피",2500,1);
//
//        ((Kiosk) kiosk).addMenu("BEVERAGE","에스프레소",1000,0);
//        ((Kiosk) kiosk).addMenu("BEVERAGE","벌꿀라떼",2300,1);
//
//        ((Kiosk) kiosk).addMenu("BEVERAGE","americano",2000,1);
//
//        ((Kiosk) kiosk).addMenu("BEVERAGE","americano",2000,1);
//
//        ((Kiosk) kiosk).addMenu("BEVERAGE","americano",2000,0);
//
//        ((Kiosk) kiosk).addMenu("BEVERAGE","americano",2000,1);
//
//        ((Kiosk) kiosk).addMenu("BEVERAGE","americano",2000,1);
//
//
//
//
//        ((Kiosk) kiosk).addMenu("ADE","구름에이드",1500,1);
//
//        ((Kiosk) kiosk).addMenu("ADE","열정에이드",2000,1);
//
//        ((Kiosk) kiosk).addMenu("ADE","자몽에이드",2000,0);
//
//        ((Kiosk) kiosk).addMenu("ADE","청포도에이드",2300,1);
//
//        ((Kiosk) kiosk).addMenu("ADE","흑당커피",2300,1);
//
//        ((Kiosk) kiosk).addMenu("ADE","룽고커피",2500,1);
//
//        ((Kiosk) kiosk).addMenu("ADE","에스프레소",1000,0);
//        ((Kiosk) kiosk).addMenu("ADE","벌꿀라떼",2300,1);
//
//        ((Kiosk) kiosk).addMenu("ADE","americano",2000,1);
//
//        ((Kiosk) kiosk).addMenu("ADE","americano",2000,1);
//
//        ((Kiosk) kiosk).addMenu("ADE","americano",2000,0);
//
//        ((Kiosk) kiosk).addMenu("ADE","americano",2000,1);
//
//        ((Kiosk) kiosk).addMenu("ADE","americano",2000,1);
//
//
//
//
//        ((Kiosk) kiosk).addMenu("BUBBLE","흑당버블티",1500,1);
//
//        ((Kiosk) kiosk).addMenu("BUBBLE","타로버블티",2000,1);
//
//        ((Kiosk) kiosk).addMenu("BUBBLE","초코버블티",2000,0);
//
//        ((Kiosk) kiosk).addMenu("BUBBLE","말차버블티",2300,1);
//
//        ((Kiosk) kiosk).addMenu("BUBBLE","오레오초코버블",2300,1);
//
//        ((Kiosk) kiosk).addMenu("BUBBLE","룽고커피",2500,1);
//
//        ((Kiosk) kiosk).addMenu("BUBBLE","에스프레소",1000,0);
//        ((Kiosk) kiosk).addMenu("BUBBLE","벌꿀라떼",2300,1);
//
//        ((Kiosk) kiosk).addMenu("BUBBLE","americano",2000,1);
//
//        ((Kiosk) kiosk).addMenu("BUBBLE","americano",2000,1);
//
//        ((Kiosk) kiosk).addMenu("BUBBLE","americano",2000,0);
//
//        ((Kiosk) kiosk).addMenu("BUBBLE","americano",2000,1);
//
//        ((Kiosk) kiosk).addMenu("BUBBLE","americano",2000,1);
//
//
//        kiosk.setVisible(true);


        try {
            Socket c_socket = new Socket("127.0.0.1", 8888);//연결 시도

            Kiosk kiosk = new Kiosk(c_socket);
            kiosk.setVisible(true);

            ReceiveThread rec_thread = new ReceiveThread();
            rec_thread.setSocket(c_socket);
            rec_thread.setKiosk(kiosk);
            rec_thread.start();



         }catch (UnknownHostException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }



    }
}
