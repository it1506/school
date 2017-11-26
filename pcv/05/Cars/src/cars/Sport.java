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

    public Sport(String name, int year, Size size) {
        super(name, year, size);
    }
    
    public Sport(String name) {
        super(name);
    }
    
    public String toString(){
        return super.toString() + " [Sport]";
    }
}
