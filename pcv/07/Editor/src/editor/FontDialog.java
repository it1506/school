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
    public String fontName;
    public Color barva;
    public int style;
    public int sizeFont;
    /**
     * Creates new form FontDialog
     */
    public FontDialog(java.awt.Frame parent, boolean modal, Font font, Color color) {
        super(parent, modal);
        initComponents();
        this.sizeFont = font.getSize();
        this.pismo = font;
        this.barva = color;
        ukazka.setForeground(color);
        this.fontName = font.getFamily();
        this.style = font.getStyle();
        for(String s : fontList){
            typPisma.addItem(s);
        }
        int i=0;
        for(String s : fontList){
            typPisma.addItem(s);
            if(s.equalsIgnoreCase(font.getFamily()))
                i=typPisma.getItemCount()-1;
        }
        this.typPisma.setSelectedIndex(i);
        this.size.setValue(this.sizeFont);
        pismo = typPisma.getFont();
        ukazka.setFont(pismo);
        ukazka.setForeground(color);
        size.setValue(pismo.getSize());
    }
    
    String[] fontList = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        /*
    public Font getFont(){
        pismo = new Font(typPisma.getSelectedValue(), Font.PLAIN, (int) size.getValue());
        return pismo;
    }
    */
    public Color getForegroundColor(){
        return barva;
    }
    
    public String showDialog() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        typPisma = new javax.swing.JComboBox<>();
        ukazka = new javax.swing.JTextField();
        velikost = new javax.swing.JSpinner();
        barvaPisma = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        ulozit = new javax.swing.JButton();
        storno = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Typ písma");

        jLabel2.setText("Velikost písma");

        typPisma.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        ukazka.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ukazka.setText("Ukázka");
        ukazka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ukazkaActionPerformed(evt);
            }
        });

        velikost.setToolTipText("Font Size");
        velikost.setAutoscrolls(true);
        velikost.setFocusCycleRoot(true);
        velikost.setMinimumSize(new java.awt.Dimension(36, 20));
        velikost.setPreferredSize(new java.awt.Dimension(36, 20));

        barvaPisma.setText("Vybrat");
        barvaPisma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                barvaPismaActionPerformed(evt);
            }
        });

        jLabel3.setText("Barva písma");

        ulozit.setText("Uložit");
        ulozit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ulozitActionPerformed(evt);
            }
        });

        storno.setText("Storno");
        storno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stornoActionPerformed(evt);
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
                        .addComponent(ulozit)
                        .addGap(18, 18, 18)
                        .addComponent(storno))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel3)
                                .addComponent(jLabel2))
                            .addGap(97, 97, 97)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(velikost, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(barvaPisma, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(typPisma, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(ukazka, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(typPisma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(velikost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(barvaPisma)
                    .addComponent(jLabel3))
                .addGap(15, 15, 15)
                .addComponent(ukazka, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ulozit)
                    .addComponent(storno))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ukazkaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ukazkaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ukazkaActionPerformed

    private void ulozitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ulozitActionPerformed
        actionButton = "Save";
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_ulozitActionPerformed

    private void barvaPismaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_barvaPismaActionPerformed
        barva = JColorChooser.showDialog(this, "Vyber si barvu", ukazka.getForeground());
        ukazka.setForeground(barva);
    }//GEN-LAST:event_barvaPismaActionPerformed

    private void stornoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stornoActionPerformed
        actionButton = "Storno";
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_stornoActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton barvaPisma;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton storno;
    private javax.swing.JComboBox<String> typPisma;
    private javax.swing.JTextField ukazka;
    private javax.swing.JButton ulozit;
    private javax.swing.JSpinner velikost;
    // End of variables declaration//GEN-END:variables
}
