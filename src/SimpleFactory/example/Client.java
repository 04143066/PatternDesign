package SimpleFactory.example;

/**
 * Created by zouxiongxin on 2017/8/10.
 * 接口的思想就是封装隔离，由于外部调用和内部实现由接口隔离开了，那么只要接口不变，内部实现
 * 的变化就不会影响到外部应用，从而使得系统更灵活，具有更好的扩展性，
 * 简单工厂方法的内部主要实现的功能是“选择合适的实现类”
 * 简单工厂的优点：帮助封装，解耦
 * 简单工厂的本质是：选择实现
 * 简单工厂的缺点是：可能增加客户端的复杂度，增加了扩展子类的难度
 */
public class Client {

    public static void main(String argv[]) {
        //通过简单工厂来获取接口对象
        Api api = Factory.createApi(1);
        api.operation("正在使用简单工厂");
        //通过简单工厂来获取接口对象
        Api api1 = Factory.createApi(2);
        api1.operation("正在使用简单工厂");
    }
}
