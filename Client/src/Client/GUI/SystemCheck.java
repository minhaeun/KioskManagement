/*
 * Created by JFormDesigner on Mon Dec 02 21:39:46 KST 2019
 */

package Client.GUI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author minhaeun
 */
public class SystemCheck {


    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - minhaeun
        panel_systemcheck = new JPanel();
        label1 = new JLabel();

        //======== panel_systemcheck ========
        {
            panel_systemcheck.setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder(new javax.
            swing.border.EmptyBorder(0,0,0,0), "JF\u006frmDes\u0069gner \u0045valua\u0074ion",javax.swing.border
            .TitledBorder.CENTER,javax.swing.border.TitledBorder.BOTTOM,new java.awt.Font("D\u0069alog"
            ,java.awt.Font.BOLD,12),java.awt.Color.red),panel_systemcheck. getBorder
            ()));panel_systemcheck. addPropertyChangeListener(new java.beans.PropertyChangeListener(){@Override public void propertyChange(java
            .beans.PropertyChangeEvent e){if("\u0062order".equals(e.getPropertyName()))throw new RuntimeException
            ();}});
            panel_systemcheck.setLayout(null);

            //---- label1 ----
            label1.setText("\uc2dc\uc2a4\ud15c \uc810\uac80\uc911");
            label1.setFont(new Font("\ub9d1\uc740 \uace0\ub515", Font.PLAIN, 36));
            label1.setHorizontalAlignment(SwingConstants.CENTER);
            label1.setBackground(Color.white);
            label1.setForeground(new Color(255, 51, 51));
            panel_systemcheck.add(label1);
            label1.setBounds(60, 70, 245, 90);

            panel_systemcheck.setPreferredSize(new Dimension(380, 280));
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - minhaeun
    private JPanel panel_systemcheck;
    private JLabel label1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
