/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CODE;

import java.awt.Color;
import java.awt.event.WindowEvent;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author usman
 */
public class NewGame extends javax.swing.JFrame {

    /**
     * Creates new form NewGame
     */
     int sc=0;//for scores
     int obj=0;//check the objectsss
    
    public NewGame() {
        initComponents();
         setSize(900,700);
         //this.setBackground(Color.yellow);
         getContentPane().setBackground(Color.WHITE);
         
         
    }

    public void close()
    {
     //   WindowEvent w1=new WindowEvent(NewGame.Wi, sc)
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        watermelon = new javax.swing.JLabel();
        strawberry = new javax.swing.JLabel();
        banana = new javax.swing.JLabel();
        watermelon1 = new javax.swing.JLabel();
        banana2 = new javax.swing.JLabel();
        strawberry1 = new javax.swing.JLabel();
        banana1 = new javax.swing.JLabel();
        strawberry2 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        SCOREE = new javax.swing.JLabel();
        chikooLabel = new javax.swing.JLabel();
        angorLabel = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        BACKKK = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        banana3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnHint = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        watermelon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CODE/watermelon.png"))); // NOI18N
        watermelon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                watermelonMouseClicked(evt);
            }
        });
        getContentPane().add(watermelon);
        watermelon.setBounds(80, 150, 180, 120);

        strawberry.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CODE/strawberry.png"))); // NOI18N
        strawberry.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                strawberryMouseClicked(evt);
            }
        });
        getContentPane().add(strawberry);
        strawberry.setBounds(60, 500, 128, 130);

        banana.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CODE/banana.png"))); // NOI18N
        banana.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bananaMouseClicked(evt);
            }
        });
        getContentPane().add(banana);
        banana.setBounds(300, 530, 128, 130);

        watermelon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CODE/watermelon.png"))); // NOI18N
        watermelon1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                watermelon1MouseClicked(evt);
            }
        });
        getContentPane().add(watermelon1);
        watermelon1.setBounds(10, 290, 180, 120);

        banana2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CODE/banana-icon.png"))); // NOI18N
        banana2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                banana2MouseClicked(evt);
            }
        });
        getContentPane().add(banana2);
        banana2.setBounds(740, 380, 260, 270);

        strawberry1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CODE/strawberry.png"))); // NOI18N
        strawberry1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                strawberry1MouseClicked(evt);
            }
        });
        getContentPane().add(strawberry1);
        strawberry1.setBounds(780, 260, 128, 130);

        banana1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CODE/banana.png"))); // NOI18N
        banana1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                banana1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                banana1MouseEntered(evt);
            }
        });
        getContentPane().add(banana1);
        banana1.setBounds(650, 130, 120, 100);

        strawberry2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CODE/strawberry.png"))); // NOI18N
        strawberry2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                strawberry2MouseClicked(evt);
            }
        });
        getContentPane().add(strawberry2);
        strawberry2.setBounds(440, 450, 128, 140);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Score:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 10, 80, 40);

        SCOREE.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        SCOREE.setForeground(new java.awt.Color(153, 0, 0));
        getContentPane().add(SCOREE);
        SCOREE.setBounds(100, 10, 60, 40);

        chikooLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CODE/68.JPG"))); // NOI18N
        chikooLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chikooLabelMouseClicked(evt);
            }
        });
        getContentPane().add(chikooLabel);
        chikooLabel.setBounds(310, 270, 171, 125);

        angorLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CODE/69.JPG"))); // NOI18N
        angorLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                angorLabelMouseClicked(evt);
            }
        });
        getContentPane().add(angorLabel);
        angorLabel.setBounds(370, 420, 40, 35);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CODE/70.JPG"))); // NOI18N
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel8);
        jLabel8.setBounds(500, 790, 68, 30);

        BACKKK.setBackground(new java.awt.Color(0, 102, 0));
        BACKKK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CODE/fruits-70a.jpg"))); // NOI18N
        BACKKK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BACKKKMouseClicked(evt);
            }
        });
        getContentPane().add(BACKKK);
        BACKKK.setBounds(0, 90, 1170, 780);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CODE/strawberry2.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(420, 10, 50, 60);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CODE/watermelon2.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(480, 10, 50, 60);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Find These Objects:");
        jLabel5.setToolTipText("");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(170, 20, 180, 30);

        banana3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CODE/banana.png"))); // NOI18N
        getContentPane().add(banana3);
        banana3.setBounds(340, 430, 128, 130);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CODE/banana-icon4.png"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(360, 10, 60, 50);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CODE/banana3.png"))); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(540, 10, 52, 50);

        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(240, 220, 34, 14);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CODE/68.JPG"))); // NOI18N
        getContentPane().add(jLabel9);
        jLabel9.setBounds(600, 10, 140, 60);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CODE/69.JPG"))); // NOI18N
        getContentPane().add(jLabel11);
        jLabel11.setBounds(750, 10, 40, 50);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CODE/70.JPG"))); // NOI18N
        getContentPane().add(jLabel10);
        jLabel10.setBounds(800, 20, 68, 40);

        btnHint.setBackground(new java.awt.Color(51, 102, 0));
        btnHint.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnHint.setForeground(new java.awt.Color(255, 255, 255));
        btnHint.setText("Hint");
        btnHint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHintActionPerformed(evt);
            }
        });
        getContentPane().add(btnHint);
        btnHint.setBounds(940, 20, 61, 25);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BACKKKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BACKKKMouseClicked
        // TODO add your handling code here:
        sc=sc-10;
        String str = Integer.toString(sc);
       
        SCOREE.setText(str);
        
       
    }//GEN-LAST:event_BACKKKMouseClicked
