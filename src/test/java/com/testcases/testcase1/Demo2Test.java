package com.testcases.testcase1;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

public class Demo2Test {
    private static HashMap<String, Object> dataMap = new HashMap<String, Object>();

    @Test
    public void LoginTest() {
        dataMap.put("login", "登录成功");
        System.out.println(dataMap.get("login"));
    }

    @Nested
    class PayTest {
        @Test
        public void payTest() {
            if (null != dataMap.get("buy")) {
                System.out.println("正在支付，请稍后");
                System.out.println("您购买了" + dataMap.get("buy"));
                dataMap.put("hello", "您好");
            } else {
                System.out.println("支付失败");
            }
        }
    }


    @Nested
    class BuyTest {
        @Test
        public void buyTest() {
            if (dataMap.get("login").equals("登录成功")) {
                System.out.println("登录成功，可以购买商品");
                dataMap.put("buy", "购买了商品A");
            } else {
                System.out.println("登录失败，请重新登录");
            }
        }
    }
}
