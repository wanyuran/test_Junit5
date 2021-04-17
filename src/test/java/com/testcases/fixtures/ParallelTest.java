package com.testcases.fixtures;

import com.util.Calculator;
import org.junit.Ignore;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ParallelTest {
    @RepeatedTest(10)
    public void countTest() throws InterruptedException {
        int result = Calculator.count(1);
        System.out.println(result);
    }

    @RepeatedTest(10)
    public void countSyncTest() throws InterruptedException {
        int result = Calculator.countSync(1);
        System.out.println(result);
    }

}
