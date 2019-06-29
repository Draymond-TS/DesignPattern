package com.Draymond.Factory.SimpleFactory;

public class Alipay implements AbstractPay {
    @Override
    public void pay() {
        System.out.println("支付宝支付");
    }
}
