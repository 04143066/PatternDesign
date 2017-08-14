package Adapter.designPattern;

import java.util.List;

/**
 * Created by zouxiongxin on 2017/8/14.
 * 适配器对象，将记录日志到文件的功能适配成第二版需要的增删改查功能
 * 第一版和第二版会同时共存一段时间，适配器对象在这里的作用是使第一版的实现还能被第二版的新接口调用，相当于转换的功能
 * 适配器里面也可以实现功能，称这种适配器为智能适配器，在接口匹配和转换的过程中，也有可能需要额外实现一定的功能才能转换过来
 */
public class Adapter implements LogDbOperateApi {
    /**
     * 持有需要被适配的接口对象
     */
    private LogFileOperateApi adaptee;
    /**
     * 构造方法，传入需要被适配的对象
     * @param adaptee
     */
    public Adapter(LogFileOperateApi adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void createLog(LogModel lm) {
        //1.先读取文件的内容
        List<LogModel> list = adaptee.readLogFile();
        //2.加入新的日志对象
        list.add(lm);
        //3.重新写入文件
        adaptee.writeLogFile(list);
    }

    @Override
    public void updateLog(LogModel lm) {
        //1.先读取文件的内容
        List<LogModel> list = adaptee.readLogFile();
        //2.修改相应的日志对象
        for(int i=0; i<list.size(); i++){
            if(list.get(i).getLogId().equals(lm.getLogId())) {
                list.set(i,lm);
                break;
            }
        }
        //3.重新写入文件
        adaptee.writeLogFile(list);
    }
    @Override
    public void removeLog(LogModel lm) {
        //1.先读取文件的内容
        List<LogModel> list = adaptee.readLogFile();
        //2.删除相应的日志对象
        list.remove(lm);
        //3.重新写入文件
        adaptee.writeLogFile(list);
    }
    @Override
    public List<LogModel> getAllLog() {
        return adaptee.readLogFile();
    }
}
