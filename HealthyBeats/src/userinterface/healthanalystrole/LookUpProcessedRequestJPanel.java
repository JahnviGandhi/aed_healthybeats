/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.healthanalystrole;

import business.Constants;
import business.HelperMethods;
import business.enterprise.Enterprise;
import business.organization.Organization;
import business.result.HealthCheckRequestResult;
import business.result.NutrientsCheckResult;
import business.result.VitalSignCheckResult;
import business.useraccount.UserAccount;
import business.workqueue.HealthCheckRequest;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.labels.ItemLabelAnchor;
import org.jfree.chart.labels.ItemLabelPosition;
import org.jfree.chart.labels.StandardCategoryItemLabelGenerator;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.TextAnchor;

/**
 *
 * @author JAHNVI
 */
public class LookUpProcessedRequestJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private Organization organization;
    private UserAccount userAccount;
    
    /**
     * Creates new form LookUPProcessedRequestJPanel
     */
    public LookUpProcessedRequestJPanel() {
        initComponents();
    }

    public LookUpProcessedRequestJPanel(JPanel userProcessContainer, Enterprise enterprise, Organization organization, UserAccount userAccount) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.organization = organization;
        this.userAccount = userAccount;
        displayDetails();
    }
    
    public void displayDetails() {
        welcomeNameLbl.setText(welcomeNameLbl.getText().replace("<Name>", userAccount.getPerson().getFirstName() + " " + userAccount.getPerson().getLastName()));
        populateRequestTable();
    }
    
    public void populateRequestTable() {
        DefaultTableModel dtm = (DefaultTableModel) healthCheckRequestTable.getModel();
        dtm.setRowCount(0);

        ArrayList<HealthCheckRequest> requestList = (ArrayList) userAccount.getWorkQueue().getWorkRequestList();

        for (HealthCheckRequest request : requestList) {
            if (request.getStatus().equals(Constants.REQUEST_COMPLETED)) {
                Object row[] = new Object[6];
                row[0] = HelperMethods.getFormattedDate(request.getRequestDate()).substring(0, 10);
                row[1] = request;
                row[2] = request.getSender().getPerson().getFirstName() + " " + request.getSender().getPerson().getLastName();
                row[3] = HelperMethods.getFormattedDate(request.getResponseDate()).substring(0, 10);
                row[4] = request.getResult();
                
                dtm.addRow(row);
            }
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
        welcomeLbl = new javax.swing.JLabel();
        welcomeNameLbl = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        healthCheckRequestTable = new javax.swing.JTable();
        processedReqLbl = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        viewCheckResultBtn = new javax.swing.JButton();

        titleLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        titleLbl.setText("Health Analyst - Look Up Processed Requests");

        welcomeLbl.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        welcomeLbl.setText("Welcome,");

        welcomeNameLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        welcomeNameLbl.setText("<Name>!");

        healthCheckRequestTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Request Date", "Message", "Sender", "Response Date", "Result"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(healthCheckRequestTable);
        if (healthCheckRequestTable.getColumnModel().getColumnCount() > 0) {
            healthCheckRequestTable.getColumnModel().getColumn(0).setResizable(false);
            healthCheckRequestTable.getColumnModel().getColumn(1).setResizable(false);
            healthCheckRequestTable.getColumnModel().getColumn(2).setResizable(false);
            healthCheckRequestTable.getColumnModel().getColumn(3).setResizable(false);
            healthCheckRequestTable.getColumnModel().getColumn(4).setResizable(false);
        }

        processedReqLbl.setText("Processed Requests:");

        backBtn.setText("<<  Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        viewCheckResultBtn.setText("View Check Result");
        viewCheckResultBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewCheckResultBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(backBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(viewCheckResultBtn)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(processedReqLbl)
                                .addGap(380, 380, 380)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(welcomeLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(welcomeNameLbl)
                        .addGap(112, 112, 112))))
            .addGroup(layout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addComponent(titleLbl)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(titleLbl)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(welcomeLbl)
                    .addComponent(welcomeNameLbl))
                .addGap(36, 36, 36)
                .addComponent(processedReqLbl)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(viewCheckResultBtn)
                .addGap(76, 76, 76)
                .addComponent(backBtn)
                .addGap(29, 29, 29))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed

    private void viewCheckResultBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewCheckResultBtnActionPerformed
        // TODO add your handling code here:
        int seletedRow = healthCheckRequestTable.getSelectedRow();
        
        if (seletedRow >= 0) {
            HealthCheckRequest request = (HealthCheckRequest) healthCheckRequestTable.getValueAt(seletedRow, 1);
            
            if (request.getResultData() != null) {
            ArrayList<NutrientsCheckResult> nCheckResult = request.getResultData().getNutrientResultList();
            ArrayList<VitalSignCheckResult> vsCheckResult = request.getResultData().getVitalSignResultList();
            
            if (nCheckResult.isEmpty() && vsCheckResult.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Health is mentained properly!", "Information", JOptionPane.INFORMATION_MESSAGE);
            }
            else {
                generateResult(request);
            }
        }    
        }
        else {
            JOptionPane.showMessageDialog(null, "Please select a row to view check result!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_viewCheckResultBtnActionPerformed

    public void generateResult(HealthCheckRequest request) {
        ArrayList<NutrientsCheckResult> nCheckResult = request.getResultData().getNutrientResultList();
        ArrayList<VitalSignCheckResult> vsCheckResult = request.getResultData().getVitalSignResultList();
        
       String date = HelperMethods.getFormattedDate(request.getRequestDate());
        
        DefaultCategoryDataset nDataset = new DefaultCategoryDataset();
        DefaultCategoryDataset vsDataset = new DefaultCategoryDataset();
        
        for (NutrientsCheckResult nResult : nCheckResult) {
            Double intake = Double.parseDouble(String.valueOf(nResult.getTotalIntake()));
            
            //nDataset.addValue(intake, nResult.getNutrientName(), String.valueOf(nResult.getId()));
            nDataset.addValue(intake, "Affected Nutrient", nResult.getNutrientName());
        }
        
        JFreeChart nutrientChart = ChartFactory.createBarChart("Nutrients Check Result", "Affected Nutrients", "Values", nDataset);
        
        DecimalFormat decimalFormat = new DecimalFormat("####.##");
        
        final CategoryPlot nPlot = nutrientChart.getCategoryPlot();
        
        BarRenderer nBarRenderer = (BarRenderer) nPlot.getRenderer();
        
        nBarRenderer.setItemLabelGenerator(new StandardCategoryItemLabelGenerator("{2}", decimalFormat));
        nPlot.setRenderer(nBarRenderer);
        nBarRenderer.setPositiveItemLabelPosition(new ItemLabelPosition(ItemLabelAnchor.OUTSIDE12, TextAnchor.HALF_ASCENT_CENTER));
        nBarRenderer.setItemLabelsVisible(true);
        
        nutrientChart.getCategoryPlot().setRenderer(nBarRenderer);
        
        for (VitalSignCheckResult vsResult : vsCheckResult) {
            Double avgValue = Double.parseDouble(String.valueOf(vsResult.getAvgValue()));
            
            //vsDataset.addValue(avgValue, vsResult.getVsName(), String.valueOf(vsResult.getId()));
            vsDataset.addValue(avgValue, "Affected Vital Sign", vsResult.getVsName());
        }
        
        JFreeChart vitalSignChart = ChartFactory.createBarChart("Vital Signs Check Result", "Affected Vital Signs", "Values", vsDataset);
                
        final CategoryPlot vsPlot = vitalSignChart.getCategoryPlot();
        
        BarRenderer vsBarRenderer = (BarRenderer) vsPlot.getRenderer();
        
        vsBarRenderer.setItemLabelGenerator(new StandardCategoryItemLabelGenerator("{2}", decimalFormat));
        vsPlot.setRenderer(vsBarRenderer);
        vsBarRenderer.setPositiveItemLabelPosition(new ItemLabelPosition(ItemLabelAnchor.OUTSIDE12, TextAnchor.TOP_CENTER));
        vsBarRenderer.setItemLabelsVisible(true);
        vitalSignChart.getCategoryPlot().setRenderer(vsBarRenderer);
        
        JFrame frame = new JFrame("Health Check Result For " + date);
        frame.getContentPane().add(new ChartPanel(nutrientChart), BorderLayout.WEST);
        frame.getContentPane().add(new ChartPanel(vitalSignChart), BorderLayout.EAST);
        frame.pack();
        frame.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JTable healthCheckRequestTable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel processedReqLbl;
    private javax.swing.JLabel titleLbl;
    private javax.swing.JButton viewCheckResultBtn;
    private javax.swing.JLabel welcomeLbl;
    private javax.swing.JLabel welcomeNameLbl;
    // End of variables declaration//GEN-END:variables
}