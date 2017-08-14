package AbstractFactory.noDesignPattern;


/**
 * Created by zouxiongxin on 2017/8/11.
 * 创建CPU的简单工厂
 */
public class CPUFactory {

    /**
     * 创建cpu接口对象的方法
     * @param type
     * @return
     */
    public static CPUApi createCPUApi(int type) {
        CPUApi cpu = null;
        //根据参数来选择创建相应的cpu对象
        if(type == 1) {
            cpu = new IntelCPU(1156);
        } else if(type == 2) {
            cpu = new AMDCPU(939);
        }
        return cpu;
    }
}
