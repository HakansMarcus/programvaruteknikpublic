/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import org.javalite.activejdbc.Model;
import org.javalite.activejdbc.annotations.BelongsTo;
import org.javalite.activejdbc.annotations.IdName;
import records.GameRecord;
import records.ResultRecord;

/**
 *
 * @author marcu
 */
//@IdName("resultsid")
//@BelongsTo(parent = Game.class, foreignKeyName = "gamesid")
public class Result {
    
    private final ResultRecord theRecord;
    
    public Result() {
        this(new ResultRecord());
    }
    
    public Result(ResultRecord theRecord) {
        this.theRecord = theRecord;
    }
    
    
    public String getWinningTeam() {
        return theRecord.getString("winningteam");
    }
    
    public int getID() {
        return theRecord.getInteger("resultsid");
    }
    
    public int getScore() {
        return theRecord.getInteger("score");
    }
    
}
