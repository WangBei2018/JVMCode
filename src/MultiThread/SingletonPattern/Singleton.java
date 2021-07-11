package MultiThread.SingletonPattern;

/**
 * @Author WangBei
 * @Date 2021/7/10 16:14
 * @Description: 双检锁/双重校验锁（DCL，即 double-checked locking）
 */
public class Singleton {
    private volatile static Singleton uniqueInstance;
    private Singleton(){}

    public synchronized static Singleton getUniqueInstance(){
        if (uniqueInstance == null){
            synchronized (Singleton.class){
                if (uniqueInstance == null){
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }
}
