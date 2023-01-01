/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package libraryApp;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
public class AdminLogin extends javax.swing.JFrame {

    /**
     * Creates new form AdminLogin
     */
    public AdminLogin() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        button_People = new javax.swing.JButton();
        button_Back = new javax.swing.JButton();
        button_Exit = new javax.swing.JButton();
        button_Books = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        button_People.setBackground(new java.awt.Color(153, 153, 153));
        button_People.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        button_People.setText("ÜYELER");
        button_People.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_PeopleActionPerformed(evt);
            }
        });
        getContentPane().add(button_People);
        button_People.setBounds(370, 220, 290, 90);

        button_Back.setBackground(new java.awt.Color(153, 153, 153));
        button_Back.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        button_Back.setText("<- GERİ");
        button_Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_BackActionPerformed(evt);
            }
        });
        getContentPane().add(button_Back);
        button_Back.setBounds(10, 620, 105, 36);

        button_Exit.setBackground(new java.awt.Color(153, 153, 153));
        button_Exit.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        button_Exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/programkapat.png"))); // NOI18N
        button_Exit.setText("KAPAT");
        button_Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_ExitActionPerformed(evt);
            }
        });
        getContentPane().add(button_Exit);
        button_Exit.setBounds(900, 620, 105, 36);

        button_Books.setBackground(new java.awt.Color(153, 153, 153));
        button_Books.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        button_Books.setText("KİTAPLAR");
        button_Books.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_BooksActionPerformed(evt);
            }
        });
        getContentPane().add(button_Books);
        button_Books.setBounds(370, 350, 290, 90);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("YÖNETİCİ KONTROL EKRANI");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(260, 90, 710, 110);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/AdminMenu.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 1020, 700);

        setSize(new java.awt.Dimension(1040, 708));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void button_PeopleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_PeopleActionPerformed
       PageUser menu;
        try {
            menu = new PageUser();
            menu.setVisible(true);
            setVisible(false);
        } catch (SQLException ex) {
            Logger.getLogger(AdminLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_button_PeopleActionPerformed

    private void button_BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_BackActionPerformed
        LoginScreen menu=new LoginScreen();
        menu.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_button_BackActionPerformed

    
    private void button_ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_ExitActionPerformed
      setVisible(false);
    }//GEN-LAST:event_button_ExitActionPerformed

                                         

    private void button_BooksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_BooksActionPerformed
        PageBooks menu;
        try {
            menu = new PageBooks(); 
            menu.setVisible(true);
            setVisible(false);
        } catch (SQLException ex) {
            Logger.getLogger(AdminLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_button_BooksActionPerformed

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
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_Back;
    private javax.swing.JButton button_Books;
    private javax.swing.JButton button_Exit;
    private javax.swing.JButton button_People;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}