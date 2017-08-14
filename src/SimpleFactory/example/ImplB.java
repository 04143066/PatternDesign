package SimpleFactory.example;

/**
 * Created by zouxiongxin on 2017/8/10.
 * 接口的具体实现类对象B
 */
public class ImplB implements Api {
    @Override
    public void operation(String s) {
        //实现功能的代码，示意一下
        System.out.println("ImplB s="+s);
    }
}
