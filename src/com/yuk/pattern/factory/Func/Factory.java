package com.yuk.pattern.factory.Func;

import com.yuk.pattern.factory.Milk;

/**
 * 工厂模型
 * Created by yuk on 2018/10/3.
 */
public interface Factory {
    /**
     * 工厂必然有生产产品的技能，统一的产品出口
     * @return
     */
    Milk getMilk();
}
