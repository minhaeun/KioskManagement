/*
 * Created by JFormDesigner on Thu Nov 14 22:15:20 KST 2019
 */

package Client.GUI;

import javax.swing.table.*;
import Client.Category;
import javafx.beans.property.IntegerProperty;

import java.awt.*;
import java.awt.event.*;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.HashMap;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;

/**
 * @author minhaeun
 */

public class Kiosk extends JFrame {
    public boolean state = false;
    private Socket socket;
    public HashMap<String, JPanel> panels = new HashMap<>();
    public HashMap<String, Category> categories = new HashMap<>();
    public HashMap<String, MenuItem> menus = new HashMap<>();

    public DefaultTableModel getTableModel(){
        return (DefaultTableModel)table_payment.getModel();
    }

    int orderitem_y = 0;
    public Kiosk(Socket socket) {
        this.socket = socket;
        initComponents();
        categories.put("COFFEE",new Category("COFFEE"));
        categories.put("BEVERAGE", new Category("BEVERAGE"));
        categories.put("ADE", new Category("ADE"));
        categories.put("BUBBLE", new Category("BUBBLE"));

        panels.put("COFFEE", panel_menu_coffee);
        panels.put("BEVERAGE", panel_menu_beverage);
        panels.put("ADE", panel_menu_ade);
        panels.put("BUBBLE", panel_menu_bubble);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        try{
            MaskFormatter mf = new MaskFormatter("####-####-####-####");
            DefaultFormatterFactory formatter = new DefaultFormatterFactory(mf);
            textField_cardnum.setFormatterFactory(formatter);

        } catch(Exception e){

        }

    }

    public void setState(Boolean state){
        this.state = state;
        showSystemCheck();
    }

    public Socket getSocket() {
        return socket;
    }

    public HashMap<String, JPanel> getPanels() {
        return panels;
    }

    public HashMap<String, Category> getCategories() {
        return categories;
    }

    public HashMap<String, MenuItem> getMenus() {
        return menus;
    }

    public int getOrderitem_y() {
        return orderitem_y;
    }

    public JPanel getManager() {
        return manager;
    }

    public JPanel getPanel_managerLogin() {
        return panel_managerLogin;
    }

    public JLabel getLabel_password() {
        return label_password;
    }

    public JPasswordField getPasswordField1() {
        return passwordField1;
    }

    public JButton getButton_OK() {
        return button_OK;
    }

    public JPanel getPanel_managerMenu() {
        return panel_managerMenu;
    }

    public JLabel getLabel2() {
        return label2;
    }

    public JButton getButton_log() {
        return button_log;
    }

    public JButton getButton_closeUp() {
        return button_closeUp;
    }

    public JButton getButton_showMenu() {
        return button_showMenu;
    }

    public JButton getButton_menuManagement() {
        return button_menuManagement;
    }

    public JButton getButton_start() {
        return button_start;
    }

    public JPanel getPanel_payment() {
        return panel_payment;
    }

    public JScrollPane getScrollPane_payment() {
        return scrollPane_payment;
    }

    public JTable getTable_payment() {
        return table_payment;
    }

    public JScrollPane getScrollPane_menuManagement() {
        return scrollPane_menuManagement;
    }

    public JPanel getPanel_menuManagement() {
        return panel_menuManagement;
    }

    public JPanel getPanel_closeUp() {
        return panel_closeUp;
    }

    public JButton getButton_end() {
        return button_end;
    }

    public JButton getButton_realCloseUp() {
        return button_realCloseUp;
    }

    public JLabel getLabel5() {
        return label5;
    }

    public JLabel getLabel10() {
        return label10;
    }

    public JLabel getLabel_total() {
        return label_total;
    }

    public JLabel getLabel_cancel() {
        return label_cancel;
    }

    public JLabel getLabel6() {
        return label6;
    }

    public JLabel getLabel_real() {
        return label_real;
    }

    public JLabel getLabel7() {
        return label7;
    }

    public JLabel getLabel_paymentCount() {
        return label_paymentCount;
    }

    public JLabel getLabel8() {
        return label8;
    }

    public JLabel getLabel_cancelCount() {
        return label_cancelCount;
    }

    public JLabel getLabel9() {
        return label9;
    }

    public JPanel getShowMenu() {
        return showMenu;
    }

    public JRadioButton getRadioButton_hot() {
        return radioButton_hot;
    }

    public JRadioButton getRadioButton_ice() {
        return radioButton_ice;
    }

    public JLabel getLabel_hot_ice() {
        return label_hot_ice;
    }

    public JLabel getLabel_amount() {
        return label_amount;
    }

    public JSpinner getSpinner_amount() {
        return spinner_amount;
    }

    public JButton getButton_finish() {
        return button_finish;
    }

    public JLabel getLabel_option() {
        return label_option;
    }

    public JCheckBox getCheckBox_addshot() {
        return checkBox_addshot;
    }

    public JCheckBox getCheckBox_addsysrup() {
        return checkBox_addsysrup;
    }

    public JCheckBox getCheckBox_addbubble() {
        return checkBox_addbubble;
    }

    public JButton getButton_cancel() {
        return button_cancel;
    }

    public JLabel getLabel_image() {
        return label_image;
    }

    public JLabel getLabel_name() {
        return label_name;
    }

    public JLabel getLabel_price() {
        return label_price;
    }

    public JPanel getPanel_showPayment() {
        return panel_showPayment;
    }

    public JLabel getLabel3() {
        return label3;
    }

    public JTextField getTextField1() {
        return textField_cardnum;
    }

    public JButton getButton_pay2() {
        return button_pay2;
    }

    public JLabel getLabel4() {
        return label4;
    }

    public JLabel getLabel_totalPrice() {
        return label_totalPrice;
    }

    public JButton getButton_back() {
        return button_back;
    }

    public JScrollPane getScrollPane_coffee() {
        return scrollPane_coffee;
    }

    public JPanel getPanel_menu_coffee() {
        return panel_menu_coffee;
    }

    public JScrollPane getScrollPane_order() {
        return scrollPane_order;
    }

    public JPanel getPanel_order() {
        return panel_order;
    }

    public JButton getButton_pay() {
        return button_pay;
    }

    public JButton getButton_delete() {
        return button_delete;
    }

    public JLabel getLabel1() {
        return label1;
    }

    public JPanel getPanel_category() {
        return panel_category;
    }

    public JButton getButton_COFFEE() {
        return button_COFFEE;
    }

    public JButton getButton_BEVERAGE() {
        return button_BEVERAGE;
    }

    public JButton getButton_ADE() {
        return button_ADE;
    }

    public JButton getButton_BUBBLE() {
        return button_BUBBLE;
    }

    public JScrollPane getScrollPane_beverage() {
        return scrollPane_beverage;
    }

    public JPanel getPanel_menu_beverage() {
        return panel_menu_beverage;
    }

    public JScrollPane getScrollPane_ade() {
        return scrollPane_ade;
    }

    public JPanel getPanel_menu_ade() {
        return panel_menu_ade;
    }

    public JScrollPane getScrollPane_bubble() {
        return scrollPane_bubble;
    }

    public JPanel getPanel_menu_bubble() {
        return panel_menu_bubble;
    }

    public JLabel getLabel_gomanager() {
        return label_gomanager;
    }

