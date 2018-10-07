package com.yuk.pattern.proxy.custom;

import javax.tools.JavaCompiler;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;

/**
 * Created by yuk on 2018/10/6.
 */
public class GPProxy {

    public static final String ln = "\r\n";

    public static Object newProxyInstance(GPClassLoader classLoader,Class<?>[] interfaces,GPInvocationHandler h){
        try {
            //1、动态生成源代码.java文件
            String src = generateSrc(interfaces);

            //2、Java文件输出磁盘
            String filePath = GPProxy.class.getResource("").getPath();
            System.out.println(filePath);
            File f = new File(filePath + "$Proxy0.java");
            FileWriter fw = new FileWriter(f);
            fw.write(src);
            fw.flush();
            fw.close();

            //3、把生成的.Java文件编译成.class文件
            JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
            StandardJavaFileManager manage = compiler.getStandardFileManager(null,null,null);
            Iterable iterable = manage.getJavaFileObjects(f);

            JavaCompiler.CompilationTask task = compiler.getTask(null,manage,null,null,null,iterable);
            task.call();
            manage.close();

            //4、编译生成的.class文件加载到jvm中来
            Class proxyClass =  classLoader.findClass("$Proxy0");
            Constructor c = proxyClass.getConstructor(GPInvocationHandler.class);
            f.delete();

            //5、返回字节码重组以后的新的代理对象
            return c.newInstance(h);

        }catch(Exception e){
            e.printStackTrace();
        }

        return null;
    }

    private static String generateSrc(Class<?>[] interfaces){

        StringBuffer sb = new StringBuffer();
        sb.append("package com.yuk.pattern.proxy.custom;" + ln);
        sb.append("import com.yuk.pattern.proxy.staticed.Person;" + ln);
        sb.append("import java.lang.reflect.Method;" +ln);
        sb.append("public class $Proxy0 implements " + interfaces[0].getName() + "{" + ln);

        sb.append("GPInvocationHandler h;" + ln);

        sb.append("public $Proxy0(GPInvocationHandler h) {" + ln);

        sb.append("this.h = h;" + ln);

        sb.append("}" + ln);

        for(Method m : interfaces[0].getMethods()){
            sb.append("public " + m.getReturnType().getName() + " " + m.getName() + "() {" + ln);

            sb.append("try{" +ln);
            sb.append("Method m = " + interfaces[0].getName() + ".class.getMethod(\""+ m.getName() +"\",new Class[]{});" + ln);
            sb.append("this.h.invoke(this,m,null);" + ln);
            sb.append("}catch(Throwable e){" + ln);
            sb.append("e.printStackTrace();" + ln);
            sb.append("}" + ln);
            sb.append("}");
        }


        sb.append("}" + ln);
        return sb.toString();

    }
}