package Facade.DesignPattern;

/**
 * Created by zouxiongxin on 2017/8/11.
 * 生成数据层的模块
 */
public class Dao {
    public void generate() {
        ConfigModel cm = ConfigManager.getInstance().getConfigData();
        if(cm.isNeedGenDAO()) {
            System.out.println("正在生成数据层代码文件");
        }
    }
}
