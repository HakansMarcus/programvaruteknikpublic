/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import java.util.List;
import org.javalite.activejdbc.Model;
import org.javalite.activejdbc.annotations.HasMany;
import org.javalite.activejdbc.annotations.IdName;

/**
 *
 * @author marcu
 */

/*
@Override IdName fixar till så man kan lägga in värden, utan att id-tabellen skall explicit heta id.
*/
@IdName("leaguesid")
@HasMany(child = Season.class, foreignKeyName = "seasonsid")
public class League extends Model {
    
    private String leagueName;
    private int leaguesID;
    
    public League(String leaguesName, int leaguesID) {
        this.leagueName = leaguesName;
        this.leaguesID = leaguesID;
    }
    
    public League(){
        
    }
    
    public String getName() {
        return getString("leaguesname");
    }
    
    public int getID(){
        return getInteger("leaguesid");
    }
    
    
    
    
//    public List<Season>(){
//        List<Season> seasons =
//    }
    
    /*
    select leaguesid from leagues where leaguesname = 'name'
    
    Hämta in en lista utav alla seasons
    
    getidByName("Donald duck") --> 4
    */
//    public int getidByName(String name) {
//        
//    }
    
}
