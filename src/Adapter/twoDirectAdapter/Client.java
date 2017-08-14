package Adapter.twoDirectAdapter;

import Adapter.designPattern.*;

import java.util.ArrayList;
import java.util.List;

/**
 * 使用双向适配器
 * Created by zouxiongxin on 2017/8/14.
 */
public class Client {
    public static void main(String[] argv){
        //准备日志内容，也就是测试的数据
        LogModel lml = new LogModel();
        lml.setLogId("001");
        lml.setOperateUser("admin");
        lml.setOperateTime("2010-03-02 10:08:18");
        lml.setLogContent("这是一个测试");

        List<LogModel> list = new ArrayList<LogModel>();
        list.add(lml);
        //创建操作日志文件的对象
        LogFileOperateApi fileLogApi =  new LogFileOperate("");
        LogDbOperateApi dbLogApi = new LogDbOperate();

        //创建经过双向适配器后的操作日志的接口对象
        LogFileOperateApi fileLogApi2 = new TwoDirectAdapter(fileLogApi,dbLogApi);
        LogDbOperateApi dbLogApi2 = new TwoDirectAdapter(fileLogApi,dbLogApi);

        //先测试从文件操作适配到第二版
        //虽然调用的是第二版的接口，其实是文件操作在实现
        dbLogApi2.createLog(lml);
        List<LogModel> allLog = dbLogApi2.getAllLog();
        System.out.println("allLog="+allLog);

        //在测试从数据库存储适配成第一版的接口
        //也就是调用第一版的接口，其实是数据实现
        fileLogApi2.writeLogFile(list);
        fileLogApi2.readLogFile();
    }
}
