#### 1.饿汉式、懒汉式  
    所谓饿汉式，既然很饿，那么在创建对象实例的时候就比较着急，于是就在装载类的时候就创建对象实例，写法如下：  
    private static Singleton uniqueInstance = new Singleton();  
    所谓懒汉式，既然很懒，那么在创建对象实例的时候就不着急，会一直等到将要使用的时候才会创建，这样就会产生线程安全问题。  
#### 2.单例模式的功能
    单例模式是用来保证这个类在运行期间只会创建一个类实例，另外，单例模式还提供了一个全局唯一访问这个类实例的访问点，就  
    是getInstance方法。不管采用懒汉式还是饿汉式的实现方式，这个全局访问点是一样的。对于单例模式而言，不管采用何种方式，  
    它都是只关心类实例的创建问题，不关心具体的业务功能。  
#### 3.懒汉式实现步骤  
    私有化构造方法  
    pirvate Singleton() {}  
    提供获取实例的静态方法  
    public static Singleton getInstance() {}  
    定义静态存储属性  
    private static Singleton instance = null;  
    实现控制实例的创建  
    public static Singleton getInstance() {  
        //先判断instance是否有值    
        if(instance == null) {    
            instance = new Singleton();  
        }  
        return instance;  
    }  
#### 4.饿汉模式实现步骤  
    私有化构造方法  
    pirvate Singleton() {}  
    提供获取实例的静态方法  
    public static Singleton getInstance() { return instance;}  
    static变量在类加载时进行初始化  
    public class Singleton {  
        private static Singleton instance = new Singleton();  
        private Singleton() {}  
        public static Singleton getInstance() { return instance;}  
    }
#### 5.延迟加载的思想  
    尽可能的节约资源  
#### 6.缓存的思想  
    这个属性就是用来缓存实例的private static Singleton instance = null;  
    如果缓存中没有就new创建一个放进缓存  
#### 7.双重检查加锁  
#### 8.单例模式适用场景  
    1. Windows的Task Manager（任务管理器）就是很典型的单例模式  
    2. windows的Recycle Bin（回收站）也是典型的单例应用。在整个系统运行过程中，回收站一直维护着仅有的一个实例。
    3. 网站的计数器，一般也是采用单例模式实现，否则难以同步。
    4. 应用程序的日志应用，一般都何用单例模式实现，这一般是由于共享的日志文件一直处于打开状态，因为只能有一个实例去操作，  
       否则内容不好追加。
    5. Web应用的配置对象的读取，一般也应用单例模式，这个是由于配置文件是共享的资源。
    6. 数据库连接池的设计一般也是采用单例模式，因为数据库连接是一种数据库资源。
    7. 多线程的线程池的设计一般也是采用单例模式，这是由于线程池要方便对池中的线程进行控制。
    8. 操作系统的文件系统，也是大的单例模式实现的具体例子，一个操作系统只能有一个文件系统。
    9. HttpApplication 也是单位例的典型应用。  
#### 9.单例模式的本质  
    控制实例数目  
#### 10.静态内部类和枚举实现单例模式   
    