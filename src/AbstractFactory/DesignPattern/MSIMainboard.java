package AbstractFactory.DesignPattern;

/**
 * Created by zouxiongxin on 2017/8/11.
 * 微星的主板
 */
public class MSIMainboard implements MainboardApi {

    private int cpuHoles = 0;

    public MSIMainboard(int cpuHoles) {
        this.cpuHoles = cpuHoles;
    }

    @Override
    public void installCPU() {
        System.out.println("now in MSIMainboard, cpuHoles = "+cpuHoles);
    }
}
