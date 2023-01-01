/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package libraryApp;

import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import static libraryApp.Db_Helper.*;

public class BookEdit extends javax.swing.JFrame {
    
    private static String bookId;
    Connection conn = DriverManager.getConnection(db_URL, username, password);
    Statement st = conn.createStatement();
    String sqld = "SELECT * FROM kitaplar";
    ResultSet rs = st.executeQuery(sqld);
    public BookEdit() throws SQLException{
        initComponents();
        DefaultTableModel tblModel = (DefaultTableModel) table_Books.getModel();
        Db_Helper.dbToTable(tblModel);
        //Db_Helper.dbTableClear();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        button_Save = new javax.swing.JButton();
        button_Back = new javax.swing.JButton();
        button_Exit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        text_BookName = new javax.swing.JTextField();
        text_WriterName = new javax.swing.JTextField();
        text_BookContent = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_Books = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("KİTAP İÇERİK GÜNCELLEME");
        getContentPane().setLayout(null);

        button_Save.setBackground(new java.awt.Color(153, 153, 153));
        button_Save.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        button_Save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/tamam.png"))); // NOI18N
        button_Save.setText("GÜNCELLE");
        button_Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_SaveActionPerformed(evt);
            }
        });
        getContentPane().add(button_Save);
        button_Save.setBounds(360, 210, 330, 30);

        button_Back.setBackground(new java.awt.Color(153, 153, 153));
        button_Back.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        button_Back.setText("<- GERİ");
        button_Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_BackActionPerformed(evt);
            }
        });
        getContentPane().add(button_Back);
        button_Back.setBounds(20, 610, 100, 40);

        button_Exit.setBackground(new java.awt.Color(153, 153, 153));
        button_Exit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        button_Exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/programkapat.png"))); // NOI18N
        button_Exit.setText("ÇIKIŞ");
        button_Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_ExitActionPerformed(evt);
            }
        });
        getContentPane().add(button_Exit);
        button_Exit.setBounds(910, 610, 100, 40);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel1.setText("KİTABIN ADI");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(140, 90, 100, 30);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel2.setText("KİTABIN YAZARI");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(140, 130, 140, 30);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel3.setText("KİTABIN İÇERİĞİ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(140, 170, 130, 30);
        getContentPane().add(text_BookName);
        text_BookName.setBounds(300, 90, 590, 30);
        getContentPane().add(text_WriterName);
        text_WriterName.setBounds(300, 130, 590, 30);
        getContentPane().add(text_BookContent);
        text_BookContent.setBounds(300, 170, 590, 30);

        table_Books.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kitap İsmi", "Yazari", "İçerik"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_Books.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_BooksMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(table_Books);
        if (table_Books.getColumnModel().getColumnCount() > 0) {
            table_Books.getColumnModel().getColumn(0).setResizable(false);
            table_Books.getColumnModel().getColumn(1).setResizable(false);
            table_Books.getColumnModel().getColumn(2).setResizable(false);
        }

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(61, 254, 920, 350);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 102));
        jLabel4.setText("KİTAP İÇERİK GÜNCELLEME EKRANI");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(210, 20, 640, 50);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/search.jpg"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 1030, 700);

        setSize(new java.awt.Dimension(1040, 708));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void table_BooksMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_BooksMouseClicked
       DefaultTableModel model =(DefaultTableModel)table_Books.getModel();
        int selectrowindex= table_Books.getSelectedRow();
        bookId = model.getValueAt(selectrowindex, 0).toString();
        text_BookName.setText(model.getValueAt(selectrowindex, 0).toString());
        text_WriterName.setText(model.getValueAt(selectrowindex, 1).toString());
        text_BookContent.setText(model.getValueAt(selectrowindex, 2).toString());
    }//GEN-LAST:event_table_BooksMouseClicked

    private void button_SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_SaveActionPerformed
       String bookName = text_BookName.getText();
        String bookWriter = text_WriterName.getText();
        String bookContent = text_BookContent.getText();
        try {
            Db_Helper.UpdateBooks(bookName,bookWriter, bookContent, bookId);
            BookEdit menu = new BookEdit();
            menu.setVisible(true);
            setVisible(false);
        } catch (SQLException e) {}

        
       }//GEN-LAST:event_button_SaveActionPerformed

    private void button_BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_BackActionPerformed
        PageBooks menu;
        try {
            menu = new PageBooks();
            menu.setVisible(true);
            setVisible(false);
        } catch (SQLException ex) {
            Logger.getLogger(BookEdit.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_button_BackActionPerformed

    private void button_ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_ExitActionPerformed
       setVisible(false);
    }//GEN-LAST:event_button_ExitActionPerformed

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
            java.util.logging.Logger.getLogger(BookEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new BookEdit().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(BookEdit.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_Back;
    private javax.swing.JButton button_Exit;
    private javax.swing.JButton button_Save;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable table_Books;
    private javax.swing.JTextField text_BookContent;
    private javax.swing.JTextField text_BookName;
    private javax.swing.JTextField text_WriterName;
    // End of variables declaration//GEN-END:variables
}
