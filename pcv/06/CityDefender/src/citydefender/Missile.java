/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citydefender;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import javax.swing.ImageIcon;

/**
 *
 * @author Dan
 */
public class Missile {
    private Canvas canvas; 
    private Tank tank;
    private Image missileImg;
    private int x;  
    private int y;  
    private int dy = 2;   
    private boolean visible;
    
    public Missile(Canvas canvas, int position) {
        ImageIcon ii = new ImageIcon(this.getClass().getResource("missile.png"));
        missileImg = ii.getImage();

        this.canvas = canvas;
        this.x = position + 35;
        this.y = 520;
        
        visible = true;
    }
    
    public void draw(Graphics g) {
        g.drawImage(missileImg, x, y, null);
    }
    
    public void move() { 
        y -= dy;
        if (y < 0) {
            visible = false;
        }
    }
    
    public Rectangle getBorder() {
        Rectangle r = new Rectangle(x, y, missileImg.getWidth(canvas), missileImg.getHeight(canvas));
        return r;
    }
    
    public boolean isVisible() {
        return visible;
    }
}
