package Builder.example;

/**
 * 生成器接口，定义创建一个产品对象所需求的各个部件的操作
 * Created by zouxiongxin on 2017/8/18.
 */
public interface Builder {
    /**
     * 示意方法，构建某个部件
     */
    public void buildPart();
}
