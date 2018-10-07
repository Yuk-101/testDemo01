package com.yuk.pattern.proxy.zz.reflect;

import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by yuk on 2018/10/7.
 */
public class test {

    public static void main(String[] args) {
        try {
            //反射
            ReflectService obj = (ReflectService)Class.forName("com.yuk.pattern.proxy.zz.reflect.ReflectService").newInstance();
            System.out.println(obj.getClass());
            Method method = obj.getClass().getMethod("sayHello",String.class);
            method.invoke(obj,"明明");

            //自己new一个对象
            ReflectService re = new ReflectService();
            re.sayHello("yuk");
        }catch(ClassNotFoundException | IllegalAccessException |InstantiationException | NoSuchMethodException | InvocationTargetException e){
            e.printStackTrace();
        }
    }



    @Test
    public Object reflect(){

        ReflectService object = null;

        try {
            object = (ReflectService)Class.forName("com.yuk.pattern.proxy.zz.reflect.ReflectService").newInstance();
            Method method = object.getClass().getMethod("sayHello",String.class);
            method.invoke(object,"明明");
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }catch (NoSuchMethodException e){
            e.printStackTrace();
        }catch (InvocationTargetException e){
            e.printStackTrace();
        }
        return object;
    }
}
