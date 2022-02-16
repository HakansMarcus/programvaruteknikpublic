/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import org.javalite.activejdbc.MetaModel;
import org.javalite.activejdbc.Model;
import org.javalite.activejdbc.annotations.BelongsTo;
import org.javalite.activejdbc.annotations.IdName;

/**
 *
 * @author Marcus Håkans
 * @version 2021-02-07
 */
@IdName("seasonsid")
@BelongsTo(parent = League.class, foreignKeyName = "leaguesid")
public class Season extends Model {
    
    private League league;
    
    /*
    Få in id-nr ifrån League tabellen till konstruktorn?
    */
//    public Season(League league) {
//        this.league = new League(); // composition
//        league.set("seasonsname", "Season 1");
//        System.out.println(league.getID());
//        
//    }
   
    
    public String getName() {
        return getString("seasonsname");
    }
    
    
    public int getID() {
        return getInteger("seasonsid");
    }
    
   public MetaModel getModel() {
       return getMetaModel();
   }
    
}
