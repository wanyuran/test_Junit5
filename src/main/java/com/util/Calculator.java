package com.util;

import java.text.DecimalFormat;

public class Calculator {
    public static int result = 0;

    public static int add(int x, int y) {
        result = x + y;
        return result;
    }

    public static int subtract(int x, int y) {
        result = x - y;
        return result;
    }

    public static int multiply(int x, int y) {
        result = x * y;
        return result;
    }

    public static double divide(double x, double y) {
//        DecimalFormat df = new DecimalFormat("0.0000");
        double result = x / y;
        return result;
    }

    public static int count(int x, int count) throws InterruptedException {
        int temp = result;
        for (int j = 1; j <= count; j++) {
            Thread.sleep(500);
            temp = temp + x;
        }
        return temp;
    }

    public static void clear() {
        result = 0;
        System.out.println("当前结果已清零");

    }

}
