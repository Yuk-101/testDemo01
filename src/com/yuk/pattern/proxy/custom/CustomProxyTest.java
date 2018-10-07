package com.yuk.pattern.proxy.custom;


import com.yuk.pattern.proxy.jdk.XieMu;
import com.yuk.pattern.proxy.staticed.Person;


/**
 * Created by yuk on 2018/10/7.
 */
public class CustomProxyTest {
    public static void main(String[] args) {

        try {
            Person obj = (Person)new CustomMeipo().getInstance(new XieMu());
            System.out.println(obj.getClass());
            obj.findLove();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
