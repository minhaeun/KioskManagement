/*
 * Created by JFormDesigner on Wed Nov 13 20:37:38 KST 2019
 */

package Client.tmp;

import java.awt.*;
import javax.swing.*;

/**
 * @author minhaeun
 */
public class ManagerMenu {
    public ManagerMenu() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - minhaeun
        panel_managermenu = new JPanel();
        label1 = new JLabel();
        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();
        button4 = new JButton();

        //======== panel_managermenu ========
        {
            panel_managermenu.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new
            javax. swing. border. EmptyBorder( 0, 0, 0, 0) , "JF\u006frmDes\u0069gner \u0045valua\u0074ion", javax
            . swing. border. TitledBorder. CENTER, javax. swing. border. TitledBorder. BOTTOM, new java
            .awt .Font ("D\u0069alog" ,java .awt .Font .BOLD ,12 ), java. awt
            . Color. red) ,panel_managermenu. getBorder( )) ); panel_managermenu. addPropertyChangeListener (new java. beans.
            PropertyChangeListener( ){ @Override public void propertyChange (java .beans .PropertyChangeEvent e) {if ("\u0062order" .
            equals (e .getPropertyName () )) throw new RuntimeException( ); }} );
            panel_managermenu.setLayout(null);

            //---- label1 ----
            label1.setText("\uad00\ub9ac\uc790 \uba54\ub274");
            label1.setFont(new Font("\ub9d1\uc740 \uace0\ub515", Font.BOLD, 36));
            label1.setHorizontalAlignment(SwingConstants.CENTER);
            panel_managermenu.add(label1);
            label1.setBounds(45, 40, 215, 60);

            //---- button1 ----
            button1.setText("\ub9e4\ucd9c \ud604\ud669");
            button1.setFont(new Font("\ub9d1\uc740 \uace0\ub515", Font.PLAIN, 24));
            panel_managermenu.add(button1);
            button1.setBounds(60, 145, 200, 60);

            //---- button2 ----
            button2.setText("\uc5c5\ubb34 \ub9c8\uac10");
            button2.setFont(new Font("\ub9d1\uc740 \uace0\ub515", Font.PLAIN, 24));
            panel_managermenu.add(button2);
            button2.setBounds(60, 265, 200, 60);

            //---- button3 ----
            button3.setText("\uace0\uac1d\ud310\ub9e4");
            button3.setFont(new Font("\ub9d1\uc740 \uace0\ub515", Font.PLAIN, 24));
            panel_managermenu.add(button3);
            button3.setBounds(60, 395, 200, 60);

            //---- button4 ----
            button4.setText("\uba54\ub274\uad00\ub9ac");
            button4.setFont(new Font("\ub9d1\uc740 \uace0\ub515", Font.PLAIN, 24));
            panel_managermenu.add(button4);
            button4.setBounds(60, 530, 200, 60);

            {
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < panel_managermenu.getComponentCount(); i++) {
                    Rectangle bounds = panel_managermenu.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = panel_managermenu.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                panel_managermenu.setMinimumSize(preferredSize);
                panel_managermenu.setPreferredSize(preferredSize);
            }
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - minhaeun
    private JPanel panel_managermenu;
    private JLabel label1;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
