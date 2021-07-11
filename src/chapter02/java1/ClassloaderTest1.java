package chapter02.java1;


import com.sun.glass.ui.Clipboard;

import javax.swing.text.html.parser.Parser;
import java.net.URL;


public class ClassloaderTest1 {
    public static void main(String[] args) {

        System.out.println("启动类加载器");

        // 获取Bootstrap ClassLoader能够加载的api路径
        URL[] urls = sun.misc.Launcher.getBootstrapClassPath().getURLs();
        for (URL url : urls) {
            System.out.println(url);
        }
        /*
            file:/D:/Java/jdk1.8.0_291/jre/lib/resources.jar
            file:/D:/Java/jdk1.8.0_291/jre/lib/rt.jar
            file:/D:/Java/jdk1.8.0_291/jre/lib/sunrsasign.jar
            file:/D:/Java/jdk1.8.0_291/jre/lib/jsse.jar
            file:/D:/Java/jdk1.8.0_291/jre/lib/jce.jar
            file:/D:/Java/jdk1.8.0_291/jre/lib/charsets.jar
            file:/D:/Java/jdk1.8.0_291/jre/lib/jfr.jar
            file:/D:/Java/jdk1.8.0_291/jre/classes
        */
        System.out.println("------------------------------------");

        // 从上面的路径中随意选择一个类，他的类加载器是：引导类加载器
        ClassLoader classLoader = Parser.class.getClassLoader();        // "D:\Java\jdk1.8.0_291\jre\lib\rt\org\xml\sax"目录下的Parser.class
        System.out.println(classLoader);    // null
        System.out.println("------------------------------------");


        System.out.println("扩展类加载器");
        String extDirs = System.getProperty("java.ext.dirs");
        for (String path:extDirs.split(";")){
            System.out.println(path);
        }
        /*
            D:\Java\jdk1.8.0_291\jre\lib\ext
            C:\Windows\Sun\Java\lib\ext
        */

        // 从上面的路径中随意选择一个类，他的类加载器是：扩展类加载器
        ClassLoader classLoader1 = Clipboard.class.getClassLoader();
        System.out.println(classLoader1);       // sun.misc.Launcher$ExtClassLoader@1b6d3586


    }
}
