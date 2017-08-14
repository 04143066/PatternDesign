package FactoryMethod.exportFile;

/**
 * Created by zouxiongxin on 2017/8/10.
 *
 */
public class client {
    public static void main(String argv[]) {
        //创建需要使用的Creator对象
        ExportOperate operate = new ExportDBOperate();
        //调用输出数据的功能方法
        operate.export("测试数据");

        ExportOperate operate1 = new ExportTxtFileOperate();
        //调用输出数据的功能方法
        operate1.export("测试数据");
    }

}
