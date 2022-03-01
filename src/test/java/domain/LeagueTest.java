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

/**
 *
 * @author marcu
 */
public class LeagueTest {
    
    public LeagueTest() {
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
        LeagueRecord leagueRecordMock = mock(LeagueRecord.class);
        
        // om getString("name") anropas så returnera "" tomma strängen
        when( leagueRecordMock.get("leaguesname")).thenReturn("");
        
        League instance = new League(leagueRecordMock); // Injicera beroendet (av mockat objekt)
        String expResult = null;
        String result = instance.getName();
        
        assertEquals(expResult, result); // kontrollera att värdet är korrekt
        
        verify(leagueRecordMock, times(1)).getString("leaguesname"); // kontrollera beteendet (getString anropas)
        
    }
    
    
    @Test
    public void testGetID() {
        System.out.println("getID");
        LeagueRecord leagueRecordMock = mock(LeagueRecord.class);
        
        // om getString("name") anropas så returnera "" tomma strängen
        when( leagueRecordMock.get("leaguesid")).thenReturn("");
        
        League instance = new League(leagueRecordMock); // Injicera beroendet (av mockat objekt)
        int expResult = 0;
        int result = instance.getID();
        
        //String exp = "0";
        //String x = String.valueOf(result)
       // String exp = 0;
        assertEquals(expResult, result); // kontrollera att värdet är korrekt
        
        verify(leagueRecordMock, times(1)).getInteger("leaguesid"); // kontrollera beteendet (getString anropas)
        
    }
    
    @Test
    public void testSetName() {
        System.out.println("setName");
        LeagueRecord leagueRecordMock = mock(LeagueRecord.class);
        
        // om getString("name") anropas så returnera "" tomma strängen
        when( leagueRecordMock.get("leaguesname")).thenReturn("");
        
        League instance = new League(leagueRecordMock); // Injicera beroendet (av mockat objekt)
        String expResult = "name";
        String result = instance.setName(expResult);
        
        //String exp = "0";
        //String x = String.valueOf(result)
       // String exp = 0;
        assertEquals(expResult, result); // kontrollera att värdet är korrekt
        
        //verify(leagueRecordMock, times(1)).getString("leaguesname"); // kontrollera beteendet (getString anropas)
        
    }
}
