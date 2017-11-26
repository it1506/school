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
    private float consumption = (float) 6.00;
    
    public Sedan(String name, int year, Size size) {
        super(name, year, size);
    }
    
    public Sedan(String name){
        super(name);
    }
    
    public float getConsumption() {
        return consumption;
    }

    public void setConsumption(float consumption) {
        this.consumption = consumption;
    }
    
    public String toString(){
        return super.toString() + " [Sedan]";
    }
}
