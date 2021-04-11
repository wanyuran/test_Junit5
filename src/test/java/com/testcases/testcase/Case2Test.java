package com.testcases.testcase;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Case2Test {
    @Test
    void test1(){
        Integer a = 456;
        assertTrue(a > 200);
    }

    @Test
    void test2(){
        String food = "juice";
        assertEquals("juice", food);
    }
}
