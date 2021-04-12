package com.testcases.fixtures;

import com.util.Calculator;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class ParallelTest {
    @RepeatedTest(10)
    public void countTest() throws InterruptedException {
        int result = Calculator.count(1,2);
        System.out.println(result);
    }

}
