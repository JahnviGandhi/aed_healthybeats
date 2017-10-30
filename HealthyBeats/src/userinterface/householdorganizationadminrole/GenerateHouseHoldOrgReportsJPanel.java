/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.householdorganizationadminrole;

import business.enterprise.Enterprise;
import business.organization.HouseHoldOrganization;
import business.organization.Organization;
import business.useraccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author JAHNVI
 */
public class GenerateHouseHoldOrgReportsJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private Organization organization;
    private UserAccount userAccount;
    private HouseHoldOrganization houseOrg;
    
    /**
     * Creates new form GenerateHouseHoldOrgReportsJPanel
     */
    public GenerateHouseHoldOrgReportsJPanel() {
        initComponents();
    }
    
    public GenerateHouseHoldOrgReportsJPanel(JPanel userProcessContainer, Enterprise enterprise, Organization organization, UserAccount userAccount) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.organization = organization;
        this.userAccount = userAccount;
        this.houseOrg = (HouseHoldOrganization) this.organization;
        
        welcomeMsg.setText(welcomeMsg.getText().replace("<Name>", userAccount.getPerson().getFirstName() + " " + userAccount.getPerson().getLastName()));
        
        if (houseOrg.getWorkQueue().getWorkRequestList().isEmpty()) {
            viewHealthiestMemberInHouseBtn.setEnabled(false);
            viewFamilyVsTrendsBtn.setEnabled(false);
            viewFamilyNutriTrendsBtn.setEnabled(false);
            errorMsgLbl.setText("No health check request found!");
            errorMsgLbl.setVisible(true);
        }
        else {
            viewHealthiestMemberInHouseBtn.setEnabled(true);
            viewFamilyVsTrendsBtn.setEnabled(true);
            viewFamilyNutriTrendsBtn.setEnabled(true);
            errorMsgLbl.setVisible(true);
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

        titleLbl = new javax.swing.JLabel();
        welcomeMsg = new javax.swing.JLabel();
        viewHealthiestMemberInHouseBtn = new javax.swing.JButton();
        viewFamilyVsTrendsBtn = new javax.swing.JButton();
        viewFamilyNutriTrendsBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        errorMsgLbl = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 204));
        setPreferredSize(new java.awt.Dimension(740, 670));

        titleLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        titleLbl.setForeground(new java.awt.Color(0, 102, 102));
        titleLbl.setText("House Hold Organization - Generate Reports");

        welcomeMsg.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        welcomeMsg.setForeground(new java.awt.Color(0, 102, 102));
        welcomeMsg.setText("Welcome, <Name>!");

        viewHealthiestMemberInHouseBtn.setBackground(new java.awt.Color(153, 153, 153));
        viewHealthiestMemberInHouseBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        viewHealthiestMemberInHouseBtn.setForeground(new java.awt.Color(0, 102, 102));
        viewHealthiestMemberInHouseBtn.setText("View Healthiest Member in The House");
        viewHealthiestMemberInHouseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewHealthiestMemberInHouseBtnActionPerformed(evt);
            }
        });

        viewFamilyVsTrendsBtn.setBackground(new java.awt.Color(153, 153, 153));
        viewFamilyVsTrendsBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        viewFamilyVsTrendsBtn.setForeground(new java.awt.Color(0, 102, 102));
        viewFamilyVsTrendsBtn.setText("View Family Vital Sign Trends");
        viewFamilyVsTrendsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewFamilyVsTrendsBtnActionPerformed(evt);
            }
        });

        viewFamilyNutriTrendsBtn.setBackground(new java.awt.Color(153, 153, 153));
        viewFamilyNutriTrendsBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        viewFamilyNutriTrendsBtn.setForeground(new java.awt.Color(0, 102, 102));
        viewFamilyNutriTrendsBtn.setText("View Family Nutrients Trends");
        viewFamilyNutriTrendsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewFamilyNutriTrendsBtnActionPerformed(evt);
            }
        });

        backBtn.setBackground(new java.awt.Color(153, 153, 153));
        backBtn.setForeground(new java.awt.Color(0, 102, 102));
        backBtn.setText("<<  Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        errorMsgLbl.setForeground(new java.awt.Color(255, 102, 102));
        errorMsgLbl.setText("<Error Message>");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(welcomeMsg)
                .addGap(137, 137, 137))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(222, 222, 222)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(viewHealthiestMemberInHouseBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(viewFamilyVsTrendsBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(viewFamilyNutriTrendsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(backBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(titleLbl))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(244, 244, 244)
                        .addComponent(errorMsgLbl)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(titleLbl)
                .addGap(37, 37, 37)
                .addComponent(welcomeMsg)
                .addGap(99, 99, 99)
                .addComponent(viewHealthiestMemberInHouseBtn)
                .addGap(49, 49, 49)
                .addComponent(viewFamilyVsTrendsBtn)
                .addGap(50, 50, 50)
                .addComponent(viewFamilyNutriTrendsBtn)
                .addGap(36, 36, 36)
                .addComponent(errorMsgLbl)
                .addGap(58, 58, 58)
                .addComponent(backBtn)
                .addContainerGap(144, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void viewHealthiestMemberInHouseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewHealthiestMemberInHouseBtnActionPerformed
        // TODO add your handling code here:
        ViewHealtiestMemberInHouseJPanel viewHealthiestMemberInHousePanel = new ViewHealtiestMemberInHouseJPanel(userProcessContainer, houseOrg, userAccount);
        userProcessContainer.add("viewHealthiestMemberInHousePanel", viewHealthiestMemberInHousePanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_viewHealthiestMemberInHouseBtnActionPerformed

    private void viewFamilyVsTrendsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewFamilyVsTrendsBtnActionPerformed
        // TODO add your handling code here:
        ViewFamilyVitalSignTrendsJPanel viewFamilyVsTrendsPanel = new ViewFamilyVitalSignTrendsJPanel(userProcessContainer, houseOrg, userAccount);
        userProcessContainer.add("viewFamilyVsTrendPanel", viewFamilyVsTrendsPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_viewFamilyVsTrendsBtnActionPerformed

    private void viewFamilyNutriTrendsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewFamilyNutriTrendsBtnActionPerformed
        // TODO add your handling code here:
        ViewFamilyNutrientTrendsJPanel viewFamilyNutriTrendsPanel = new ViewFamilyNutrientTrendsJPanel(userProcessContainer, houseOrg, userAccount);
        userProcessContainer.add("viewFamilyNutriTrendPanel", viewFamilyNutriTrendsPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_viewFamilyNutriTrendsBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel errorMsgLbl;
    private javax.swing.JLabel titleLbl;
    private javax.swing.JButton viewFamilyNutriTrendsBtn;
    private javax.swing.JButton viewFamilyVsTrendsBtn;
    private javax.swing.JButton viewHealthiestMemberInHouseBtn;
    private javax.swing.JLabel welcomeMsg;
    // End of variables declaration//GEN-END:variables
}
