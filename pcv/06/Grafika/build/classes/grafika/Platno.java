/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafika;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import javax.swing.JComponent;

/**
 *
 * @author ucitel
 */
public class Platno extends JComponent {
    private Point p = new Point(100,100);
    
    public Platno() {
    }
    
    public void setPoint(int x, int y) {
        p = new Point(x,y);
    }
    
    public void drawAxis(Graphics g, Dimension size) {
        g.setColor(Color.gray);
        g.drawLine(0, p.y, size.width, p.y);        
        g.drawLine(p.x, 0, p.x, size.height);        
    }
    
    public void paint(Graphics g) {
        g.setColor(Color.white);
        Dimension size = this.getSize();
        g.fillRect(0, 0, size.width, size.height);
        drawAxis(g, size);
    }
}
