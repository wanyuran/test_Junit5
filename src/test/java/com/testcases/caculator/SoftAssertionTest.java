package com.testcases.caculator;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import com.util.Calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertAll;

// 优化了测试用例，造测试用例中使用了软断言
// java 8 lambda的使用
public class SoftAssertionTest {
    @BeforeEach
    public void clear() {
        Calculator.clear();
    }

    @Test
    public void addSoftAssertionTest() {
        int result = Calculator.add(1, 2);
        final int result01 = Calculator.add(11, 2);
        int result02 = Calculator.add(3, 112);
        int result03 = Calculator.add(4, 92);


        assertAll("", () -> {
            assertNotNull(result);

            assertAll("计算结果校验：", () -> assertEquals(3, result), () -> assertEquals(3, result01), () -> assertEquals(105, result02), () -> assertEquals(96, result03));
        });
    }

    @Test
    public void divideSoftAssertionTest() {
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            Calculator.divide(1, 0);
        });
        assertEquals("/ by zero ", exception.getMessage());

    }

    @Test
    public void subtractTest() {
        int result = Calculator.subtract(7, 8);
        assertEquals(-1, result);
    }

    @Test
    public void multiplyTest() {
        int result = Calculator.multiply(2, 4);
        assertEquals(8, result);

    }


    @Test
    public void countTest() throws InterruptedException {
        float result = Calculator.count(1,6);
        System.out.println("result is: " + result);
        assertEquals(6, result);
    }
}
