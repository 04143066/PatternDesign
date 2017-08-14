package Facade.DesignPattern;

/**
 * Created by zouxiongxin on 2017/8/11.
 * 外观模式的定义
 * 为子系统中的一组接口提供一个一致的界面，Facade模式定义了一个高层接口，
 * 这个接口使得一个子系统更加容易使用。
 * 外观模式的定义，外观模式的目的不是给子系统添加新的功能接口，而是为了让外部减少
 * 与子系统内部多个模块的交互，松散耦合，从而让外部能够更简单地使用子系统。
 * 外观模式的本质是：封装交互，简化调用。
 */
public class Client {
    public static void main(String argv[]){
        new Facade().test();
    }
}
