/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CODE;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author usman
 */
public class MainMenu extends javax.swing.JFrame {

    /**
     * Creates new form MainMenu
     */
    public MainMenu() {
        initComponents();
        setSize(650,500);
       
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        exit = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnNewGame = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        exit.setBackground(new java.awt.Color(153, 0, 0));
        exit.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        exit.setForeground(new java.awt.Color(255, 255, 255));
        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        getContentPane().add(exit);
        exit.setBounds(420, 300, 220, 50);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Hidden Object Game");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(100, 30, 520, 110);

        btnNewGame.setBackground(new java.awt.Color(153, 0, 0));
        btnNewGame.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnNewGame.setForeground(new java.awt.Color(255, 255, 255));
        btnNewGame.setText("New Game");
        btnNewGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewGameActionPerformed(evt);
            }
        });
        getContentPane().add(btnNewGame);
        btnNewGame.setBounds(420, 180, 220, 50);

        jButton1.setBackground(new java.awt.Color(153, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Load Game");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(420, 240, 220, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CODE/wpid-photo-feb-6-2013-1252-am.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 790, 480);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNewGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewGameActionPerformed
        // TODO add your handling code here:
       NAMES n1=new NAMES();
       n1.setVisible(true);
      this.setVisible(false);
           this.dispose();
    }//GEN-LAST:event_btnNewGameActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    public void fileFlush() throws IOException
    {
        String path="D:\\Documents and Settings\\limon\\Desktop\\Hidden Object Game\\src\\CODE\\save.txt";
       
        
        FileWriter fw=new FileWriter(path);
        BufferedWriter bw=new BufferedWriter(fw);
        bw.flush();
        bw.close();
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       String path="D:\\Documents and Settings\\limon\\Desktop\\Hidden Object Game\\src\\CODE\\save.txt";
        try {
            FileReader fr=new FileReader(path);
            BufferedReader br=new BufferedReader(fr);
            int temp=Integer.valueOf(br.readLine());
            br.close();
            if(temp==2)
            {
                fileFlush();
                this.dispose();
                LEVEL2 t=new LEVEL2();
                
                
                t.setVisible(true);
            }
            else if(temp==3)
            {
                fileFlush();
                this.dispose();
                LEVEL3 t=new LEVEL3();
                
                
                t.setVisible(true);
            }
            else if(temp==4)
            {
                fileFlush();
                this.dispose();
                LEVEL4 t=new LEVEL4();
                
                
                t.setVisible(true);
            }
            else if(temp==5)
            {
                fileFlush();
                this.dispose();
                LEVEL5 t=new LEVEL5();
                
                
                t.setVisible(true);
            }
            else if(temp==6)
            {
                fileFlush();
                this.dispose();
                LEVEL6 t=new LEVEL6();
                
                
                t.setVisible(true);
            }
            else if(temp==6)
            {
                fileFlush();
                this.dispose();
                LEVEL6 t=new LEVEL6();
                
                
                t.setVisible(true);
            }
            else if(temp==7)
            {
                fileFlush();
                this.dispose();
                LEVEL7 t=new LEVEL7();
                
                
                t.setVisible(true);
            }
            else if(temp==8)
            {
                fileFlush();
                this.dispose();
                LEVEL8 t=new LEVEL8();
                
                
                t.setVisible(true);
            }
            else if(temp==9)
            {
                fileFlush();
                this.dispose();
                LEVEL9 t=new LEVEL9();
                
                
                t.setVisible(true);
            }
            else if(temp==10)
            {
                fileFlush();
                this.dispose();
                LEVEL10 t=new LEVEL10();
                
                
                t.setVisible(true);
            }
            //JOptionPane.showMessageDialog(rootPane, temp);
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNewGame;
    private javax.swing.JButton exit;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables

 
}
