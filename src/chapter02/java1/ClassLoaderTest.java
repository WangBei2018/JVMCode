package chapter02.java1;

public class ClassLoaderTest {
    public static void main(String[] args) {

        // 获取系统类加载器
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println(systemClassLoader);      // sun.misc.Launcher$AppClassLoader@18b4aac2


        // 获取系统类加载器的上层：扩展类加载器
        ClassLoader extClassLoader = systemClassLoader.getParent();
        System.out.println(extClassLoader);         // sun.misc.Launcher$ExtClassLoader@1b6d3586


        // 获取扩展类加载器的上层：获取不到引导类加载器
        ClassLoader bootstrapClassLoader = extClassLoader.getParent();
        System.out.println(bootstrapClassLoader);   // null


        // 与系统类记载器相同。 对于用户自定义类来说，默认使用系统类加载器进行加载
        ClassLoader classLoader = ClassLoaderTest.class.getClassLoader();
        System.out.println(classLoader);            // sun.misc.Launcher$AppClassLoader@18b4aac2


        // String类使用引导类加载器进行加载   ------->Java的核心类库都是使用引导类加载器进行加载的
        ClassLoader classLoader1 = String.class.getClassLoader();
        System.out.println(classLoader1);           // null  它是通过C/C++实现的，并不存在于JVM体系内，所以输出为 null

    }
}
