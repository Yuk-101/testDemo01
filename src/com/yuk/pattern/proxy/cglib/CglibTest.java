package com.yuk.pattern.proxy.cglib;

/**
 * Created by yuk on 2018/10/6.
 */
public class CglibTest {

    public static void main(String[] args) {

        try {
            ZhangSan obj = (ZhangSan)new CglibMeipo().getInstance(ZhangSan.class);
            obj.findLove();
            System.out.println(obj.getClass());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
