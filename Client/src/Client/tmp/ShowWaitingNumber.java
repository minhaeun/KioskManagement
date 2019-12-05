/*
 * Created by JFormDesigner on Thu Nov 14 21:25:33 KST 2019
 */

package Client.tmp;

import java.awt.*;
import javax.swing.*;

/**
 * @author minhaeun
 */
public class ShowWaitingNumber {
    public ShowWaitingNumber() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - minhaeun
        paymentComplete = new JPanel();
        label_complete = new JLabel();

        //======== paymentComplete ========
        {
            paymentComplete.setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder(new javax.swing.border.
            EmptyBorder(0,0,0,0), "JF\u006frmD\u0065sig\u006eer \u0045val\u0075ati\u006fn",javax.swing.border.TitledBorder.CENTER,javax.swing
            .border.TitledBorder.BOTTOM,new java.awt.Font("Dia\u006cog",java.awt.Font.BOLD,12),
            java.awt.Color.red),paymentComplete. getBorder()));paymentComplete. addPropertyChangeListener(new java.beans.PropertyChangeListener()
            {@Override public void propertyChange(java.beans.PropertyChangeEvent e){if("\u0062ord\u0065r".equals(e.getPropertyName()))
            throw new RuntimeException();}});
            paymentComplete.setLayout(null);

            //---- label_complete ----
            label_complete.setText("\uacb0\uc81c\uac00 \uc644\ub8cc\ub418\uc5c8\uc2b5\ub2c8\ub2e4.");
            label_complete.setFont(new Font("\ub9d1\uc740 \uace0\ub515", Font.PLAIN, 30));
            label_complete.setHorizontalAlignment(SwingConstants.CENTER);
            paymentComplete.add(label_complete);
            label_complete.setBounds(5, 90, 415, 60);

            paymentComplete.setPreferredSize(new Dimension(425, 240));
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - minhaeun
    private JPanel paymentComplete;
    private JLabel label_complete;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
