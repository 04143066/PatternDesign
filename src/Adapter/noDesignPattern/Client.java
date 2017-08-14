package Adapter.noDesignPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zouxiongxin on 2017/8/11.
 *
 */
public class Client {
    public static void main(String argv[]) {
        //准备日志内容，也就是测试的数据
        LogModel lml = new LogModel();
        lml.setLogId("001");
        lml.setOperateUser("admin");
        lml.setOperateTime("2010-03-02 10:08:18");
        lml.setLogContent("这是一个测试");

        List<LogModel> list = new ArrayList<LogModel>();
        list.add(lml);
        //创建操作日志文件的对象
        LogFileOperateApi api =  new LogFileOperate("");
        //保存日志文件
        api.writeLogFile(list);

        //读取日志文件的内容
        List<LogModel> readLog = api.readLogFile();
        System.out.println("readLog="+readLog);
    }
}
