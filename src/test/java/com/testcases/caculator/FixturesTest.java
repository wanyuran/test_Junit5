package com.testcases.caculator;

import com.util.Calculator;
import org.junit.jupiter.api.*;

import java.text.DecimalFormat;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FixturesTest {
    @BeforeAll
    public static void beforeAll(){
        System.out.println("在所有测试之前执行");
    }

    @AfterAll
    public static void afterAll(){
        System.out.println("在所有测试之后执行");
    }

    @BeforeEach
    public void before(){
        Calculator.clear();
        System.out.println("在每一个测试之前执行");
    }

    @AfterEach
    public void after(){
        System.out.println("在每一个测试之后执行");
    }

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
        DecimalFormat df = new DecimalFormat("0.00000");
        double result = Calculator.divide(2,4);
        assertEquals(0.5, result);
    }

    @Test
    public void countTest() throws InterruptedException {
        int result = Calculator.count(1,6);
        System.out.println("result is: " + result);
        assertEquals(6, result);
    }

}
