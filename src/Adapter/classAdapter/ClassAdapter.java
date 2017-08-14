package Adapter.classAdapter;

import Adapter.designPattern.LogDbOperateApi;
import Adapter.designPattern.LogFileOperate;
import Adapter.designPattern.LogModel;
import java.util.List;

/**
 * 类适配器对象
 * 在标准的适配器模式里面，根据适配器的实现方式，把适配器分成了两种，一种是对象适配器，另一种是类适配器
 * 对象适配器的实现：依赖于对象组合
 * 类适配器的实现：采用多重继承对一个接口与另一个接口进行匹配。由于Java不支持多重继承，所以到目前为止还没有涉及。
 *
 * 对象适配器于类适配器的权衡：
 * ①从实现上讲：类适配器使用对象继承的方式，是静态的定义方式；而对象适配器使用对象组合的方式，是动态组合的方式。
 * ②对于类适配器，由于适配器直接继承了Adaptee,使得适配器不能和Adapter的子类一起工作，因为继承是静态关系，当
 * 适配器继承了Adaptee后，就不可能再去处理Adaptee的子类了。而对象适配器采用的是对象组合的关系，只要对象类型正确，是不是子类无所谓。
 * ③对于类适配器，适配器可以重定义Adaptee的部分行为，相当于子类覆盖父类的部分实现方法。对于对象适配器，需要重新定义Adaptee的子类，
 * 来重新定义，然后让适配器组合子类。
 * 在Java开发中，尽量使用对象适配器，当然有特殊功能可以使用类适配器
 *
 * Created by zouxiongxin on 2017/8/14.
 */
public class ClassAdapter extends LogFileOperate implements LogDbOperateApi {
    /**
     * 构造方法，传入文件的路径和名称
     *
     * @param logFilePathName 文件的路径和名称
     */
    public ClassAdapter(String logFilePathName) {
        super(logFilePathName);
    }

    @Override
    public void createLog(LogModel lm) {
        //1.先读取文件的内容
        List<LogModel> list = this.readLogFile();
        //2.加入新的日志对象
        list.add(lm);
        //3.重新写入文件
        this.writeLogFile(list);
    }

    @Override
    public void updateLog(LogModel lm) {
        //1.先读取文件的内容
        List<LogModel> list = this.readLogFile();
        //2.修改相应的日志对象
        for(int i=0; i<list.size(); i++) {
            if(list.get(i).getLogId().equals(lm.getLogId())) {
                list.set(i,lm);
                break;
            }
        }
        //3.重新写入文件
        this.writeLogFile(list);
    }

    @Override
    public void removeLog(LogModel lm) {
        //1.先读取文件的内容
        List<LogModel> list = this.readLogFile();
        //2.删除相应的日志对象
        list.remove(lm);
        //3.重新写入文件
        this.writeLogFile(list);
    }

    @Override
    public List<LogModel> getAllLog() {
        return this.readLogFile();
    }
}
