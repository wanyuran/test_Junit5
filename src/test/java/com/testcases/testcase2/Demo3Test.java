package com.testcases.testcase2;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class Demo3Test {
    @RepeatedTest(10)
    void test1() throws InterruptedException {
        Thread.sleep(200);
        System.out.println("hello");
    }
}