public void  gameSvaing(String f)
    {
        String path="D:\\Documents and Settings\\zaheer\\Desktop\\Hidden Object Game\\src\\CODE\\save.txt";
        try {
            FileWriter fw=new FileWriter(path);
            BufferedWriter bw=new BufferedWriter(fw);
            bw.write(f);
            bw.close();
        } catch (IOException ex) {
            Logger.getLogger(LEVEL2.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public void checkScore()
    {
        MainMenu ob=new MainMenu();
        if(sc<20)
        {
            JOptionPane.showMessageDialog(rootPane, "Your score is to low");
            NewGame.this.dispose();
            NewGame.this.setVisible(false);
            ob.setVisible(true);
        }
    }
    private void watermelon1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_watermelon1MouseClicked
        // TODO add your handling code here:
       
        sc=sc+10;
       String str = Integer.toString(sc);
       
        SCOREE.setText(str);
        watermelon1.setVisible(false);
        obj++;
        checkGame();
        
    }//GEN-LAST:event_watermelon1MouseClicked

    private void strawberryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_strawberryMouseClicked
        // TODO add your handling code here:
         sc=sc+10;
       String str = Integer.toString(sc);
       
        SCOREE.setText(str);
        strawberry.setVisible(false);
        obj++;
        checkGame();
    }//GEN-LAST:event_strawberryMouseClicked

    private void banana2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_banana2MouseClicked
        // TODO add your handling code here:
        
        sc=sc+10;
       String str = Integer.toString(sc);
      
        SCOREE.setText(str);
       banana2.setVisible(false);
       obj++;
        checkGame();
    }//GEN-LAST:event_banana2MouseClicked

    private void watermelonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_watermelonMouseClicked
        // TODO add your handling code here:
         sc=sc+10;
       String str = Integer.toString(sc);
       
        SCOREE.setText(str);
      watermelon.setVisible(false);
      obj++;
       checkGame(); 
        
    }//GEN-LAST:event_watermelonMouseClicked

    private void strawberry1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_strawberry1MouseClicked
        // TODO add your handling code here:
        
         sc=sc+10;
       String str = Integer.toString(sc);
       
        SCOREE.setText(str);
      strawberry1.setVisible(false);
      obj++;
       checkGame(); 
    }//GEN-LAST:event_strawberry1MouseClicked

    private void bananaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bananaMouseClicked
        // TODO add your handling code here:
          sc=sc+10;
       String str = Integer.toString(sc);
       
        SCOREE.setText(str);
      banana.setVisible(false);
      obj++;
      checkGame();
    }//GEN-LAST:event_bananaMouseClicked

    private void strawberry2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_strawberry2MouseClicked
        // TODO add your handling code here:
         sc=sc+10;
       String str = Integer.toString(sc);
       
        SCOREE.setText(str);
     strawberry2.setVisible(false);
     obj++;
        
        checkGame();
    }//GEN-LAST:event_strawberry2MouseClicked

    private void banana1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_banana1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_banana1MouseEntered

    private void banana1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_banana1MouseClicked
        // TODO add your handling code here:
        
         sc=sc+10;
       String str = Integer.toString(sc);
       
        SCOREE.setText(str);
      banana1.setVisible(false);
      obj++;
      checkGame();
    }//GEN-LAST:event_banana1MouseClicked

    private void angorLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_angorLabelMouseClicked
        
                sc=sc+10;
       String str = Integer.toString(sc);
       
        SCOREE.setText(str);
      angorLabel.setVisible(false);
      jLabel11.setVisible(false);
      obj++;
      checkGame();
    }//GEN-LAST:event_angorLabelMouseClicked

    private void chikooLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chikooLabelMouseClicked
        
                sc=sc+10;
       String str = Integer.toString(sc);
       
        SCOREE.setText(str);
      chikooLabel.setVisible(false);
      jLabel9.setVisible(false);
      obj++;
      checkGame();
    }//GEN-LAST:event_chikooLabelMouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        
                sc=sc+10;
       String str = Integer.toString(sc);
       
        SCOREE.setText(str);
      jLabel8.setVisible(false);
      jLabel10.setVisible(false);
      obj++;
      checkGame();
    }//GEN-LAST:event_jLabel8MouseClicked

    private void btnHintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHintActionPerformed
        // TODO add your handling code here:

        JOptionPane.showMessageDialog(null,"See Bold Images.....");
    }//GEN-LAST:event_btnHintActionPerformed

    void checkGame()
    {
        int res = 1;
        if(obj==10)
        {
           if( sc>=70)
           {
             res= JOptionPane.showConfirmDialog(null,"Congratulations you have found all the hidden objects." + "\n"+" Do you want to continue? ");
        
           }
           else
           {
               JOptionPane.showMessageDialog(rootPane, "Your Scoore is to low");
           }
        if (res==JOptionPane.YES_OPTION)
        {
        //JOptionPane.showMessageDialog(null,"oK");
          
            
           LEVEL2 l2=new LEVEL2();
           l2.setVisible(true);
           this.setVisible(false);
           this.dispose();
        }
        else
        {
            
            MainMenu m1=new MainMenu();
            m1.setVisible(true);
           this.setVisible(false);
           this.dispose();
        }
            }
    }
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
            java.util.logging.Logger.getLogger(NewGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new NewGame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BACKKK;
    private javax.swing.JLabel SCOREE;
    private javax.swing.JLabel angorLabel;
    private javax.swing.JLabel banana;
    private javax.swing.JLabel banana1;
    private javax.swing.JLabel banana2;
    private javax.swing.JLabel banana3;
    private javax.swing.JButton btnHint;
    private javax.swing.JLabel chikooLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel strawberry;
    private javax.swing.JLabel strawberry1;
    private javax.swing.JLabel strawberry2;
    private javax.swing.JLabel watermelon;
    private javax.swing.JLabel watermelon1;
    // End of variables declaration//GEN-END:variables
}
