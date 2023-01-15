package com.hillel.posokhov.tests;

import com.hillel.posokhov.homeworks.homework18.UtilArrays;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestArraysUtil {
    static int [] arraysTest;
    @BeforeAll
    static void beforeAll (){
        arraysTest = new int[] {3,3,3,3,3};
    }
    @Test
    public void test1 (){
        assertTrue(UtilArrays.getArrays(new int[3][3]));
    }
    @Test
    public void test2 (){
        assertFalse (UtilArrays.getArrays(null));
    }
    @Test
    public void test3 (){
        double value = UtilArrays.getArithmeticMeanArrays(new int[]{});
        assertEquals(0.0, value);
    }
    @Test
    public void test4 (){
        double value = UtilArrays.getArithmeticMeanArrays(null);
        assertEquals(0.0, value);
    }
    @Test
    public void test5 (){
        double value = UtilArrays.getArithmeticMeanArrays(arraysTest);
        assertEquals(3.0, value);
    }
}
