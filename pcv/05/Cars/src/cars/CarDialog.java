/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cars;

import cars.Car.Size;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JDialog;

/**
 *
 * @author Dan
 */
public class CarDialog extends javax.swing.JDialog {

    private Car car;
    private String actionButton = "Storno";
    
    public CarDialog(java.awt.Frame parent, boolean modal, Car car){
        super(parent, modal);
        initComponents();
        this.car = car;
        nameTextField.setText(car.getName());
        yearSpinner.setValue(car.getYear());
        sizeComboBox.removeAllItems();
        sizeComboBox.setModel(new DefaultComboBoxModel(Car.Size.values()));
        sizeComboBox.setSelectedItem(car.getSize());
        consumptionSpinner.setValue(car.getConsumption());
        speedSlider.setValue((int)(car.getSpeed()));
    }
    
    public Car getCar(){
        this.car.setName(nameTextField.getText());
        this.car.setYear((int)yearSpinner.getValue());
        this.car.setSize((Car.Size) sizeComboBox.getSelectedItem());
        this.car.setConsumption((int)consumptionSpinner.getValue());
        this.car.setSpeed((int)speedSlider.getValue());
        return this.car;
    }
    
    
    public String showDialog(){
        this.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        this.setVisible(true);
        return actionButton;
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sizeButtonGroup = new javax.swing.ButtonGroup();
        nameTextField = new javax.swing.JTextField();
        heading = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        yearLabel = new javax.swing.JLabel();
        sizeLabel = new javax.swing.JLabel();
        consumptionLabel = new javax.swing.JLabel();
        consumptionSpinner = new javax.swing.JSpinner();
        speedLabel = new javax.swing.JLabel();
        speedValue = new javax.swing.JLabel();
        speedSlider = new javax.swing.JSlider();
        yearSpinner = new javax.swing.JSpinner();
        okButton = new javax.swing.JButton();
        stornoButton = new javax.swing.JButton();
        sizeComboBox = new javax.swing.JComboBox();
        kmphLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        heading.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        heading.setText("DETAILS");

        nameLabel.setText("Name");

        yearLabel.setText("Year of manufacture");

        sizeLabel.setText("Size");

        consumptionLabel.setText("Consumption");

        consumptionSpinner.setOpaque(false);

        speedLabel.setText("Top speed");

        speedValue.setText("200");

        speedSlider.setMaximum(450);
        speedSlider.setMinimum(50);
        speedSlider.setValue(200);
        speedSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                speedSliderStateChanged(evt);
            }
        });

        okButton.setText("OK");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });

        stornoButton.setText("Storno");
        stornoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stornoButtonActionPerformed(evt);
            }
        });

        sizeComboBox.setModel(new DefaultComboBoxModel(Car.Size.values()));
        sizeComboBox.setSelectedItem(Car.Size.Medium);
        sizeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sizeComboBoxActionPerformed(evt);
            }
        });

        kmphLabel.setText("km/h");

        jLabel1.setText("l / 100 km");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(heading)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(nameLabel)
                            .addComponent(yearLabel)
                            .addComponent(sizeLabel)
                            .addComponent(consumptionLabel)
                            .addComponent(speedLabel)
                            .addComponent(okButton))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(speedValue)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(kmphLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                                .addComponent(speedSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(stornoButton)
                                    .addComponent(nameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(yearSpinner, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(sizeComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(consumptionSpinner, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel1)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {consumptionSpinner, nameTextField});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(heading)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel)
                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yearLabel)
                    .addComponent(yearSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sizeLabel)
                    .addComponent(sizeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(consumptionLabel)
                    .addComponent(consumptionSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(speedLabel)
                        .addComponent(speedValue)
                        .addComponent(kmphLabel))
                    .addComponent(speedSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(okButton)
                    .addComponent(stornoButton))
                .addGap(40, 40, 40))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {consumptionSpinner, nameTextField});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {speedSlider, speedValue});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
        actionButton = "OK";
        if((int)yearSpinner.getValue() > 2017 || (int)yearSpinner.getValue() < 1950){
            yearSpinner.setValue(car.getYear());
        }else{
            this.dispose();
        }
        
    }//GEN-LAST:event_okButtonActionPerformed

    private void stornoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stornoButtonActionPerformed
        actionButton = "Storno";
        this.dispose();
    }//GEN-LAST:event_stornoButtonActionPerformed

    private void speedSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_speedSliderStateChanged
        speedValue.setText(String.valueOf(speedSlider.getValue()));
    }//GEN-LAST:event_speedSliderStateChanged

    private void sizeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sizeComboBoxActionPerformed
        
    }//GEN-LAST:event_sizeComboBoxActionPerformed

    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel consumptionLabel;
    private javax.swing.JSpinner consumptionSpinner;
    private javax.swing.JLabel heading;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel kmphLabel;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JButton okButton;
    private javax.swing.ButtonGroup sizeButtonGroup;
    private javax.swing.JComboBox sizeComboBox;
    private javax.swing.JLabel sizeLabel;
    private javax.swing.JLabel speedLabel;
    private javax.swing.JSlider speedSlider;
    private javax.swing.JLabel speedValue;
    private javax.swing.JButton stornoButton;
    private javax.swing.JLabel yearLabel;
    private javax.swing.JSpinner yearSpinner;
    // End of variables declaration//GEN-END:variables

   
}
