package fr.formation.formationdevops;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AppTest {
	
	Calculette calculette;
	
	@BeforeEach                                         
    void setUp() {
        calculette = new Calculette();
    }

    @Test 
    void testAdd() {
    	calculette.add(1, 3);
    	assertEquals(4.0, calculette.getRes());  
    }

    @Test 
    void testDiv() {
    	try {
			calculette.divide(3, 1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	assertEquals(3.0, calculette.getRes());  
    }

    @Test 
    void testDivException() throws Exception {
		Exception thrown = assertThrows(
		           Exception.class,
		           () -> calculette.divide(1,0),
		           "Expected doThing() to throw, but it didn't"
		    );

		    assertTrue(thrown.getMessage().contentEquals("on ne divise pas par 0 !!!"));
    }
}
