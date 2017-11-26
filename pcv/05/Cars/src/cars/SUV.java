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
public class SUV extends Car{

    public SUV(String name, int year, Size size) {
        super(name, year, size);
    }
    
    public SUV(String name){
        super(name);
    }
    
    public String toString(){
        return super.toString() + " [SUV]";
    }
}
