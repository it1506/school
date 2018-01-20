/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citydefender;

import javax.swing.JFrame;

/**
 *
 * @author Dan
 */

public class CityDefender extends JFrame {
    
    public CityDefender(){
        this.setTitle("City Defender");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Canvas canvas = new Canvas();
        this.add(canvas);

        this.setResizable(false);
        this.pack();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CityDefender mainWindow = new CityDefender();
        mainWindow.setVisible(true);
    }
    
}
