package com.yuk.pattern.proxy.jdk;

import com.yuk.pattern.proxy.staticed.Person;

/**
 * Created by yuk on 2018/10/6.
 */
public class XieMu implements Person{

    public void findLove(){
        System.out.println("高富帅");
        System.out.println("身高180cm");
        System.out.println("胸大，6块腹肌");
    }

    @Override
    public void zufangzi() {
        System.out.println("租房子");
    }

    @Override
    public void buy() {

        System.out.println("买东西");
    }

    @Override
    public void findJob() {
        System.out.println("月薪在20k");
        System.out.println("找工作");

    }
}
