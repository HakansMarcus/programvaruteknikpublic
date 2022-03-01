/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import org.javalite.activejdbc.Model;
import org.javalite.activejdbc.annotations.HasMany;
import org.javalite.activejdbc.annotations.IdName;
import org.javalite.activejdbc.annotations.Table;
import records.LeagueRecord;

/**
 *
 * @author marcu
 */

/*
@Override IdName fixar till så man kan lägga in värden, utan att id-tabellen skall explicit heta id.
*/

//@IdName("leaguesid")
//@HasMany(child = Season.class, foreignKeyName = "seasonsid")
public class League {
    
    private final LeagueRecord theRecord;
  
    
    public League() {
        this(new LeagueRecord());
    }
    
    public League(LeagueRecord theRecord) {
        this.theRecord = theRecord;
    }
    
    
    public String getName() {
        String name = theRecord.getString("leaguesname");
        return name;
    }
    
    public int getID(){
        return theRecord.getInteger("leaguesid");
    }
    
    public String setName(String name) {
        theRecord.set("name", name);
        return name;
    }
    
    public static List<League> findAll(){
        List<LeagueRecord> leagueRecordList = LeagueRecord.findAll();
//        List<League> leagueList = new ArrayList();
//        for( LeagueRecord lr : leagueRecordList) {
//            leagueList.add(new League(lr));
//        }
        return leagueRecordList.stream().map((r)-> new League(r)).collect(Collectors.toList());
    }
    
    public LeagueRecord getRecord() {
        return theRecord;
    }
    
    
    public static League findById(int i) {
        return new League(LeagueRecord.findById(i));
    }  
}
