/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citydefender;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author Dan
 */
public class Canvas extends JPanel implements ActionListener {
    private int canvasWidth = 400;  
    private int canvasHeight = 600;  
    private Image backgroundImg;
    private Timer timer;
    private Tank tank;
    private boolean playing;   
    private int counter;      
    private int hp;
    private int hits;
    private int round;
    private int bombsDelay; 
    private List<Bomb> bombs;   
    private List<Missile> missiles; 
    
    public Canvas() {
        init();
        start();
    }
    
    private void init() {
        this.setPreferredSize(new Dimension(canvasWidth, canvasHeight));
        this.setBackground(Color.black);
        this.setForeground(Color.white);
        this.setFont(new Font(Font.MONOSPACED, Font.BOLD, 20));
        this.setFocusable(true);
        ImageIcon ii = new ImageIcon(this.getClass().getResource("background1.png"));
        backgroundImg = ii.getImage();
    }
    
    private void start() {
        playing = true;
        tank = new Tank(this);
        counter = 0;
        hp = 5;
        hits = 0;
        round = 1;
        bombsDelay = 100;
        bombs = new ArrayList<Bomb>();
        missiles = new ArrayList<Missile>();
        this.addKeyListener(tank);

        timer = new Timer(10, this);
        timer.start();
    }
    
    @Override
    public void paintComponent(Graphics g) {
        if (playing) {
            super.paintComponent(g);
            if(hp==5){
                g.drawImage(backgroundImg, 0, 0, null);
            }
            if(hp==4){
                ImageIcon ii = new ImageIcon(this.getClass().getResource("background2.png"));
                backgroundImg = ii.getImage();
                g.drawImage(backgroundImg, 0, 0, null);
            }
            if(hp==3){
                ImageIcon ii = new ImageIcon(this.getClass().getResource("background3.png"));
                backgroundImg = ii.getImage();
                g.drawImage(backgroundImg, 0, 0, null);
            }
            if(hp==2){
                ImageIcon ii = new ImageIcon(this.getClass().getResource("background4.png"));
                backgroundImg = ii.getImage();
                g.drawImage(backgroundImg, 0, 0, null);
            }
            if(hp==1){
                ImageIcon ii = new ImageIcon(this.getClass().getResource("background5.png"));
                backgroundImg = ii.getImage();
                g.drawImage(backgroundImg, 0, 0, null);
            }
            
            tank.draw(g);

            for (int i = 0; i < bombs.size(); i++) {
                Bomb bomb = bombs.get(i);
                bomb.draw(g);
            }
            
            for (int e = 0; e < missiles.size(); e++) {
                Missile missile = missiles.get(e);
                missile.draw(g);
            }
            
            drawInfo(g);
            
            if(counter > 200 && counter < 500 || counter > 2700 && counter < 3000 || counter > 5200 && counter < 5500 || counter > 8200 && counter < 8500 || counter > 11200 && counter < 11500){
                showRound(g);
            }
            
            
        }
        else if(counter<15000){
            g.drawImage(backgroundImg, 0, 0, null);
            endGame(g);
        }
        
        else{
            g.drawImage(backgroundImg, 0, 0, null);
            endGameWin(g);
        }
    }
    
    private void drawInfo(Graphics g) {
        g.drawString("Time: " + String.valueOf(counter/100), 10, 30);
        g.drawString("Lives: " + String.valueOf(hp), 300, 30);
    }

    private void showRound(Graphics g){
        String textRound = "Round ";
        Font font = new Font(Font.MONOSPACED, Font.BOLD, 28);
        g.setFont(font);
        FontMetrics fm = g.getFontMetrics(font);
        int textWidth = fm.stringWidth(textRound);
        
        g.drawString(textRound + String.valueOf(round), (this.getWidth() - textWidth) / 2, this.getHeight() / 2);
    }
    
    private void endGame(Graphics g) {
        String textGO = "G A M E   O V E R";
        String textTime = "Time: " + String.valueOf(counter/100);
        String textHits = "Bombs destroyed: " + String.valueOf(hits);
        Font font = new Font(Font.MONOSPACED, Font.BOLD, 28);
        g.setFont(font);
        FontMetrics fm = g.getFontMetrics(font);
        int textWidth = fm.stringWidth(textGO);

        g.setColor(Color.red);
        g.drawString(textGO, (this.getWidth() - textWidth) / 2, this.getHeight() / 2);
        g.setColor(Color.white);
        g.drawString(textTime, (this.getWidth() - textWidth) / 2, (this.getHeight() + 100) / 2);
        g.drawString(textHits, (this.getWidth() - textWidth) / 2, (this.getHeight() + 150) / 2);
    }
    
