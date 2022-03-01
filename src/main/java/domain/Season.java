/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import static java.lang.Integer.getInteger;
import static javax.swing.UIManager.getString;
import org.javalite.activejdbc.MetaModel;
import org.javalite.activejdbc.Model;
import static org.javalite.activejdbc.Model.getMetaModel;
import org.javalite.activejdbc.annotations.BelongsTo;
import org.javalite.activejdbc.annotations.IdName;
import records.SeasonRecord;

/**
 *
 * @author Marcus Håkans
 * @version 2021-02-07
 */
//@IdName("seasonsid")
//@BelongsTo(parent = League.class, foreignKeyName = "leaguesid")
public class Season {
    
    private final SeasonRecord theRecord;
  
    
    public Season() {
        this(new SeasonRecord());
    }
   
    
    public Season(SeasonRecord theRecord) {
        this.theRecord = theRecord;
    }
    
    public String getName() {
        return theRecord.getString("seasonsname");
    }
    
    
    public int getID() {
        return theRecord.getInteger("seasonsid");
    }
    
   public MetaModel getModel() {
       return getMetaModel();
   }
   
   public SeasonRecord getRecord() {
        return theRecord;
    }
   
    public static Season findById(int i) {
        return new Season(SeasonRecord.findById(i));
    }  
    
}
