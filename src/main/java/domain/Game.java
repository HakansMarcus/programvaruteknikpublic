/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import org.javalite.activejdbc.Model;
import org.javalite.activejdbc.annotations.BelongsTo;
import org.javalite.activejdbc.annotations.IdName;

/**
 *
 * @author marcu
 */
@IdName("gamesid")
@BelongsTo(parent = Season.class, foreignKeyName="seasonsid")
public class Game extends Model {
    
    
     public String getName() {
        return getString("gamesname");
    }
    
    public int getID() {
        return getInteger("gamesid");
    }
    
    public int getTeamsID() {
        return getInteger("teamsid");
    }
    
    public int getSeasonsID() {
        return getInteger("seasonsid");
    }
    
    public int getResultsID() {
        return getInteger("resultsid");
    }
    
    public String getPlace() {
        return getString("place");
    }
    
   
    
    
}
