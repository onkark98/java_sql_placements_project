/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tnp;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.imageio.*;
import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

/**
 *
 * @author SWAPNIL LAHOTI
 */
public class dpanel1 extends javax.swing.JPanel {

    /**
     * Creates new form dpanel1
     */
    public dpanel1() {
        initComponents();
        
    }
public void playSound(String soundName)
     {
       try 
       {
        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(soundName).getAbsoluteFile());
        Clip clip = AudioSystem.getClip();
        clip.open(audioInputStream);
        clip.start();
       }
       catch(Exception ex)
       {
         System.out.println("Error with playing sound.");
         ex.printStackTrace( );
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

        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jLabel4.setText("jLabel4");

        setMinimumSize(new java.awt.Dimension(920, 445));
        setPreferredSize(new java.awt.Dimension(920, 445));
        setRequestFocusEnabled(false);
        setVerifyInputWhenFocusTarget(false);
        setLayout(null);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("EMAIL :");
        add(jLabel2);
        jLabel2.setBounds(230, 120, 80, 30);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setText("PASSWORD:");
        add(jLabel3);
        jLabel3.setBounds(190, 180, 120, 30);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        add(jTextField1);
        jTextField1.setBounds(320, 120, 150, 30);
        add(jTextField2);
        jTextField2.setBounds(320, 180, 150, 30);

        jButton1.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jButton1.setText("LOGIN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(360, 230, 80, 24);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tnp/Webp.net-resizeimage (10).jpg"))); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(0, 0, 920, 450);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
       try {
					
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/tnp1","root","");
					String query="select * from registration where email=? and password=? ";
					PreparedStatement pst= con.prepareStatement(query);
					pst.setString(1,jTextField1.getText() );
					pst.setString(2,jTextField2.getText() );
					ResultSet rs=pst.executeQuery();
					int count=0;
					while(rs.next()) 
					{
						count=count+1;
						
					}
					if(count==1)
					{
						JOptionPane.showMessageDialog(null, "user name and password is correct");
						
						StudentLogin frame1;
        frame1 = new StudentLogin();
        frame1.setVisible(true);  
					}
					else if(count>1) 
					{
						
						JOptionPane.showMessageDialog(null, "duplicate username and password");
					}
					else {
						JOptionPane.showMessageDialog(null, "user name and password is not correct");
					}
					rs.close();
					pst.close();
				}
				catch(Exception e){
					JOptionPane.showMessageDialog(null, e);
				
					
					}
        
    /*StudentLogin frame1;
        frame1 = new StudentLogin();
        frame1.setVisible(true); */   
        
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}