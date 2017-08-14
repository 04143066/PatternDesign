package AbstractFactory.noDesignPattern;

/**
 * Created by zouxiongxin on 2017/8/11.
 * 这样写有何问题，CPU和主板是有关系的，需要互相匹配，而在本包中
 * 并没有维护这种关系，cpu和主板类型在客户端随机选择的
 */
public class client {
    public static void main(String argv[]) {
        //创建装机工程师对象
        ComputerEngineer engineer = new ComputerEngineer();
        //告诉装机工程师选择的配件，让装机工程师组装电脑
        engineer.makeComputer(1,1);
    }
}