    private void endGameWin(Graphics g) {
        String textGO = "Y O U   W I N";
        String textTime = "Time: " + String.valueOf(counter/100);
        String textHits = "Bombs destroyed: " + String.valueOf(hits);
        Font font = new Font(Font.MONOSPACED, Font.BOLD, 28);
        g.setFont(font);
        FontMetrics fm = g.getFontMetrics(font);
        int textWidth = fm.stringWidth(textGO);

        g.setColor(Color.red);
        g.drawString(textGO, (this.getWidth() - textWidth) / 2, this.getHeight() / 2);
        g.setColor(Color.white);
        g.drawString(textTime, (this.getWidth() - textWidth) / 2, (this.getHeight() + 100) / 2);
        g.drawString(textHits, (this.getWidth() - textWidth) / 2, (this.getHeight() + 150) / 2);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        counter++;

        tank.move();
        addBomb();
        addMissile();
        
        moveBombs();
        moveMissiles();
        
        if(isHit()){
            hits++;
        }
        
        if (isCrash()){
            hp--;
        }
        
        if(hp == 0 || counter == 15000){
            playing = false;
            timer.stop();
        }

        removeBombs();
        removeMissiles();

        this.repaint(); 
    }
    
    private void removeBombs() {
        for (int i = 0; i < bombs.size(); i++) {
            Bomb bomb = bombs.get(i);
            if (bomb.isVisible() == false) {
                bombs.remove(bomb);
                hp--;
            }
        }
    }
    
    private void removeMissiles() {
        for (int i = 0; i < missiles.size(); i++) {
            Missile missile = missiles.get(i);
            if (missile.isVisible() == false) {
                missiles.remove(missile);
            }
        }
    }
    
    private boolean isCrash() {
        for (int i = 0; i < bombs.size(); i++) {
            Bomb bomb = bombs.get(i);
            if (tank.getBorder().intersects(bomb.getBorder())) {
                bombs.remove(bomb);
                return true;
            }
        }
        return false;
    }
    
    private boolean isHit() {
        for (int i = 0; i < missiles.size(); i++) {
            Missile missile = missiles.get(i);
            for (int e = 0; e < bombs.size(); e++) {
                Bomb bomb = bombs.get(e);
                if (bomb.getBorder().intersects(missile.getBorder())) {
                    missiles.remove(missile);
                    bombs.remove(bomb);
                    return true;
                }
            }
        }
        return false;
    }
    
    private void moveBombs() {
        for (int i = 0; i < bombs.size(); i++) {
            Bomb bomb = bombs.get(i);
            bomb.move();
        }
    }
    
    private void moveMissiles() {
        for (int i = 0; i < missiles.size(); i++) {
            Missile missile = missiles.get(i);
            missile.move();
        }
    }
    
    private void addBomb() {
        if(counter > 500 && counter < 2000){
            if ((counter % 90) == 0) {
                Bomb bomb = new Bomb(this);
                bombs.add(bomb);
            }
            round = 2;
        }
        if(counter > 3000 && counter < 4500){
            if ((counter % 70) == 0) {
                Bomb bomb = new Bomb(this);
                bombs.add(bomb);
            }
            round = 3;
        }
        if(counter > 5500 && counter < 7500){
            if ((counter % 40) == 0) {
                Bomb bomb = new Bomb(this);
                bombs.add(bomb);
            }
            round = 4;
        }
        if(counter > 8500 && counter < 10500){
            if ((counter % 30) == 0) {
                Bomb bomb = new Bomb(this);
                bombs.add(bomb);
            }
            round = 5;
        }
        if(counter > 11500 && counter < 14500){
            if ((counter % 20) == 0) {
                Bomb bomb = new Bomb(this);
                bombs.add(bomb);
            }
        }
    }
    
    private void addMissile() {
        if ((counter % 70) == 0) {
            Missile missile1 = new Missile(this,tank.getPosition());
            Missile missile2 = new Missile(this,tank.getPosition()+20);
            missiles.add(missile1);
            missiles.add(missile2);
        }
    }
    
}
