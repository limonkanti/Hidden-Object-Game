/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CODE;

import java.awt.Color;
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author usman
 */
public class LEVEL3 extends javax.swing.JFrame {

    /**
     * Creates new form LEVEL3
     */
    
       Thread clock = null;
         int cc=30;
         boolean suspended = true;
         int just=0;
    public LEVEL3() {
        initComponents();
         getContentPane().setBackground(Color.WHITE);
         setSize(813,466);
         
         
         

         
       
     timeee();

    }
    public void suspended()
    {
        suspended=false;
    }
    public void timeee()
    {
        
        
      
             clock = new Thread()
             {
                 @Override
                 public void run()
                 {
                     
                     while(suspended)
                     {
                         
                         cc--;
                         String str = Integer.toString(cc);
                         
                         TIME.setText(str);
                         
                         if(cc==0)
                         {
                          JOptionPane.showMessageDialog(null, "Time Up Level faild");
                     
                          
                          
                          HHg();
                         }
                         if(just==1)
                         {
                             suspended();
                         }
                         
//  System.out.println("Ok");
                         try
                         {
                             
                             sleep(1000);
                             
                             
                             
                         }
                         catch(Exception e)
                             
                         {
                             
                         }
                     }
                    
                 }
             };
       clock.start();   
    }
    
    void HHg()
    {
        MainMenu m1=new MainMenu();
            m1.setVisible(true);
           this.setVisible(false);
           this.dispose();
    }
    
    int scoree;
    int gg;
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        ladder = new javax.swing.JLabel();
        SCORE3 = new javax.swing.JLabel();
        sofa = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        number1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        suit = new javax.swing.JLabel();
        lbl6 = new javax.swing.JLabel();
        home = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lbl77 = new javax.swing.JLabel();
        TIME = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        lbl66 = new javax.swing.JLabel();
        btnHint = new javax.swing.JButton();
        lbl100 = new javax.swing.JLabel();
        ladder1 = new javax.swing.JLabel();
        lbl999 = new javax.swing.JLabel();
        lbl8 = new javax.swing.JLabel();
        lblpp = new javax.swing.JLabel();
        lbl11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lbl99 = new javax.swing.JLabel();
        lblpp1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Find These Objects:");
        jLabel5.setToolTipText("");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(290, 10, 200, 30);

