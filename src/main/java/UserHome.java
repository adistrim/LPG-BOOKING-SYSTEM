
import java.awt.HeadlessException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.sql.*;

//import Pakage.Home_Page.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author aditya
 */

public class UserHome extends javax.swing.JFrame {

public String UserN = Home_Page.usernametextfield.getText();

    /**
     * Creates new form UserHome
     */
    public UserHome() {
        initComponents();
    }

    public UserHome(String username) {
        
        initComponents();
        jLabel5.setVisible(false);
        jLabel6.setVisible(false);
        im_5kg.setVisible(true);
        
        try{
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from user where username='"+username+"'");
            while(rs.next()){
//                namedisplay.setText(rs.getString(2));
            }
        }
        catch(SQLException e){
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        im_5kg = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(135, 125));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255, 200));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jButton1.setText("Order");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 111, -1));

        jComboBox1.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "5 kg", "14.2 kg", "19 kg" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        jLabel3.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        jLabel3.setText("Category");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jLabel4.setFont(new java.awt.Font("Georgia", 1, 36)); // NOI18N
        jLabel4.setText("LPG Booking");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon("/Users/aditya/Documents/Netbeans/JKLU_LPG_Booking_system/src/main/java/images/14 kg.png")); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 111, -1));

        im_5kg.setIcon(new javax.swing.ImageIcon("/Users/aditya/Documents/Netbeans/JKLU_LPG_Booking_system/src/main/java/images/5kg.png")); // NOI18N
        jPanel2.add(im_5kg, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon("/Users/aditya/Documents/Netbeans/JKLU_LPG_Booking_system/src/main/java/images/19_kg.png")); // NOI18N
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, 420, 410));

        jLabel1.setIcon(new javax.swing.ImageIcon("/Users/aditya/Documents/Netbeans/JKLU_LPG_Booking_system/src/main/java/images/jklu_blured.jpeg")); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, 510));

        jLabel2.setText("jLabel2");

        jMenuBar1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dashboard", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Georgia", 1, 36))); // NOI18N

        jMenu1.setIcon(new javax.swing.ImageIcon("/Users/aditya/Documents/Netbeans/JKLU_LPG_Booking_system/src/main/java/images/i01_profile.png")); // NOI18N
        jMenu1.setText("Profile");
        jMenu1.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        jMenu1.setMargin(new java.awt.Insets(3, 30, 3, 30));
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon("/Users/aditya/Documents/Netbeans/JKLU_LPG_Booking_system/src/main/java/images/order (1).png")); // NOI18N
        jMenu2.setText("My Orders");
        jMenu2.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        jMenu2.setMargin(new java.awt.Insets(3, 30, 3, 30));
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon("/Users/aditya/Documents/Netbeans/JKLU_LPG_Booking_system/src/main/java/images/i01_complain.png")); // NOI18N
        jMenu3.setText("Complain");
        jMenu3.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        jMenu3.setMargin(new java.awt.Insets(3, 30, 3, 30));
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu3);

        jMenu4.setIcon(new javax.swing.ImageIcon("/Users/aditya/Documents/Netbeans/JKLU_LPG_Booking_system/src/main/java/images/logout.png")); // NOI18N
        jMenu4.setText("Logout");
        jMenu4.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        jMenu4.setMargin(new java.awt.Insets(3, 30, 3, 30));
        jMenu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu4MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu4);

        jMenu5.setIcon(new javax.swing.ImageIcon("/Users/aditya/Documents/Netbeans/JKLU_LPG_Booking_system/src/main/java/images/exit_logo.png")); // NOI18N
        jMenu5.setText("Exit");
        jMenu5.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        jMenu5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu5MouseClicked(evt);
            }
        });
        jMenu5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu5ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        try{
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from user where username='"+UserN+"'");
            while(rs.next()){
                
//                String date = rs.getString(2);
                String category = jComboBox1.getItemAt(jComboBox1.getSelectedIndex());
                String address = rs.getString(5);
                String pending = "pending";
               
                try{
                    PreparedStatement ps = con.prepareStatement("insert into "+UserN+" (category, address, delivery) value(?,?,?)");
                    ps.setString(1, category);
                    ps.setString(2, address);
                    ps.setString(3, pending);
                    ps.executeUpdate();
                    
                    PreparedStatement newps = con.prepareStatement("update user set revenue  = 0, lastdelivery = '"+"pending"+"'  where username = '"+UserN+"';");
//                    newps.setString(1, pending);
                    newps.executeUpdate();
                    
                    System.out.println(newps);


                    JOptionPane.showMessageDialog(null, "Successfully ordered");
                    

                    }
                    catch(HeadlessException | SQLException e){
                    JOptionPane.showConfirmDialog(null, e);
                    }
                
                
                
                
                
            }
        }
        catch(SQLException e){
        }
 
//        setVisible(false);
//        new Home_Page().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        if(jComboBox1.getItemAt(jComboBox1.getSelectedIndex()) == "5 kg"){
            im_5kg.setVisible(true);
            jLabel5.setVisible(false);
            jLabel6.setVisible(false);
        } if(jComboBox1.getItemAt(jComboBox1.getSelectedIndex()) == "14.2 kg"){
            jLabel5.setVisible(true);
            jLabel6.setVisible(false);
            im_5kg.setVisible(false);
        } if(jComboBox1.getItemAt(jComboBox1.getSelectedIndex()) == "19 kg"){
            jLabel6.setVisible(true);
            jLabel5.setVisible(false);
            im_5kg.setVisible(false);
        }

    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenu5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu5ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jMenu5ActionPerformed

    private void jMenu5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu5MouseClicked
        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog(null, "Do you really want to exit Application", "select",
                                JOptionPane.YES_NO_OPTION);
                if (a == 0) {
                        System.exit(0);
                }
    }//GEN-LAST:event_jMenu5MouseClicked

    private void jMenu4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu4MouseClicked
        // TODO add your handling code here:
        JFrame  jf = new JFrame();
        jf.setAlwaysOnTop(true);
        int a = JOptionPane.showConfirmDialog(jf, "Do you really want to Logout","Select", JOptionPane.YES_NO_OPTION);
        if(a==0){
            setVisible(false);
            new Home_Page().setVisible(true);
        }
        
    }//GEN-LAST:event_jMenu4MouseClicked

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        // TODO add your handling code here:
        new UserProfile(UserN).setVisible(true);
    }//GEN-LAST:event_jMenu1MouseClicked

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        // TODO add your handling code here:
        setVisible(false);
        new UserOrderList().setVisible(true);
    }//GEN-LAST:event_jMenu2MouseClicked

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
        // TODO add your handling code here:
        new ComplainPanel().setVisible(true);
    }//GEN-LAST:event_jMenu3MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UserHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel im_5kg;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
