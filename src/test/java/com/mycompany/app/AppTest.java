package com.mycompany.app;
import java.util.ArrayList;
import java.util.Arrays;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }

    public void testResult(){
        ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        ArrayList<Integer> arr2 = new ArrayList<>(Arrays.asList(4, 3, 2, 1));
        String str1 = "ThisIsMy";
        String str2 = "Result";
        assertEquals("hisIluse", new App().myMethod(arr1, arr2, str1, str2));
    }
    public void testNullArrays() {
        String str1 = "String1";
        String str2 = "String2";
        assertEquals(null, new App().myMethod(null, null, str1, str2));
    }
    public void testNullStrings() {
        ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        ArrayList<Integer> arr2 = new ArrayList<>(Arrays.asList(4, 3, 2, 1));
        assertEquals(null, new App().myMethod(arr1, arr2, null, null));
    }
    public void testNegativeValues(){
        ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(-1, 2, -3, 4));
        ArrayList<Integer> arr2 = new ArrayList<>(Arrays.asList(4, -3, 2, -1));
        String str1 = "ThisIsMy";
        String str2 = "Result";
        assertEquals(null, new App().myMethod(arr1, arr2, str1, str2));
    }
    public void testIndexOutOfBounds(){
        ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(1, 2, 3, 7));
        ArrayList<Integer> arr2 = new ArrayList<>(Arrays.asList(10, 3, 2, 1));
        String str1 = "ThisIsMy";
        String str2 = "Result";
        assertEquals(null, new App().myMethod(arr1, arr2, str1, str2));
    }
}
