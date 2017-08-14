package FactoryMethod.exportFile;

/**
 * Created by zouxiongxin on 2017/8/10.
 * 具体的创建器实现对象，实现创建导出文本文件格式的对象
 */
public class ExportTxtFileOperate extends ExportOperate {
    @Override
    protected ExportFileApi factoryMethod() {
        return new ExportTxtFile();
    }
}
