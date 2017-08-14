package Adapter.example;

/**
 * Created by zouxiongxin on 2017/8/14.
 * 适配器
 * 适配器模式中被适配的接口Adaptee和适配成为的接口Target
 * 是没有关联的，也就是说，Adaptee和Target中的方法既可以
 * 相同也可以不同（这里所说的相同和不同是指方法定义的名称、
 * 参数列表、返回值，以及方法本身的功能可以相同和不同）。
 */
public class Adapter implements Target {
    /**
     * 持有需要被适配的接口对象
     */
    private Adaptee adaptee;

    /**
     * 构造方法，传入需要被适配的对象
     * @param adaptee
     */
    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        adaptee.specificRequest();
    }
}
