package com.example.arithmetic;


import org.junit.Test;

import model.Arithmetic;

import static junit.framework.TestCase.assertEquals;


public class ArithmeticTest {

    @Test
    public void testAddition(){
        Arithmetic arithmetic = new Arithmetic();
        float expectedResult = 10;
        float actualResult = arithmetic.add(4, 6);
        assertEquals(expectedResult,actualResult);
    }


}
