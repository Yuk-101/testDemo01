package com.yuk.pattern.factory.abstr;

import com.yuk.pattern.factory.Func.MengniuFactory;
import com.yuk.pattern.factory.Func.SanluFactory;
import com.yuk.pattern.factory.Func.TelunsuFactory;
import com.yuk.pattern.factory.Func.YiliFactory;
import com.yuk.pattern.factory.Milk;

/**
 * Created by yuk on 2018/10/3.
 */
public class MilkFactory extends AbstractFactory {
    @Override
    public Milk getMengniu() {
        return new MengniuFactory().getMilk();
    }

    @Override
    public Milk getYili() {
        return new YiliFactory().getMilk();
    }

    @Override
    public Milk getTelunsu() {
        return new TelunsuFactory().getMilk();
    }

    @Override
    public Milk getSanlu() {
        return new SanluFactory().getMilk();
    }
}
