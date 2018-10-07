package com.yuk.pattern.factory.abstr;

import com.yuk.pattern.factory.Milk;

/**
 * 抽象工厂是用户的主入口
 * 在Spring中应用最广泛的一种设计模式
 * 易于扩展
 * Created by yuk on 2018/10/3.
 */
public abstract class AbstractFactory {

    /**
     * 获得一个蒙牛产品
     * @return
     */
    public abstract Milk getMengniu();

    /**
     * 获得一个伊利产品
     * @return
     */
    public abstract Milk getYili();

    /**
     * 获得一个特仑苏产品
     * @return
     */
    public abstract Milk getTelunsu();

    /**
     * 获得一个特仑苏产品
     * @return
     */
    public abstract Milk getSanlu();
}
