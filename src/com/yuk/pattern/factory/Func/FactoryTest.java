package com.yuk.pattern.factory.Func;

/**
 * Created by yuk on 2018/10/3.
 */
public class FactoryTest {
    public static void main(String[] args) {
        //System.out.println(new Factory().getMilk(););

        Factory factory = new MengniuFactory();
        System.out.println(factory.getMilk());
    }
}
