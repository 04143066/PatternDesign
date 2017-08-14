package FactoryMethod.example;

/**
 * Created by zouxiongxin on 2017/8/10.
 * 具体的工厂方法
 */
public class ConcreteCreatorB extends Creator {
    @Override
    protected Product factoryMethod() {
        return new ConcreteProductB();
    }
}
