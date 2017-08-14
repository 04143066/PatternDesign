package AbstractFactory.DesignPattern;

import SimpleFactory.properties.Factory;

import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by zouxiongxin on 2017/8/11.
 *
 */
public class Client {
    public static void main(String argv[]) {
        //选择并创建选择的装机方案
        AbstractFactory factoryA = new FactoryA();
        //创建装机工程师对象
        ComputerEngineer computerEngineer = new ComputerEngineer();
        //告诉工程师自己的组装方案
        computerEngineer.makeComputer(factoryA);
    }
}
