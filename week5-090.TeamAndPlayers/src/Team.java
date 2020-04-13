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

public class Team {
    private String name;
    private ArrayList<Player> players;
    private int maxSize;
    
    public Team(String name){
        this.name = name;
        this.players = new ArrayList<Player>();
        this.maxSize = 25;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void addPlayer(Player player){
        if (this.players.size() >= this.maxSize){
            //do nothing
        }else{
            this.players.add(player);
        }
    }
    
    public void printPlayers(){
        for (Player player: this.players){
            System.out.println(player);
        }
    }
    
    public void setMaxSize(int maxSize){
        //maximum number of players a team can have
        this.maxSize = maxSize;
    }
    
    public int size(){
        //returns the number of players on a team
        return this.players.size();
    }
    
    public int goals(){
        
        int numOfGoals = 0;
        
        for(Player i: this.players){
            numOfGoals += i.goals();
        }
        return numOfGoals;
    
    }
}
