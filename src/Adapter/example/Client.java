package Adapter.example;

/**
 * Created by zouxiongxin on 2017/8/14.
 * 使用适配器的客户端
 */
public class Client {
    public static void main(String argv[]){
        //创建需要被适配的对象
        Adaptee adaptee = new Adaptee();
        //创建客户端需要调用的接口对象
        Target target = new Adapter(adaptee);
        //请求处理
        target.request();
    }
}
