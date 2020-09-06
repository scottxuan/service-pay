package com.service.pay;

import java.util.Map;


/**
 * 微信客户付款码
 * @author scottxuan
 */
public class WeChatPayQrCode implements PayCore{

    @Override
    public void payOrder(Order order, Map<String, String> params) throws Exception {

    }

    @Override
    public void queryOrder(Order order, Map<String, String> payParams) throws Exception {

    }

    @Override
    public void refundOrder(Order order, Map<String, String> payParams) throws Exception {

    }

    @Override
    public void refundQuery(Order order, Map<String, String> payParams) throws Exception {

    }

    @Override
    public void cancelOrder(Order order, Map<String, String> payParams) throws Exception {

    }

    @Override
    public void closeOrder(Order order, Map<String, String> payParams) throws Exception {

    }
}
