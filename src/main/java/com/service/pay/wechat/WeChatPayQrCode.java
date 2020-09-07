package com.service.pay.wechat;

import com.service.pay.utils.PayClient;
import com.service.pay.wechat.condition.PayQrCodeCondition;
import com.service.pay.wechat.response.PayQrCodeResponse;

import java.util.Map;


/**
 * 微信客户付款码
 * @author scottxuan
 */
public class WeChatPayQrCode extends AbstractWeChatPayCommon {

    @Override
    public void payOrder(Object order, Map<String, String> params) throws Exception {
        PayQrCodeCondition condition = new PayQrCodeCondition();
        PayQrCodeResponse response = PayClient.weChatPayQrCode(condition);
    }

    @Override
    public void refundOrder(Object order, Map<String, String> payParams) throws Exception {

    }

    @Override
    public void refundQuery(Object order, Map<String, String> payParams) throws Exception {

    }

    @Override
    public void cancelOrder(Object order, Map<String, String> payParams) throws Exception {

    }

    @Override
    public void closeOrder(Object order, Map<String, String> payParams) throws Exception {

    }
}
