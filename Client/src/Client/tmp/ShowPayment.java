/*
 * Created by JFormDesigner on Wed Nov 13 20:37:39 KST 2019
 */

package Client.tmp;

import java.awt.*;
import javax.swing.*;

/**
 * @author minhaeun
 */
public class ShowPayment {
    public ShowPayment() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - minhaeun
        panel_showPayment = new JPanel();
        label1 = new JLabel();
        textField1 = new JTextField();
        button_pay = new JButton();

        //======== panel_showPayment ========
        {
            panel_showPayment.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new
            javax. swing. border. EmptyBorder( 0, 0, 0, 0) , "JFor\u006dDesi\u0067ner \u0045valu\u0061tion", javax
            . swing. border. TitledBorder. CENTER, javax. swing. border. TitledBorder. BOTTOM, new java
            .awt .Font ("Dia\u006cog" ,java .awt .Font .BOLD ,12 ), java. awt
            . Color. red) ,panel_showPayment. getBorder( )) ); panel_showPayment. addPropertyChangeListener (new java. beans.
            PropertyChangeListener( ){ @Override public void propertyChange (java .beans .PropertyChangeEvent e) {if ("bord\u0065r" .
            equals (e .getPropertyName () )) throw new RuntimeException( ); }} );
            panel_showPayment.setLayout(null);

            //---- label1 ----
            label1.setText("\uce74\ub4dc\ubc88\ud638\ub97c \uc785\ub825\ud558\uc138\uc694");
            label1.setFont(new Font("\ub9d1\uc740 \uace0\ub515", Font.BOLD, 20));
            label1.setHorizontalAlignment(SwingConstants.CENTER);
            panel_showPayment.add(label1);
            label1.setBounds(50, 25, 260, 60);
            panel_showPayment.add(textField1);
            textField1.setBounds(90, 105, 185, 35);

            //---- button_pay ----
            button_pay.setText("\uacb0\uc81c");
            panel_showPayment.add(button_pay);
            button_pay.setBounds(120, 165, 115, 45);

            panel_showPayment.setPreferredSize(new Dimension(370, 430));
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - minhaeun
    private JPanel panel_showPayment;
    private JLabel label1;
    private JTextField textField1;
    private JButton button_pay;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
