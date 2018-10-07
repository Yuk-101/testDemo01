package com.yuk.pattern.factory.Func;

import com.yuk.pattern.factory.Milk;
import com.yuk.pattern.factory.Telunsu;

/**
 * Created by yuk on 2018/10/3.
 */
public class TelunsuFactory implements Factory{

    @Override
    public Milk getMilk() {
        return new Telunsu();
    }
}
