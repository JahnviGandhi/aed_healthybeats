/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.userrole;

import business.Constants;
import business.HelperMethods;
import business.data.FoodConsumptionDetail;
import business.data.VitalSign;
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
import javafx.scene.chart.CategoryAxis;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryLabelPositions;
import org.jfree.chart.labels.ItemLabelAnchor;
import org.jfree.chart.labels.ItemLabelPosition;
import org.jfree.chart.labels.StandardCategoryItemLabelGenerator;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.ValueMarker;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.TextAnchor;

/**
 *
 * @author JAHNVI
 */
public class ViewRequestDetailsJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private HealthCheckRequest request;
    
    /**
     * Creates new form ViewRequestDetailsJPanel
     */
    public ViewRequestDetailsJPanel() {
        initComponents();
    }
    
    public ViewRequestDetailsJPanel(JPanel userProcessContainer, UserAccount userAccount, HealthCheckRequest request) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.request = request;
        displayDetails();
    }

    public void displayDetails() {
        welcomeNameLbl.setText(welcomeNameLbl.getText().replace("<Name>", userAccount.getPerson().getFirstName() + " " + userAccount.getPerson().getLastName()));
        
        requestDateLbl.setText(HelperMethods.getFormattedDate(request.getRequestDate()));
        
        statusDetailLbl.setText(request.getStatus());
        msgTxtLbl.setText(request.getMessage());
        
        if (!request.getStatus().equals(Constants.REQUEST_PENDING)) {
            if (request.getStatus().equals(Constants.REQUEST_COMPLETED)) {
                responseDateLbl.setText(HelperMethods.getFormattedDate(request.getResponseDate()));
                resultTxtLbl.setText(request.getResult());
                viewResultDataBtn.setEnabled(true);
            }
            else {
                viewResultDataBtn.setEnabled(false);
                resultTxtLbl.setText("");
                responseDateLbl.setText("");
            }
            
            receiverNameLbl.setText(request.getReceiver().getPerson().getFirstName() + " " + request.getReceiver().getPerson().getLastName());
        }
        else {
            receiverNameLbl.setText("");
            responseDateLbl.setText("");
            resultTxtLbl.setText("");
            viewResultDataBtn.setEnabled(false);
        }
        
        
        populateVitalSignTable();
        populateFcdTable();
    }
    
    public void populateVitalSignTable() {
        DefaultTableModel dtm = (DefaultTableModel) vitalSignTable.getModel();
        dtm.setRowCount(0);
        
        for (VitalSign vs : request.getVitalSignsList()) {
            Object row[] = new Object[9];
            row[0] = vs;
            row[1] = vs.getTemperature();
            row[2] = vs.getSystolicBp();
            row[3] = vs.getDiastolicBp();
            row[4] = vs.getPulse();
            row[5] = vs.getRespiratoryRate();
            row[6] = vs.getCholesterol();
            row[7] = vs.getBloodSugar();
            row[8] = vs.getBmi();
            
            dtm.addRow(row);
        }
    }
    
    public void populateFcdTable() {
        DefaultTableModel dtm = (DefaultTableModel) fcdTable.getModel();
        dtm.setRowCount(0);
        
        for (FoodConsumptionDetail fcd : request.getFcdList()) {
            Object row[] = new Object[15];
            row[0] = fcd;
            row[1] = fcd.getEnergy();
            row[2] = fcd.getProtien();
            row[3] = fcd.getCarbohydrates();
            row[4] = fcd.getFat();
            row[5] = fcd.getFibers();
            row[6] = fcd.getSugar();
            row[7] = fcd.getSalt();
            row[8] = fcd.getIodine();
            row[9] = fcd.getVitaminA();
            row[10] = fcd.getVitaminB12();
            row[11] = fcd.getVitaminC();
            row[12] = fcd.getVitaminD();
            row[13] = fcd.getVitaminE();
            row[14] = fcd.getVitaminK();
            
            dtm.addRow(row);
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

        titleLBl = new javax.swing.JLabel();
        welcomeLbl = new javax.swing.JLabel();
        welcomeNameLbl = new javax.swing.JLabel();
        requestDtLbl = new javax.swing.JLabel();
        requestDateLbl = new javax.swing.JLabel();
        statusLbl = new javax.swing.JLabel();
        statusDetailLbl = new javax.swing.JLabel();
        msgLbl = new javax.swing.JLabel();
        msgTxtLbl = new javax.swing.JLabel();
        receiverLbl = new javax.swing.JLabel();
        receiverNameLbl = new javax.swing.JLabel();
        vsLbl = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        vitalSignTable = new javax.swing.JTable();
        fcdLbl = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        fcdTable = new javax.swing.JTable();
        resultLbl = new javax.swing.JLabel();
        resultTxtLbl = new javax.swing.JLabel();
        viewResultDataBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        responseDtLbl = new javax.swing.JLabel();
        responseDateLbl = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 204));
        setPreferredSize(new java.awt.Dimension(740, 670));

        titleLBl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        titleLBl.setForeground(new java.awt.Color(0, 102, 102));
        titleLBl.setText("User - View Request Details");

        welcomeLbl.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        welcomeLbl.setForeground(new java.awt.Color(0, 102, 102));
        welcomeLbl.setText("Welcome,");

        welcomeNameLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        welcomeNameLbl.setForeground(new java.awt.Color(0, 102, 102));
        welcomeNameLbl.setText("<Name>!");

        requestDtLbl.setForeground(new java.awt.Color(0, 102, 102));
        requestDtLbl.setText("Request Date:");

        requestDateLbl.setForeground(new java.awt.Color(0, 102, 102));
        requestDateLbl.setText("<Request Date>");
        requestDateLbl.setEnabled(false);

        statusLbl.setForeground(new java.awt.Color(0, 102, 102));
        statusLbl.setText("Status:");

        statusDetailLbl.setForeground(new java.awt.Color(0, 102, 102));
        statusDetailLbl.setText("<Status>");
        statusDetailLbl.setEnabled(false);

        msgLbl.setForeground(new java.awt.Color(0, 102, 102));
        msgLbl.setText("Message:");

        msgTxtLbl.setForeground(new java.awt.Color(0, 102, 102));
        msgTxtLbl.setText("<Message>");
        msgTxtLbl.setEnabled(false);

        receiverLbl.setForeground(new java.awt.Color(0, 102, 102));
        receiverLbl.setText("Receiver:");

        receiverNameLbl.setForeground(new java.awt.Color(0, 102, 102));
        receiverNameLbl.setText("<Receiver Name>");

        vsLbl.setForeground(new java.awt.Color(0, 102, 102));
        vsLbl.setText("Vital Signs:");

        jScrollPane1.setForeground(new java.awt.Color(0, 102, 102));

        vitalSignTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Time", "Temp.", "Sys. BP", "Dia. SP", "Pulse", "Resp. Rate", "Cholesterol", "Blood Sugar", "BMI"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(vitalSignTable);

        fcdLbl.setForeground(new java.awt.Color(0, 102, 102));
        fcdLbl.setText("Food Consumption Details:");

        jScrollPane2.setForeground(new java.awt.Color(0, 102, 102));

        fcdTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Time", "Energy", "Protien", "Carbo.", "Fat", "Fibers", "Sugar", "Salt", "Iodine", "Vit A", "Vit B12", "Vit C", "Vit D", "Vit E", "Vit K"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(fcdTable);

        resultLbl.setForeground(new java.awt.Color(0, 102, 102));
        resultLbl.setText("Result:");

        resultTxtLbl.setForeground(new java.awt.Color(0, 102, 102));
        resultTxtLbl.setText("<Result>");

        viewResultDataBtn.setBackground(new java.awt.Color(153, 153, 153));
        viewResultDataBtn.setForeground(new java.awt.Color(0, 102, 102));
        viewResultDataBtn.setText("View Result Data");
        viewResultDataBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewResultDataBtnActionPerformed(evt);
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

        responseDtLbl.setForeground(new java.awt.Color(0, 102, 102));
        responseDtLbl.setText("Response Date:");

        responseDateLbl.setForeground(new java.awt.Color(0, 102, 102));
        responseDateLbl.setText("<Response Date>");
        responseDateLbl.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(requestDtLbl)
                    .addComponent(msgLbl)
                    .addComponent(receiverLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(requestDateLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(statusLbl))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(msgTxtLbl)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(receiverNameLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(responseDtLbl)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(statusDetailLbl)
                    .addComponent(responseDateLbl))
                .addGap(145, 145, 145))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(resultLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(resultTxtLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(viewResultDataBtn)
                        .addGap(132, 132, 132))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(vsLbl))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(fcdLbl)))
                        .addGap(548, 548, 548))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2)
                            .addComponent(jScrollPane1))
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(backBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(250, 250, 250)
                        .addComponent(titleLBl)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(welcomeLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(welcomeNameLbl)
                .addGap(205, 205, 205))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(titleLBl)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(welcomeLbl)
                    .addComponent(welcomeNameLbl))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(requestDtLbl)
                    .addComponent(requestDateLbl)
                    .addComponent(statusLbl)
                    .addComponent(statusDetailLbl))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(msgLbl)
                    .addComponent(msgTxtLbl))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(receiverLbl)
                    .addComponent(receiverNameLbl)
                    .addComponent(responseDtLbl)
                    .addComponent(responseDateLbl))
                .addGap(34, 34, 34)
                .addComponent(vsLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(fcdLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resultLbl)
                    .addComponent(resultTxtLbl)
                    .addComponent(viewResultDataBtn))
                .addGap(42, 42, 42)
                .addComponent(backBtn)
                .addGap(75, 75, 75))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed

    private void viewResultDataBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewResultDataBtnActionPerformed
        // TODO add your handling code here:
        if (request.getResultData() != null) {
            ArrayList<NutrientsCheckResult> nCheckResult = request.getResultData().getNutrientResultList();
            ArrayList<VitalSignCheckResult> vsCheckResult = request.getResultData().getVitalSignResultList();
            
            if (nCheckResult.isEmpty() && vsCheckResult.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Health is mentained properly!", "Information", JOptionPane.INFORMATION_MESSAGE);
            }
            else {
                generateResult(request.getResultData());
            }
        }    
    }//GEN-LAST:event_viewResultDataBtnActionPerformed

    public void generateResult(HealthCheckRequestResult resultData) {
        ArrayList<NutrientsCheckResult> nCheckResult = resultData.getNutrientResultList();
        ArrayList<VitalSignCheckResult> vsCheckResult = resultData.getVitalSignResultList();
        
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
    private javax.swing.JLabel fcdLbl;
    private javax.swing.JTable fcdTable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel msgLbl;
    private javax.swing.JLabel msgTxtLbl;
    private javax.swing.JLabel receiverLbl;
    private javax.swing.JLabel receiverNameLbl;
    private javax.swing.JLabel requestDateLbl;
    private javax.swing.JLabel requestDtLbl;
    private javax.swing.JLabel responseDateLbl;
    private javax.swing.JLabel responseDtLbl;
    private javax.swing.JLabel resultLbl;
    private javax.swing.JLabel resultTxtLbl;
    private javax.swing.JLabel statusDetailLbl;
    private javax.swing.JLabel statusLbl;
    private javax.swing.JLabel titleLBl;
    private javax.swing.JButton viewResultDataBtn;
    private javax.swing.JTable vitalSignTable;
    private javax.swing.JLabel vsLbl;
    private javax.swing.JLabel welcomeLbl;
    private javax.swing.JLabel welcomeNameLbl;
    // End of variables declaration//GEN-END:variables
}
