package chapter02.java;

/*
类的加载过程三：Initialization
    初始化阶段就是执行类构造方法<Clinit>()过程。
       1、<Clinit>()：此方法不需要定义，是javac编译器自动收集类中的所有类变量的赋值动作和静态代码块中的语句合并来的。
       2、构造方法中指令按照语句在源文件中出现的顺序执行
       3、<Clinit>()不同于类的构造器<init>()
*/


public class ClinitTest {
    private int a = 1;

    static {
        num = 20;
    }

    private static int num = 10;

    public static void main(String[] args) {
        int b = 2;
        System.out.println(num); // num = 10 构造方法中指令按照语句在源文件中出现的顺序执行
    }
}
