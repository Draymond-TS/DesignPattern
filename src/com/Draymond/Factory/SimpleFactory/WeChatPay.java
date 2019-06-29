package com.Draymond.Factory.SimpleFactory;

public class WeChatPay implements AbstractPay {
    @Override
    public void pay() {
        System.out.println("微信支付");
    }
}
