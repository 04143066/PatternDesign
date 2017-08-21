package Builder.noDesignPattern;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * 没有用设计模式有何问题？
 * 不管是输出成文本文件，还是输出到XML文件，在实现的时候，步骤基本上都是一样的，大致分成了一下四步。
 * 先拼接文件头的内容
 * 然后拼接文件体的内容
 * 再拼接文件尾的内容
 * 最后把拼接好的内容输出成文件
 * 也就是说，对于不同的输出格式，处理步骤是一样的，但是每步的具体实现是不一样的
 * 解决方案：
 *      构建每种输出格式的文件内容的时候，都会重复这几个处理步骤，应该提炼出来，形成公共的处理过程。
 *      今后可能会有很多不同的输出格式的要求，这就需要在处理过程不变的情况下，能方便地切换不同的输出格式的处理
 *      也就是在构建每种格式的数据文件的时候，应该和具体的步骤实现分开，这样就能复用处理过程，而且能很容易地切换不同地输出格式
 * Created by zouxiongxin on 2017/8/18.
 */
public class Client {
    public static void main(String[] args) {
        ExportHeaderModel ehm = new ExportHeaderModel();
        ehm.setDepId("一分公司");
        ehm.setExportDate("2010-05-18");

        Map<String,Collection<ExportDataModel>> mapData =
                new HashMap<String,Collection<ExportDataModel>>();
        Collection<ExportDataModel> col = new ArrayList<ExportDataModel>();
        ExportDataModel edm1 = new ExportDataModel();
        edm1.setProductId("产品001号");
        edm1.setPrice(100);
        edm1.setAmount(80);

        ExportDataModel edm2 = new ExportDataModel();
        edm2.setProductId("产品号002");
        edm2.setPrice(99);
        edm2.setAmount(55);
        //把数据组装起来
        col.add(edm1);
        col.add(edm2);
        mapData.put("销售记录",col);
        ExportFooterModel efm = new ExportFooterModel();
        efm.setExportUser("张三");
        //测试输出到文本文件
        ExportToText toText = new ExportToText();
        toText.export(ehm,mapData,efm);
        //测试输出到xml文件
        ExportToXml toXml = new ExportToXml();
        toXml.export(ehm,mapData,efm);

    }
}
