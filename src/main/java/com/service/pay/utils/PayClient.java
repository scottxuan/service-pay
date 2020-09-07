package com.service.pay.utils;

import com.service.pay.wechat.condition.PayQrCodeCondition;
import com.service.pay.wechat.request.PayQrCodeRequest;
import com.service.pay.wechat.response.PayQrCodeResponse;

/**
 * @author : pc
 * @date : 2020/9/7
 */
public class PayClient {
    /**
     * 客户付款码付款
     * @param condition
     * @return
     */
    public static PayQrCodeResponse weChatPayQrCode(PayQrCodeCondition condition){
        PayQrCodeRequest request = new PayQrCodeRequest(condition);
        return PayHttpUtil.execute(request);
    }
}
