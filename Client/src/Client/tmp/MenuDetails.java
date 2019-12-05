/*
 * Created by JFormDesigner on Wed Nov 13 20:04:45 KST 2019
 */

package Client.tmp;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

/**
 * @author minhaeun
 */
public class MenuDetails {
    public MenuDetails() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - minhaeun
        panel_menuDetails = new JPanel();
        label1 = new JLabel();
        radioButton1 = new JRadioButton();
        radioButton2 = new JRadioButton();
        label2 = new JLabel();
        label3 = new JLabel();
        spinner1 = new JSpinner();
        button1 = new JButton();
        label4 = new JLabel();
        checkBox1 = new JCheckBox();
        checkBox2 = new JCheckBox();
        checkBox3 = new JCheckBox();

        //======== panel_menuDetails ========
        {
            panel_menuDetails.setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(
            0,0,0,0), "JF\u006frmDesi\u0067ner Ev\u0061luatio\u006e",javax.swing.border.TitledBorder.CENTER,javax.swing.border.TitledBorder
            .BOTTOM,new java.awt.Font("Dialo\u0067",java.awt.Font.BOLD,12),java.awt.Color.
            red),panel_menuDetails. getBorder()));panel_menuDetails. addPropertyChangeListener(new java.beans.PropertyChangeListener(){@Override public void propertyChange(java.
            beans.PropertyChangeEvent e){if("borde\u0072".equals(e.getPropertyName()))throw new RuntimeException();}});
            panel_menuDetails.setLayout(null);

            //---- label1 ----
            label1.setText("MenuItem");
            label1.setBorder(LineBorder.createBlackLineBorder());
            panel_menuDetails.add(label1);
            label1.setBounds(145, 25, 220, 165);

            //---- radioButton1 ----
            radioButton1.setText("ice");
            radioButton1.setFont(new Font("\ub9d1\uc740 \uace0\ub515", Font.PLAIN, 24));
            panel_menuDetails.add(radioButton1);
            radioButton1.setBounds(250, 260, 95, 40);

            //---- radioButton2 ----
            radioButton2.setText("hot");
            radioButton2.setFont(new Font("\ub9d1\uc740 \uace0\ub515", Font.PLAIN, 24));
            panel_menuDetails.add(radioButton2);
            radioButton2.setBounds(390, 260, 85, 40);

            //---- label2 ----
            label2.setText("temperature");
            label2.setFont(new Font("\ub9d1\uc740 \uace0\ub515", Font.PLAIN, 26));
            panel_menuDetails.add(label2);
            label2.setBounds(new Rectangle(new Point(25, 255), label2.getPreferredSize()));

            //---- label3 ----
            label3.setText("amount");
            label3.setFont(new Font("\ub9d1\uc740 \uace0\ub515", Font.PLAIN, 26));
            panel_menuDetails.add(label3);
            label3.setBounds(new Rectangle(new Point(45, 350), label3.getPreferredSize()));

            //---- spinner1 ----
            spinner1.setModel(new SpinnerNumberModel(1, 1, null, 1));
            spinner1.setFont(new Font("\ub9d1\uc740 \uace0\ub515", Font.PLAIN, 24));
            panel_menuDetails.add(spinner1);
            spinner1.setBounds(250, 355, 125, spinner1.getPreferredSize().height);

            //---- button1 ----
            button1.setText("\uba54\ub274 \ub2f4\uae30");
            button1.setFont(new Font("\ub9d1\uc740 \uace0\ub515", Font.PLAIN, 26));
            panel_menuDetails.add(button1);
            button1.setBounds(165, 665, 170, 60);

            //---- label4 ----
            label4.setText("option");
            label4.setFont(new Font("\ub9d1\uc740 \uace0\ub515", Font.PLAIN, 26));
            panel_menuDetails.add(label4);
            label4.setBounds(40, 440, 118, 55);

            //---- checkBox1 ----
            checkBox1.setText("\uc0f7\ucd94\uac00");
            checkBox1.setFont(new Font("\ub9d1\uc740 \uace0\ub515", Font.PLAIN, 22));
            panel_menuDetails.add(checkBox1);
            checkBox1.setBounds(new Rectangle(new Point(255, 460), checkBox1.getPreferredSize()));

            //---- checkBox2 ----
            checkBox2.setText("\uc2dc\ub7fd\ucd94\uac00");
            checkBox2.setFont(new Font("\ub9d1\uc740 \uace0\ub515", Font.PLAIN, 22));
            panel_menuDetails.add(checkBox2);
            checkBox2.setBounds(255, 500, 130, 55);

            //---- checkBox3 ----
            checkBox3.setText("\ubc84\ube14\ucd94\uac00");
            checkBox3.setFont(new Font("\ub9d1\uc740 \uace0\ub515", Font.PLAIN, 22));
            panel_menuDetails.add(checkBox3);
            checkBox3.setBounds(255, 555, 125, 65);

            panel_menuDetails.setPreferredSize(new Dimension(540, 775));
        }

        //---- buttonGroup1 ----
        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(radioButton1);
        buttonGroup1.add(radioButton2);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - minhaeun
    private JPanel panel_menuDetails;
    private JLabel label1;
    private JRadioButton radioButton1;
    private JRadioButton radioButton2;
    private JLabel label2;
    private JLabel label3;
    private JSpinner spinner1;
    private JButton button1;
    private JLabel label4;
    private JCheckBox checkBox1;
    private JCheckBox checkBox2;
    private JCheckBox checkBox3;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
