package com.Draymond.Factory.SimpleFactory;

import org.junit.Test;

/*要点：
 *  – 简单工厂模式也叫静态工厂模式，就是工厂类一般是使用静态方法， 通过接收的参数的不同来返回不同的对象实例。
 *  – 对于增加新产品无能为力！不修改代码的话，是无法扩展的
 * */
public class TestSimpleFactory {

    @Test
    public void test(){
        WeChatPay wechatPay = (WeChatPay)PayMethodFactory.payMethod("微信");
        Alipay alipay = (Alipay)PayMethodFactory.payMethod("支付宝");

        wechatPay.pay();
        alipay.pay();

    }
}
