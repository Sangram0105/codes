/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import calculator.AssertStatement;
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
public class SortArrayTestCase {
    
    public SortArrayTestCase() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
        
        @Test
    public void Sort(){
        
assertArrayEquals(new int[]{10, 20, 30, 40, 50},Calculator.sort(new int[]{30, 40, 50, 20, 10})); 

assertArrayEquals(new int[]{-10,-5, -1, 2, 4}, Calculator.sort(new int[]{-1, 4, -5, 2, -10})); 

assertArrayEquals(new int[]{-100,65, 31,-23, 4}, Calculator.sort(new int[]{-100,65, 31,-23,4})); 

    }
    
    
    @Test
    
    public void Bool(){
        assertTrue(AssertStatement.search(new int[]{10, 20, 30, 40, 50}, 10));
    }
    
    
    @Test
     public void Double(){
        assertArrayEquals(new double[]{5,10,15,20,25},AssertStatement.sortBy2(new double[]{10, 20, 30, 40, 50}),0.01);
    }
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
