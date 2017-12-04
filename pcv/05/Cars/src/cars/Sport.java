/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cars;

/**
 *
 * @author Dan
 */
public class Sport extends Car{
    private int consumption = 8;
    private int speed = 320;
    private Size size = Size.Small;
    
    public Sport(String name, int year, Size size) {
        super(name, year, size);
    }
    
    public Sport(String name) {
        super(name);
    }
    
    public int getConsumption() {
        return consumption;
    }

    public void setConsumption(int consumption) {
        this.consumption = consumption;
    }
    
    public int getSpeed(){
        return this.speed;
    }
    
    public void setSpeed(int speed){
        if(speed > 0 && speed < 450)
            this.speed = speed;       
    }
    
    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }
    
    public String toString(){
        return super.toString() + " [Sport]";
    }
}
