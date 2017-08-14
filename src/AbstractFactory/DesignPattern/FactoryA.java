package AbstractFactory.DesignPattern;

/**
 * Created by zouxiongxin on 2017/8/11.
 *
 */
public class FactoryA implements AbstractFactory{

    @Override
    public MainboardApi createMainboard() {
        return new GAMainboard(1156);
    }

    @Override
    public CPUApi createCPU() {
        return new IntelCPU(1156);
    }
}
