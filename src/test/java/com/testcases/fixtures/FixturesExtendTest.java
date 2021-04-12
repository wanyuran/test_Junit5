package com.testcases.fixtures;

import com.util.Calculator;
import org.junit.jupiter.api.*;

import java.text.DecimalFormat;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FixturesExtendTest extends FixturesTest{
    @BeforeAll
    public static void beforeChildAll(){
        System.out.println("子测试类：在所有测试之前执行");
    }

    @AfterAll
    public static void afterChildAll(){
        System.out.println("子测试类：在所有测试之后执行");
    }

    @BeforeEach
    public void beforeChild(){
        Calculator.clear();
        System.out.println("子测试类：在每一个测试之前执行");
    }

    @AfterEach
    public void afterChild(){
        System.out.println("子测试类：在每一个测试之后执行");
    }

    @Test
    public void addChildTest() {
        int result = Calculator.add(4, 7);
        assertEquals(11, result);
    }

    @Test
    public void subtractChildTest() {
        int result = Calculator.subtract(7, 8);
        assertEquals(-1, result);
    }

    @Test
    public void multiplyChildTest(){
        int result = Calculator.multiply(2,4);
        assertEquals(8,result);
    }

    @Test
    public void divideChildTest(){
        DecimalFormat df = new DecimalFormat("0.00000");
        double result = Calculator.divide(2.111,4.222);
        assertEquals(0.5, result);
    }

    @Test
    public void countChildTest() throws InterruptedException {
        int result = Calculator.count(1,6);
        System.out.println("result is: " + result);
        assertEquals(6, result);
    }

}
