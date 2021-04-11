package com.testcases.testcase;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class Case1Test {
    @Test
    void test1(){
        Integer a = 123;
        assertTrue(a<200);
    }

    @Test
    void test2(){
        String food = "bread";
        assertEquals("bread", food);
    }
}
