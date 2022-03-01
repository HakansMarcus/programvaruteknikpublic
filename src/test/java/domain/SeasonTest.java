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

/**
 *
 * @author marcu
 */
public class SeasonTest {
    
    public SeasonTest() {
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
        SeasonRecord seasonRecordMock = mock(SeasonRecord.class);
        
        // om getString("name") anropas så returnera "" tomma strängen
        when( seasonRecordMock.getString("seasonsname")).thenReturn("");
        
        Season instance = new Season(seasonRecordMock); // Injicera beroendet (av mockat objekt)
        String expResult = "";
        String result = instance.getName();
        
        assertEquals(expResult, result); // kontrollera att värdet är korrekt
        
        verify(seasonRecordMock, times(1)).getString("seasonsname");
        
    }
    
    @Test
    public void testGetID() {
        System.out.println("getID");
        SeasonRecord seasonRecordMock = mock(SeasonRecord.class);
        
        // om getString("name") anropas så returnera "" tomma strängen
        when( seasonRecordMock.get("seasonsid")).thenReturn("");
        
        Season instance = new Season(seasonRecordMock); // Injicera beroendet (av mockat objekt)
        int expResult = 0;
        int result = instance.getID();
        
        //String exp = "0";
        //String x = String.valueOf(result)
       // String exp = 0;
        assertEquals(expResult, result); // kontrollera att värdet är korrekt
        
        verify(seasonRecordMock, times(1)).getInteger("seasonsid"); // kontrollera beteendet (getString anropas)
        
    }
    
}
