/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CODE;

import java.awt.Color;
import static java.lang.Thread.sleep;
import javax.swing.JOptionPane;

/**
 *
 * @author usman
 */
public class LEVEL8 extends javax.swing.JFrame {

    /**
     * Creates new form LEVEL4
     */
     int cc=25;
     boolean suspended = true;
     int just=0;
    public LEVEL8() {
        initComponents();
        
        getContentPane().setBackground(Color.WHITE);
         setSize(880,500);
         timeee2();
    }
    public void suspended()
    {
        suspended=false;
    }
    public void timeee2()
    {
        
        
      Thread clock;
             clock = new Thread()
             {
                 @Override
                 public void run()
                 {
                     
                     while(suspended)
                     {
                         
                         cc--;
                         String str = Integer.toString(cc);
                         
                         TIME2.setText(str);
                         if(cc==0)
                         {
                             
                          JOptionPane.showMessageDialog(null, "Time Up");
                     
                          HHgG();
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
    
    void HHgG()
    {
        MainMenu m1=new MainMenu();
            m1.setVisible(true);
           this.setVisible(false);
           this.dispose();
    }
    

    
    int scoree4;
    int hh;
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mouthhh = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        flower = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        flow2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        number2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        appleeee = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        rosee = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        numberPlateLabel = new javax.swing.JLabel();
        longBigPipeLabel = new javax.swing.JLabel();
        gunFrontLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        SCORE4 = new javax.swing.JLabel();
        TIME2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        btnHint = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        mouthhh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CODE/19.JPG"))); // NOI18N
        mouthhh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mouthhhMouseClicked(evt);
            }
        });
        getContentPane().add(mouthhh);
        mouthhh.setBounds(60, 150, 84, 70);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setText("Score:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(10, 10, 100, 40);

        flower.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CODE/18.JPG"))); // NOI18N
        flower.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                flowerMouseClicked(evt);
            }
        });
        getContentPane().add(flower);
        flower.setBounds(650, 300, 110, 100);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Find These Objects:");
        jLabel5.setToolTipText("");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(220, 10, 200, 30);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CODE/20.JPG"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(660, 10, 90, 60);

