package com.yuk.pattern.factory.Func;

import com.yuk.pattern.factory.Mengniu;
import com.yuk.pattern.factory.Milk;

/**
 * Created by yuk on 2018/10/3.
 */
public class MengniuFactory implements Factory{

    @Override
    public Milk getMilk() {
        return new Mengniu();
    }
}
