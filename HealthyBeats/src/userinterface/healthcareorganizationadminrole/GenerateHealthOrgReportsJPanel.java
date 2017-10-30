/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.healthcareorganizationadminrole;

import business.organization.HealthCareOrganization;
import business.organization.Organization;
import business.role.HealthAnalystRole;
import business.useraccount.UserAccount;
import business.workqueue.HealthCheckRequest;
import java.awt.CardLayout;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultKeyedValuesDataset;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author JAHNVI
 */
public class GenerateHealthOrgReportsJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Organization organization;
    private UserAccount userAccount;
    private HealthCareOrganization healthOrg;
    
    /**
     * Creates new form GenerateHealthOrgReportsJPanel
     */
    public GenerateHealthOrgReportsJPanel() {
        initComponents();
    }

    public GenerateHealthOrgReportsJPanel(JPanel userProcessContainer, Organization organization, UserAccount userAccount) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.userAccount = userAccount;
        this.healthOrg = (HealthCareOrganization) this.organization;
        
        welcomeMsgLbl.setText(welcomeMsgLbl.getText().replace("<Name>", userAccount.getPerson().getFirstName() + " " + userAccount.getPerson().getLastName()));
        
        if (healthOrg.getWorkQueue().getWorkRequestList().isEmpty()) {
            viewMostEfficientAnalystBtn.setEnabled(false);
        }
        else {
            viewMostEfficientAnalystBtn.setEnabled(true);
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
        welcomeMsgLbl = new javax.swing.JLabel();
        viewMostEfficientAnalystBtn = new javax.swing.JButton();
        reviewOverallEfficiency = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        analyzeResponseTimeBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 204));
        setPreferredSize(new java.awt.Dimension(740, 670));

        titleLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        titleLbl.setForeground(new java.awt.Color(0, 102, 102));
        titleLbl.setText("Health Care Organization Admin - Generate Reports");

        welcomeMsgLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        welcomeMsgLbl.setForeground(new java.awt.Color(0, 102, 102));
        welcomeMsgLbl.setText("Welcome, <Name>!");

        viewMostEfficientAnalystBtn.setBackground(new java.awt.Color(153, 153, 153));
        viewMostEfficientAnalystBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        viewMostEfficientAnalystBtn.setForeground(new java.awt.Color(0, 102, 102));
        viewMostEfficientAnalystBtn.setText("View Most Efficient Health Analyst");
        viewMostEfficientAnalystBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewMostEfficientAnalystBtnActionPerformed(evt);
            }
        });

        reviewOverallEfficiency.setBackground(new java.awt.Color(153, 153, 153));
        reviewOverallEfficiency.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        reviewOverallEfficiency.setForeground(new java.awt.Color(0, 102, 102));
        reviewOverallEfficiency.setText("Review Overall Efficiency");
        reviewOverallEfficiency.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reviewOverallEfficiencyActionPerformed(evt);
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

        analyzeResponseTimeBtn.setBackground(new java.awt.Color(153, 153, 153));
        analyzeResponseTimeBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        analyzeResponseTimeBtn.setForeground(new java.awt.Color(0, 102, 102));
        analyzeResponseTimeBtn.setText("Analyze Request Response Time");
        analyzeResponseTimeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                analyzeResponseTimeBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(welcomeMsgLbl)
                .addGap(140, 140, 140))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(backBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(titleLbl))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(245, 245, 245)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(analyzeResponseTimeBtn)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(viewMostEfficientAnalystBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(reviewOverallEfficiency, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(172, 172, 172))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(titleLbl)
                .addGap(43, 43, 43)
                .addComponent(welcomeMsgLbl)
                .addGap(124, 124, 124)
                .addComponent(viewMostEfficientAnalystBtn)
                .addGap(53, 53, 53)
                .addComponent(reviewOverallEfficiency)
                .addGap(54, 54, 54)
                .addComponent(analyzeResponseTimeBtn)
                .addGap(203, 203, 203)
                .addComponent(backBtn)
                .addGap(34, 34, 34))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed

    private void viewMostEfficientAnalystBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewMostEfficientAnalystBtnActionPerformed
        // TODO add your handling code here:
        
        ViewMostEfficientHealthAnalystJPanel viewMostEfficientAnalystPanel = new ViewMostEfficientHealthAnalystJPanel(userProcessContainer, organization, userAccount);
        userProcessContainer.add("viewMostEfficientAnalystPanel", viewMostEfficientAnalystPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_viewMostEfficientAnalystBtnActionPerformed

    private void reviewOverallEfficiencyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reviewOverallEfficiencyActionPerformed
        // TODO add your handling code here:
        generateOverAllEfficiencyReport(healthOrg);
    }//GEN-LAST:event_reviewOverallEfficiencyActionPerformed

    private void analyzeResponseTimeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_analyzeResponseTimeBtnActionPerformed
        // TODO add your handling code here:
        generateResponseTimeReport(healthOrg);
    }//GEN-LAST:event_analyzeResponseTimeBtnActionPerformed

    public void generateOverAllEfficiencyReport(HealthCareOrganization org) {
        DefaultPieDataset dataset = new DefaultPieDataset();
        
        for (UserAccount ua : org.getUserAccountDirectory().getUserAccountDirectory()) {
            if (ua.getRole() instanceof HealthAnalystRole) {
                String analystName = ua.getPerson().getFirstName() + " " + ua.getPerson().getLastName();
                int requestCount = ua.getWorkQueue().getCompletedRequests().size();
            
                dataset.setValue(analystName, new Double(String.valueOf(requestCount)));
            }
        }
        
        JFreeChart chart = ChartFactory.createPieChart("Overall Efficiency Report", dataset, true, true, false);
        
        PiePlot plot = (PiePlot) chart.getPlot();
        plot.setLabelFont(new Font("SansSerif", Font.PLAIN, 12));
        plot.setNoDataMessage("No data available");
        plot.setCircular(false);
        plot.setLabelGap(0.02);
        
        ChartFrame frame = new ChartFrame("Health Care Organization - Overall Efficiency Report", chart);
        frame.setVisible(true);
        frame.setSize(650, 650);
    }

    public void generateResponseTimeReport(HealthCareOrganization org) {
        DefaultPieDataset dataset = new DefaultPieDataset();
        
        for (UserAccount ua : org.getUserAccountDirectory().getUserAccountDirectory()) {
            if (ua.getRole() instanceof HealthAnalystRole) {
                String analystName = ua.getPerson().getFirstName() + " " + ua.getPerson().getLastName();
                ArrayList<HealthCheckRequest> requests = (ArrayList) ua.getWorkQueue().getCompletedRequests();
                double totalResponseTime = 0;
                int requestCount = requests.size();
            
                for (HealthCheckRequest request : requests) {
                    double responseTime = ((request.getResponseDate().getTime() - request.getRequestDate().getTime()) / (1000 * 60 * 60 * 24));  
                    totalResponseTime = totalResponseTime + responseTime;
                }
                
                double avgResponseTime = totalResponseTime/requestCount;
                
                dataset.setValue(analystName, avgResponseTime);
            }
        }
        
        JFreeChart chart = ChartFactory.createPieChart("Average Request Response Time", dataset, true, true, false);
        
        PiePlot plot = (PiePlot) chart.getPlot();
        plot.setLabelFont(new Font("SansSerif", Font.PLAIN, 12));
        plot.setNoDataMessage("No data available");
        plot.setCircular(false);
        plot.setLabelGap(0.02);
        
        ChartFrame frame = new ChartFrame("Health Care Organization - Analyze Request Response Time", chart);
        frame.setVisible(true);
        frame.setSize(650, 650);        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton analyzeResponseTimeBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton reviewOverallEfficiency;
    private javax.swing.JLabel titleLbl;
    private javax.swing.JButton viewMostEfficientAnalystBtn;
    private javax.swing.JLabel welcomeMsgLbl;
    // End of variables declaration//GEN-END:variables
}