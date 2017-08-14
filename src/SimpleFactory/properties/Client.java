package SimpleFactory.properties;

/**
 * Created by zouxiongxin on 2017/8/10.
 */
public class Client {
    public static void main(String argv[]) {
        Api api = Factory.createApi();
        api.operation("lalallalal");
    }
}