    public JPanel getPanel_paymentComplete() {
        return panel_paymentComplete;
    }

    public JLabel getLabel_complete() {
        return label_complete;
    }

    public JButton getButton_close() {
        return button_close;
    }

    public void getPanel_menuDetails() {


    }

    public void setPanel_menuDetails(MenuItem menuItem){

        panel_menuDetails.setVisible(true);
        menuItem.setVisible(true);
        label_image.setIcon(menuItem.getMenuIcon());
         label_name.setText(menuItem.getName());
        label_price.setText(""+menuItem.getPrice());
        button_pay.setVisible(false);
        button_delete.setVisible(false);
    }


    private void button_COFFEEMouseClicked(MouseEvent e) {
        scrollPane_coffee.setVisible(true);
        scrollPane_ade.setVisible(false);
        scrollPane_bubble.setVisible(false);
        scrollPane_beverage.setVisible(false);
        showMenu.validate();

        // TODO add your code here
    }
    //void addMenu()
    //void disableMenu()
    //void enableMenu() { this.showMenu.enableMenu()

    public void addMenu(String category, String name, int price, int activ_num){
        Category c = categories.get(category);
        MenuItem newMenu = new MenuItem(this);
        newMenu.setMenu(name, price, activ_num);
        int n = c.count();
        int x = n % 3;
        int y = n / 3;
        newMenu.setSize(245,160);
        newMenu.setLocation(20+245*x, 160*y);
        c.addMenu(name,price, activ_num);
        menus.put(name, newMenu);
        JPanel p = panels.get(category);
        p.add(newMenu);
        p.setPreferredSize(new Dimension(p.getWidth(), 160*(y+1)));

        MenuManagementItem menuManagementItem = new MenuManagementItem(this);
        menuManagementItem.setMenuManagementItem(category,name, activ_num);
        menuManagementItem.setSize(700,110);
        menuManagementItem.setLocation(0,panel_menuManagement.getComponentCount()*110);
        panel_menuManagement.add(menuManagementItem);
        panel_menuManagement.setPreferredSize(new Dimension(panel_menuManagement.getWidth(), panel_menuManagement.getComponentCount()*110));

    }



    public void addOrder(String name, int amount, boolean temperature, String option, int price){
        OrderItem  orderItem = new OrderItem();
        orderItem.setOrderItem(name, amount, temperature, option, price);
        panel_order.setVisible(true);
        panel_menuDetails.setVisible(false);


        orderItem.setSize(350, 115);
        orderItem.setLocation(0,120*panel_order.getComponentCount());
        panel_order.setPreferredSize(new Dimension(panel_order.getWidth(), 120*(panel_order.getComponentCount()+1)));
        panel_order.add(orderItem);
        button_delete.setVisible(true);
        button_pay.setVisible(true);
    }

    private void button_BEVERAGEMouseClicked(MouseEvent e) {
//        panel_menu_coffee.setVisible(false);
        scrollPane_coffee.setVisible(false);
        scrollPane_ade.setVisible(false);
        scrollPane_bubble.setVisible(false);
        scrollPane_beverage.setVisible(true);
        showMenu.validate();


        // TODO add your code here
    }

    private void button_ADEMouseClicked(MouseEvent e) {
        scrollPane_coffee.setVisible(false);
        scrollPane_ade.setVisible(true);
        scrollPane_bubble.setVisible(false);
        scrollPane_beverage.setVisible(false);
        showMenu.validate();

        // TODO add your code here
    }

    private void button_BUBBLEMouseClicked(MouseEvent e) {
        scrollPane_coffee.setVisible(false);
        scrollPane_ade.setVisible(false);
        scrollPane_bubble.setVisible(true);
        scrollPane_beverage.setVisible(false);
        showMenu.validate();
        // TODO add your code here
    }

    public void resetDetail(){

        radioButton_hot.setSelected(true);
        spinner_amount.setValue(1);
        checkBox_addbubble.setSelected(false);
        checkBox_addshot.setSelected(false);
        checkBox_addsysrup.setSelected(false);
   }

    public void button_cancelMouseClicked(MouseEvent e) {
        panel_menuDetails.setVisible(false);
        button_delete.setVisible(true);
        button_pay.setVisible(true);
        resetDetail();
        // TODO add your code here

    }

    private void button_finishMouseClicked(MouseEvent e) {
        //저장
       // button_cancelMouseClicked(e);
        String option = "";
        String name = label_name.getText();
        int originalPrice = Integer.parseInt(label_price.getText());
        int optionPrice = 0;
        optionPrice += checkBox_addbubble.isSelected() ? 600:0;
        optionPrice += checkBox_addsysrup.isSelected() ? 500:0;
        optionPrice += checkBox_addshot.isSelected() ? 400:0;
        int price = (originalPrice + optionPrice) * (Integer)spinner_amount.getValue();
        if(checkBox_addshot.isSelected())
            option += "+ 샷추가 ";
        if(checkBox_addsysrup.isSelected())
            option += "+ 시럽추가 ";
        if(checkBox_addbubble.isSelected())
            option += "+ 펄추가 ";

        addOrder(name,(Integer)spinner_amount.getValue(), radioButton_hot.isSelected(), option, price);
        // TODO add your code here
    }

    private void button_payMouseClicked(MouseEvent e) {
        int price=0;
        Component[] components = panel_order.getComponents();
        for(Component component : components){
            price += ((OrderItem)component).price;
        }
        if(price == 0){
            return;
        }
        scrollPane_order.setVisible(false);
        panel_showPayment.setVisible(true);
        button_delete.setVisible(false);
        button_pay.setVisible(false);
        label_totalPrice.setText(price + "");
        // TODO add your code here
    }

    private void button_deleteMouseClicked(MouseEvent e) {
        panel_order.removeAll();
        panel_order.revalidate();
        panel_order.repaint();
        // TODO add your code here
    }

    private void button_pay2MouseClicked(MouseEvent e) {
        if(textField_cardnum.getValue() == null){
            JOptionPane.showMessageDialog(this, "카드번호를 확인해주세요.");
        } else {
            panel_showPayment.setVisible(false);
            panel_paymentComplete.setVisible(true);
            button_delete.setVisible(false);
            button_pay.setVisible(false);

            String message = "PAY/" + textField_cardnum.getValue() +"," + Integer.parseInt(this.label_totalPrice.getText());

            Component[] comps = panel_order.getComponents();
            for(Component comp : comps){
                OrderItem o = (OrderItem)comp;
                message += "/" + o.name;
            }

            // PAY/cardnum,totalprice/아메리카노/카페라뗴
            SendMessage(message);
            textField_cardnum.setValue(null);

        }
        // TODO add your code here
    }

    private void button_closeMouseClicked(MouseEvent e) {
        panel_paymentComplete.setVisible(false);
        scrollPane_order.setVisible(true);
        button_delete.setVisible(true);
        button_pay.setVisible(true);
        panel_order.removeAll();
        panel_order.revalidate();
        panel_order.repaint();
        // TODO add your code here
    }

    private void button_backMouseClicked(MouseEvent e) {
        scrollPane_order.setVisible(true);
        panel_showPayment.setVisible(false);
        button_delete.setVisible(true);
        button_pay.setVisible(true);

        // TODO add your code here
    }

