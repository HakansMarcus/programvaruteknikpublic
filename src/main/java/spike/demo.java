/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spike;

import db.DbConn;
import domain.Game;
import domain.League;
import domain.Result;
import domain.Season;
import domain.Team;
import java.util.List;
import org.javalite.activejdbc.Model;
/**
 *
 * @author marcu
 */
public class demo {
    
    public static void main(String[] args) {
       
        /*
        Öppnar upp databas uppkopplingen
        */
        DbConn dbCon = DbConn.getInstance();
        dbCon.open();
        
        // Nytt league-objekt
        League league = new League();
        
        // Sätter in värden, lagrar data till tabellen i databasen
        league.set("leaguesname", "Donald Duck League");
        league.saveIt();
        
        
        // Lista alla tillgängliga leagues
         List<League> leagues = League.findAll();
         
         // Hämta id-nr på första League-objektet i listan
         int firstIDfromLeague = leagues.get(0).getID();
        
        
         for(League l: leagues) {
            System.out.printf("LeagueName: %s, Leagues-ID: %d\n", l.getName(), l.getID());
        }
        
         /*
         Skapar ett Season objekt. Sätter in Leaguesid ifrån Leage-objeket.
         */
         Season season = new Season();
         season.set("leaguesid", firstIDfromLeague);
         season.set("seasonsname", "Säsong 1");
         season.saveIt();
         
         // Lägger till season som ett barn till League
         league.add(season);
         
         List<Season> seasons = Season.findAll();
         
         // Hämtar parent -> League
         League leagueParent = season.parent(League.class);
       
           for(Season s: seasons) {
            System.out.printf("SeasonName: %s, Seasons-ID: %d LeagueID: %d\n", s.getName(), s.getID(), leagueParent.getID());
        }
           
           /*
           Skapa ett Game objekt
           Skapa ett Team objekt
           Skapa ett Results objekt
           Slutligen lägga till Game objektet som ett barn till Season.
           */
           
            Game game = new Game();
           
           // Hämta id ifrån Season
           int firstIDfromSeasons = seasons.get(0).getID();
           game.set("seasonsid", firstIDfromSeasons);
           game.saveIt();
           
           List<Game> firstGamesList = Game.findAll();
           
           
           
           //
            // Skapa ett results objekt med diverse värden
           Result result = new Result();
           result.set("winningteam", "Lag A");
           result.set("score", 4);
           result.set("gamesid", firstGamesList.get(0).getID());
           result.saveIt();
           
           List<Result> results = Result.findAll();
           
           for(Result r: results) {
               System.out.printf("WinningTeam: %s ID: %d Score: %d\n", r.getWinningTeam(), r.getID(), r.getScore());
           }
           
           
           game.set("resultsid", results.get(0).getID());
           
          
           
           // Skapa ett Team-objekt. Sätta in värden
           Team team = new Team();
           team.set("teamsname", "Lag A");
           team.set("gamesid", firstGamesList.get(0).getID());
           team.saveIt();
           
           List<Team> teams = Team.findAll();
           
           for(Team t: teams) {
               System.out.printf("Teamname: %s TeamID: %d\n", t.getName(), t.getID());
           }
           
           game.set("teamsid", teams.get(0).getID());
           game.set("place", "Arena");
           game.set("gamesname", "Spelomgång 1");
           game.saveIt();
           
           /*
           Season objektet lägger till Game objektet som barn.
           */
           season.add(game);
           
           List<Game> games = Game.findAll();
           
           for(Game g: games) {
               System.out.printf("GameName: %s, GameID: %d TeamID: %d ResultsID: %d SeasonsID: %d Place: %s\n", g.getName(), g.getID(), g.getTeamsID(), 
                       g.getResultsID(), g.getSeasonsID(), g.getPlace());
           }
           
           team.set("gamesid", games.get(0).getID());
           team.saveIt();
           
           // Lägger till Team och Results som barn till Games
           game.add(team);
           game.add(result);

        dbCon.close();
        
    }
    
}
