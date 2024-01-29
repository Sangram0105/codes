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
public class CalculatorJUnitTest {
    
    public CalculatorJUnitTest() {
     
    }
       int a,b ;
       double q;
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
         a=3;
         b=4; 
         q=4.0;
    } 
    
    @Test
    public void testadd(){
    
        assertEquals(7,Calculator.add(a,b));
    } 
    
    
      @Test
    public void testMultiple(){
    
        assertEquals(12,Calculator.multiple(a,b));
    } 
    
    
     @Test
    public void testCube(){
    
        assertEquals(64.00,Calculator.cube(q),0.01);
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
