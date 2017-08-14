package Facade.noDesignPattern;

/**
 * Created by zouxiongxin on 2017/8/11.
 * 使用外观模式来解决问题
 * 然后本包内的代码有什么问题呢？
 * 那就是客户端为了实现生成代码的功能，与生成代码子系统内部的多个模块交互
 * 这对于客户端来说是一个麻烦，使得客户端不能简单地使用生成代码的功能，如果其中一个
 * 模块发生了变化会导致客户端也随着发生了变化，于是就产生了外观模式
 */
public class Client {
    public static void main(String[] args) {
        //现在没有配置文件，直接使用默认的配置，通常情况下，三层应该生成
        //也就是说客户端必须对这些模块都有了解，才能够正确的使用它们
        new Presentation().generate();
        new Business().generate();
        new Dao().generate();
    }
}