    public void label_gomanagerMouseClicked(MouseEvent e) {
        panel_kioskmanagement.setVisible(false);
        showMenu.setVisible(false);
        manager.setVisible(true);
        panel_managerLogin.setVisible(true);
        panel_managerMenu.setVisible(false);
        scrollPane_menuManagement.setVisible(false);
        panel_closeUp.setVisible(false);
        panel_payment.setVisible(false);
        // TODO add your code here
    }

    private void button_OKMouseClicked(MouseEvent e) {
        this.SendMessage("ADMINCHK/" + passwordField1.getText());
        // TODO add your code here
    }
    public void showSystemCheck(){
        panel_systemcheck.setVisible(!this.manager.isVisible() && !this.state);
        showMenu.setVisible(!this.manager.isVisible() && !panel_systemcheck.isVisible());
    }
    private void button3MouseClicked(MouseEvent e) {
        manager.setVisible(false);
        showMenu.setVisible(true);
        showSystemCheck();
        // TODO add your code here
    }


    private void button_menuManagementMouseClicked(MouseEvent e) {
        panel_closeUp.setVisible(false);
        panel_payment.setVisible(false);
        scrollPane_menuManagement.setVisible(true);
        panel_menuManagement.setVisible(true);

        // TODO add your code here


    }

    private void button_endMouseClicked(MouseEvent e) {
        this.SendMessage("EXIT");
        //System.exit(0);
        // TODO add your code here
    }

    private void button_closeUpMouseClicked(MouseEvent e) {
        panel_closeUp.setVisible(true);
        panel_menuManagement.setVisible(false);
        scrollPane_menuManagement.setVisible(false);
        panel_payment.setVisible(false);
        panel_kioskmanagement.setVisible(false);
        this.SendMessage("CLOSEMSG");
        // TODO add your code here
    }

    private void button_logMouseClicked(MouseEvent e) {

        panel_payment.setVisible(true);
        panel_closeUp.setVisible(false);
        panel_menuManagement.setVisible(false);
        scrollPane_menuManagement.setVisible(false);
        table_payment.setVisible(true);
        panel_kioskmanagement.setVisible(false);
        SendMessage("PAYMENT_LIST");

        // TODO add your code here
    }

    public void SendMessage(String message){
        try {
            PrintWriter pw = new PrintWriter(socket.getOutputStream());
            pw.println(message);
            pw.flush();
        }catch(IOException ioe) {
            ioe.printStackTrace();
        }
    }
    private void button_realCloseUpMouseClicked(MouseEvent e) {
        // TODO add your code here
        String message = "CLOSE";
        SendMessage(message);
    }

    private void button_startMouseClicked(MouseEvent e) {
        String message = "OPEN";
        SendMessage(message);
        // TODO add your code here
    }

    private void button_paymentcancelMouseClicked(MouseEvent e) {
        try {

            int row = table_payment.getSelectedRow();
            DefaultTableModel model = (DefaultTableModel)table_payment.getModel();
            int pno = Integer.parseInt(model.getValueAt(row, 0).toString());
            SendMessage("CANCEL/" + pno);
        } catch (Exception ee){

        }
        // TODO add your code here
    }

    private void button_kioskmanagementMouseClicked(MouseEvent e) {
        panel_kioskmanagement.setVisible(true);
        panel_payment.setVisible(false);
        panel_closeUp.setVisible(false);
        panel_menuManagement.setVisible(false);
        scrollPane_menuManagement.setVisible(false);

        passwordField_newpassword.setText("");
        passwordField_check.setText("");
        // TODO add your code here
    }

