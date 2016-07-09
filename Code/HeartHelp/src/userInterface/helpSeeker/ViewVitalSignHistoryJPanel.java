/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.helpSeeker;

import business.common.Validation;
import business.personpkg.HelpSeeker;
import business.personpkg.Person;
import business.sensor.VitalSign;
import business.userAccountpkg.UserAccount;
import business.userAccountpkg.UserAccountDirectory;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author tejageetla
 */
public class ViewVitalSignHistoryJPanel extends javax.swing.JPanel {
    
    private JPanel userProcessContainer;
    private UserAccount userAccount; 
    private Person person;
    private UserAccountDirectory userAccountDirectory;
    
    /**
     * Creates new form ViewVitalSignHistoryJPanel
     */
    public ViewVitalSignHistoryJPanel(JPanel userProcessContainer, UserAccount userAccount, UserAccountDirectory userAccountDirectory) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        person = userAccount.getPerson();
        this.userAccountDirectory = userAccountDirectory;
        
        populateVitalSignsJTable();
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        int w = getWidth();
        int h = getHeight();
        
        Color c1 = new Color(153,197,85);
        Color c2 = Color.white;
     
        GradientPaint gp = new GradientPaint(w/4, 0, c2, w/4, h, c1);
        setOpaque( false );
        g2d.setPaint(gp);
        g2d.fillRect(0, 0, w, h);
        setOpaque( true );
    }
    
     public void populateVitalSignsJTable()
    {   
        try
        {
        HelpSeeker customer = (HelpSeeker)person;
        if(customer.getVitalSignList().isEmpty())
        {
        JOptionPane.showMessageDialog(this, "Please update vital sign information first", "warning", JOptionPane.WARNING_MESSAGE);
        return;    
        }
        DefaultTableModel defaultTableModel = (DefaultTableModel)vitalSignTable.getModel();
        defaultTableModel.setRowCount(0);
        int age = Validation.calculateAge(person.getDob());
        
        for(VitalSign vitalSign : customer.getVitalSignList())
        {
        String patientCondition = customer.patientCondition(age, vitalSign);
        Object [] rowData = new Object[2];
        rowData[0] = vitalSign;
        rowData[1] = patientCondition;
       
        defaultTableModel.addRow(rowData);
        }
        }
        catch(NullPointerException npe)
        {
            JOptionPane.showMessageDialog(this, "No records for the person", "error", JOptionPane.ERROR_MESSAGE);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        vitalSignTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        respiratoryRate = new javax.swing.JLabel();
        respiratoryRateTextField = new javax.swing.JTextField();
        heartRate = new javax.swing.JLabel();
        heartRateTextField = new javax.swing.JTextField();
        systollicBloodPressure = new javax.swing.JLabel();
        systollicBPTextField = new javax.swing.JTextField();
        weight = new javax.swing.JLabel();
        weightTextField = new javax.swing.JTextField();
        viewDetailsJButton = new javax.swing.JButton();
        manageEnt2 = new javax.swing.JLabel();
        manageEnt5 = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        BarCharJButton = new javax.swing.JButton();
        barChartPanel = new javax.swing.JPanel();

        vitalSignTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date/Time", "Patient Vital Condition"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(vitalSignTable);

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel3.setText("Vital Signs");

        respiratoryRate.setText("Respiratory Rate:");

        respiratoryRateTextField.setEditable(false);

        heartRate.setText("Heart Rate:");

        heartRateTextField.setEditable(false);

        systollicBloodPressure.setText("Systollic Blood Pressure:");

        systollicBPTextField.setEditable(false);

        weight.setText("Weight (Pounds):");

        weightTextField.setEditable(false);

        viewDetailsJButton.setText("View Details ");
        viewDetailsJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewDetailsJButtonActionPerformed(evt);
            }
        });

        manageEnt2.setFont(new java.awt.Font("Malayalam MN", 3, 24)); // NOI18N
        manageEnt2.setText("Heart Help");

        manageEnt5.setFont(new java.awt.Font("Malayalam MN", 3, 24)); // NOI18N
        manageEnt5.setText("View Vital Sign History ");

        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        BarCharJButton.setText("View BarChart");
        BarCharJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BarCharJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout barChartPanelLayout = new javax.swing.GroupLayout(barChartPanel);
        barChartPanel.setLayout(barChartPanelLayout);
        barChartPanelLayout.setHorizontalGroup(
            barChartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 656, Short.MAX_VALUE)
        );
        barChartPanelLayout.setVerticalGroup(
            barChartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(manageEnt5)
                        .addGap(105, 105, 105)
                        .addComponent(manageEnt2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(viewDetailsJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BarCharJButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(backJButton))
                        .addGap(42, 42, 42)
                        .addComponent(barChartPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(heartRate)
                            .addComponent(respiratoryRate)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(systollicBloodPressure, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(weight)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(heartRateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(systollicBPTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(respiratoryRateTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(weightTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(manageEnt2)
                .addGap(18, 18, 18)
                .addComponent(barChartPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(35, 35, 35))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(79, Short.MAX_VALUE)
                .addComponent(manageEnt5)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewDetailsJButton)
                    .addComponent(BarCharJButton))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(respiratoryRateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(respiratoryRate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(heartRateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(heartRate))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(systollicBPTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(systollicBloodPressure))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(weightTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(weight))
                .addGap(43, 43, 43)
                .addComponent(backJButton)
                .addGap(17, 17, 17))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void viewDetailsJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewDetailsJButtonActionPerformed

        int selectedRow = vitalSignTable.getSelectedRow();
        if(selectedRow >= 0)
        {
            VitalSign vitalSign = (VitalSign)vitalSignTable.getValueAt(selectedRow, 0);
            respiratoryRateTextField.setText(String.valueOf(vitalSign.getRespiratoryRate()));
            heartRateTextField.setText(String.valueOf(vitalSign.getHeartRate()));
            systollicBPTextField.setText(String.valueOf(vitalSign.getSystolicBloodpressure()));
            weightTextField.setText(String.valueOf(vitalSign.getWeightInPounds()));
            
            
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Please select a row", "warning", JOptionPane.PLAIN_MESSAGE);
        }
    }//GEN-LAST:event_viewDetailsJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void BarCharJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BarCharJButtonActionPerformed
        int selectedRow = vitalSignTable.getSelectedRow();
         barChartPanel.removeAll();
         barChartPanel.revalidate();
        if(selectedRow >= 0)
        {
            VitalSign vitalSign = (VitalSign)vitalSignTable.getValueAt(selectedRow, 0);
            float respiratoryRate = vitalSign.getRespiratoryRate();
            int heartRate = vitalSign.getHeartRate();
            int systollicBP = vitalSign.getSystolicBloodpressure();
            float weight = vitalSign.getWeightInPounds();
            // Code for bar chart
            
            
            DefaultCategoryDataset dataSet = new DefaultCategoryDataset();
            if(respiratoryRate != 0)
            {
            dataSet.setValue(respiratoryRate, "Values", "Respiratory Rate");
            }
            if(heartRate != 0)
            {
            dataSet.setValue(heartRate, "Values", "Heart Rate");
            }
            if(systollicBP != 0)
            {
            dataSet.setValue(systollicBP, "Values", "Systollic Blood Pressure");
            }
            if(weight != 0)
            {
            dataSet.setValue(weight, "Values", "Weight (pounds)");
            }
            JFreeChart barchart = ChartFactory.createBarChart("Test Results on " + vitalSign.getTimeStamp(),"Vital Signs" ,"Values", dataSet,PlotOrientation.VERTICAL, false, true, false);
            barchart.removeLegend();
            barchart.setBackgroundPaint(Color.CYAN);
            barchart.getTitle().setPaint(Color.BLUE);
            CategoryPlot plot = barchart.getCategoryPlot();
            plot.setBackgroundPaint(Color.WHITE);
            
            
            
            ChartPanel chartpanel = new ChartPanel(barchart);
            chartpanel.setDomainZoomable(true);
            
            barChartPanel.setLayout(new BorderLayout());
            barChartPanel.add(chartpanel, BorderLayout.EAST); 
            barChartPanel.repaint();
            barChartPanel.setVisible(true);
        
      }
        else
        {
            JOptionPane.showMessageDialog(this, "Please select a row", "warning", JOptionPane.PLAIN_MESSAGE);
        }
    }//GEN-LAST:event_BarCharJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BarCharJButton;
    private javax.swing.JButton backJButton;
    private javax.swing.JPanel barChartPanel;
    private javax.swing.JLabel heartRate;
    private javax.swing.JTextField heartRateTextField;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel manageEnt2;
    private javax.swing.JLabel manageEnt5;
    private javax.swing.JLabel respiratoryRate;
    private javax.swing.JTextField respiratoryRateTextField;
    private javax.swing.JTextField systollicBPTextField;
    private javax.swing.JLabel systollicBloodPressure;
    private javax.swing.JButton viewDetailsJButton;
    private javax.swing.JTable vitalSignTable;
    private javax.swing.JLabel weight;
    private javax.swing.JTextField weightTextField;
    // End of variables declaration//GEN-END:variables
}
