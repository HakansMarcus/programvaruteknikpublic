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
import records.GameRecord;

/**
 *
 * @author marcu
 */
public class GameTest {
    
    public GameTest() {
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
        GameRecord gameRecordMock = mock(GameRecord.class);
        
        // om getString("name") anropas så returnera "" tomma strängen
        when( gameRecordMock.get("gamesname")).thenReturn("");
        
        Game instance = new Game(gameRecordMock); // Injicera beroendet (av mockat objekt)
        String expResult = null;
        String result = instance.getName();
        
        assertEquals(expResult, result); // kontrollera att värdet är korrekt
        
        verify(gameRecordMock, times(1)).getString("gamesname"); // kontrollera beteendet (getString anropas)
        
    }
    
    
    @Test
    public void testGetID() {
        System.out.println("getID");
        GameRecord gameRecordMock = mock(GameRecord.class);
        
        // om getString("name") anropas så returnera "" tomma strängen
        when( gameRecordMock.get("gamesid")).thenReturn("");
        
        Game instance = new Game(gameRecordMock); // Injicera beroendet (av mockat objekt)
        int expResult = 0;
        int result = instance.getID();
        
        //String exp = "0";
        //String x = String.valueOf(result)
       // String exp = 0;
        assertEquals(expResult, result); // kontrollera att värdet är korrekt
        
        verify(gameRecordMock, times(1)).getInteger("gamesid"); // kontrollera beteendet (getString anropas)
        
    }   
}
