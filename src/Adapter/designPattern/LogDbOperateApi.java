package Adapter.designPattern;

import java.util.List;

/**
 * Created by zouxiongxin on 2017/8/14.
 * 定义操作日志的应用接口，为了示例的简单，只是简单地定义了增删改查的方法
 * 客户提出了新的需求，要用日志管理第二版实现同事支持数据库存储和文件存储两种方式
 * 然后这样问题就来了，第二版新加入了保存日志到数据库中，但是对于已有的实现方式，也就是
 * 在第一版中采用的文件存储方式，他的操作接口和第二版的不太一样，这就导致了现在的客户端无法以同样的
 * 方式来直接使用第一版的实现
 */
public interface LogDbOperateApi {
    /**
     * 新增日志
     * @param lm
     */
    public void createLog(LogModel lm);
    /**
     * 修改日志
     * @param lm
     */
    public void updateLog(LogModel lm);
    /**
     * 删除日志
     * @param lm
     */
    public void removeLog(LogModel lm);
    /**
     * 获取所有的日志
     * @return 所有的日志对象
     */
    public List<LogModel> getAllLog();
}
