package com.testcases.fixtures;

import com.util.Calculator;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Parallel_1_Test {
    @RepeatedTest(20)
    public void addTest() {
        System.out.println(Thread.currentThread().getId());
        int result = Calculator.add(2, 5);
        assertEquals(7, result);
    }

    @RepeatedTest(20)
    public void subtractTest() {
        System.out.println(Thread.currentThread().getId());
        int result = Calculator.subtract(7, 8);
        assertEquals(-1, result);
    }
}
