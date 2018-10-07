package com.yuk.pattern.proxy.jdk;

import com.yuk.pattern.proxy.staticed.Person;
import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;

/**
 * Created by yuk on 2018/10/6.
 */
public class JDKProxyTest {

    public static void main(String[] args) {
        try {
            //找对象
            //Person obj = (Person)new JDKMeipo().getInstance(new XieMu());
            //obj.findLove();

            //找工作
            Person obj = (Person)new JDK58().getInstance(new XieMu());
            System.out.println(obj.getClass());
            obj.findJob();



            //字节码重组原理：
            //1、拿到被代理对象的引用，并且获取到它的所有的接口，反射获取
            //2、JDK Proxy 类重新生成一个新的类、同时新的类要实现被代理类的所有实现的所有的接口
            //3、动态生成java代码，把新加的业务逻辑方法由一定的逻辑代码去调用（在代码中体现）
            //4、编译新生成的Java代码.class
            //5、再重新加载到jvm中运行
            //以上这个过程就叫字节码重组


            //JDK中有个规范，只要是$开头的一般是自动生成的

            //通过反编译工具可以查看源代码
            byte[] bytes = ProxyGenerator.generateProxyClass("$Proxy0", new Class[]{Person.class});
            FileOutputStream os = new FileOutputStream("E://$Proxy0.class");
            os.write(bytes);
            os.close();


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
