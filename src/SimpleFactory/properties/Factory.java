package SimpleFactory.properties;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by zouxiongxin on 2017/8/10.
 * 工厂类用来创建API对象
 */
public class Factory {
    /**
     * 具体创建Api的方法，根据配置文件的参数来创建接口
     * @return 创建好的API对象
     */
    public static Api createApi() {
        InputStream in = null;
        Properties properties = new Properties();
        in = Factory.class.getResourceAsStream("Factory.properties");
        try {
            properties.load(in);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        Api api = null;
        Class clazz = null;
        String className = null;
        try {
            className = properties.getProperty("ImplClass");
            clazz = Class.forName(className);
            api = (Api)clazz.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return api;
    }
}
