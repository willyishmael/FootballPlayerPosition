/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package footballplayerposition;

/**
 *
 * @author User
 */
public class MainLayout extends javax.swing.JFrame {

    /**
     * Creates new form MainView
     */
    
  
    
    public MainLayout() {
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

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        tfPhy = new javax.swing.JTextField();
        tfDef = new javax.swing.JTextField();
        tfDrib = new javax.swing.JTextField();
        tfPass = new javax.swing.JTextField();
        tfShoot = new javax.swing.JTextField();
        tfAcc = new javax.swing.JTextField();
        btnCreate = new javax.swing.JLabel();
        tfFoot = new javax.swing.JTextField();
        tfNumber = new javax.swing.JTextField();
        tfNation = new javax.swing.JTextField();
        tfName = new javax.swing.JTextField();
        bgLabel = new javax.swing.JLabel();
        infoButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(960, 760));
        setResizable(false);
        getContentPane().setLayout(null);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/footballplayerposition/Create.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setOpaque(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(650, 600, 210, 50);

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setBorderPainted(false);
        jButton2.setOpaque(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(10, 660, 50, 50);

        tfPhy.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        tfPhy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPhyActionPerformed(evt);
            }
        });
        getContentPane().add(tfPhy);
        tfPhy.setBounds(560, 600, 50, 30);

        tfDef.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        tfDef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDefActionPerformed(evt);
            }
        });
        getContentPane().add(tfDef);
        tfDef.setBounds(560, 550, 50, 30);

        tfDrib.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        tfDrib.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDribActionPerformed(evt);
            }
        });
        getContentPane().add(tfDrib);
        tfDrib.setBounds(560, 500, 50, 30);

        tfPass.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        tfPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPassActionPerformed(evt);
            }
        });
        getContentPane().add(tfPass);
        tfPass.setBounds(300, 600, 50, 30);

        tfShoot.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        tfShoot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfShootActionPerformed(evt);
            }
        });
        getContentPane().add(tfShoot);
        tfShoot.setBounds(300, 550, 50, 30);

        tfAcc.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        tfAcc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfAccActionPerformed(evt);
            }
        });
        getContentPane().add(tfAcc);
        tfAcc.setBounds(300, 500, 50, 30);
        getContentPane().add(btnCreate);
        btnCreate.setBounds(660, 610, 190, 30);

        tfFoot.setBackground(new java.awt.Color(0, 166, 82));
        tfFoot.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        tfFoot.setForeground(new java.awt.Color(255, 255, 255));
        tfFoot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfFootActionPerformed(evt);
            }
        });
        getContentPane().add(tfFoot);
        tfFoot.setBounds(340, 360, 290, 30);

        tfNumber.setBackground(new java.awt.Color(0, 166, 82));
        tfNumber.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        tfNumber.setForeground(new java.awt.Color(255, 255, 255));
        tfNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNumberActionPerformed(evt);
            }
        });
        getContentPane().add(tfNumber);
        tfNumber.setBounds(340, 320, 290, 30);

        tfNation.setBackground(new java.awt.Color(0, 166, 82));
        tfNation.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        tfNation.setForeground(new java.awt.Color(255, 255, 255));
        tfNation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNationActionPerformed(evt);
            }
        });
        getContentPane().add(tfNation);
        tfNation.setBounds(340, 280, 290, 30);

        tfName.setBackground(new java.awt.Color(0, 166, 82));
        tfName.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        tfName.setForeground(new java.awt.Color(255, 255, 255));
        tfName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNameActionPerformed(evt);
            }
        });
        getContentPane().add(tfName);
        tfName.setBounds(340, 240, 290, 30);

        bgLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/footballplayerposition/ui.jpg"))); // NOI18N
        getContentPane().add(bgLabel);
        bgLabel.setBounds(0, 0, 960, 720);

        infoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infoButtonActionPerformed(evt);
            }
        });
        getContentPane().add(infoButton);
        infoButton.setBounds(10, 663, 50, 50);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNameActionPerformed

    private void tfNationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNationActionPerformed

    private void tfNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNumberActionPerformed

    private void tfFootActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfFootActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfFootActionPerformed

    private void tfAccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfAccActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfAccActionPerformed

    private void tfShootActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfShootActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfShootActionPerformed

    private void tfPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPassActionPerformed

    private void tfDribActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDribActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfDribActionPerformed

    private void tfDefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDefActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfDefActionPerformed

    private void tfPhyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPhyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPhyActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        double acc = Double.parseDouble(tfAcc.getText());
        double shoot = Double.parseDouble(tfShoot.getText());
        double pass = Double.parseDouble(tfPass.getText());
        double drib = Double.parseDouble(tfDrib.getText());
        double def = Double.parseDouble(tfDef.getText());
        double phy = Double.parseDouble(tfPhy.getText());
        
        String name = (tfName.getText());
        String nation = (tfNation.getText());
        String number = (tfNumber.getText());
        String foot = (tfFoot.getText());
        
        double[] stat = {acc, shoot, pass, drib, def, phy};
        
        Model model = new Model();
        model.listPlayerStat(stat);
        model.position();
        
        ResultLayout resultLayout = new ResultLayout();
        resultLayout.strikerScore = model.strikerScore;
        resultLayout.centerScore = model.centerScore;
        resultLayout.defenceScore = model.defenceScore;
        
        resultLayout.name = name;
        resultLayout.nation = nation;
        resultLayout.number = number;
        resultLayout.foot = foot;
                
        resultLayout.playerStat = stat;
        
        System.out.println(model.strikerScore);
        System.out.println(model.centerScore);
        System.out.println(model.defenceScore);
        
        this.dispose();
        resultLayout.setVisible(true);
        
 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void infoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infoButtonActionPerformed
        InfoLayout infoLayout = new InfoLayout();
        infoLayout.setVisible(true);
    }//GEN-LAST:event_infoButtonActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        InfoLayout infoLayout = new InfoLayout();
        this.dispose();
        infoLayout.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    

    
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
            java.util.logging.Logger.getLogger(MainLayout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainLayout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainLayout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainLayout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainLayout().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bgLabel;
    private javax.swing.JLabel btnCreate;
    private javax.swing.JButton infoButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JTextField tfAcc;
    private javax.swing.JTextField tfDef;
    private javax.swing.JTextField tfDrib;
    private javax.swing.JTextField tfFoot;
    private javax.swing.JTextField tfName;
    private javax.swing.JTextField tfNation;
    private javax.swing.JTextField tfNumber;
    private javax.swing.JTextField tfPass;
    private javax.swing.JTextField tfPhy;
    private javax.swing.JTextField tfShoot;
    // End of variables declaration//GEN-END:variables
}
