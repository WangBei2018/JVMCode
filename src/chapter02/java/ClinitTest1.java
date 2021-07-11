package chapter02.java;

/*
类的加载过程三：Initialization
    初始化阶段就是执行类构造方法<Clinit>()过程。
        4、若该类具有父类，JVM会保证子类的<Clinit>()执行前，父类的<Clinit>()已经执行完毕
*/


public class ClinitTest1 {

    static class Father{
        public static int A = 1;
        static {
            A = 2;
        }
    }

    static class Son extends Father{
        public static int B = A;
    }

    public static void main(String[] args) {
        System.out.println(Son.B);      // B = 2
    }

}

