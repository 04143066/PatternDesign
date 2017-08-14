package Facade.example;

/**
 * Created by zouxiongxin on 2017/8/11.
 *
 */
public class BModuleImpl implements BModuleApi {

    @Override
    public void testB() {
        System.out.println("现在在B模块里面操作testB方法");
    }
}
