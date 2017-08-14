package FactoryMethod.example;

/**
 * Created by zouxiongxin on 2017/8/10.
 * 与简单方法相比，在客户端不需要传参数判断直接调用工厂方法子类
 * 如果新加一个产品C,只需新建一个方法子类，实现抽象方法就好，不需要改动原有的代码
 */
public class Client {
    public static void main(String argv[]) {
        Creator creatorA = new ConcreteCreatorA();
        Product ConcreteProductA = creatorA.someOperation();

        Creator creatorB = new ConcreteCreatorB();
        Product ConcreteProductB = creatorB.someOperation();
    }

}
