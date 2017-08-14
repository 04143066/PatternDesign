package SimpleFactory.example;

/**
 * Created by zouxiongxin on 2017/8/10.
 * 工厂类，用来创建Api对象
 */
public class Factory {
    public static Api createApi (int condition) {
        //应该根据某些条件去选择究竟创建哪一个具体的实现类
        //这些条件可以从外部传入，也可以从其他途径来获取
        //如果只有一个实现类，可以省略条件，因为没有选择的必要
        //示意使用条件
        Api api = null;
        if(condition == 1) {
            api = new ImplA();
        } else if(condition == 2) {
            api = new ImplB();
        }
        return api;
  }
}
