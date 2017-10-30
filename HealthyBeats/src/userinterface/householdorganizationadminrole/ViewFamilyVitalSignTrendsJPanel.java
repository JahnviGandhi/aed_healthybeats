/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.householdorganizationadminrole;

import business.data.VitalSign;
import business.household.HouseHold;
import business.organization.HouseHoldOrganization;
import business.person.FamilyMember;
import business.useraccount.UserAccount;
import java.awt.CardLayout;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.labels.ItemLabelAnchor;
import org.jfree.chart.labels.ItemLabelPosition;
import org.jfree.chart.labels.StandardCategoryItemLabelGenerator;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.TextAnchor;

/**
 *
 * @author JAHNVI
 */
public class ViewFamilyVitalSignTrendsJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private HouseHoldOrganization houseOrg;
    private UserAccount userAccount;
    private ArrayList<FamilyMember> members;
    
    /**
     * Creates new form ViewFamilyVitalSignTrendsJPanel
     */
    public ViewFamilyVitalSignTrendsJPanel() {
        initComponents();
    }

    public ViewFamilyVitalSignTrendsJPanel(JPanel userProcessContainer, HouseHoldOrganization houseOrg, UserAccount userAccount) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.houseOrg = houseOrg;
        this.userAccount = userAccount;
        displayDetails();
    }
    
    public void displayDetails() {
        welcomeNameLbl.setText(welcomeNameLbl.getText().replace("<Name>", userAccount.getPerson().getFirstName() + " " + userAccount.getPerson().getLastName()));
        bindHouseCombo();
    }

    public void bindHouseCombo() {
        houseHoldCombo.removeAllItems();
        
        for (HouseHold house : houseOrg.getHouseHoldDirectory().getHouseHoldDirectory()) {
            houseHoldCombo.addItem(house);
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

        welcomeLbl = new javax.swing.JLabel();
        welcomeNameLbl = new javax.swing.JLabel();
        titleLbl = new javax.swing.JLabel();
        selectHouseHoldLbl = new javax.swing.JLabel();
        houseHoldCombo = new javax.swing.JComboBox();
        backBtn = new javax.swing.JButton();
        viewTrendsBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 204));
        setPreferredSize(new java.awt.Dimension(740, 670));

        welcomeLbl.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        welcomeLbl.setForeground(new java.awt.Color(0, 102, 102));
        welcomeLbl.setText("Welcome,");

        welcomeNameLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        welcomeNameLbl.setForeground(new java.awt.Color(0, 102, 102));
        welcomeNameLbl.setText("<Name>!");

        titleLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        titleLbl.setForeground(new java.awt.Color(0, 102, 102));
        titleLbl.setText("House Hould Organization Admin - View Family Vital Sign Trends");

        selectHouseHoldLbl.setForeground(new java.awt.Color(0, 102, 102));
        selectHouseHoldLbl.setText("Select House Hold:");

        houseHoldCombo.setForeground(new java.awt.Color(0, 102, 102));
        houseHoldCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        houseHoldCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                houseHoldComboActionPerformed(evt);
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

        viewTrendsBtn.setBackground(new java.awt.Color(153, 153, 153));
        viewTrendsBtn.setForeground(new java.awt.Color(0, 102, 102));
        viewTrendsBtn.setText("View Trends");
        viewTrendsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewTrendsBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 98, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titleLbl)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(welcomeLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(welcomeNameLbl)
                        .addGap(14, 14, 14)))
                .addGap(128, 128, 128))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(235, 235, 235)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(selectHouseHoldLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(houseHoldCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addComponent(viewTrendsBtn))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(backBtn)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(titleLbl)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(welcomeLbl)
                    .addComponent(welcomeNameLbl))
                .addGap(109, 109, 109)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectHouseHoldLbl)
                    .addComponent(houseHoldCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73)
                .addComponent(viewTrendsBtn)
                .addGap(163, 163, 163)
                .addComponent(backBtn)
                .addGap(49, 49, 49))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void houseHoldComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_houseHoldComboActionPerformed
        // TODO add your handling code here:
        HouseHold house = (HouseHold) houseHoldCombo.getSelectedItem();
        
        if (house != null) {
            members = (ArrayList) house.getFamilyMembers().getPersonList();
        }
    }//GEN-LAST:event_houseHoldComboActionPerformed

    private void viewTrendsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewTrendsBtnActionPerformed
        // TODO add your handling code here:
        generateReport(members);
    }//GEN-LAST:event_viewTrendsBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed

    public void generateReport(ArrayList<FamilyMember> membersList) {
       
        for (FamilyMember member : membersList) {
            DefaultCategoryDataset dataset = new DefaultCategoryDataset();
            
            for (VitalSign vs : member.getVitalSignHistory().getVitalSignHistory()) {
                Double temprature = Double.parseDouble(String.valueOf(vs.getTemperature()));
                Double sysBp = Double.parseDouble(String.valueOf(vs.getSystolicBp()));
                Double diaBp = Double.parseDouble(String.valueOf(vs.getDiastolicBp()));
                Double respRate = Double.parseDouble(String.valueOf(vs.getRespiratoryRate()));
                Double pulse = Double.parseDouble(String.valueOf(vs.getPulse()));
                Double bloodSugar = Double.parseDouble(String.valueOf(vs.getBloodSugar()));
                Double cholesterol = Double.parseDouble(String.valueOf(vs.getCholesterol()));
                Double bmi = Double.parseDouble(String.valueOf(vs.getBmi()));
            
                dataset.addValue(temprature, "Temperature", vs.getTimestamp());
                dataset.addValue(sysBp, "Systolic BP", vs.getTimestamp());
                dataset.addValue(diaBp, "Diastolic BP", vs.getTimestamp());
                dataset.addValue(respRate, "Respiration Rate", vs.getTimestamp());
                dataset.addValue(pulse, "Pulse", vs.getTimestamp());
                dataset.addValue(bloodSugar, "Blood Sugar", vs.getTimestamp());
                dataset.addValue(cholesterol, "Cholesterol;", vs.getTimestamp());
                dataset.addValue(bmi, "BMI", vs.getTimestamp());
            }
            
            
            JFreeChart chart = ChartFactory.createLineChart(member.getFirstName() + "'s Vital Sign Trend", "Vital Signs", "Values", dataset);
            
            final CategoryPlot plot = chart.getCategoryPlot();
        
            LineAndShapeRenderer renderer = (LineAndShapeRenderer) plot.getRenderer();
            DecimalFormat decimalFormat = new DecimalFormat("####.##");
            renderer.setShapesVisible(true);
            renderer.setItemLabelGenerator(new StandardCategoryItemLabelGenerator("{2}", decimalFormat));
            plot.setRenderer(renderer);
            renderer.setPositiveItemLabelPosition(new ItemLabelPosition(ItemLabelAnchor.OUTSIDE12, TextAnchor.HALF_ASCENT_CENTER));
            renderer.setItemLabelsVisible(true);
            chart.getCategoryPlot().setRenderer(renderer);
            
            JFrame frame = new JFrame("Vital Sign Trends For The Family");
            frame.getContentPane().add(new ChartPanel(chart));
          
            frame.pack();
            frame.setVisible(true);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JComboBox houseHoldCombo;
    private javax.swing.JLabel selectHouseHoldLbl;
    private javax.swing.JLabel titleLbl;
    private javax.swing.JButton viewTrendsBtn;
    private javax.swing.JLabel welcomeLbl;
    private javax.swing.JLabel welcomeNameLbl;
    // End of variables declaration//GEN-END:variables
}