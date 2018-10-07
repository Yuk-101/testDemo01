package com.yuk.pattern.proxy.staticed.test;

import com.yuk.pattern.proxy.staticed.Father;
import com.yuk.pattern.proxy.staticed.Son;

/**
 * Created by yuk on 2018/10/4.
 */
public class StaticProxyTest {
    public static void main(String[] args) {

        //Son son = new Son();

        //只能帮儿子找对象，不能其他人找
        Father fa = new Father(new Son());
        fa.findLove();
    }
}
