/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import org.javalite.activejdbc.Model;
import org.javalite.activejdbc.annotations.BelongsTo;
import org.javalite.activejdbc.annotations.IdName;
import records.TeamRecord;

/**
 *
 * @author marcu
 */
//@IdName("teamsid")
//@BelongsTo(parent = Game.class, foreignKeyName = "gamesid")
public class Team {
    
    private final TeamRecord theRecord;
    
    public Team() {
        this(new TeamRecord());
    }
    
    public Team(TeamRecord theRecord) {
        this.theRecord = theRecord;
    }
    
    public String getName() {
        return theRecord.getString("teamsname");
    }
    
    public int getID() {
        return theRecord.getInteger("teamsid");
    }
}
