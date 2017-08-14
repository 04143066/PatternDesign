package SimpleFactory.properties;

/**
 * Created by zouxiongxin on 2017/8/10.
 * 接口的具体实现对象A
 */
public class Impl implements Api {
    @Override
    public void operation(String s) {
        //实现功能的代码，示意一下
        System.out.println("ImplA s="+s);

    }
}
