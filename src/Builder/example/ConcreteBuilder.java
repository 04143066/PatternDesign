package Builder.example;

import FactoryMethod.example.Product;

/**
 * 具体的生成器实现对象
 * Created by zouxiongxin on 2017/8/18.
 */
public class ConcreteBuilder implements Builder{
    /**
     * 生成器最终构建的产品对象
     */
    private Product resultProduct;
    /**
     * 生成器最终构建的产品对象
     * @return 生成器最终构建的产品对象
     */
    public Product getResult() {
        return resultProduct;
    }

    @Override
    public void buildPart() {
        //构建某个部件的功能处理
    }
}
