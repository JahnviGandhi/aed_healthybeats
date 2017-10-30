/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.userrole;

import business.HelperMethods;
import business.data.FoodConsumptionDetail;
import business.person.FamilyMember;
import business.sensor.Sensor;
import business.useraccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author JAHNVI
 */
public class CaptureFoodConsumptionDetailJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private FamilyMember member;
    
    /**
     * Creates new form CaptureFoodConsumptionDetailJPanel
     */
    public CaptureFoodConsumptionDetailJPanel() {
        initComponents();
    }
    
    public CaptureFoodConsumptionDetailJPanel(JPanel userProcessContainer, UserAccount userAccount) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.member = (FamilyMember) this.userAccount.getPerson();
        welcomeNameLbl.setText(welcomeNameLbl.getText().replace("<Name>", member.getFirstName() + " " + member.getLastName()));
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
        welcomeNameLbl = new javax.swing.JLabel();
        welcomeLbl = new javax.swing.JLabel();
        energyLbl = new javax.swing.JLabel();
        energyTxt = new javax.swing.JTextField();
        protienLbl = new javax.swing.JLabel();
        protienTxt = new javax.swing.JTextField();
        fatLbl = new javax.swing.JLabel();
        fatTxt = new javax.swing.JTextField();
        carboLbl = new javax.swing.JLabel();
        carboTxt = new javax.swing.JTextField();
        iodineLbl = new javax.swing.JLabel();
        iodineTxt = new javax.swing.JTextField();
        sugarLbl = new javax.swing.JLabel();
        sugarTxt = new javax.swing.JTextField();
        saltLbl = new javax.swing.JLabel();
        saltTxt = new javax.swing.JTextField();
        vitALbl = new javax.swing.JLabel();
        vitaATxt = new javax.swing.JTextField();
        vitB12Lbl = new javax.swing.JLabel();
        vitB12Txt = new javax.swing.JTextField();
        vitCLbl = new javax.swing.JLabel();
        vitCTxt = new javax.swing.JTextField();
        vitDLbl = new javax.swing.JLabel();
        vitDTxt = new javax.swing.JTextField();
        vitELbl = new javax.swing.JLabel();
        vitETxt = new javax.swing.JTextField();
        vitKLbl = new javax.swing.JLabel();
        vitKTxt = new javax.swing.JTextField();
        captureFcdDetailBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        energyUnitLbl = new javax.swing.JLabel();
        protienUnitLbl = new javax.swing.JLabel();
        fatUnitLbl = new javax.swing.JLabel();
        carboUnitLbl = new javax.swing.JLabel();
        iodineUnitLbl = new javax.swing.JLabel();
        saltUnitLbl = new javax.swing.JLabel();
        fibersLbl = new javax.swing.JLabel();
        fibersTxt = new javax.swing.JTextField();
        fibersUnitLbl = new javax.swing.JLabel();
        vitAUnitLbl = new javax.swing.JLabel();
        vitB12UnitLbl = new javax.swing.JLabel();
        vitCUnitLbl = new javax.swing.JLabel();
        vitDUnitLbl = new javax.swing.JLabel();
        vitEUnitLbl = new javax.swing.JLabel();
        vitKUnitLbl = new javax.swing.JLabel();
        sugarUnitLbl = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 204));

        titleLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        titleLbl.setForeground(new java.awt.Color(0, 102, 102));
        titleLbl.setText("User - Capture Food Consumption Detail");

        welcomeNameLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        welcomeNameLbl.setForeground(new java.awt.Color(0, 102, 102));
        welcomeNameLbl.setText("<Name>!");

        welcomeLbl.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        welcomeLbl.setForeground(new java.awt.Color(0, 102, 102));
        welcomeLbl.setText("Welcome,");

        energyLbl.setForeground(new java.awt.Color(0, 102, 102));
        energyLbl.setText("Energy:");

        energyTxt.setForeground(new java.awt.Color(0, 102, 102));

        protienLbl.setForeground(new java.awt.Color(0, 102, 102));
        protienLbl.setText("Protien:");

        protienTxt.setForeground(new java.awt.Color(0, 102, 102));

        fatLbl.setForeground(new java.awt.Color(0, 102, 102));
        fatLbl.setText("Fat:");

        fatTxt.setForeground(new java.awt.Color(0, 102, 102));

        carboLbl.setForeground(new java.awt.Color(0, 102, 102));
        carboLbl.setText("Carbohydrates:");

        carboTxt.setForeground(new java.awt.Color(0, 102, 102));

        iodineLbl.setForeground(new java.awt.Color(0, 102, 102));
        iodineLbl.setText("Iodine:");

        iodineTxt.setForeground(new java.awt.Color(0, 102, 102));

        sugarLbl.setForeground(new java.awt.Color(0, 102, 102));
        sugarLbl.setText("Sugar:");

        sugarTxt.setForeground(new java.awt.Color(0, 102, 102));

        saltLbl.setForeground(new java.awt.Color(0, 102, 102));
        saltLbl.setText("Salt:");

        saltTxt.setForeground(new java.awt.Color(0, 102, 102));

        vitALbl.setForeground(new java.awt.Color(0, 102, 102));
        vitALbl.setText("Vitamin A:");

        vitaATxt.setForeground(new java.awt.Color(0, 102, 102));

        vitB12Lbl.setForeground(new java.awt.Color(0, 102, 102));
        vitB12Lbl.setText("Vitamin B12:");

        vitB12Txt.setForeground(new java.awt.Color(0, 102, 102));

        vitCLbl.setForeground(new java.awt.Color(0, 102, 102));
        vitCLbl.setText("Vitamin C:");

        vitCTxt.setForeground(new java.awt.Color(0, 102, 102));

        vitDLbl.setForeground(new java.awt.Color(0, 102, 102));
        vitDLbl.setText("Vitamin D:");

        vitDTxt.setForeground(new java.awt.Color(0, 102, 102));

        vitELbl.setForeground(new java.awt.Color(0, 102, 102));
        vitELbl.setText("Vitamin E:");

        vitETxt.setForeground(new java.awt.Color(0, 102, 102));

        vitKLbl.setForeground(new java.awt.Color(0, 102, 102));
        vitKLbl.setText("Vitamin K:");

        vitKTxt.setForeground(new java.awt.Color(0, 102, 102));

        captureFcdDetailBtn.setBackground(new java.awt.Color(153, 153, 153));
        captureFcdDetailBtn.setForeground(new java.awt.Color(0, 102, 102));
        captureFcdDetailBtn.setText("Capture Food Consumption Detail");
        captureFcdDetailBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                captureFcdDetailBtnActionPerformed(evt);
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

        energyUnitLbl.setForeground(new java.awt.Color(0, 102, 102));
        energyUnitLbl.setText("kilojoules");

        protienUnitLbl.setForeground(new java.awt.Color(0, 102, 102));
        protienUnitLbl.setText("grams");

        fatUnitLbl.setForeground(new java.awt.Color(0, 102, 102));
        fatUnitLbl.setText("grams");

        carboUnitLbl.setForeground(new java.awt.Color(0, 102, 102));
        carboUnitLbl.setText("grams");

        iodineUnitLbl.setForeground(new java.awt.Color(0, 102, 102));
        iodineUnitLbl.setText("grams");

        saltUnitLbl.setForeground(new java.awt.Color(0, 102, 102));
        saltUnitLbl.setText("grams");

        fibersLbl.setForeground(new java.awt.Color(0, 102, 102));
        fibersLbl.setText("Fibers:");

        fibersTxt.setForeground(new java.awt.Color(0, 102, 102));

        fibersUnitLbl.setForeground(new java.awt.Color(0, 102, 102));
        fibersUnitLbl.setText("grams");

        vitAUnitLbl.setForeground(new java.awt.Color(0, 102, 102));
        vitAUnitLbl.setText("micro gms");

        vitB12UnitLbl.setForeground(new java.awt.Color(0, 102, 102));
        vitB12UnitLbl.setText("micro gms");

        vitCUnitLbl.setForeground(new java.awt.Color(0, 102, 102));
        vitCUnitLbl.setText("mg");

        vitDUnitLbl.setForeground(new java.awt.Color(0, 102, 102));
        vitDUnitLbl.setText("micro gms");

        vitEUnitLbl.setForeground(new java.awt.Color(0, 102, 102));
        vitEUnitLbl.setText("mg");

        vitKUnitLbl.setForeground(new java.awt.Color(0, 102, 102));
        vitKUnitLbl.setText("micro gms");

        sugarUnitLbl.setForeground(new java.awt.Color(0, 102, 102));
        sugarUnitLbl.setText("grams");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(backBtn)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(fibersLbl)
                            .addComponent(protienLbl)
                            .addComponent(energyLbl)
                            .addComponent(fatLbl)
                            .addComponent(carboLbl)
                            .addComponent(iodineLbl)
                            .addComponent(sugarLbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(fibersTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                            .addComponent(energyTxt)
                            .addComponent(protienTxt)
                            .addComponent(fatTxt)
                            .addComponent(carboTxt)
                            .addComponent(iodineTxt)
                            .addComponent(sugarTxt))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(energyUnitLbl)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(protienUnitLbl)
                                        .addComponent(fatUnitLbl)
                                        .addComponent(carboUnitLbl)
                                        .addComponent(iodineUnitLbl))
                                    .addGap(14, 14, 14)))
                            .addComponent(sugarUnitLbl)
                            .addComponent(fibersUnitLbl))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(vitELbl, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(vitDLbl, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(vitCLbl, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(vitB12Lbl, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(vitALbl, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(saltLbl, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(vitKLbl)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(saltTxt)
                            .addComponent(vitaATxt)
                            .addComponent(vitB12Txt)
                            .addComponent(vitCTxt)
                            .addComponent(vitDTxt)
                            .addComponent(vitETxt)
                            .addComponent(vitKTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(saltUnitLbl)
                            .addComponent(vitAUnitLbl)
                            .addComponent(vitB12UnitLbl)
                            .addComponent(vitCUnitLbl)
                            .addComponent(vitDUnitLbl)
                            .addComponent(vitEUnitLbl)
                            .addComponent(vitKUnitLbl))
                        .addGap(68, 68, 68))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(captureFcdDetailBtn)
                        .addGap(178, 178, 178))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(welcomeLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(welcomeNameLbl)
                        .addGap(78, 78, 78))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(titleLbl)
                        .addGap(121, 121, 121))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLbl)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(welcomeLbl)
                    .addComponent(welcomeNameLbl))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(saltLbl)
                            .addComponent(saltTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(saltUnitLbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(vitALbl)
                            .addComponent(vitaATxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(vitAUnitLbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(vitB12Lbl)
                            .addComponent(vitB12Txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(vitB12UnitLbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(vitCLbl)
                            .addComponent(vitCTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(vitCUnitLbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(vitDLbl)
                            .addComponent(vitDTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(vitDUnitLbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(vitELbl)
                            .addComponent(vitETxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(vitEUnitLbl)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(energyLbl)
                            .addComponent(energyTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(energyUnitLbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(protienLbl)
                            .addComponent(protienTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(protienUnitLbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fatLbl)
                            .addComponent(fatTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fatUnitLbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(carboLbl)
                            .addComponent(carboTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(carboUnitLbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(iodineLbl)
                            .addComponent(iodineTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(iodineUnitLbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sugarLbl)
                            .addComponent(sugarTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sugarUnitLbl))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vitKLbl)
                    .addComponent(vitKTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fibersLbl)
                    .addComponent(fibersTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fibersUnitLbl)
                    .addComponent(vitKUnitLbl))
                .addGap(47, 47, 47)
                .addComponent(captureFcdDetailBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                .addComponent(backBtn)
                .addGap(30, 30, 30))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed

    private void captureFcdDetailBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_captureFcdDetailBtnActionPerformed
        // TODO add your handling code here:
        if (validateInput()) {
            FoodConsumptionDetail fcd = member.getFoodConsumptionHistory().addFcd();
            fcd.setEnergy(Float.parseFloat(energyTxt.getText().trim()));
            fcd.setProtien(Float.parseFloat(protienTxt.getText().trim()));
            fcd.setFat(Float.parseFloat(fatTxt.getText().trim()));
            fcd.setIodine(Float.parseFloat(iodineTxt.getText().trim()));
            fcd.setFibers(Float.parseFloat(fibersTxt.getText().trim()));
            fcd.setCarbohydrates(Float.parseFloat(carboTxt.getText().trim()));
            fcd.setSugar(Float.parseFloat(sugarTxt.getText().trim()));
            fcd.setSalt(Float.parseFloat(saltTxt.getText().trim()));
            fcd.setVitaminA(Float.parseFloat(vitaATxt.getText().trim()));
            fcd.setVitaminB12(Float.parseFloat(vitB12Txt.getText().trim()));
            fcd.setVitaminC(Float.parseFloat(vitCTxt.getText().trim()));
            fcd.setVitaminD(Float.parseFloat(vitDTxt.getText().trim()));
            fcd.setVitaminE(Float.parseFloat(vitETxt.getText().trim()));
            fcd.setVitaminK(Float.parseFloat(vitKTxt.getText().trim()));
            
            fcd.setTimestamp(HelperMethods.getTimeStamp());

            for (Sensor s : member.getSensorDirectory().getSensorList()) {
                if (s.getType() == Sensor.SensorType.FoodConsumption) {
                    fcd.setSensorName(s.getSensorName());
                }
            }
            
            JOptionPane.showMessageDialog(null, "Food Consumption Detail captured successfully!", "Information", JOptionPane.INFORMATION_MESSAGE);
            clearFields();
        }
    }//GEN-LAST:event_captureFcdDetailBtnActionPerformed

    public boolean validateInput() {
        if (energyTxt.getText().trim().isEmpty() || !(energyTxt.getText().trim().matches("^[0-9]+") || energyTxt.getText().trim().matches("^[0-9]*\\.[0-9]*$"))) {
            JOptionPane.showMessageDialog(null, "Please enter valid Energy!", "Error", JOptionPane.ERROR_MESSAGE);
            energyTxt.requestFocus();
            return false;
        }
        else if (protienTxt.getText().trim().isEmpty() || !(protienTxt.getText().trim().matches("^[0-9]+") || protienTxt.getText().trim().matches("^[0-9]*\\.[0-9]*$"))) {
            JOptionPane.showMessageDialog(null, "Please enter valid Protien!", "Error", JOptionPane.ERROR_MESSAGE);
            protienTxt.requestFocus();
            return false;
        }
        else if (fatTxt.getText().trim().isEmpty() || !(fatTxt.getText().trim().matches("^[0-9]+") || fatTxt.getText().trim().matches("^[0-9]*\\.[0-9]*$"))) {
            JOptionPane.showMessageDialog(null, "Please enter valid Fat!", "Error", JOptionPane.ERROR_MESSAGE);
            fatTxt.requestFocus();
            return false;
        }
        else if (carboTxt.getText().trim().isEmpty() || !(carboTxt.getText().trim().matches("^[0-9]+") || carboTxt.getText().trim().matches("^[0-9]*\\.[0-9]*$"))) {
            JOptionPane.showMessageDialog(null, "Please enter valid Carbohydrates!", "Error", JOptionPane.ERROR_MESSAGE);
            carboTxt.requestFocus();
            return false;
        }
        else if (iodineTxt.getText().trim().isEmpty() || !(iodineTxt.getText().trim().matches("^[0-9]+") || iodineTxt.getText().trim().matches("^[0-9]*\\.[0-9]*$"))) {
            JOptionPane.showMessageDialog(null, "Please enter valid Iodine!", "Error", JOptionPane.ERROR_MESSAGE);
            iodineTxt.requestFocus();
            return false;
        }
        else if (sugarTxt.getText().trim().isEmpty() || !(sugarTxt.getText().trim().matches("^[0-9]+") || sugarTxt.getText().trim().matches("^[0-9]*\\.[0-9]*$"))) {
            JOptionPane.showMessageDialog(null, "Please enter valid Sugar!", "Error", JOptionPane.ERROR_MESSAGE);
            sugarTxt.requestFocus();
            return false;
        }
        else if (fibersTxt.getText().trim().isEmpty() || !(fibersTxt.getText().trim().matches("^[0-9]+") || fibersTxt.getText().trim().matches("^[0-9]*\\.[0-9]*$"))) {
            JOptionPane.showMessageDialog(null, "Please enter valid Fibers!", "Error", JOptionPane.ERROR_MESSAGE);
            fibersTxt.requestFocus();
            return false;
        }
        else if (saltTxt.getText().trim().isEmpty()|| !(saltTxt.getText().trim().matches("^[0-9]+") || saltTxt.getText().trim().matches("^[0-9]*\\.[0-9]*$"))) {
            JOptionPane.showMessageDialog(null, "Please enter valid Salt!", "Error", JOptionPane.ERROR_MESSAGE);
            saltTxt.requestFocus();
            return false;
        }
        else if (vitaATxt.getText().trim().isEmpty() || !(vitaATxt.getText().trim().matches("^[0-9]+") || vitaATxt.getText().trim().matches("^[0-9]*\\.[0-9]*$"))) {
            JOptionPane.showMessageDialog(null, "Please enter valid Vitamin A!", "Error", JOptionPane.ERROR_MESSAGE);
            vitaATxt.requestFocus();
            return false;
        }
        else if (vitB12Txt.getText().trim().isEmpty() || !(vitB12Txt.getText().trim().matches("^[0-9]+") || vitB12Txt.getText().trim().matches("^[0-9]*\\.[0-9]*$"))) {
            JOptionPane.showMessageDialog(null, "Please enter valid Vitamin B12!", "Error", JOptionPane.ERROR_MESSAGE);
            vitB12Txt.requestFocus();
            return false;
        }
        else if (vitCTxt.getText().trim().isEmpty() || !(vitCTxt.getText().trim().matches("^[0-9]+") || vitCTxt.getText().trim().matches("^[0-9]*\\.[0-9]*$"))) {
            JOptionPane.showMessageDialog(null, "Please enter valid Vitamin C!", "Error", JOptionPane.ERROR_MESSAGE);
            vitCTxt.requestFocus();
            return false;
        }
        else if (vitDTxt.getText().trim().isEmpty()|| !(vitDTxt.getText().trim().matches("^[0-9]+") || vitDTxt.getText().trim().matches("^[0-9]*\\.[0-9]*$"))) {
            JOptionPane.showMessageDialog(null, "Please enter valid Vitamin D!", "Error", JOptionPane.ERROR_MESSAGE);
            vitDTxt.requestFocus();
            return false;
        }
        else if (vitETxt.getText().trim().isEmpty() || !(vitETxt.getText().trim().matches("^[0-9]+") || vitETxt.getText().trim().matches("^[0-9]*\\.[0-9]*$"))) {
            JOptionPane.showMessageDialog(null, "Please enter valid Vitamin E!", "Error", JOptionPane.ERROR_MESSAGE);
            vitETxt.requestFocus();
            return false;
        }
        else if (vitKTxt.getText().trim().isEmpty() || !(vitKTxt.getText().trim().matches("^[0-9]+") || vitKTxt.getText().trim().matches("^[0-9]*\\.[0-9]*$"))) {
            JOptionPane.showMessageDialog(null, "Please enter valid Vitamin K!", "Error", JOptionPane.ERROR_MESSAGE);
            vitKTxt.requestFocus();
            return false;
        }
        else {
            return true;
        }
    }
    
    public void clearFields() {
        energyTxt.setText("");
        protienTxt.setText("");
        fatTxt.setText("");
        iodineTxt.setText("");
        carboTxt.setText("");
        sugarTxt.setText("");
        fibersTxt.setText("");
        saltTxt.setText("");
        vitaATxt.setText("");
        vitB12Txt.setText("");
        vitCTxt.setText("");
        vitDTxt.setText("");
        vitETxt.setText("");
        vitKTxt.setText("");
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton captureFcdDetailBtn;
    private javax.swing.JLabel carboLbl;
    private javax.swing.JTextField carboTxt;
    private javax.swing.JLabel carboUnitLbl;
    private javax.swing.JLabel energyLbl;
    private javax.swing.JTextField energyTxt;
    private javax.swing.JLabel energyUnitLbl;
    private javax.swing.JLabel fatLbl;
    private javax.swing.JTextField fatTxt;
    private javax.swing.JLabel fatUnitLbl;
    private javax.swing.JLabel fibersLbl;
    private javax.swing.JTextField fibersTxt;
    private javax.swing.JLabel fibersUnitLbl;
    private javax.swing.JLabel iodineLbl;
    private javax.swing.JTextField iodineTxt;
    private javax.swing.JLabel iodineUnitLbl;
    private javax.swing.JLabel protienLbl;
    private javax.swing.JTextField protienTxt;
    private javax.swing.JLabel protienUnitLbl;
    private javax.swing.JLabel saltLbl;
    private javax.swing.JTextField saltTxt;
    private javax.swing.JLabel saltUnitLbl;
    private javax.swing.JLabel sugarLbl;
    private javax.swing.JTextField sugarTxt;
    private javax.swing.JLabel sugarUnitLbl;
    private javax.swing.JLabel titleLbl;
    private javax.swing.JLabel vitALbl;
    private javax.swing.JLabel vitAUnitLbl;
    private javax.swing.JLabel vitB12Lbl;
    private javax.swing.JTextField vitB12Txt;
    private javax.swing.JLabel vitB12UnitLbl;
    private javax.swing.JLabel vitCLbl;
    private javax.swing.JTextField vitCTxt;
    private javax.swing.JLabel vitCUnitLbl;
    private javax.swing.JLabel vitDLbl;
    private javax.swing.JTextField vitDTxt;
    private javax.swing.JLabel vitDUnitLbl;
    private javax.swing.JLabel vitELbl;
    private javax.swing.JTextField vitETxt;
    private javax.swing.JLabel vitEUnitLbl;
    private javax.swing.JLabel vitKLbl;
    private javax.swing.JTextField vitKTxt;
    private javax.swing.JLabel vitKUnitLbl;
    private javax.swing.JTextField vitaATxt;
    private javax.swing.JLabel welcomeLbl;
    private javax.swing.JLabel welcomeNameLbl;
    // End of variables declaration//GEN-END:variables
}
