/*
 * Created by JFormDesigner on Thu Nov 14 21:31:03 KST 2019
 */

package Client.GUI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author minhaeun
 */
public class MenuManagementItem extends JPanel {
    String category;
    String name;
    int activ_num;
    Kiosk kiosk;
    public MenuManagementItem(Kiosk k) {
        this.kiosk = k;
        initComponents();
    }

    public void setData(String category, String name, int activ_num){
        if(this.category.equals(category) && this.name.equals(name)){
            this.activ_num = activ_num;
            radioButton_active.setSelected(activ_num == 1 ?true:false);
            radioButton_deactive.setSelected(activ_num == 0 ? true:false);
        }
    }

    private void radioButton_activeMouseClicked(MouseEvent e) {
        kiosk.SendMessage("USE/" +this.category + "," + this.name + "," + 1);
        // TODO add your code here
    }

    private void radioButton_deactiveMouseClicked(MouseEvent e) {
        kiosk.SendMessage("USE/"+  this.category + "," + this.name + "," + 0);
        // TODO add your code here
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - minhaeun
        label_menuname = new JLabel();
        radioButton_active = new JRadioButton();
        radioButton_deactive = new JRadioButton();

        //======== this ========
        setLayout(null);

        //---- label_menuname ----
        label_menuname.setText("\uba54\ub274\uba85");
        label_menuname.setFont(new Font("\ub9d1\uc740 \uace0\ub515", Font.PLAIN, 28));
        add(label_menuname);
        label_menuname.setBounds(10, 40, 280, 30);

        //---- radioButton_active ----
        radioButton_active.setText("\uc0ac\uc6a9");
        radioButton_active.setFont(new Font("\ub9d1\uc740 \uace0\ub515", Font.PLAIN, 28));
        radioButton_active.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                radioButton_activeMouseClicked(e);
            }
        });
        add(radioButton_active);
        radioButton_active.setBounds(310, 30, 190, 55);

        //---- radioButton_deactive ----
        radioButton_deactive.setText("\ubbf8\uc0ac\uc6a9");
        radioButton_deactive.setFont(new Font("\ub9d1\uc740 \uace0\ub515", Font.PLAIN, 28));
        radioButton_deactive.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                radioButton_deactiveMouseClicked(e);
            }
        });
        add(radioButton_deactive);
        radioButton_deactive.setBounds(520, 30, 190, 55);

        setPreferredSize(new Dimension(700, 110));

        //---- buttonGroup2 ----
        ButtonGroup buttonGroup2 = new ButtonGroup();
        buttonGroup2.add(radioButton_active);
        buttonGroup2.add(radioButton_deactive);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    public void setMenuManagementItem(String category, String name, int activ_num){
        this.category = category;
        this.name = name;
        this.activ_num = activ_num;
        radioButton_active.setSelected(activ_num == 1 ?true:false);
        radioButton_deactive.setSelected(activ_num == 0 ? true:false);
        label_menuname.setText(name);

        label_menuname.setVisible(true);
        radioButton_deactive.setVisible(true);
        radioButton_active.setVisible(true);
   }


    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - minhaeun
    private JLabel label_menuname;
    private JRadioButton radioButton_active;
    private JRadioButton radioButton_deactive;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
