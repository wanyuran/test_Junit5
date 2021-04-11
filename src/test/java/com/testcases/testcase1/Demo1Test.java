package com.testcases.testcase1;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Demo1Test {
    @ParameterizedTest
    @ValueSource(ints =  {0,1,2,3})
    void testWithValueSource(int args){
        assertTrue(args > 0 && args < 3);
    }


    @Test
    void test(){
        String food = "milk";
        assertEquals("milk", food);
    }
}
