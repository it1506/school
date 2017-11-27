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
public class Car {
    public enum Size {
        Big, Medium, Small;
    }
    private String name;
    private int year = 2010;
    private Size size = Size.Medium;
    private int consumption = 6;
    private int speed = 220;
    
    public Car(String name){
        this.name = name;
    }
    
    public Car(String name, int year, Size size){
        this.name = name;
        this.setYear(year);
        this.setSize(size);
    }
    
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public int getYear(){
        return this.year;
    }
    
    public void setYear(int year){
        if(year > 1950 && year < 2017)
            this.year = year;       
    }
    
    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
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
    
    public String toString(){
        String output = this.name;
        return output;
    }
}
