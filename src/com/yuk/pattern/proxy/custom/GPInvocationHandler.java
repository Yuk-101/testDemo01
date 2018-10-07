package com.yuk.pattern.proxy.custom;

import java.lang.reflect.Method;

/**
 * Created by yuk on 2018/10/6.
 */
public interface GPInvocationHandler {
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable;
}
