package AbstractFactory.noDesignPattern;

/**
 * Created by zouxiongxin on 2017/8/11.
 * 技嘉的主板
 */
public class GAMainboard implements MainboardApi {

    /**
     * cpu的插槽的孔数
     */
    private int cpuHoles = 0;

    /**
     * 构造方法，传入cpu插槽的孔数
     * @param cpuHoles
     */
    public GAMainboard(int cpuHoles) {
        this.cpuHoles = cpuHoles;
    }

    @Override
    public void installCPU() {
        System.out.println("now in GAMainboard, cpuHoles = "+cpuHoles);
    }
}
