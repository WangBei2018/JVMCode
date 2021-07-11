package chapter02.java;

/*
类的加载过程三：Initialization
    初始化阶段就是执行类构造方法<Clinit>()过程。
        5、虚拟机必须保证一个类的<Clinit>()方法在多个线程下被同步加锁
*/
public class DeadThreadTest {
    public static void main(String[] args) {
        Runnable r = () ->{
            System.out.println(Thread.currentThread().getName() + "开始");
            DeadThread dead = new DeadThread();
            System.out.println(Thread.currentThread().getName() + "结束");
        };
        Thread t1 = new Thread(r,"线程1");
        Thread t2 = new Thread(r,"线程2");


        t1.start();
        t2.start();

    }
}

class DeadThread{
    static {
        if(true){
            System.out.println(Thread.currentThread().getName() + "初始化当前类");
            while(true){

            }
        }

    }
}