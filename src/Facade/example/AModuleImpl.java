package Facade.example;

/**
 * Created by zouxiongxin on 2017/8/11.
 *
 */
public class AModuleImpl implements AModuleApi {
    @Override
    public void testA() {
        System.out.println("现在在A模块里面操作testA方法");
    }
}
