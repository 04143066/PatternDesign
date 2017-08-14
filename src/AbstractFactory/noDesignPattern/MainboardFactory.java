package AbstractFactory.noDesignPattern;

/**
 * Created by zouxiongxin on 2017/8/11.
 * 创建主板的简单工厂
 */
public class MainboardFactory {

    public static MainboardApi createMainboardApi(int type) {
        MainboardApi mainboardApi = null;
        //根据参数来选择并创建相应的主板对象
        if(type == 1) {
            mainboardApi = new GAMainboard(1156);
        } else if(type == 2) {
            mainboardApi = new MSIMainboard(939);
        }
        return mainboardApi;
    }
}
