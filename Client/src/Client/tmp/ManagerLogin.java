/*
 * Created by JFormDesigner on Wed Nov 13 19:19:46 KST 2019
 */

package Client.tmp;

import java.awt.*;
import javax.swing.*;

/**
 * @author unknown
 */
public class ManagerLogin {
    public ManagerLogin() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - minhaeun
        managerLogin = new JPanel();
        label_password = new JLabel();
        passwordField1 = new JPasswordField();

        //======== managerLogin ========
        {
            managerLogin.setFont(new Font("\ub9d1\uc740 \uace0\ub515", Font.BOLD, 30));
            managerLogin.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing. border. EmptyBorder
            ( 0, 0, 0, 0) , "JF\u006frmD\u0065sig\u006eer \u0045val\u0075ati\u006fn", javax. swing. border. TitledBorder. CENTER, javax. swing. border
            . TitledBorder. BOTTOM, new java .awt .Font ("Dia\u006cog" ,java .awt .Font .BOLD ,12 ), java. awt
            . Color. red) ,managerLogin. getBorder( )) ); managerLogin. addPropertyChangeListener (new java. beans. PropertyChangeListener( ){ @Override public void
            propertyChange (java .beans .PropertyChangeEvent e) {if ("\u0062ord\u0065r" .equals (e .getPropertyName () )) throw new RuntimeException( )
            ; }} );
            managerLogin.setLayout(null);

            //---- label_password ----
            label_password.setText("\uad00\ub9ac\uc790 \ube44\ubc00\ubc88\ud638");
            label_password.setHorizontalAlignment(SwingConstants.CENTER);
            label_password.setFont(new Font("\ub9d1\uc740 \uace0\ub515", Font.BOLD, 36));
            managerLogin.add(label_password);
            label_password.setBounds(60, 50, 295, label_password.getPreferredSize().height);

            //---- passwordField1 ----
            passwordField1.setFont(new Font(Font.MONOSPACED, Font.BOLD, 22));
            managerLogin.add(passwordField1);
            passwordField1.setBounds(65, 155, 275, 50);

            managerLogin.setPreferredSize(new Dimension(430, 260));
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - minhaeun
    private JPanel managerLogin;
    private JLabel label_password;
    private JPasswordField passwordField1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
