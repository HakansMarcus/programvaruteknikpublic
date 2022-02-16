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
@IdName("teamsid")
@BelongsTo(parent = Game.class, foreignKeyName = "gamesid")
public class Team extends Model {
    
    private String teamsname;
    private int teamsid;
    private int participants;
    private String teamcolor;
    
    /*
    Sätta in värdena direkt till databasen i konstruktorn?
    */
    public Team(String teamsname, int teamsid, int participants, String teamcolor){
        this.teamsname = teamsname;
        this.teamsid = teamsid;
        this.participants = participants;
        this.teamcolor = teamcolor;
    }
   
    public Team(){
        
    }
    
    public String getName() {
        return getString("teamsname");
    }
    
    public int getID() {
        return getInteger("teamsid");
    }
}
