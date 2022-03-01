/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package records;

import domain.League;
import org.javalite.activejdbc.Model;
import org.javalite.activejdbc.annotations.BelongsTo;
import org.javalite.activejdbc.annotations.IdName;
import org.javalite.activejdbc.annotations.Table;


/**
 *
 * @author marcu
 */

@Table("seasons")
@IdName("seasonsid")
@BelongsTo(parent = LeagueRecord.class, foreignKeyName = "leaguesid")
public class SeasonRecord extends Model {
    
}