        flow2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CODE/16.JPG"))); // NOI18N
        flow2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                flow2MouseClicked(evt);
            }
        });
        getContentPane().add(flow2);
        flow2.setBounds(590, 380, 30, 70);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CODE/19.JPG"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(400, 10, 60, 68);

        number2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CODE/21.JPG"))); // NOI18N
        number2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                number2MouseClicked(evt);
            }
        });
        getContentPane().add(number2);
        number2.setBounds(550, 340, 30, 50);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CODE/18.JPG"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(470, 10, 60, 60);

        appleeee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CODE/17.JPG"))); // NOI18N
        appleeee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                appleeeeMouseClicked(evt);
            }
        });
        getContentPane().add(appleeee);
        appleeee.setBounds(10, 280, 99, 70);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CODE/16.JPG"))); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(540, 10, 20, 50);

        rosee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CODE/20.JPG"))); // NOI18N
        rosee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                roseeMouseClicked(evt);
            }
        });
        getContentPane().add(rosee);
        rosee.setBounds(110, 210, 100, 190);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CODE/21.JPG"))); // NOI18N
        getContentPane().add(jLabel9);
        jLabel9.setBounds(630, 10, 20, 60);

        numberPlateLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CODE/46.JPG"))); // NOI18N
        numberPlateLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                numberPlateLabelMouseClicked(evt);
            }
        });
        getContentPane().add(numberPlateLabel);
        numberPlateLabel.setBounds(820, 500, 48, 30);

        longBigPipeLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CODE/47.JPG"))); // NOI18N
        longBigPipeLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                longBigPipeLabelMouseClicked(evt);
            }
        });
        getContentPane().add(longBigPipeLabel);
        longBigPipeLabel.setBounds(640, 100, 25, 240);

        gunFrontLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CODE/48.JPG"))); // NOI18N
        gunFrontLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gunFrontLabelMouseClicked(evt);
            }
        });
        getContentPane().add(gunFrontLabel);
        gunFrontLabel.setBounds(340, 230, 74, 60);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CODE/49.JPG"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(515, 490, 80, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CODE/1200x720_17595_Garage_fire_station_2d_illustration_game_art_location_picture_image_digital_art.jpg"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 100, 1020, 460);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CODE/17.JPG"))); // NOI18N
        getContentPane().add(jLabel10);
        jLabel10.setBounds(570, 10, 50, 50);

        SCORE4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        SCORE4.setToolTipText("");
        getContentPane().add(SCORE4);
        SCORE4.setBounds(110, 20, 80, 30);

        TIME2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        TIME2.setForeground(new java.awt.Color(102, 0, 102));
        getContentPane().add(TIME2);
        TIME2.setBounds(220, 50, 140, 30);

        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(0, 70, 90, 23);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CODE/46.JPG"))); // NOI18N
        jLabel11.setText("jLabel11");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(750, 10, 50, 50);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CODE/47.JPG"))); // NOI18N
        getContentPane().add(jLabel12);
        jLabel12.setBounds(810, 0, 30, 100);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CODE/48.JPG"))); // NOI18N
        getContentPane().add(jLabel13);
        jLabel13.setBounds(840, 10, 60, 60);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CODE/49.JPG"))); // NOI18N
        getContentPane().add(jLabel14);
        jLabel14.setBounds(910, 20, 70, 40);

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
        btnHint.setBounds(130, 60, 61, 25);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mouthhhMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouthhhMouseClicked
        // TODO add your handling code here:
        
        
         scoree4=scoree4+10;
       String str = Integer.toString(scoree4);
       
       SCORE4.setText(str);
     mouthhh.setVisible(false);
     jLabel4.setVisible(false);
        hh++;
        checkGameee4();
    }//GEN-LAST:event_mouthhhMouseClicked

    private void number2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_number2MouseClicked
        // TODO add your handling code here:
         scoree4=scoree4+10;
       String str = Integer.toString(scoree4);
       
       SCORE4.setText(str);
     number2.setVisible(false);
     jLabel9.setVisible(false);
        hh++;
        checkGameee4();
    }//GEN-LAST:event_number2MouseClicked

    private void flow2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_flow2MouseClicked
        // TODO add your handling code here:
        scoree4=scoree4+10;
       String str = Integer.toString(scoree4);
       
       SCORE4.setText(str);
     flow2.setVisible(false);
     jLabel8.setVisible(false);
     
        hh++;
        checkGameee4();
    }//GEN-LAST:event_flow2MouseClicked

    private void roseeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roseeMouseClicked
        // TODO add your handling code here:
        
         scoree4=scoree4+10;
       String str = Integer.toString(scoree4);
       
       SCORE4.setText(str);
    rosee.setVisible(false);
    jLabel3.setVisible(false);
        hh++;
        checkGameee4();
        
    }//GEN-LAST:event_roseeMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        
        
         scoree4=scoree4-10;
        String str = Integer.toString(scoree4);
       
        SCORE4.setText(str);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void appleeeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_appleeeeMouseClicked
        // TODO add your handling code here:
        scoree4=scoree4+10;
        String str = Integer.toString(scoree4);

        SCORE4.setText(str);
        appleeee.setVisible(false);
        jLabel10.setVisible(false);
        hh++;
        checkGameee4();
    }//GEN-LAST:event_appleeeeMouseClicked

    private void flowerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_flowerMouseClicked
        // TODO add your handling code here:

        scoree4=scoree4+10;
        String str = Integer.toString(scoree4);

        SCORE4.setText(str);
        flower.setVisible(false);
        jLabel6.setVisible(false);
        hh++;
        checkGameee4();

    }//GEN-LAST:event_flowerMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        NewGame n=new NewGame();
        n.gameSvaing("8");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void numberPlateLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_numberPlateLabelMouseClicked
        
                scoree4=scoree4+10;
        String str = Integer.toString(scoree4);

        SCORE4.setText(str);
        numberPlateLabel.setVisible(false);
        jLabel11.setVisible(false);
        hh++;
        checkGameee4();
    }//GEN-LAST:event_numberPlateLabelMouseClicked

    private void longBigPipeLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_longBigPipeLabelMouseClicked
        
                scoree4=scoree4+10;
        String str = Integer.toString(scoree4);

        SCORE4.setText(str);
        longBigPipeLabel.setVisible(false);
        jLabel12.setVisible(false);
        hh++;
        checkGameee4();
    }//GEN-LAST:event_longBigPipeLabelMouseClicked

    private void gunFrontLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gunFrontLabelMouseClicked
        
                scoree4=scoree4+10;
        String str = Integer.toString(scoree4);

        SCORE4.setText(str);
        gunFrontLabel.setVisible(false);
        jLabel13.setVisible(false);
        hh++;
        checkGameee4();
                
    }//GEN-LAST:event_gunFrontLabelMouseClicked

    private void btnHintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHintActionPerformed
        // TODO add your handling code here:

        JOptionPane.showMessageDialog(null,"See Small Images.....");
    }//GEN-LAST:event_btnHintActionPerformed

    public void checkGameee4()
    {
        int res=1;
        if(hh==10)
        {
            if( scoree4>=50)
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
      //JOptionPane.showMessageDialog(null,"oK");
      LEVEL9 l9=new LEVEL9();
      l9.setVisible(true);
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
            java.util.logging.Logger.getLogger(LEVEL4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LEVEL4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LEVEL4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LEVEL4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LEVEL8().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel SCORE4;
    private javax.swing.JLabel TIME2;
    private javax.swing.JLabel appleeee;
    private javax.swing.JButton btnHint;
    private javax.swing.JLabel flow2;
    private javax.swing.JLabel flower;
    private javax.swing.JLabel gunFrontLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel longBigPipeLabel;
    private javax.swing.JLabel mouthhh;
    private javax.swing.JLabel number2;
    private javax.swing.JLabel numberPlateLabel;
    private javax.swing.JLabel rosee;
    // End of variables declaration//GEN-END:variables
}
