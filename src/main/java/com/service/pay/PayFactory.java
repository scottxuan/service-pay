package com.service.pay;

/**
 * 支付工厂类
 *
 * @author scottxuan
 */
public class PayFactory {
    public static PayCore createPayInstance(Integer type) {
        PayType payType = PayType.getByType(type);
        if (payType == null) {
            throw new RuntimeException("该支付类型暂不被支持");
        }
        PayCore payCore;
        switch (payType) {
            case WE_CHAT_PAY_QR_CODE:
                payCore = new WeChatPayQrCode();
                break;
            default:
                throw new RuntimeException("该支付类型暂不被支持");
        }
        return payCore;
    }
}
