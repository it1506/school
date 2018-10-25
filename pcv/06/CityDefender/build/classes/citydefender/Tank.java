/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citydefender;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.ImageIcon;

/**
 *
 * @author Dan
 */
public class Tank implements KeyListener{
    private Canvas canvas;  
    private Image tankImg;
    private Missile missile;
    private int x;     
    private int y;     
    private int dx; 
    
    public Tank(Canvas canvas) {
        ImageIcon ii = new ImageIcon(this.getClass().getResource("tank.png"));
        tankImg = ii.getImage();

        this.canvas = canvas;
        this.x = 185;  
        this.y = 530; 
        this.dx = 0;
    }
    
    public void draw(Graphics g) {
        g.drawImage(tankImg, x, y, null);
    }
    
    public void move() {
        x += dx;
        if (x < 0) {
            x = 0;
        } else if (x > (canvas.getWidth() - tankImg.getWidth(null) - 1) && (canvas.getWidth() >0)) {
            x = canvas.getWidth() - tankImg.getWidth(null) - 1;
        }
    }
    
    public Rectangle getBorder() {
        Rectangle r = new Rectangle(x, y, tankImg.getWidth(null), tankImg.getHeight(null));
        return r;
    }
    
    public int getPosition(){
        return this.x;
    }
    
    public void keyPressed(KeyEvent ke) {
        int key = ke.getKeyCode();
        if (key == KeyEvent.VK_LEFT) {
            dx = -2;
        }

        if (key == KeyEvent.VK_RIGHT) {
            dx = 2;  
        }
    }
    public void keyReleased(KeyEvent ke) {
        dx = 0;
    }

    public void keyTyped(KeyEvent ke) {
    }
}
