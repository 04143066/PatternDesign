package Singleton.InnerClass;

/**
 * 类级内部类就是静态内部类，相当于其外部类的static成分，他的对象与外部类
 * 对象不存在依赖关系，因此可以直接创建，而对象内部类的实例是绑定在外部对象实例中的。
 * 类级内部类相当于外部类的成员，只有在第一次使用的时候才会被装载，
 *
 * 当getInstance方法第一次被调用的时候，它第一次读取SingletonHolder.instance,导致SingletonHolder
 * 类得到初始化；而这个类在装载并初始化的时候，会初始化它的静态域，从而创建Singleton的实例，由于
 * 静态的域，因此只会在虚拟机装载类的时候初始化一次，并由虚拟机来保证它的线程安全。
 *
 * 这个模式的优点在于，getInstance方法并没有被同步，并且只是在执行一个域的访问，因此延迟初始化并
 * 没有增加任何访问成本。
 *
 * Created by zouxiongxin on 2017/8/16.
 */
public class Singleton {
    /**
     * 类级内部类，也就是静态的成员式内部类，该内部类与外部类的实例没有绑定关系
     * 而且只有在被调用的时候才会被装载，从而实现了延迟加载。
     */
    private static class SingletonHolder{
        /**
         * 静态初始化器，有JVM来保证线程安全
         */
        private static Singleton instance = new Singleton();
    }
    /**
     * 私有化构造方法
     */
    private Singleton() {}
    public static Singleton getInstance() {
        return SingletonHolder.instance;
    }
}
