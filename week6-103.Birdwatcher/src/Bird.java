/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alesa
 */
public class Bird {
    private String name;
    private String latinName;
    private int numberObserved;
    
    public Bird(String name, String latinName){
        this.name = name;
        this.latinName = latinName;
        this.numberObserved = 0;
    }
    
    public String getName(){
        return this.name;
    }
    public String getLatin(){
        return this.latinName;
    }
    
    public void increaseObserved(){
        this.numberObserved ++;
    }
    
    public int getObserved(){
        return this.numberObserved;
    }
}
