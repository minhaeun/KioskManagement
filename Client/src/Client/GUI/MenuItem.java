/*
 * Created by JFormDesigner on Thu Nov 28 23:20:23 KST 2019
 */

package Client.GUI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

/**
 * @author minhaeun
 */
public class MenuItem extends JPanel {
    Kiosk kiosk;
    String name;
    int price;
    int activ_num = 1;
    ImageIcon menuIcon;
    public MenuItem(Kiosk k)  {
        this.kiosk=k;
        initComponents();
    }
    private void label_imageMouseClicked(MouseEvent e) {
        if(activ_num == 1 && !(kiosk.getPanel_showPayment().isVisible() || kiosk.getPanel_paymentComplete().isVisible())){
            kiosk.setPanel_menuDetails(this);
            kiosk.resetDetail();
        }


        // TODO add your code here
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - minhaeun
        label_image = new JLabel();
        label_name = new JLabel();
        label_price = new JLabel();
        label_preparing = new JLabel();

        //======== this ========
        setLayout(null);

        //---- label_image ----
        label_image.setText("\uc774\ubbf8\uc9c0");
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                label_imageMouseClicked(e);
            }
        });
        add(label_image);
        label_image.setBounds(15, 15, 100, 130);

        //---- label_name ----
        label_name.setText("\uba54\ub274\uba85");
        label_name.setHorizontalAlignment(SwingConstants.CENTER);
        label_name.setFont(new Font("\ub9d1\uc740 \uace0\ub515", Font.BOLD, 16));
        add(label_name);
        label_name.setBounds(115, 45, 130, label_name.getPreferredSize().height);

        //---- label_price ----
        label_price.setText("\uac00\uaca9");
        label_price.setHorizontalAlignment(SwingConstants.CENTER);
        label_price.setFont(new Font("\ub9d1\uc740 \uace0\ub515", Font.BOLD, 16));
        add(label_price);
        label_price.setBounds(115, 95, 130, label_price.getPreferredSize().height);

        //---- label_preparing ----
        label_preparing.setText("\uc900\ube44\uc911");
        label_preparing.setBackground(Color.white);
        label_preparing.setFont(new Font("\ub9d1\uc740 \uace0\ub515", Font.PLAIN, 20));
        label_preparing.setForeground(Color.red);
        add(label_preparing);
        label_preparing.setBounds(30, 15, 85, 125);

        setPreferredSize(new Dimension(245, 160));
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    public ImageIcon getMenuIcon() {
        return menuIcon;
    }

    public void setMenu(String name, int price, int activ_num){
        this.activ_num = activ_num;
        ImageIcon icon = new ImageIcon("image/" + name + ".png");
        Image origin = icon.getImage();
        Image after = origin.getScaledInstance(100, 130, Image.SCALE_SMOOTH);
       ImageIcon icon2 = new ImageIcon(after);
        label_image.setIcon(icon2);
        menuIcon = icon2;
         label_image.setVisible(true);
         label_name.setVisible(true);
         label_price.setVisible(true);
         label_name.setText(name);
         label_price.setText(price+" 원");
         this.name = name;
         this.price = price;
         label_preparing.setVisible(false);
         setActiv_num(activ_num);

     }

     public void setActiv_num(int activ_num){
        this.activ_num = activ_num;
        if(activ_num == 1) {
            label_image.setVisible(true);
            label_preparing.setVisible(false);
        }else {
            label_image.setVisible(false);
            label_preparing.setVisible(true);
        }

     }
     // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - noegond
    private JLabel label_image;
    private JLabel label_name;
    private JLabel label_price;
    private JLabel label_preparing;

    @Override
    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
// JFormDesigner - End of variables declaration  //GEN-END:variables
}
