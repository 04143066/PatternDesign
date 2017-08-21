package Builder.noDesignPattern;

/**
 * 描述输出到文件头的内容对象
 * Created by zouxiongxin on 2017/8/18.
 */
public class ExportHeaderModel {
    /**
     * 分公司或门市点编号
     */
    private String depId;
    /**
     * 导出数据的日期
     */
    private String exportDate;

    public void setDepId(String depId) {
        this.depId = depId;
    }

    public String getDepId() {
        return depId;
    }

    public String getExportDate() {
        return exportDate;
    }

    public void setExportDate(String exportDate) {
        this.exportDate = exportDate;
    }
}
