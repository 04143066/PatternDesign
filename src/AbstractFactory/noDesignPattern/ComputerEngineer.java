package AbstractFactory.noDesignPattern;

/**
 * Created by zouxiongxin on 2017/8/11.
 * 装机工程师的类
 */
public class ComputerEngineer {
    /**
     * 定义组装机器需要的cpu
     */
    private CPUApi cpu = null;
    /**
     * 定义组装机器需要的主板
     */
    private MainboardApi mainboardApi = null;
    /**
     * 装机过程
     * @param cpuType 客户选择所需的cpu类型
     * @param mainboardType 客户选择所需的主板类型
     */
    public void makeComputer(int cpuType, int mainboardType) {
        //1.首先准备好装机所需要的配件
        prepareHardwares(cpuType,mainboardType);
        //2.组装机器
        //3.测试机器
        //4.交付客户
    }
    /**
     * 准备装机所需的配件
     * @param cpuType 客户选择所需的cpu类型
     * @param mainboardType 客户选择所需的主板类型
     */
    private void prepareHardwares(int cpuType, int mainboardType) {
        //这里要去准备CPU和主板的具体实现，为了示例简单，这里只准备这两个
        //可是装机工程师并不知道如何去创建，怎么办呢
        //查找相应的工厂获取
        this.cpu = CPUFactory.createCPUApi(cpuType);
        this.mainboardApi = MainboardFactory.createMainboardApi(mainboardType);
        //测试下配件是否好用
        this.cpu.calculate();
        this.mainboardApi.installCPU();
    }
}
