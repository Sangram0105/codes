/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author Admin
 */
public class StringTest {
    
    public StringTest() {
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
    public void testConcatenateStrings() {
        String str1 = "Hello, ";
        String str2 = "World!";
        String expectedResult = "Hello, World!";
       assertEquals(expectedResult, calculator.Strings.concatenateStrings(str1, str2));
    }
    
    @Test
    @Ignore
    public void testCompare(){
     String str1 = "Hello, ";
        String str2 = "World!";
        assertEquals(false, calculator.Strings.concatenateStrings(str1, str2));
    }
     


    @Test
    public void testStringEquality() {
        String expected = "Hello";
        String actual = "Hello";
        assertSame(expected, actual);
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
