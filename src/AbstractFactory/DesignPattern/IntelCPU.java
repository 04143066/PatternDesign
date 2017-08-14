package AbstractFactory.DesignPattern;

/**
 * Created by zouxiongxin on 2017/8/10.
 * Intel的cpu实现
 */
public class IntelCPU implements CPUApi {

    /**
     * Intel的针脚个数
     */
    private int pins = 0;

    /**
     * @param pins
     */
    public IntelCPU(int pins) {
        this.pins = pins;
    }

    @Override
    public void calculate() {
        System.out.println("now install Intel CPU, pins = "+pins);
    }
}
