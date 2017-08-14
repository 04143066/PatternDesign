package Adapter.twoDirectAdapter;

import Adapter.designPattern.LogDbOperateApi;
import Adapter.designPattern.LogFileOperateApi;
import Adapter.designPattern.LogModel;

import java.util.List;

/**
 * 双向适配器
 * 情景是这样的，第一版和第二版同时共存一段时间，比如第二版的应用
 * 还在不断调整中，也就是第二版还不够稳定。客户提出，希望在两版共存期间，主要
 * 还是使用第一版，同时希望第一版的日志也能记录到数据库中，也就是客户虽然操作
 * 的接口是第一版的日志接口，界面也就是第一版的界面，但是可以使用第二版的将日志记录到数据库得劲功能。
 * Created by zouxiongxin on 2017/8/14.
 */
public class TwoDirectAdapter implements LogDbOperateApi,LogFileOperateApi {
    /**
     * 持有需要被适配的文件存储日志的接口
     */
    private LogFileOperateApi fileLog;
    /**
     * 持有需要被适配的DB存储日志的接口对象
     */
    private LogDbOperateApi dbLog;
    /**
     * 构造方法，传入需要被适配的对象
     * @param fileLog
     * @param dbLog
     */
    public TwoDirectAdapter(LogFileOperateApi fileLog, LogDbOperateApi dbLog) {
        this.fileLog = fileLog;
        this.dbLog = dbLog;
    }

    /**-----以下是把DB操作的方式适配成为文件实现方式的接口-----**/
    @Override
    public List<LogModel> readLogFile() {
        return getAllLog();
    }

    @Override
    public void writeLogFile(List<LogModel> list) {
        //1.最简单的实现思路是先删除数据库中的数据
        //2.然后循环把现在的数据加入到数据库中
        for(LogModel lm : list) {
            dbLog.createLog(lm);
        }
    }

    /**-----以下是把文件操作的方式匹配成为DB实现的额-----**/
    @Override
    public void createLog(LogModel lm) {
        //1.先读取文件的内容
        List<LogModel> list = fileLog.readLogFile();
        //2.加入新的日志对象
        list.add(lm);
        //3.重新写入文件
        fileLog.writeLogFile(list);
    }

    @Override
    public void updateLog(LogModel lm) {
        //1.先读取文件的内容
        List<LogModel> list = fileLog.readLogFile();
        //2.修改相应的日志对象
        for(int i=0; i<list.size(); i++){
            if(list.get(i).getLogId().equals(lm.getLogId())) {
                list.set(i,lm);
                break;
            }
        }
        //3.重新写入文件
        fileLog.writeLogFile(list);
    }
    @Override
    public void removeLog(LogModel lm) {
        //1.先读取文件的内容
        List<LogModel> list = fileLog.readLogFile();
        //2.删除相应的日志对象
        list.remove(lm);
        //3.重新写入文件
        fileLog.writeLogFile(list);
    }
    @Override
    public List<LogModel> getAllLog() {
        return fileLog.readLogFile();
    }
}
