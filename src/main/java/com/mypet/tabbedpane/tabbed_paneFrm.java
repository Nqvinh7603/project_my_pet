/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mypet.tabbedpane;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;

/**
 *
 * @author Admin
 */
public class tabbed_paneFrm extends javax.swing.JFrame implements ActionListener{

    /**
     * Creates new form tabbed_paneFrm
     */
    public tabbed_paneFrm() {
        initComponents();
         addButtonGroup();
        addActionListener();
        addActionCommand();
        radioCat.setSelected(true);
        cbCat.addActionListener(this);
        cbChicken.addActionListener(this);
        cbDog.addActionListener(this);
        cbDuck.addActionListener(this);
        cbPig.addActionListener(this);
        cbRabbit.addActionListener(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        labelPet = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        radioCat = new javax.swing.JRadioButton();
        radioChicken = new javax.swing.JRadioButton();
        radioDog = new javax.swing.JRadioButton();
        radioDuck = new javax.swing.JRadioButton();
        radioPig = new javax.swing.JRadioButton();
        radioRabbit = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        iconDuck = new javax.swing.JLabel();
        iconChicken = new javax.swing.JLabel();
        iconPig = new javax.swing.JLabel();
        iconRabbit = new javax.swing.JLabel();
        iconDog = new javax.swing.JLabel();
        iconCat = new javax.swing.JLabel();
        cbDog = new javax.swing.JCheckBox();
        cbDuck = new javax.swing.JCheckBox();
        cbChicken = new javax.swing.JCheckBox();
        cbPig = new javax.swing.JCheckBox();
        cbRabbit = new javax.swing.JCheckBox();
        cbCat = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelPet.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelPet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mypet/images/cat.png"))); // NOI18N
        labelPet.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "My Pet", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Choose my pet", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N

        radioCat.setText("Cat");

        radioChicken.setText("Chicken");
        radioChicken.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioChickenActionPerformed(evt);
            }
        });

        radioDog.setText("Dog");
        radioDog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioDogActionPerformed(evt);
            }
        });

        radioDuck.setText("Duck");

        radioPig.setText("Pig");

        radioRabbit.setText("Rabbit");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(radioCat)
                .addGap(56, 56, 56)
                .addComponent(radioDog)
                .addGap(43, 43, 43)
                .addComponent(radioChicken)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(radioDuck)
                .addGap(45, 45, 45)
                .addComponent(radioPig)
                .addGap(58, 58, 58)
                .addComponent(radioRabbit)
                .addGap(38, 38, 38))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioCat)
                    .addComponent(radioChicken)
                    .addComponent(radioDuck)
                    .addComponent(radioPig)
                    .addComponent(radioRabbit)
                    .addComponent(radioDog))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelPet)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelPet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 616, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jTabbedPane1.addTab("Raddio__button", jPanel1);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PET CỦA BẠN");

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Chọn pet của bạn", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N

        iconDuck.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mypet/images/duck.jpg"))); // NOI18N
        iconDuck.setEnabled(false);

        iconChicken.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mypet/images/chicken_2.png"))); // NOI18N
        iconChicken.setEnabled(false);

        iconPig.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mypet/images/pig_2.png"))); // NOI18N
        iconPig.setEnabled(false);

        iconRabbit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mypet/images/rabbit_2.png"))); // NOI18N
        iconRabbit.setEnabled(false);

        iconDog.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mypet/images/dog_1.png"))); // NOI18N
        iconDog.setEnabled(false);

        iconCat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mypet/images/cat_2.png"))); // NOI18N
        iconCat.setEnabled(false);

        cbDog.setText("Dog");

        cbDuck.setText("Duck");
        cbDuck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbDuckActionPerformed(evt);
            }
        });

        cbChicken.setText("Chicken");
        cbChicken.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbChickenActionPerformed(evt);
            }
        });

        cbPig.setText("Pig");

        cbRabbit.setText("Rabbit");

        cbCat.setText("Cat ");
        cbCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(iconDog, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(iconPig, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cbDog)
                    .addComponent(cbPig))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(iconDuck, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(iconRabbit, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbDuck)
                    .addComponent(cbRabbit))
                .addGap(67, 67, 67)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbCat)
                    .addComponent(cbChicken)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(iconChicken, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(iconCat, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(17, 17, 17))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(cbDog)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(iconDog, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cbPig)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(iconPig, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbDuck)
                    .addComponent(cbChicken))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(iconDuck, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(iconChicken, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(98, 98, 98)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cbRabbit)
                    .addComponent(cbCat))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(iconRabbit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(iconCat, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Check_box", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 616, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 587, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void radioChickenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioChickenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioChickenActionPerformed

    private void radioDogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioDogActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioDogActionPerformed

    private void cbDuckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbDuckActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbDuckActionPerformed

    private void cbChickenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbChickenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbChickenActionPerformed

    private void cbCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbCatActionPerformed

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
            java.util.logging.Logger.getLogger(tabbed_paneFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tabbed_paneFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tabbed_paneFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tabbed_paneFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tabbed_paneFrm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox cbCat;
    private javax.swing.JCheckBox cbChicken;
    private javax.swing.JCheckBox cbDog;
    private javax.swing.JCheckBox cbDuck;
    private javax.swing.JCheckBox cbPig;
    private javax.swing.JCheckBox cbRabbit;
    private javax.swing.JLabel iconCat;
    private javax.swing.JLabel iconChicken;
    private javax.swing.JLabel iconDog;
    private javax.swing.JLabel iconDuck;
    private javax.swing.JLabel iconPig;
    private javax.swing.JLabel iconRabbit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel labelPet;
    private javax.swing.JRadioButton radioCat;
    private javax.swing.JRadioButton radioChicken;
    private javax.swing.JRadioButton radioDog;
    private javax.swing.JRadioButton radioDuck;
    private javax.swing.JRadioButton radioPig;
    private javax.swing.JRadioButton radioRabbit;
    // End of variables declaration//GEN-END:variables

    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if(obj.equals(cbCat)){
            iconCat.setEnabled(!iconCat.isEnabled());
        }else if(obj.equals(cbChicken)){
            iconChicken.setEnabled(!iconChicken.isEnabled());
        }else if(obj.equals(cbDog)){
            iconDog.setEnabled(!iconDog.isEnabled());
        }else if(obj.equals(cbDuck)){
            iconDuck.setEnabled(!iconDuck.isEnabled());
        }else if(obj.equals(cbPig)){
            iconPig.setEnabled(!iconPig.isEnabled());
        }else if(obj.equals(cbRabbit)){
            iconRabbit.setEnabled(!iconRabbit.isEnabled());
        }
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        ImageIcon icon = new ImageIcon(getClass().getResource("/com/mypet/images/" + e.getActionCommand() +".png" ));
        labelPet.setIcon(icon);
        
    }
     

    private void addButtonGroup() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        buttonGroup1.add(radioCat);
        buttonGroup1.add(radioChicken);
        buttonGroup1.add(radioDog);
        buttonGroup1.add(radioDuck);
        buttonGroup1.add(radioPig);
        buttonGroup1.add(radioRabbit);
    }

    private void addActionListener() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        radioCat.addActionListener(this);
        radioChicken.addActionListener(this);
        radioDog.addActionListener(this);
        radioDuck.addActionListener(this);
        radioPig.addActionListener(this);
        radioRabbit.addActionListener(this);
    }

    private void addActionCommand() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        radioCat.setActionCommand("cat");
        radioChicken.setActionCommand("chicken");
        radioDog.setActionCommand("Dog");
        radioDuck.setActionCommand("Duck");
        radioPig.setActionCommand("Pig");
        radioRabbit.setActionCommand("Rabbit");
    }
}
