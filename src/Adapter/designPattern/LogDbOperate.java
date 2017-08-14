package Adapter.designPattern;

import java.util.List;

/**
 * Created by zouxiongxin on 2017/8/14.
 * 实现数据库对日志的操作
 */
public class LogDbOperate implements LogDbOperateApi {
    @Override
    public void createLog(LogModel lm) {
        //数据库访问实现
        System.out.println("now in LogDbOperate createLog, lm="+lm);
    }

    @Override
    public void updateLog(LogModel lm) {
        //数据库访问实现
        System.out.println("now in LogDbOperate updateLog, lm="+lm);
    }

    @Override
    public void removeLog(LogModel lm) {
        System.out.println("now in LogDbOperate removeLog, lm="+lm);
        //数据库访问实现
    }

    @Override
    public List<LogModel> getAllLog() {
        //数据库访问实现
        System.out.println("now in LogDbOperate createLog ");
        return null;
    }
}
