package Client.tmp;/*
 * Created by JFormDesigner on Wed Nov 13 20:37:39 KST 2019
 */

import Client.GUI.MenuItem;
import Client.ReceiveThread;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
/**
 * @author minhaeun
 */
public class ShowMenu {
    MenuItem[] menuItem;
    ReceiveThread receiveThread;
    public ShowMenu() {
        initComponents();
    }

    private void button_COFFEEMouseClicked(MouseEvent e) {
        // TODO add your code here
       // for(int i = 0; i < ) {


          //  panel_showmenu.add(menuItem[i]);
       // }
    }
    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - minhaeun
        ShowMenu = new JPanel();
        scrollPane1 = new JScrollPane();
        panel_menu = new JPanel();
        scrollPane2 = new JScrollPane();
        panel_order = new JPanel();
        button_pay = new JButton();
        button_cancel = new JButton();
        label1 = new JLabel();
        label_total = new JLabel();
        label_won = new JLabel();
        panel_category = new JPanel();
        button_COFFEE = new JButton();
        button_BEVERAGE = new JButton();
        button_ADE = new JButton();
        button_BUBBLE = new JButton();

        //======== ShowMenu ========
        {
            ShowMenu.setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder(new javax
            .swing.border.EmptyBorder(0,0,0,0), "JF\u006frmD\u0065sig\u006eer \u0045val\u0075ati\u006fn",javax.swing
            .border.TitledBorder.CENTER,javax.swing.border.TitledBorder.BOTTOM,new java.awt.
            Font("Dia\u006cog",java.awt.Font.BOLD,12),java.awt.Color.red
            ),ShowMenu. getBorder()));ShowMenu. addPropertyChangeListener(new java.beans.PropertyChangeListener(){@Override
            public void propertyChange(java.beans.PropertyChangeEvent e){if("\u0062ord\u0065r".equals(e.getPropertyName(
            )))throw new RuntimeException();}});
            ShowMenu.setLayout(null);

            //======== scrollPane1 ========
            {

                //======== panel_menu ========
                {
                    panel_menu.setLayout(null);

                    {
                        // compute preferred size
                        Dimension preferredSize = new Dimension();
                        for(int i = 0; i < panel_menu.getComponentCount(); i++) {
                            Rectangle bounds = panel_menu.getComponent(i).getBounds();
                            preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                            preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                        }
                        Insets insets = panel_menu.getInsets();
                        preferredSize.width += insets.right;
                        preferredSize.height += insets.bottom;
                        panel_menu.setMinimumSize(preferredSize);
                        panel_menu.setPreferredSize(preferredSize);
                    }
                }
                scrollPane1.setViewportView(panel_menu);
            }
            ShowMenu.add(scrollPane1);
            scrollPane1.setBounds(10, 140, 775, 530);

            //======== scrollPane2 ========
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
                scrollPane2.setViewportView(panel_order);
            }
            ShowMenu.add(scrollPane2);
            scrollPane2.setBounds(825, 145, 370, 360);

            //---- button_pay ----
            button_pay.setText("\uacb0\uc81c");
            button_pay.setFont(new Font("\ub9d1\uc740 \uace0\ub515", Font.BOLD, 30));
            ShowMenu.add(button_pay);
            button_pay.setBounds(1020, 585, 178, 70);

            //---- button_cancel ----
            button_cancel.setText("\ucde8\uc18c");
            button_cancel.setFont(new Font("\ub9d1\uc740 \uace0\ub515", Font.BOLD, 30));
            ShowMenu.add(button_cancel);
            button_cancel.setBounds(825, 585, 178, 70);

            //---- label1 ----
            label1.setText("\uc8fc\ubb38\ub0b4\uc5ed");
            label1.setHorizontalAlignment(SwingConstants.CENTER);
            label1.setFont(new Font("\ub9d1\uc740 \uace0\ub515", Font.BOLD, 30));
            ShowMenu.add(label1);
            label1.setBounds(915, 75, 195, 35);

            //---- label_total ----
            label_total.setText("\ucd1d\uae08\uc561");
            label_total.setFont(new Font("\ub9d1\uc740 \uace0\ub515", Font.PLAIN, 18));
            ShowMenu.add(label_total);
            label_total.setBounds(850, 525, 85, 45);

            //---- label_won ----
            label_won.setText("\\       \uc6d0");
            label_won.setFont(new Font("\ub9d1\uc740 \uace0\ub515", Font.PLAIN, 22));
            label_won.setHorizontalAlignment(SwingConstants.RIGHT);
            ShowMenu.add(label_won);
            label_won.setBounds(980, 530, 165, label_won.getPreferredSize().height);

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
                button_COFFEE.setBounds(25, 20, 145, 70);

                //---- button_BEVERAGE ----
                button_BEVERAGE.setText("BEVERAGE");
                button_BEVERAGE.setFont(new Font("\ub9d1\uc740 \uace0\ub515", Font.PLAIN, 26));
                button_BEVERAGE.setBackground(new Color(204, 204, 204));
                panel_category.add(button_BEVERAGE);
                button_BEVERAGE.setBounds(205, 20, 145, 70);

                //---- button_ADE ----
                button_ADE.setText("ADE");
                button_ADE.setFont(new Font("\ub9d1\uc740 \uace0\ub515", Font.PLAIN, 26));
                button_ADE.setBackground(new Color(204, 204, 204));
                panel_category.add(button_ADE);
                button_ADE.setBounds(390, 20, 145, 70);

                //---- button_BUBBLE ----
                button_BUBBLE.setText("BUBBLE");
                button_BUBBLE.setFont(new Font("\ub9d1\uc740 \uace0\ub515", Font.PLAIN, 26));
                button_BUBBLE.setBackground(new Color(204, 204, 204));
                panel_category.add(button_BUBBLE);
                button_BUBBLE.setBounds(575, 20, 145, 70);
            }
            ShowMenu.add(panel_category);
            panel_category.setBounds(10, 20, 763, 103);

            ShowMenu.setPreferredSize(new Dimension(1230, 690));
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - minhaeun
    private JPanel ShowMenu;
    private JScrollPane scrollPane1;
    private JPanel panel_menu;
    private JScrollPane scrollPane2;
    private JPanel panel_order;
    private JButton button_pay;
    private JButton button_cancel;
    private JLabel label1;
    private JLabel label_total;
    private JLabel label_won;
    private JPanel panel_category;
    private JButton button_COFFEE;
    private JButton button_BEVERAGE;
    private JButton button_ADE;
    private JButton button_BUBBLE;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
