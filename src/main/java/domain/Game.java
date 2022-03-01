/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import java.util.List;
import org.javalite.activejdbc.Model;
import org.javalite.activejdbc.annotations.BelongsTo;
import org.javalite.activejdbc.annotations.IdName;
import records.GameRecord;
import records.SeasonRecord;
import records.TeamRecord;

/**
 *
 * @author marcu
 */
//@IdName("gamesid")
//@BelongsTo(parent = SeasonRecord.class, foreignKeyName="seasonsid")
public class Game {
    
    private final GameRecord theRecord;
    
    public Game() {
        this(new GameRecord());
    }
    
    public Game(GameRecord theRecord) {
        this.theRecord = theRecord;
    }
    
    
     public String getName() {
        return theRecord.getString("gamesname");
    }
    
    public int getID() {
        return theRecord.getInteger("gamesid");
    }
    
//    // getTeam objek.
//    public List<TeamRecord> getTeams() {
//        return teamrecord.findAll();
//    }
//    
//    public int getSeasonsID() {
//        return getInteger("seasonsid");
//    }
//    
//    public int getResultsID() {
//        return getInteger("resultsid");
//    }
//    
//    public String getPlace() {
//        return getString("place");
//    }   
}