        ladder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CODE/ta.png"))); // NOI18N
        ladder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ladderMouseClicked(evt);
            }
        });
        getContentPane().add(ladder);
        ladder.setBounds(560, 360, 72, 90);

        SCORE3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(SCORE3);
        SCORE3.setBounds(110, 0, 88, 40);

        sofa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CODE/ssa.png"))); // NOI18N
        sofa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sofaMouseClicked(evt);
            }
        });
        getContentPane().add(sofa);
        sofa.setBounds(110, 140, 64, 70);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setText("Score:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(10, 0, 100, 30);

        number1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CODE/1.png"))); // NOI18N
        number1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                number1MouseClicked(evt);
            }
        });
        getContentPane().add(number1);
        number1.setBounds(110, 270, 32, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CODE/homee2.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(680, 0, 48, 40);

        suit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CODE/suitt.png"))); // NOI18N
        suit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                suitMouseClicked(evt);
            }
        });
        getContentPane().add(suit);
        suit.setBounds(40, 370, 64, 70);

        lbl6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CODE/rag-doll-icon.png"))); // NOI18N
        getContentPane().add(lbl6);
        lbl6.setBounds(480, 50, 48, 40);

        home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CODE/homee2.png"))); // NOI18N
        home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeMouseClicked(evt);
            }
        });
        getContentPane().add(home);
        home.setBounds(480, 330, 48, 48);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CODE/sofa222.png"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(530, 0, 48, 48);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CODE/1.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(590, 0, 48, 48);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CODE/ssar.png"))); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(630, 0, 48, 48);

        lbl77.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CODE/as3.png"))); // NOI18N
        lbl77.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl77MouseClicked(evt);
            }
        });
        getContentPane().add(lbl77);
        lbl77.setBounds(750, 360, 60, 50);

        TIME.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        TIME.setForeground(new java.awt.Color(0, 0, 153));
        getContentPane().add(TIME);
        TIME.setBounds(200, 40, 60, 40);

        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(0, 30, 80, 23);

        lbl66.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CODE/rag-doll-icon.png"))); // NOI18N
        lbl66.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl66MouseClicked(evt);
            }
        });
        getContentPane().add(lbl66);
        lbl66.setBounds(380, 370, 32, 50);

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
        btnHint.setBounds(220, 10, 61, 25);

        lbl100.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CODE/uu.png"))); // NOI18N
        lbl100.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl100MouseClicked(evt);
            }
        });
        getContentPane().add(lbl100);
        lbl100.setBounds(270, 360, 80, 40);

        ladder1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CODE/lad2.png"))); // NOI18N
        getContentPane().add(ladder1);
        ladder1.setBounds(480, 2, 48, 48);

        lbl999.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CODE/doll.png"))); // NOI18N
        lbl999.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl999MouseClicked(evt);
            }
        });
        getContentPane().add(lbl999);
        lbl999.setBounds(460, 310, 30, 40);

        lbl8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CODE/as3.png"))); // NOI18N
        getContentPane().add(lbl8);
        lbl8.setBounds(730, 40, 50, 50);

        lblpp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CODE/Voodoo-Doll-icon.png"))); // NOI18N
        lblpp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblppMouseClicked(evt);
            }
        });
        getContentPane().add(lblpp);
        lblpp.setBounds(720, 140, 50, 40);

        lbl11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CODE/uu.png"))); // NOI18N
        getContentPane().add(lbl11);
        lbl11.setBounds(580, 50, 50, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CODE/asss.jpg"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 100, 820, 340);

        lbl99.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CODE/doll.png"))); // NOI18N
        getContentPane().add(lbl99);
        lbl99.setBounds(540, 50, 30, 40);

        lblpp1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CODE/Voodoo-Doll-icon.png"))); // NOI18N
        getContentPane().add(lblpp1);
        lblpp1.setBounds(660, 50, 50, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void number1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_number1MouseClicked
        // TODO add your handling code here:
        
          scoree=scoree+10;
       String str = Integer.toString(scoree);
       
       SCORE3.setText(str);
     number1.setVisible(false);
     jLabel4.setVisible(false);
        gg++;
           try {
               checkGameee();
           } catch (InterruptedException ex) {
               Logger.getLogger(LEVEL3.class.getName()).log(Level.SEVERE, null, ex);
           }
        
    }//GEN-LAST:event_number1MouseClicked

    private void suitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_suitMouseClicked
        // TODO add your handling code here:
        
        
        scoree=scoree+10;
       String str = Integer.toString(scoree);
       
       SCORE3.setText(str);
     suit.setVisible(false);
     jLabel8.setVisible(false);
        gg++;
           try {
               checkGameee();
           } catch (InterruptedException ex) {
               Logger.getLogger(LEVEL3.class.getName()).log(Level.SEVERE, null, ex);
           }
        
    }//GEN-LAST:event_suitMouseClicked

    private void sofaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sofaMouseClicked
        // TODO add your handling code here:
        
        
         scoree=scoree+10;
       String str = Integer.toString(scoree);
       
       SCORE3.setText(str);
  sofa.setVisible(false);
  jLabel6.setVisible(false);
        gg++;
           try {
               checkGameee();
           } catch (InterruptedException ex) {
               Logger.getLogger(LEVEL3.class.getName()).log(Level.SEVERE, null, ex);
           }
    }//GEN-LAST:event_sofaMouseClicked

    private void ladderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ladderMouseClicked
        // TODO add your handling code here:
         scoree=scoree+10;
       String str = Integer.toString(scoree);
       
       SCORE3.setText(str);
  ladder.setVisible(false);
  ladder1.setVisible(false);
        gg++;
           try {
               checkGameee();
           } catch (InterruptedException ex) {
               Logger.getLogger(LEVEL3.class.getName()).log(Level.SEVERE, null, ex);
           }
        
        
    }//GEN-LAST:event_ladderMouseClicked

    private void homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseClicked
        // TODO add your handling code here:
         scoree=scoree+10;
       String str = Integer.toString(scoree);
       
       SCORE3.setText(str);
 home.setVisible(false);
 jLabel2.setVisible(false);
        gg++;
           try {
               checkGameee();
           } catch (InterruptedException ex) {
               Logger.getLogger(LEVEL3.class.getName()).log(Level.SEVERE, null, ex);
           }
        
    }//GEN-LAST:event_homeMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        scoree=scoree-10;
        String str = Integer.toString(scoree);
       
        SCORE3.setText(str);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        NewGame n=new NewGame();
        n.gameSvaing("3");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnHintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHintActionPerformed
        // TODO add your handling code here:

        JOptionPane.showMessageDialog(null,"See Light Images.....");
    }//GEN-LAST:event_btnHintActionPerformed

    private void lbl77MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl77MouseClicked
 scoree=scoree+10;
       String str = Integer.toString(scoree);
       
       SCORE3.setText(str);
     lbl8.setVisible(false);
    lbl77.setVisible(false);
        gg++;
           try {
               checkGameee();
           } catch (InterruptedException ex) {
               Logger.getLogger(LEVEL3.class.getName()).log(Level.SEVERE, null, ex);
           }        // TODO add your handling code here:

       

    }//GEN-LAST:event_lbl77MouseClicked

    private void lbl66MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl66MouseClicked
        // TODO add your handling code here:
        
        
        scoree=scoree+10;
       String str = Integer.toString(scoree);
       
       SCORE3.setText(str);
     lbl6.setVisible(false);
     lbl66.setVisible(false);
        gg++;
           try {
               checkGameee();
           } catch (InterruptedException ex) {
               Logger.getLogger(LEVEL3.class.getName()).log(Level.SEVERE, null, ex);
           }        // TODO add your handling code here:

       
    }//GEN-LAST:event_lbl66MouseClicked

    private void lbl100MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl100MouseClicked
        // TODO add your handling code here:
        
        
          scoree=scoree+10;
       String str = Integer.toString(scoree);
       
       SCORE3.setText(str);
     lbl11.setVisible(false);
     lbl100.setVisible(false);
        gg++;
           try {
               checkGameee();
           } catch (InterruptedException ex) {
               Logger.getLogger(LEVEL3.class.getName()).log(Level.SEVERE, null, ex);
           }     
        
        
    }//GEN-LAST:event_lbl100MouseClicked

    private void lbl999MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl999MouseClicked
        // TODO add your handling code here:
        
         scoree=scoree+10;
       String str = Integer.toString(scoree);
       
       SCORE3.setText(str);
     lbl99.setVisible(false);
     lbl999.setVisible(false);
        gg++;
           try {
               checkGameee();
           } catch (InterruptedException ex) {
               Logger.getLogger(LEVEL3.class.getName()).log(Level.SEVERE, null, ex);
           }     
        
    }//GEN-LAST:event_lbl999MouseClicked

    private void lblppMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblppMouseClicked
        // TODO add your handling code here:
        
        
         scoree=scoree+10;
       String str = Integer.toString(scoree);
       
       SCORE3.setText(str);
     lblpp.setVisible(false);
     lblpp1.setVisible(false);
        gg++;
           try {
               checkGameee();
           } catch (InterruptedException ex) {
               Logger.getLogger(LEVEL3.class.getName()).log(Level.SEVERE, null, ex);
           }    
    }//GEN-LAST:event_lblppMouseClicked

    public void checkGameee() throws InterruptedException
    {
        int res=1;
         if(gg==10)
        {
            if( scoree>90)
           {
             res= JOptionPane.showConfirmDialog(null,"Congratulations you have found all the hidden objects." + "\n"+" Do you want to continue? ");
        
             just=1;
           }
           else
           {
               JOptionPane.showMessageDialog(rootPane, "Your Scoore is to low");
           }
            //int res= JOptionPane.showConfirmDialog(null,"Congratulations you have found all the hidden objects." + "\n"+" Do you want to continue? ");
            //just=1;
        if (res==JOptionPane.YES_OPTION)
        {
       // JOptionPane.showMessageDialog(null,"oK");
          
          
            
            
            
          LEVEL4 l4=new LEVEL4();
          l4.setVisible(true);
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
            java.util.logging.Logger.getLogger(LEVEL3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LEVEL3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LEVEL3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LEVEL3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LEVEL3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel SCORE3;
    private javax.swing.JLabel TIME;
    private javax.swing.JButton btnHint;
    private javax.swing.JLabel home;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel ladder;
    private javax.swing.JLabel ladder1;
    private javax.swing.JLabel lbl100;
    private javax.swing.JLabel lbl11;
    private javax.swing.JLabel lbl6;
    private javax.swing.JLabel lbl66;
    private javax.swing.JLabel lbl77;
    private javax.swing.JLabel lbl8;
    private javax.swing.JLabel lbl99;
    private javax.swing.JLabel lbl999;
    private javax.swing.JLabel lblpp;
    private javax.swing.JLabel lblpp1;
    private javax.swing.JLabel number1;
    private javax.swing.JLabel sofa;
    private javax.swing.JLabel suit;
    // End of variables declaration//GEN-END:variables
}
