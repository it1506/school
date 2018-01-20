/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citydefender;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.util.Random;
import javax.swing.ImageIcon;

/**
 *
 * @author Dan
 */
public class Bomb {
    private Canvas canvas; 
    private Image bombImg;
    private int x;
    private int y;
    private int dy = 1; 
    private boolean visible; 
    private Random generator; 
    
    public Bomb(Canvas canvas) {
        ImageIcon ii = new ImageIcon(this.getClass().getResource("bomb.png"));
        bombImg = ii.getImage();

        this.generator = new Random();
        this.canvas = canvas; 
        this.x = generator.nextInt(canvas.getWidth() - bombImg.getWidth(null));
        this.y = -50; 

        visible = true;
    }
    
    public void draw(Graphics g) {
        g.drawImage(bombImg, x, y, null);
    }

    public void move() {
        y += dy;
        if (y > canvas.getHeight()) {
            visible = false;
        }
    }

    public Rectangle getBorder() {
        Rectangle r = new Rectangle(x, y, bombImg.getWidth(canvas), bombImg.getHeight(canvas));
        return r;
    }

    public boolean isVisible() {
        return visible;
    }
}
