/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.awt.Color;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Danecek
 */
public class testDialog extends javax.swing.JDialog {
    private String actionButton = "Storno";
    private String anglicky;
    private String nemecky;
    private String[][] slovicka = new String[3][10];
    private int index = 0;
    /**
     * Creates new form testDialog
     * @param parent
     * @param modal
     * @param slova
     */
    public testDialog(java.awt.Frame parent, boolean modal, String[][] slova) {
        super(parent, modal);
        initComponents();
        for(int i = 0; i < 10; i++){
            for(int z = 0; z < 3; z++){
                this.slovicka[z][i] = slova[z][i];
            }
        }
        changeWord();
    }

    /**
     *
     * @return
     */
    public String showDialog() {
        this.setVisible(true);
        return actionButton; 
    }
    
    public String getAnglicky() {
        return this.enText.getText();
    }
    
    public String getNemecky() {
        return this.deText.getText();
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        enText = new javax.swing.JTextField();
        stornoButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        deText = new javax.swing.JTextField();
        csText = new javax.swing.JLabel();
        panel = new javax.swing.JPanel();
        resultText = new javax.swing.JLabel();
        nextButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        pocet = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("česky");

        jLabel2.setText("anglicky");

        stornoButton.setText("Storno");
        stornoButton.setToolTipText("");
        stornoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stornoButtonActionPerformed(evt);
            }
        });

        jLabel3.setText("německy");

        deText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deTextActionPerformed(evt);
            }
        });

        csText.setText(" ");

        resultText.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        resultText.setForeground(new java.awt.Color(255, 255, 255));
        resultText.setText(" ");

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                    .addContainerGap(117, Short.MAX_VALUE)
                    .addComponent(resultText, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(115, Short.MAX_VALUE)))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 54, Short.MAX_VALUE)
            .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(resultText)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        nextButton.setText("Dále");
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Slovo");

        pocet.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        pocet.setText(" ");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("z   10");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nextButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(stornoButton))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3))
                            .addGap(77, 77, 77)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(enText, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                                .addComponent(csText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(deText)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(pocet)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel6))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(pocet)
                    .addComponent(jLabel6))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(csText))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(enText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(deText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stornoButton)
                    .addComponent(nextButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void stornoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stornoButtonActionPerformed
       actionButton = "Storno";
       this.dispose();
    }//GEN-LAST:event_stornoButtonActionPerformed

    private void deTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deTextActionPerformed

    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed
        if(this.resultText.getText().equals(" ")){
            if(this.enText.getText().equals(anglicky) && this.deText.getText().equals(nemecky)){
                this.resultText.setText("Správně!");
                this.panel.setBackground(Color.green);
             }else{
                this.resultText.setText("Špatně...");
                this.panel.setBackground(Color.red);
            }
        }else if(this.index > 8){
            this.dispose();
        }else{
            this.index++; 
            changeWord();
        }
    }//GEN-LAST:event_nextButtonActionPerformed

    private void changeWord(){
        this.pocet.setText(String.valueOf(index+1));
        this.csText.setText(this.slovicka[0][index]);
        this.enText.setText("");
        this.deText.setText("");
        this.anglicky = this.slovicka[1][index];
        this.nemecky = this.slovicka[2][index];
        this.resultText.setText(" ");
        this.panel.setBackground(Color.white);
    }
    
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel csText;
    private javax.swing.JTextField deText;
    private javax.swing.JTextField enText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton nextButton;
    private javax.swing.JPanel panel;
    private javax.swing.JLabel pocet;
    private javax.swing.JLabel resultText;
    private javax.swing.JButton stornoButton;
    // End of variables declaration//GEN-END:variables
}
