package chapter02.java1;

import java.sql.Driver;
import java.sql.DriverManager;

// 获取ClassLoader的途径
public class ClassLoaderTest2 {
    public static void main(String[] args) {
        // 1. class.getClassLoader()

        ClassLoader classLoader = String.class.getClassLoader();
        System.out.println(classLoader);        // null


        // 2. 获取当前线程上下文的Classloader

        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        System.out.println(contextClassLoader);     // sun.misc.Launcher$AppClassLoader@18b4aac2


        // 3. 获取系统的ClassLoader

        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println(systemClassLoader);      // sun.misc.Launcher$AppClassLoader@18b4aac2


    }
}
