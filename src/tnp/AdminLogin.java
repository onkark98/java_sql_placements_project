/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tnp;
import java.sql.*;
import net.proteanit.sql.DbUtils;
import javax.swing.*;

/**
 *
 * @author SWAPNIL LAHOTI
 */
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

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnView = new javax.swing.JButton();
        btnView1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        table_1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();
        rollTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        rollTxt1 = new javax.swing.JTextField();
        btnDelete = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);
        setMinimumSize(new java.awt.Dimension(920, 445));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Welcome Admin ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(216, 11, 207, 28);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Registered students list :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(179, 62, 174, 17);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Company's list :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(179, 95, 149, 23);

        btnView.setText("VIEW");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });
        getContentPane().add(btnView);
        btnView.setBounds(367, 61, 76, 30);

        btnView1.setText("VIEW");
        btnView1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnView1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnView1);
        btnView1.setBounds(367, 97, 76, 30);

        jButton3.setText("Logout");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(487, 32, 76, 30);

        table.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(table);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 230, 452, 200);

        table_1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(table_1);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(10, 150, 450, 70);

        jLabel4.setText("Search Student");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(520, 130, 110, 20);

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        getContentPane().add(btnSearch);
        btnSearch.setBounds(520, 200, 100, 30);
        getContentPane().add(rollTxt);
        rollTxt.setBounds(520, 160, 100, 37);

        jLabel5.setText("Delete Student");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(520, 280, 100, 20);

        rollTxt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rollTxt1ActionPerformed(evt);
            }
        });
        getContentPane().add(rollTxt1);
        rollTxt1.setBounds(520, 300, 100, 37);

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btnDelete);
        btnDelete.setBounds(520, 340, 100, 30);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tnp/Webp.net-resizeimage (10).jpg"))); // NOI18N
        jLabel6.setMaximumSize(new java.awt.Dimension(920, 445));
        jLabel6.setMinimumSize(new java.awt.Dimension(920, 445));
        jLabel6.setPreferredSize(new java.awt.Dimension(920, 445));
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 0, 920, 445);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnView1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnView1ActionPerformed
        try{
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/tnp1","root","");
				
					String query="select cmp_name from company";
					PreparedStatement pst=con.prepareStatement(query);
					ResultSet rs=pst.executeQuery();
					table.setModel(DbUtils.resultSetToTableModel(rs));
					
				
				//st.executeUpdate(sql);
					
					//JOptionPane.showMessageDialog(null,"Data is successfully inserted into the database." );
					//this.;
					pst.close();
					con.close();
				}
				catch(Exception e)
				{System.out.println(e);}	

    }//GEN-LAST:event_btnView1ActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
try{
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/tnp1","root","");
				
					String query="select * from profile";
					PreparedStatement pst=con.prepareStatement(query);
					ResultSet rs=pst.executeQuery();
					table.setModel(DbUtils.resultSetToTableModel(rs));
					
				
				//st.executeUpdate(sql);
					
					//JOptionPane.showMessageDialog(null,"Data is successfully inserted into the database." );
					//this.;
					pst.close();
					con.close();
				}
				catch(Exception e)
				{System.out.println(e);}	       
    }//GEN-LAST:event_btnViewActionPerformed

    
     
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void rollTxt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rollTxt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rollTxt1ActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
          try{
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/tnp1","root","");
				
					String query="select cmp_name from company left join profile on company.min_ptr<=profile.aggr && company.dead>=profile.dead && company.live<=profile.live where roll='"+rollTxt.getText()+"'";
					PreparedStatement pst=con.prepareStatement(query);
					ResultSet rs=pst.executeQuery();
					table.setModel(DbUtils.resultSetToTableModel(rs));
					
					String query1="select name from profile where roll='"+rollTxt.getText()+"'";
					PreparedStatement pst1=con.prepareStatement(query1);
					ResultSet rs1=pst1.executeQuery();
					table_1.setModel(DbUtils.resultSetToTableModel(rs1));
				
					pst.close();
					con.close();
				}
				catch(Exception e)
				{System.out.println(e);}
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
         try{
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/tnp1","root","");
				Statement st = con.createStatement();
					//preparedStatement st= null;
				String sql = "delete from profile where roll='"+rollTxt1.getText()+"'";	
			//	st=con.prepareStatement(sql);
			//	st.setString(1, name);
			//	st.setString(2, roll);
				st.executeUpdate(sql);
					
					JOptionPane.showMessageDialog(null,"Data is successfully Deleted from the database." );
					
					st.close();
					con.close();
				}
				catch(Exception e)
				{System.out.println(e);}
    }//GEN-LAST:event_btnDeleteActionPerformed

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
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnView;
    private javax.swing.JButton btnView1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField rollTxt;
    private javax.swing.JTextField rollTxt1;
    private javax.swing.JTable table;
    private javax.swing.JTable table_1;
    // End of variables declaration//GEN-END:variables
}