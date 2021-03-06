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
public class Sedan extends Car {
    private int consumption = 5;
    private int speed = 240;
    private Size size = Size.Medium;
    
    public Sedan(String name, int year, Size size) {
        super(name, year, size);
    }
    
    public Sedan(String name){
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
        return super.toString() + " [Sedan]";
    }
}
