/*
 * Created by JFormDesigner on Fri Nov 15 00:05:37 KST 2019
 */

package Client.GUI;

import java.awt.*;
import javax.swing.*;

/**
 * @author minhaeun
 */
public class OrderItem extends JPanel {
    String name;
    String category;
    int price;
    String option;
    int amount;
    boolean temperature;

    public OrderItem() {
        initComponents();
    }

    public void setOrderItem(String name, int amount, boolean temperature, String option, int price){
        this.name = name;
        this.amount = amount;
        this.temperature = temperature;
        this.option = option;
        this.price = price;
        label_option.setText(option);
        label_name.setText(name);
        label_amount.setText(amount + " 개");
        label_temperature.setText(temperature ? "HOT" : "ICE");
        label_price.setText(price+" 원");
    }
    public String getCategory(){
        return this.category;
    }
    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - minhaeun
        label_name = new JLabel();
        label_temperature = new JLabel();
        label_option = new JLabel();
        label_price = new JLabel();
        label_amount = new JLabel();

        //======== this ========
        setLayout(null);

        //---- label_name ----
        label_name.setText("\uc544\uba54\ub9ac\uce74\ub178");
        label_name.setFont(new Font("\ub9d1\uc740 \uace0\ub515", Font.PLAIN, 20));
        add(label_name);
        label_name.setBounds(10, 10, 335, label_name.getPreferredSize().height);

        //---- label_temperature ----
        label_temperature.setText("HOT");
        label_temperature.setFont(new Font("\ub9d1\uc740 \uace0\ub515", Font.PLAIN, 14));
        add(label_temperature);
        label_temperature.setBounds(125, 85, 50, label_temperature.getPreferredSize().height);

        //---- label_option ----
        label_option.setText("\uc0f7\ucd94\uac00");
        label_option.setFont(new Font("\ub9d1\uc740 \uace0\ub515", Font.PLAIN, 14));
        add(label_option);
        label_option.setBounds(10, 45, 335, 35);

        //---- label_price ----
        label_price.setText("2,000\uc6d0");
        label_price.setFont(new Font("\ub9d1\uc740 \uace0\ub515", Font.PLAIN, 14));
        add(label_price);
        label_price.setBounds(240, 85, 90, label_price.getPreferredSize().height);

        //---- label_amount ----
        label_amount.setText("1\uac1c");
        label_amount.setFont(new Font("\ub9d1\uc740 \uace0\ub515", Font.PLAIN, 14));
        add(label_amount);
        label_amount.setBounds(10, 80, 70, 27);

        setPreferredSize(new Dimension(350, 115));
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - minhaeun
    private JLabel label_name;
    private JLabel label_temperature;
    private JLabel label_option;
    private JLabel label_price;
    private JLabel label_amount;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
