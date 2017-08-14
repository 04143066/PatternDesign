package FactoryMethod.exportFile;

/**
 * Created by zouxiongxin on 2017/8/10.
 * 具体的创建器实现对象，实现创建导出成数据库备份文件形式的对象
 */
public class ExportDBOperate extends ExportOperate {
    @Override
    protected ExportFileApi factoryMethod() {
        return new ExportDB();
    }
}
