package com.testcases.caculator;

import com.util.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BaseTest {
    @Test
    public void addTest() {
        int result = Calculator.add(2, 5);
        assertEquals(7, result);
    }

    @Test
    public void subtractTest() {
        int result = Calculator.subtract(7, 8);
        assertEquals(-1, result);
    }

    @Test
    public void multiplyTest(){
        int result = Calculator.multiply(2,4);
        assertEquals(8,result);
    }

    @Test
    public void divideTest(){
        double result = Calculator.divide(3.1,6.2);
        assertEquals(0.5, result);
    }

    @Test
    public void countTest() throws InterruptedException {
        float result = Calculator.count(1,6);
        System.out.println("result is: " + result);
        assertEquals(6, result);
    }



}
