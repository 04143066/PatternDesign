package AbstractFactory.DesignPattern;

/**
 * Created by zouxiongxin on 2017/8/11.
 *
 */
public interface AbstractFactory {

    public MainboardApi createMainboard();

    public CPUApi createCPU();
}
