package Builder.noDesignPattern;

import java.util.Collection;
import java.util.Map;

/**
 * 导出数据到文本文件的对象
 * Created by zouxiongxin on 2017/8/18.
 */
public class ExportToText {
    /**
     * 导出数据到文本文件
     * @param ehm
     * @param mapData
     * @param efm
     */
    public void export(ExportHeaderModel ehm,
                       Map<String,Collection<ExportDataModel>> mapData,
                       ExportFooterModel efm){
        //用来记录最终输出的文件内容
        StringBuffer buffer = new StringBuffer();
        //1.先讲记录最终输出的文件内容
        buffer.append(ehm.getDepId()+","+ehm.getExportDate()+"\n");
        //2.接着来讲解文件体的内容
        for(String tblName:mapData.keySet()) {
            //先拼接表名称
            buffer.append(tblName+"\n");
            //然后循环拼接具体数据
            for(ExportDataModel edm: mapData.get(tblName)) {
                buffer.append(edm.getProductId() + ","+edm.getPrice()+","+edm.getAmount()+"\n");
            }
            //接着来拼接文件尾的内容
            buffer.append(efm.getExportUser());
            //为了演示的简洁性，这里就不再写输出文件的代码了
            //把输出的内容输出到控制台看看
            System.out.println("输出到文本文件的内容：\n"+buffer);
        }
    }


}
