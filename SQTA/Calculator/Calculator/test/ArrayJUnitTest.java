/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import calculator.Calculator;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Admin
 */
public class ArrayJUnitTest {
    
    public ArrayJUnitTest() {
    }
    
    @BeforeClass
    public static void setUpClass() { 
             System.out.println("Before class");
    }
    
    @AfterClass
    public static void tearDownClass() { 
         System.out.println("After class");
    }
    
    @Before
    public void setUp() { 
         System.out.println("Before ");
    }
    
    
         @Test
    public void testMultiple(){
       assertEquals(7,Calculator.max(new int[]{4,2,7,6}));
       assertEquals(-3,Calculator.max(new int[]{-12,-1,-3,-2}));

    } 
    @After
    public void tearDown() { 
         System.out.println("After");
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
