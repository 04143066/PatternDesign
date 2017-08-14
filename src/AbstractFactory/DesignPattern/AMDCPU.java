package AbstractFactory.DesignPattern;

/**
 * Created by zouxiongxin on 2017/8/10.
 *  AMD的cpu实现
 */
public class AMDCPU implements CPUApi {

    /**
     * CPU针脚数目
     */
    private int pins = 0;

    /**
     * @param pins
     */
    public AMDCPU(int pins) {
        this.pins = pins;
    }

    @Override
    public void calculate() {
        System.out.println("now install AMD cpu, pins = "+pins);
    }
}
