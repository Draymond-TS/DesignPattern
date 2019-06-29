package com.Draymond.Factory.SimpleFactory;

public class PayMethodFactory {
    public  static  AbstractPay payMethod(String type){
        if(type.equals("微信")){
            return  new WeChatPay();
        }else if(type.equals("支付宝")){
            return  new Alipay();
        }else {
            return null;
        }
    }
}
