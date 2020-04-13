/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alesa
 */
import java.util.ArrayList;

public class Phonebook {
    private ArrayList<Person> people;
    
    public Phonebook(){
        this.people = new ArrayList<Person>();
    }
    
    public void add(String name, String number){
        Person person = new Person(name, number); //creates new person object
        this.people.add(person);
    }
    
    public void printAll(){
        for (Person person: this.people){
            System.out.println(person.getName() + " number: " + person.getNumber());
        }
    }
    
    public String searchNumber(String name){
        //returns phone number of a given name
       for (Person person: this.people){
            if (person.getName().equals(name)){
                return person.getNumber();
            }
       }
       return "number not known";
}
}
