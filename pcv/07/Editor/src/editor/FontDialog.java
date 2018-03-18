/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package editor;

import java.awt.Color;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import javax.swing.JColorChooser;

/**
 *
 * @author student
 */
public class FontDialog extends javax.swing.JDialog {
    private String actionButton = "Storno";
    public Font pismo;
    private String fontName;
    public Color barva;
    private int sizeFont;
    
    String[] fontList = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
    
    /**
     * Creates new form FontDialog
     */
    public FontDialog(java.awt.Frame parent, boolean modal, Font font, Color color) {
        super(parent, modal);
        initComponents();
        this.barva = color;
        this.sizeFont = font.getSize();
        this.pismo = font;
        this.fontName = font.getFamily();
        int i=0;
        for(String s : fontList){
            fontFamily.addItem(s);
            if(s.equalsIgnoreCase(font.getFamily()))
                i=fontFamily.getItemCount()-1;
        }
        this.fontFamily.setSelectedIndex(i);
        this.fontSize.setValue(this.sizeFont);
        pismo = fontFamily.getFont(); 
        
        testText.setFont(pismo);
        testText.setForeground(color);
        
        this.setTitle("Nastavení písma");
    }
    
    
    public Color getColor(){
        return this.barva;
    }
    
    public String showDialog() {
        this.setVisible(true);
        return actionButton;
    }
    
    public Font getFont(){
        pismo = new Font(Font.SANS_SERIF, Font.PLAIN,(int) fontSize.getValue());
        return pismo;
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
        fontFamily = new javax.swing.JComboBox<>();
        testText = new javax.swing.JTextField();
        fontSize = new javax.swing.JSpinner();
        colorButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        saveButton = new javax.swing.JButton();
        stornoButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Typ písma");

        jLabel2.setText("Velikost písma");

        fontFamily.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fontFamilyActionPerformed(evt);
            }
        });

        testText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        testText.setText("Ukázka");
        testText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                testTextActionPerformed(evt);
            }
        });

        fontSize.setToolTipText("Font Size");
        fontSize.setAutoscrolls(true);
        fontSize.setFocusCycleRoot(true);
        fontSize.setMinimumSize(new java.awt.Dimension(36, 20));
        fontSize.setPreferredSize(new java.awt.Dimension(36, 20));

        colorButton.setText("Vybrat");
        colorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorButtonActionPerformed(evt);
            }
        });

        jLabel3.setText("Barva písma");

        saveButton.setText("Uložit");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        stornoButton.setText("Storno");
        stornoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stornoButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(saveButton)
                        .addGap(18, 18, 18)
                        .addComponent(stornoButton))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel3)
                                .addComponent(jLabel2))
                            .addGap(21, 21, 21)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(fontSize, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(colorButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(fontFamily, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(testText, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(fontFamily, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fontSize, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(colorButton)
                    .addComponent(jLabel3))
                .addGap(15, 15, 15)
                .addComponent(testText, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveButton)
                    .addComponent(stornoButton))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void testTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_testTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_testTextActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        actionButton = "Save";
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_saveButtonActionPerformed

    private void colorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorButtonActionPerformed
        barva = JColorChooser.showDialog(this, "Vyber si barvu", testText.getForeground());
        testText.setForeground(barva);
    }//GEN-LAST:event_colorButtonActionPerformed

    private void stornoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stornoButtonActionPerformed
        actionButton = "Storno";
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_stornoButtonActionPerformed

    private void fontFamilyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fontFamilyActionPerformed
        testText.setFont(getFont());
    }//GEN-LAST:event_fontFamilyActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton colorButton;
    private javax.swing.JComboBox<String> fontFamily;
    private javax.swing.JSpinner fontSize;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton saveButton;
    private javax.swing.JButton stornoButton;
    private javax.swing.JTextField testText;
    // End of variables declaration//GEN-END:variables

   
}
