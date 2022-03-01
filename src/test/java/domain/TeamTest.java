/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package domain;

import db.DbConn;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import records.LeagueRecord;
import static org.mockito.Mockito.*;
import records.SeasonRecord;
import records.TeamRecord;

/**
 *
 * @author marcu
 */
public class TeamTest {
    
    public TeamTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
        //DbConn.getInstance().open();
    }
    
    @AfterAll
    public static void tearDownClass() {
       //DbConn.getInstance().close();
    }
    
    @BeforeEach
    public void setUp() {
        
    }
    
    @AfterEach
    public void tearDown() {
    }
    
    @Test
    public void testGetName() {
        System.out.println("getName");
        TeamRecord teamRecordMock = mock(TeamRecord.class);
        
        // om getString("name") anropas så returnera "" tomma strängen
        when( teamRecordMock.getString("teamsname")).thenReturn("");
        
        Team instance = new Team(teamRecordMock); // Injicera beroendet (av mockat objekt)
        String expResult = "";
        String result = instance.getName();
        
        assertEquals(expResult, result); // kontrollera att värdet är korrekt
        
        verify(teamRecordMock, times(1)).getString("teamsname");
        
    }
    
    @Test
    public void testGetID() {
        System.out.println("getID");
        TeamRecord teamRecordMock = mock(TeamRecord.class);
        
        // om getString("name") anropas så returnera "" tomma strängen
        when( teamRecordMock.get("teamsid")).thenReturn("");
        
        Team instance = new Team(teamRecordMock); // Injicera beroendet (av mockat objekt)
        int expResult = 0;
        int result = instance.getID();
        
        //String exp = "0";
        //String x = String.valueOf(result)
       // String exp = 0;
        assertEquals(expResult, result); // kontrollera att värdet är korrekt
        
        verify(teamRecordMock, times(1)).getInteger("teamsid"); // kontrollera beteendet (getString anropas)
        
    }
    
}