    private void button_changeMouseClicked(MouseEvent e) {
        String password1 = passwordField_newpassword.getText();
        String password2 = passwordField_check.getText();
        if(password1.equals(password2)){
            SendMessage("PASSWORD/" + password1);
            passwordField_newpassword.setText("");
            passwordField_check.setText("");
            JOptionPane.showMessageDialog(this,"비밀번호가 변경되었습니다.","알림",JOptionPane.INFORMATION_MESSAGE);
        }else {
            JOptionPane.showMessageDialog(this,"비밀번호가 다릅니다.","알림",JOptionPane.ERROR_MESSAGE);
        }
        // TODO add your code here
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - minhaeun
        manager = new JPanel();
        panel_managerLogin = new JPanel();
        label_password = new JLabel();
        passwordField1 = new JPasswordField();
        button_OK = new JButton();
        panel_managerMenu = new JPanel();
        label2 = new JLabel();
        button_log = new JButton();
        button_closeUp = new JButton();
        button_showMenu = new JButton();
        button_menuManagement = new JButton();
        button_start = new JButton();
        button_kioskmanagement = new JButton();
        panel_payment = new JPanel();
        scrollPane_payment = new JScrollPane();
        table_payment = new JTable();
        button_paymentcancel = new JButton();
        scrollPane_menuManagement = new JScrollPane();
        panel_menuManagement = new JPanel();
        panel_closeUp = new JPanel();
        button_end = new JButton();
        button_realCloseUp = new JButton();
        label5 = new JLabel();
        label10 = new JLabel();
        label_total = new JLabel();
        label_cancel = new JLabel();
        label6 = new JLabel();
        label_real = new JLabel();
        label7 = new JLabel();
        label_paymentCount = new JLabel();
        label8 = new JLabel();
        label_cancelCount = new JLabel();
        label9 = new JLabel();
        panel_kioskmanagement = new JPanel();
        label_newpassword = new JLabel();
        label_check = new JLabel();
        button_change = new JButton();
        passwordField_newpassword = new JPasswordField();
        passwordField_check = new JPasswordField();
        showMenu = new JPanel();
        panel_menuDetails = new JPanel();
        radioButton_hot = new JRadioButton();
        radioButton_ice = new JRadioButton();
        label_hot_ice = new JLabel();
        label_amount = new JLabel();
        spinner_amount = new JSpinner();
        button_finish = new JButton();
        label_option = new JLabel();
        checkBox_addshot = new JCheckBox();
        checkBox_addsysrup = new JCheckBox();
        checkBox_addbubble = new JCheckBox();
        button_cancel = new JButton();
        label_image = new JLabel();
        label_name = new JLabel();
        label_price = new JLabel();
        panel_showPayment = new JPanel();
        label3 = new JLabel();
        textField_cardnum = new JFormattedTextField();
        button_pay2 = new JButton();
        label4 = new JLabel();
        label_totalPrice = new JLabel();
        button_back = new JButton();
        label_totalPrice2 = new JLabel();
        scrollPane_coffee = new JScrollPane();
        panel_menu_coffee = new JPanel();
        scrollPane_order = new JScrollPane();
        panel_order = new JPanel();
        button_pay = new JButton();
        button_delete = new JButton();
        label1 = new JLabel();
        panel_category = new JPanel();
        button_COFFEE = new JButton();
        button_BEVERAGE = new JButton();
        button_ADE = new JButton();
        button_BUBBLE = new JButton();
        scrollPane_beverage = new JScrollPane();
        panel_menu_beverage = new JPanel();
        scrollPane_ade = new JScrollPane();
        panel_menu_ade = new JPanel();
        scrollPane_bubble = new JScrollPane();
        panel_menu_bubble = new JPanel();
        label_gomanager = new JLabel();
        panel_paymentComplete = new JPanel();
        label_complete = new JLabel();
        button_close = new JButton();
        panel_systemcheck = new JPanel();
        label11 = new JLabel();
        label_gomanager2 = new JLabel();

        //======== this ========
        setFocusable(false);
        setResizable(false);
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        //======== manager ========
        {
            manager.setVisible(false);
            manager.setLayout(null);

            //======== panel_managerLogin ========
            {
                panel_managerLogin.setFont(new Font("\ub9d1\uc740 \uace0\ub515", Font.BOLD, 30));
                panel_managerLogin.setVisible(false);
                panel_managerLogin.setLayout(null);

                //---- label_password ----
                label_password.setText("\uad00\ub9ac\uc790 \ube44\ubc00\ubc88\ud638");
                label_password.setHorizontalAlignment(SwingConstants.CENTER);
                label_password.setFont(new Font("\ub9d1\uc740 \uace0\ub515", Font.BOLD, 36));
                panel_managerLogin.add(label_password);
                label_password.setBounds(60, 50, 295, label_password.getPreferredSize().height);

                //---- passwordField1 ----
                passwordField1.setFont(new Font(Font.MONOSPACED, Font.BOLD, 22));
                panel_managerLogin.add(passwordField1);
                passwordField1.setBounds(65, 130, 275, 40);

                //---- button_OK ----
                button_OK.setText("\ud655\uc778");
                button_OK.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        button_OKMouseClicked(e);
                    }
                });
                panel_managerLogin.add(button_OK);
                button_OK.setBounds(145, 200, 123, button_OK.getPreferredSize().height);
            }
            manager.add(panel_managerLogin);
            panel_managerLogin.setBounds(395, 210, 430, 260);

            //======== panel_managerMenu ========
            {
                panel_managerMenu.setLayout(null);

                //---- label2 ----
                label2.setText("\uad00\ub9ac\uc790 \uba54\ub274");
                label2.setFont(new Font("\ub9d1\uc740 \uace0\ub515", Font.BOLD, 36));
                label2.setHorizontalAlignment(SwingConstants.CENTER);
                panel_managerMenu.add(label2);
                label2.setBounds(60, 25, 215, 60);

                //---- button_log ----
                button_log.setText("\ub9e4\ucd9c \ud604\ud669");
                button_log.setFont(new Font("\ub9d1\uc740 \uace0\ub515", Font.PLAIN, 24));
                button_log.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        button_logMouseClicked(e);
                    }
                });
                panel_managerMenu.add(button_log);
                button_log.setBounds(65, 115, 200, 60);

                //---- button_closeUp ----
                button_closeUp.setText("\uc5c5\ubb34 \ub9c8\uac10");
                button_closeUp.setFont(new Font("\ub9d1\uc740 \uace0\ub515", Font.PLAIN, 24));
                button_closeUp.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        button_closeUpMouseClicked(e);
                    }
                });
                panel_managerMenu.add(button_closeUp);
                button_closeUp.setBounds(65, 295, 200, 60);

                //---- button_showMenu ----
                button_showMenu.setText("\uace0\uac1d\ud310\ub9e4");
                button_showMenu.setFont(new Font("\ub9d1\uc740 \uace0\ub515", Font.PLAIN, 24));
                button_showMenu.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        button3MouseClicked(e);
                    }
                });
                panel_managerMenu.add(button_showMenu);
                button_showMenu.setBounds(65, 385, 200, 60);

                //---- button_menuManagement ----
                button_menuManagement.setText("\uba54\ub274 \uad00\ub9ac");
                button_menuManagement.setFont(new Font("\ub9d1\uc740 \uace0\ub515", Font.PLAIN, 24));
                button_menuManagement.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        button_menuManagementMouseClicked(e);
                    }
                });
                panel_managerMenu.add(button_menuManagement);
                button_menuManagement.setBounds(65, 480, 200, 60);

                //---- button_start ----
                button_start.setText("\uc5c5\ubb34 \uac1c\uc2dc");
                button_start.setFont(new Font("\ub9d1\uc740 \uace0\ub515", Font.PLAIN, 24));
                button_start.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        button_startMouseClicked(e);
                    }
                });
                panel_managerMenu.add(button_start);
                button_start.setBounds(65, 205, 200, 60);

                //---- button_kioskmanagement ----
                button_kioskmanagement.setText("\ud0a4\uc624\uc2a4\ud06c \uad00\ub9ac");
                button_kioskmanagement.setFont(new Font("\ub9d1\uc740 \uace0\ub515", Font.PLAIN, 24));
                button_kioskmanagement.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        button_kioskmanagementMouseClicked(e);
                    }
                });
                panel_managerMenu.add(button_kioskmanagement);
                button_kioskmanagement.setBounds(65, 580, 200, 60);

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < panel_managerMenu.getComponentCount(); i++) {
                        Rectangle bounds = panel_managerMenu.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = panel_managerMenu.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    panel_managerMenu.setMinimumSize(preferredSize);
                    panel_managerMenu.setPreferredSize(preferredSize);
                }
            }
            manager.add(panel_managerMenu);
            panel_managerMenu.setBounds(45, 15, 330, 670);

            //======== panel_payment ========
            {
                panel_payment.setVisible(false);
                panel_payment.setLayout(null);

                //======== scrollPane_payment ========
                {

                    //---- table_payment ----
                    table_payment.setModel(new DefaultTableModel(
                        new Object[][] {
                        },
                        new String[] {
                            "no", "\uce74\ub4dc\ubc88\ud638", "\uac00\uaca9", "\uacb0\uc81c\uc2dc\uac04", "\ucde8\uc18c\uc2dc\uac04"
                        }
                    ) {
                        boolean[] columnEditable = new boolean[] {
                            false, false, false, false, false
                        };
                        @Override
                        public boolean isCellEditable(int rowIndex, int columnIndex) {
                            return columnEditable[columnIndex];
                        }
                    });
                    {
                        TableColumnModel cm = table_payment.getColumnModel();
                        cm.getColumn(0).setPreferredWidth(80);
                    }
                    table_payment.setAutoCreateColumnsFromModel(false);
                    table_payment.setRowSelectionAllowed(false);
                    scrollPane_payment.setViewportView(table_payment);
                }
                panel_payment.add(scrollPane_payment);
                scrollPane_payment.setBounds(0, 100, 800, 575);

                //---- button_paymentcancel ----
                button_paymentcancel.setText("\uacb0\uc81c\ucde8\uc18c");
                button_paymentcancel.setFont(new Font("\ub9d1\uc740 \uace0\ub515", Font.PLAIN, 18));
                button_paymentcancel.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        button_paymentcancelMouseClicked(e);
                    }
                });
                panel_payment.add(button_paymentcancel);
                button_paymentcancel.setBounds(650, 50, 127, 30);
            }
            manager.add(panel_payment);
            panel_payment.setBounds(495, 10, 800, 670);

            //======== scrollPane_menuManagement ========
            {
                scrollPane_menuManagement.setVisible(false);

                //======== panel_menuManagement ========
                {
                    panel_menuManagement.setVisible(false);
                    panel_menuManagement.setLayout(null);
                }
                scrollPane_menuManagement.setViewportView(panel_menuManagement);
            }
            manager.add(scrollPane_menuManagement);
            scrollPane_menuManagement.setBounds(495, 10, 800, 670);

            //======== panel_closeUp ========
            {
                panel_closeUp.setVisible(false);
                panel_closeUp.setLayout(null);

                //---- button_end ----
                button_end.setText("PC\uc885\ub8cc");
                button_end.setFont(new Font("\ub9d1\uc740 \uace0\ub515", Font.PLAIN, 20));
                button_end.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        button_endMouseClicked(e);
                    }
                });
                panel_closeUp.add(button_end);
                button_end.setBounds(465, 590, 148, 50);

                //---- button_realCloseUp ----
                button_realCloseUp.setText("\uc5c5\ubb34\ub9c8\uac10");
                button_realCloseUp.setFont(new Font("\ub9d1\uc740 \uace0\ub515", Font.PLAIN, 20));
                button_realCloseUp.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        button_realCloseUpMouseClicked(e);
                    }
                });
                panel_closeUp.add(button_realCloseUp);
                button_realCloseUp.setBounds(230, 590, 157, 50);

                //---- label5 ----
                label5.setText("1. \ucd1d \ub9e4\ucd9c\uc561 : ");
                label5.setFont(new Font("\ub9d1\uc740 \uace0\ub515", Font.PLAIN, 18));
                panel_closeUp.add(label5);
                label5.setBounds(185, 125, 200, 40);

                //---- label10 ----
                label10.setText("\ub9c8\uac10\uc804\ud45c");
                label10.setFont(new Font("\ub9d1\uc740 \uace0\ub515", Font.PLAIN, 26));
                label10.setHorizontalAlignment(SwingConstants.CENTER);
                panel_closeUp.add(label10);
                label10.setBounds(275, 10, 270, 105);

                //---- label_total ----
                label_total.setText("100000");
                label_total.setFont(new Font("\ub9d1\uc740 \uace0\ub515", Font.PLAIN, 18));
                label_total.setHorizontalAlignment(SwingConstants.RIGHT);
                panel_closeUp.add(label_total);
                label_total.setBounds(435, 125, 200, 40);

                //---- label_cancel ----
                label_cancel.setText("100000");
                label_cancel.setFont(new Font("\ub9d1\uc740 \uace0\ub515", Font.PLAIN, 18));
                label_cancel.setHorizontalAlignment(SwingConstants.RIGHT);
                panel_closeUp.add(label_cancel);
                label_cancel.setBounds(435, 210, 200, 40);

                //---- label6 ----
                label6.setText("2. \ucde8\uc18c \ub9e4\ucd9c : ");
                label6.setFont(new Font("\ub9d1\uc740 \uace0\ub515", Font.PLAIN, 18));
                panel_closeUp.add(label6);
                label6.setBounds(185, 210, 200, 40);

                //---- label_real ----
                label_real.setText("100000");
                label_real.setFont(new Font("\ub9d1\uc740 \uace0\ub515", Font.PLAIN, 18));
                label_real.setHorizontalAlignment(SwingConstants.RIGHT);
                panel_closeUp.add(label_real);
                label_real.setBounds(435, 295, 200, 40);

                //---- label7 ----
                label7.setText("3. \uc2e4 \ub9e4\ucd9c\uc561 : ");
                label7.setFont(new Font("\ub9d1\uc740 \uace0\ub515", Font.PLAIN, 18));
                panel_closeUp.add(label7);
                label7.setBounds(185, 295, 200, 40);

                //---- label_paymentCount ----
                label_paymentCount.setText("100000");
                label_paymentCount.setFont(new Font("\ub9d1\uc740 \uace0\ub515", Font.PLAIN, 18));
                label_paymentCount.setHorizontalAlignment(SwingConstants.RIGHT);
                panel_closeUp.add(label_paymentCount);
                label_paymentCount.setBounds(435, 380, 200, 40);

                //---- label8 ----
                label8.setText("4. \uc8fc\ubb38 \uac74\uc218 : ");
                label8.setFont(new Font("\ub9d1\uc740 \uace0\ub515", Font.PLAIN, 18));
                panel_closeUp.add(label8);
                label8.setBounds(185, 380, 200, 40);

                //---- label_cancelCount ----
                label_cancelCount.setText("100000");
                label_cancelCount.setFont(new Font("\ub9d1\uc740 \uace0\ub515", Font.PLAIN, 18));
                label_cancelCount.setHorizontalAlignment(SwingConstants.RIGHT);
                panel_closeUp.add(label_cancelCount);
                label_cancelCount.setBounds(435, 460, 200, 40);

                //---- label9 ----
                label9.setText("5. \ucde8\uc18c \uac74\uc218 : ");
                label9.setFont(new Font("\ub9d1\uc740 \uace0\ub515", Font.PLAIN, 18));
                panel_closeUp.add(label9);
                label9.setBounds(185, 460, 200, 40);

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < panel_closeUp.getComponentCount(); i++) {
                        Rectangle bounds = panel_closeUp.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = panel_closeUp.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    panel_closeUp.setMinimumSize(preferredSize);
                    panel_closeUp.setPreferredSize(preferredSize);
                }
            }
            manager.add(panel_closeUp);
            panel_closeUp.setBounds(495, 10, 800, 670);

            //======== panel_kioskmanagement ========
            {
                panel_kioskmanagement.setVisible(false);
                panel_kioskmanagement.setLayout(null);

                //---- label_newpassword ----
                label_newpassword.setText("\uc0c8 \ube44\ubc00\ubc88\ud638 : ");
                label_newpassword.setFont(new Font("\ub9d1\uc740 \uace0\ub515", Font.PLAIN, 20));
                panel_kioskmanagement.add(label_newpassword);
                label_newpassword.setBounds(95, 110, 150, 120);

                //---- label_check ----
                label_check.setText("\ube44\ubc00\ubc88\ud638 \ud655\uc778 : ");
                label_check.setFont(new Font("\ub9d1\uc740 \uace0\ub515", Font.PLAIN, 20));
                panel_kioskmanagement.add(label_check);
                label_check.setBounds(95, 245, 160, 120);

                //---- button_change ----
                button_change.setText("\ube44\ubc00\ubc88\ud638 \ubcc0\uacbd");
                button_change.setFont(new Font("\ub9d1\uc740 \uace0\ub515", Font.PLAIN, 20));
                button_change.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        button_changeMouseClicked(e);
                    }
                });
                panel_kioskmanagement.add(button_change);
                button_change.setBounds(260, 455, 215, 70);

                //---- passwordField_newpassword ----
                passwordField_newpassword.setText("1234");
                panel_kioskmanagement.add(passwordField_newpassword);
                passwordField_newpassword.setBounds(330, 160, 245, passwordField_newpassword.getPreferredSize().height);

                //---- passwordField_check ----
                passwordField_check.setText("1234");
                panel_kioskmanagement.add(passwordField_check);
                passwordField_check.setBounds(330, 290, 245, passwordField_check.getPreferredSize().height);

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < panel_kioskmanagement.getComponentCount(); i++) {
                        Rectangle bounds = panel_kioskmanagement.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = panel_kioskmanagement.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    panel_kioskmanagement.setMinimumSize(preferredSize);
                    panel_kioskmanagement.setPreferredSize(preferredSize);
                }
            }
            manager.add(panel_kioskmanagement);
            panel_kioskmanagement.setBounds(495, 10, 800, 670);
        }
        contentPane.add(manager);
        manager.setBounds(40, 10, 1285, 700);

        //======== showMenu ========
        {
            showMenu.setLayout(null);

            //======== panel_menuDetails ========
            {
                panel_menuDetails.setBorder(new LineBorder(Color.black, 1, true));
                panel_menuDetails.setVisible(false);
                panel_menuDetails.setLayout(null);

                //---- radioButton_hot ----
                radioButton_hot.setText(" HOT");
                radioButton_hot.setFont(new Font("\ub9d1\uc740 \uace0\ub515", Font.PLAIN, 24));
                radioButton_hot.setSelected(true);
                panel_menuDetails.add(radioButton_hot);
                radioButton_hot.setBounds(250, 225, 95, 40);

                //---- radioButton_ice ----
                radioButton_ice.setText(" ICE");
                radioButton_ice.setFont(new Font("\ub9d1\uc740 \uace0\ub515", Font.PLAIN, 24));
                panel_menuDetails.add(radioButton_ice);
                radioButton_ice.setBounds(350, 230, 85, 40);

                //---- label_hot_ice ----
                label_hot_ice.setText("HOT/ICE");
                label_hot_ice.setFont(new Font("\ub9d1\uc740 \uace0\ub515", Font.PLAIN, 26));
                panel_menuDetails.add(label_hot_ice);
                label_hot_ice.setBounds(new Rectangle(new Point(35, 230), label_hot_ice.getPreferredSize()));

                //---- label_amount ----
                label_amount.setText("\uc218\ub7c9");
                label_amount.setFont(new Font("\ub9d1\uc740 \uace0\ub515", Font.PLAIN, 26));
                panel_menuDetails.add(label_amount);
                label_amount.setBounds(new Rectangle(new Point(65, 300), label_amount.getPreferredSize()));

                //---- spinner_amount ----
                spinner_amount.setModel(new SpinnerNumberModel(1, 1, null, 1));
                spinner_amount.setFont(new Font("\ub9d1\uc740 \uace0\ub515", Font.PLAIN, 24));
                panel_menuDetails.add(spinner_amount);
                spinner_amount.setBounds(250, 295, 125, spinner_amount.getPreferredSize().height);

                //---- button_finish ----
                button_finish.setText("\uba54\ub274 \ub2f4\uae30");
                button_finish.setFont(new Font("\ub9d1\uc740 \uace0\ub515", Font.PLAIN, 26));
                button_finish.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        button_finishMouseClicked(e);
                    }
                });
                panel_menuDetails.add(button_finish);
                button_finish.setBounds(275, 550, 170, 60);

                //---- label_option ----
                label_option.setText("\uc635\uc158");
                label_option.setFont(new Font("\ub9d1\uc740 \uace0\ub515", Font.PLAIN, 26));
                panel_menuDetails.add(label_option);
                label_option.setBounds(65, 370, 118, 55);

                //---- checkBox_addshot ----
                checkBox_addshot.setText(" \uc0f7\ucd94\uac00(+400)");
                checkBox_addshot.setFont(new Font("\ub9d1\uc740 \uace0\ub515", Font.PLAIN, 18));
                panel_menuDetails.add(checkBox_addshot);
                checkBox_addshot.setBounds(235, 385, 175, checkBox_addshot.getPreferredSize().height);

                //---- checkBox_addsysrup ----
                checkBox_addsysrup.setText(" \uc2dc\ub7fd\ucd94\uac00(+500)");
                checkBox_addsysrup.setFont(new Font("\ub9d1\uc740 \uace0\ub515", Font.PLAIN, 18));
                panel_menuDetails.add(checkBox_addsysrup);
                checkBox_addsysrup.setBounds(235, 420, 205, 55);

                //---- checkBox_addbubble ----
                checkBox_addbubble.setText(" \ubc84\ube14\ucd94\uac00(+600)");
                checkBox_addbubble.setFont(new Font("\ub9d1\uc740 \uace0\ub515", Font.PLAIN, 18));
                panel_menuDetails.add(checkBox_addbubble);
                checkBox_addbubble.setBounds(235, 465, 220, 65);

                //---- button_cancel ----
                button_cancel.setText("\ucde8\uc18c");
                button_cancel.setFont(new Font("\ub9d1\uc740 \uace0\ub515", Font.PLAIN, 26));
                button_cancel.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        button_cancelMouseClicked(e);
                    }
                });
                panel_menuDetails.add(button_cancel);
                button_cancel.setBounds(50, 550, 170, 60);
                panel_menuDetails.add(label_image);
                label_image.setBounds(90, 40, 110, 155);

                //---- label_name ----
                label_name.setText("\uc774\ub984");
                label_name.setFont(new Font("\ub9d1\uc740 \uace0\ub515", Font.PLAIN, 20));
                label_name.setHorizontalAlignment(SwingConstants.CENTER);
                panel_menuDetails.add(label_name);
                label_name.setBounds(240, 70, 165, label_name.getPreferredSize().height);

                //---- label_price ----
                label_price.setText("\uac00\uaca9");
                label_price.setFont(new Font("\ub9d1\uc740 \uace0\ub515", Font.PLAIN, 20));
                label_price.setHorizontalAlignment(SwingConstants.CENTER);
                panel_menuDetails.add(label_price);
                label_price.setBounds(240, 115, 165, label_price.getPreferredSize().height);

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < panel_menuDetails.getComponentCount(); i++) {
                        Rectangle bounds = panel_menuDetails.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = panel_menuDetails.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    panel_menuDetails.setMinimumSize(preferredSize);
                    panel_menuDetails.setPreferredSize(preferredSize);
                }
            }
            showMenu.add(panel_menuDetails);
            panel_menuDetails.setBounds(795, 45, 475, 645);

            //======== panel_showPayment ========
            {
                panel_showPayment.setVisible(false);
                panel_showPayment.setLayout(null);

                //---- label3 ----
                label3.setText("\uce74\ub4dc\ubc88\ud638\ub97c \uc785\ub825\ud558\uc138\uc694");
                label3.setFont(new Font("\ub9d1\uc740 \uace0\ub515", Font.BOLD, 20));
                label3.setHorizontalAlignment(SwingConstants.CENTER);
                panel_showPayment.add(label3);
                label3.setBounds(60, 210, 260, 60);

                //---- textField_cardnum ----
                textField_cardnum.setNavigationFilter(null);
                panel_showPayment.add(textField_cardnum);
                textField_cardnum.setBounds(95, 330, 185, 35);

                //---- button_pay2 ----
                button_pay2.setText("\uacb0\uc81c");
                button_pay2.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        button_pay2MouseClicked(e);
                    }
                });
                panel_showPayment.add(button_pay2);
                button_pay2.setBounds(215, 415, 115, 45);

                //---- label4 ----
                label4.setText("\ucd1d \uae08\uc561 : ");
                label4.setFont(new Font("\ub9d1\uc740 \uace0\ub515", Font.BOLD, 20));
                panel_showPayment.add(label4);
                label4.setBounds(40, 115, 115, 55);

                //---- label_totalPrice ----
                label_totalPrice.setText("1000");
                label_totalPrice.setFont(new Font("\ub9d1\uc740 \uace0\ub515", Font.BOLD, 20));
                label_totalPrice.setHorizontalAlignment(SwingConstants.RIGHT);
                panel_showPayment.add(label_totalPrice);
                label_totalPrice.setBounds(135, 125, 130, 35);

                //---- button_back ----
                button_back.setText("\ucde8\uc18c");
                button_back.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        button_backMouseClicked(e);
                    }
                });
                panel_showPayment.add(button_back);
                button_back.setBounds(60, 415, 115, 45);

                //---- label_totalPrice2 ----
                label_totalPrice2.setText(" \uc6d0");
                label_totalPrice2.setFont(new Font("\ub9d1\uc740 \uace0\ub515", Font.BOLD, 20));
                panel_showPayment.add(label_totalPrice2);
                label_totalPrice2.setBounds(265, 125, 65, 35);
            }
            showMenu.add(panel_showPayment);
            panel_showPayment.setBounds(825, 60, 370, 615);

            //======== scrollPane_coffee ========
            {
                scrollPane_coffee.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
                scrollPane_coffee.setAutoscrolls(true);

                //======== panel_menu_coffee ========
                {
                    panel_menu_coffee.setAutoscrolls(true);
                    panel_menu_coffee.setLayout(null);

                    {
                        // compute preferred size
                        Dimension preferredSize = new Dimension();
                        for(int i = 0; i < panel_menu_coffee.getComponentCount(); i++) {
                            Rectangle bounds = panel_menu_coffee.getComponent(i).getBounds();
                            preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                            preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                        }
                        Insets insets = panel_menu_coffee.getInsets();
                        preferredSize.width += insets.right;
                        preferredSize.height += insets.bottom;
                        panel_menu_coffee.setMinimumSize(preferredSize);
                        panel_menu_coffee.setPreferredSize(preferredSize);
                    }
                }
                scrollPane_coffee.setViewportView(panel_menu_coffee);
            }
            showMenu.add(scrollPane_coffee);
            scrollPane_coffee.setBounds(5, 150, 765, 540);

            //======== scrollPane_order ========
            {

                //======== panel_order ========
                {
                    panel_order.setLayout(null);

                    {
                        // compute preferred size
                        Dimension preferredSize = new Dimension();
                        for(int i = 0; i < panel_order.getComponentCount(); i++) {
                            Rectangle bounds = panel_order.getComponent(i).getBounds();
                            preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                            preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                        }
                        Insets insets = panel_order.getInsets();
                        preferredSize.width += insets.right;
                        preferredSize.height += insets.bottom;
                        panel_order.setMinimumSize(preferredSize);
                        panel_order.setPreferredSize(preferredSize);
                    }
                }
                scrollPane_order.setViewportView(panel_order);
            }
            showMenu.add(scrollPane_order);
            scrollPane_order.setBounds(825, 150, 390, 355);

            //---- button_pay ----
            button_pay.setText("\uacb0\uc81c");
            button_pay.setFont(new Font("\ub9d1\uc740 \uace0\ub515", Font.BOLD, 30));
            button_pay.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button_payMouseClicked(e);
                }
            });
            showMenu.add(button_pay);
            button_pay.setBounds(1020, 585, 178, 70);

            //---- button_delete ----
            button_delete.setText("\uc0ad\uc81c");
            button_delete.setFont(new Font("\ub9d1\uc740 \uace0\ub515", Font.BOLD, 30));
            button_delete.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button_deleteMouseClicked(e);
                }
            });
            showMenu.add(button_delete);
            button_delete.setBounds(825, 585, 178, 70);

            //---- label1 ----
            label1.setText("\uc8fc\ubb38\ub0b4\uc5ed");
            label1.setHorizontalAlignment(SwingConstants.CENTER);
            label1.setFont(new Font("\ub9d1\uc740 \uace0\ub515", Font.BOLD, 30));
            showMenu.add(label1);
            label1.setBounds(915, 75, 195, 35);

            //======== panel_category ========
            {
                panel_category.setLayout(null);

                //---- button_COFFEE ----
                button_COFFEE.setText("COFFEE");
                button_COFFEE.setFont(new Font("\ub9d1\uc740 \uace0\ub515", Font.PLAIN, 26));
                button_COFFEE.setBackground(new Color(204, 204, 204));
                button_COFFEE.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        button_COFFEEMouseClicked(e);
                    }
                });
                panel_category.add(button_COFFEE);
                button_COFFEE.setBounds(10, 20, 155, 70);

                //---- button_BEVERAGE ----
                button_BEVERAGE.setText("BEVERAGE");
                button_BEVERAGE.setFont(new Font("\ub9d1\uc740 \uace0\ub515", Font.PLAIN, 26));
                button_BEVERAGE.setBackground(new Color(204, 204, 204));
                button_BEVERAGE.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        button_BEVERAGEMouseClicked(e);
                    }
                });
                panel_category.add(button_BEVERAGE);
                button_BEVERAGE.setBounds(220, 20, 155, 70);

                //---- button_ADE ----
                button_ADE.setText("ADE");
                button_ADE.setFont(new Font("\ub9d1\uc740 \uace0\ub515", Font.PLAIN, 26));
                button_ADE.setBackground(new Color(204, 204, 204));
                button_ADE.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        button_ADEMouseClicked(e);
                    }
                });
                panel_category.add(button_ADE);
                button_ADE.setBounds(420, 20, 155, 70);

                //---- button_BUBBLE ----
                button_BUBBLE.setText("BUBBLE");
                button_BUBBLE.setFont(new Font("\ub9d1\uc740 \uace0\ub515", Font.PLAIN, 26));
                button_BUBBLE.setBackground(new Color(204, 204, 204));
                button_BUBBLE.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        button_BUBBLEMouseClicked(e);
                    }
                });
                panel_category.add(button_BUBBLE);
                button_BUBBLE.setBounds(620, 20, 155, 70);
            }
            showMenu.add(panel_category);
            panel_category.setBounds(-5, 20, 778, 103);

            //======== scrollPane_beverage ========
            {
                scrollPane_beverage.setVisible(false);

                //======== panel_menu_beverage ========
                {
                    panel_menu_beverage.setLayout(null);

                    {
                        // compute preferred size
                        Dimension preferredSize = new Dimension();
                        for(int i = 0; i < panel_menu_beverage.getComponentCount(); i++) {
                            Rectangle bounds = panel_menu_beverage.getComponent(i).getBounds();
                            preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                            preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                        }
                        Insets insets = panel_menu_beverage.getInsets();
                        preferredSize.width += insets.right;
                        preferredSize.height += insets.bottom;
                        panel_menu_beverage.setMinimumSize(preferredSize);
                        panel_menu_beverage.setPreferredSize(preferredSize);
                    }
                }
                scrollPane_beverage.setViewportView(panel_menu_beverage);
            }
            showMenu.add(scrollPane_beverage);
            scrollPane_beverage.setBounds(5, 150, 765, 530);

            //======== scrollPane_ade ========
            {
                scrollPane_ade.setVisible(false);

                //======== panel_menu_ade ========
                {
                    panel_menu_ade.setLayout(null);

                    {
                        // compute preferred size
                        Dimension preferredSize = new Dimension();
                        for(int i = 0; i < panel_menu_ade.getComponentCount(); i++) {
                            Rectangle bounds = panel_menu_ade.getComponent(i).getBounds();
                            preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                            preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                        }
                        Insets insets = panel_menu_ade.getInsets();
                        preferredSize.width += insets.right;
                        preferredSize.height += insets.bottom;
                        panel_menu_ade.setMinimumSize(preferredSize);
                        panel_menu_ade.setPreferredSize(preferredSize);
                    }
                }
                scrollPane_ade.setViewportView(panel_menu_ade);
            }
            showMenu.add(scrollPane_ade);
            scrollPane_ade.setBounds(5, 150, 765, 530);

            //======== scrollPane_bubble ========
            {
                scrollPane_bubble.setVisible(false);

                //======== panel_menu_bubble ========
                {
                    panel_menu_bubble.setLayout(null);

                    {
                        // compute preferred size
                        Dimension preferredSize = new Dimension();
                        for(int i = 0; i < panel_menu_bubble.getComponentCount(); i++) {
                            Rectangle bounds = panel_menu_bubble.getComponent(i).getBounds();
                            preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                            preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                        }
                        Insets insets = panel_menu_bubble.getInsets();
                        preferredSize.width += insets.right;
                        preferredSize.height += insets.bottom;
                        panel_menu_bubble.setMinimumSize(preferredSize);
                        panel_menu_bubble.setPreferredSize(preferredSize);
                    }
                }
                scrollPane_bubble.setViewportView(panel_menu_bubble);
            }
            showMenu.add(scrollPane_bubble);
            scrollPane_bubble.setBounds(5, 150, 765, 530);

            //---- label_gomanager ----
            label_gomanager.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    label_gomanagerMouseClicked(e);
                }
            });
            showMenu.add(label_gomanager);
            label_gomanager.setBounds(1195, 5, 80, 50);

            //======== panel_paymentComplete ========
            {
                panel_paymentComplete.setVisible(false);
                panel_paymentComplete.setLayout(null);

                //---- label_complete ----
                label_complete.setText("\uacb0\uc81c\uac00 \uc644\ub8cc\ub418\uc5c8\uc2b5\ub2c8\ub2e4.");
                label_complete.setFont(new Font("\ub9d1\uc740 \uace0\ub515", Font.PLAIN, 30));
                label_complete.setHorizontalAlignment(SwingConstants.CENTER);
                panel_paymentComplete.add(label_complete);
                label_complete.setBounds(5, 185, 415, 60);

                //---- button_close ----
                button_close.setText("\ub2eb\uae30");
                button_close.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        button_closeMouseClicked(e);
                    }
                });
                panel_paymentComplete.add(button_close);
                button_close.setBounds(new Rectangle(new Point(170, 290), button_close.getPreferredSize()));
            }
            showMenu.add(panel_paymentComplete);
            panel_paymentComplete.setBounds(795, 65, 425, 605);
        }
        contentPane.add(showMenu);
        showMenu.setBounds(40, 10, 1285, 700);

        //======== panel_systemcheck ========
        {
            panel_systemcheck.setVisible(false);
            panel_systemcheck.setLayout(null);

            //---- label11 ----
            label11.setText("\uc2dc\uc2a4\ud15c \uc810\uac80\uc911");
            label11.setFont(new Font("\ub9d1\uc740 \uace0\ub515", Font.PLAIN, 36));
            label11.setHorizontalAlignment(SwingConstants.CENTER);
            label11.setBackground(Color.white);
            label11.setForeground(new Color(255, 51, 51));
            panel_systemcheck.add(label11);
            label11.setBounds(500, 300, 245, 90);

            //---- label_gomanager2 ----
            label_gomanager2.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    label_gomanagerMouseClicked(e);
                }
            });
            panel_systemcheck.add(label_gomanager2);
            label_gomanager2.setBounds(1195, 10, 80, 50);
        }
        contentPane.add(panel_systemcheck);
        panel_systemcheck.setBounds(40, 10, 1285, 700);

        contentPane.setPreferredSize(new Dimension(1330, 750));
        setSize(1330, 750);
        setLocationRelativeTo(getOwner());

        //---- buttonGroup1 ----
        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(radioButton_hot);
        buttonGroup1.add(radioButton_ice);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - minhaeun
    private JPanel manager;
    private JPanel panel_managerLogin;
    private JLabel label_password;
    private JPasswordField passwordField1;
    private JButton button_OK;
    private JPanel panel_managerMenu;
    private JLabel label2;
    private JButton button_log;
    private JButton button_closeUp;
    private JButton button_showMenu;
    private JButton button_menuManagement;
    private JButton button_start;
    private JButton button_kioskmanagement;
    private JPanel panel_payment;
    private JScrollPane scrollPane_payment;
    private JTable table_payment;
    private JButton button_paymentcancel;
    private JScrollPane scrollPane_menuManagement;
    private JPanel panel_menuManagement;
    private JPanel panel_closeUp;
    private JButton button_end;
    private JButton button_realCloseUp;
    private JLabel label5;
    private JLabel label10;
    private JLabel label_total;
    private JLabel label_cancel;
    private JLabel label6;
    private JLabel label_real;
    private JLabel label7;
    private JLabel label_paymentCount;
    private JLabel label8;
    private JLabel label_cancelCount;
    private JLabel label9;
    private JPanel panel_kioskmanagement;
    private JLabel label_newpassword;
    private JLabel label_check;
    private JButton button_change;
    private JPasswordField passwordField_newpassword;
    private JPasswordField passwordField_check;
    private JPanel showMenu;
    private JPanel panel_menuDetails;
    private JRadioButton radioButton_hot;
    private JRadioButton radioButton_ice;
    private JLabel label_hot_ice;
    private JLabel label_amount;
    private JSpinner spinner_amount;
    private JButton button_finish;
    private JLabel label_option;
    private JCheckBox checkBox_addshot;
    private JCheckBox checkBox_addsysrup;
    private JCheckBox checkBox_addbubble;
    private JButton button_cancel;
    private JLabel label_image;
    private JLabel label_name;
    private JLabel label_price;
    private JPanel panel_showPayment;
    private JLabel label3;
    private JFormattedTextField textField_cardnum;
    private JButton button_pay2;
    private JLabel label4;
    private JLabel label_totalPrice;
    private JButton button_back;
    private JLabel label_totalPrice2;
    private JScrollPane scrollPane_coffee;
    private JPanel panel_menu_coffee;
    private JScrollPane scrollPane_order;
    private JPanel panel_order;
    private JButton button_pay;
    private JButton button_delete;
    private JLabel label1;
    private JPanel panel_category;
    private JButton button_COFFEE;
    private JButton button_BEVERAGE;
    private JButton button_ADE;
    private JButton button_BUBBLE;
    private JScrollPane scrollPane_beverage;
    private JPanel panel_menu_beverage;
    private JScrollPane scrollPane_ade;
    private JPanel panel_menu_ade;
    private JScrollPane scrollPane_bubble;
    private JPanel panel_menu_bubble;
    private JLabel label_gomanager;
    private JPanel panel_paymentComplete;
    private JLabel label_complete;
    private JButton button_close;
    private JPanel panel_systemcheck;
    private JLabel label11;
    private JLabel label_gomanager2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
