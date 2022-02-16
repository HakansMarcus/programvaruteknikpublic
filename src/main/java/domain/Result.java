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
@IdName("resultsid")
@BelongsTo(parent = Game.class, foreignKeyName = "gamesid")
public class Result extends Model {
    
    
    public String getWinningTeam() {
        return getString("winningteam");
    }
    
    public int getID() {
        return getInteger("resultsid");
    }
    
    public int getScore() {
        return getInteger("score");
    }
    
}
