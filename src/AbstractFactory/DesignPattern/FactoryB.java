package AbstractFactory.DesignPattern;

/**
 * Created by zouxiongxin on 2017/8/11.
 *
 */
public class FactoryB implements AbstractFactory{

    @Override
    public MSIMainboard createMainboard() {
        return new MSIMainboard(939);
    }

    @Override
    public CPUApi createCPU() {
        return new AMDCPU(939);
    }
}
