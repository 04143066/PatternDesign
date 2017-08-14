package Facade.DesignPattern;

/**
 * Created by zouxiongxin on 2017/8/11.
 * 示意生成逻辑层的模块
 */
public class Business {
    public void generate() {
        ConfigModel cm = ConfigManager.getInstance().getConfigData();
        if(cm.isNeedGendBusiness()) {
            System.out.println("正在生成逻辑层代码文件");
        }
    }
}
