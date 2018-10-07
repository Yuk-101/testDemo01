package com.yuk.pattern.factory.simple;

import com.yuk.pattern.factory.Milk;
import com.yuk.pattern.factory.Telunsu;

/**
 * Created by yuk on 2018/10/2.
 */
public class SimpleFactory {
    public Milk getMilk(String name){
        if ("特仑苏".equals(name)){
            return new Telunsu();
        }
        return null;
    }
}
