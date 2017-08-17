package Singleton.DoubleLock;

/**
 * 这种实现方式可以线程安全的创建实例，而又不会对性能造成太大的影响，
 * 它只是第一次创建实例的时候同步，以后就不需要同步了，从而加快了运行的速度。
 * Created by zouxiongxin on 2017/8/16.
 */
public class Singleton {
    private volatile static Singleton instance = null;
    private Singleton() {}
    public static Singleton getInstance() {
        //先检查实例是否存在，如果不存在才进入下面的同步块
        if(instance == null) {
            synchronized (Singleton.class) {
                if(instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
