package Facade.DesignPattern;

/**
 * Created by zouxiongxin on 2017/8/11.
 *
 */
public class Facade {
    public void test() {
        new Presentation().generate();
        new Business().generate();
        new Dao().generate();
    }
}
