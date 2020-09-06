package com.service.pay;

/**
 * 支付方式枚举类
 * @author scottxuan
 */

public enum PayType {
    /**
     * 客户展示付款码,商家扫描客户付款码支付
     */
    WE_CHAT_PAY_QR_CODE(1,"客户付款码支付"),
    /**
     * 微信扫码,关注公众号等方式进入商家H5页面唤醒微信支付
     */
    WE_CHAT_PUBLIC_H5(2,"JSAPI支付"),
    /**
     * 用户扫描商家二维码支付
     */
    WE_CHAT_CUS_SCAN(3,"Native支付"),
    /**
     * 其他APP调用微信支付
     */
    WE_CHAT_OTHER_APP(4,"微信APP支付"),
    /**
     * 手机浏览器唤醒微信支付
     */
    WE_CHAT_BROWSER_H5(5,"微信H5支付"),
    /**
     * 小程序支付
     */
    WE_CHAT_MINI(6,"微信小程序支付"),
    /**
     * 刷脸支付
     */
    WE_CHAT_SCAN_FACE(7,"微信刷脸支付"),
    ;
    private int type;
    private String name;

    PayType(int type, String name) {
        this.type = type;
        this.name = name;
    }

    public Integer getType() {
        return type;
    }

    public static PayType getByType(int type){
        for (PayType value : PayType.values()) {
            if (value.type == type) {
                return value;
            }
        }
        return null;
    }
}
