package com.service.pay;

import com.google.common.collect.Maps;
import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

@Slf4j
public class PayHandler {

    public void handle(String orderNo, Integer payType, BigDecimal amount, Integer payTansCode) throws Exception {
        if(payTansCode == null){
            throw new RuntimeException("交易类型不能为空");
        }
        PayTansCode tansCode = PayTansCode.getByCode(payTansCode);
        if(tansCode == null){
            throw new RuntimeException("交易类型不支持");
        }
        Order order = new Order();
        log.info("订单【{}】，支付方式【{}】执行【{}】操作",orderNo,payType,payTansCode);

        switch (tansCode){
            case ORDER:
                payOrder(orderNo,payType,amount);
                break;
            case QUERY:
                queryOrder(orderNo);
                break;
            case REFUND:
                refundOrder(orderNo,amount);
                break;
            case REFUND_QUERY:
                refundQuery(orderNo);
                break;
            case CANCEL:
                cancelOrder(orderNo);
                break;
            case CLOSE:
                closeOrder(orderNo);
                break;
            default:
                throw new RuntimeException("交易类型不支持");
        }
    }

    void payOrder(String orderNo, Integer payType, BigDecimal amount) throws Exception {
        PayCore payCore = PayFactory.createPayInstance(payType);
        payCore.payOrder(null, Maps.newHashMap());
    }

    void queryOrder(String orderNo) throws Exception {
        Integer payType = 1;
        PayCore payCore = PayFactory.createPayInstance(payType);
        payCore.queryOrder(null, Maps.newHashMap());
    }

    void refundOrder(String orderNo, BigDecimal amount) throws Exception {
        Integer payType = 1;
        PayCore payCore = PayFactory.createPayInstance(payType);
        payCore.refundOrder(null, Maps.newHashMap());
    }

    void refundQuery(String orderNo) throws Exception {
        Integer payType = 1;
        PayCore payCore = PayFactory.createPayInstance(payType);
        payCore.refundQuery(null, Maps.newHashMap());
    }

    void cancelOrder(String orderNo) throws Exception {
        Integer payType = 1;
        PayCore payCore = PayFactory.createPayInstance(payType);
        payCore.cancelOrder(null, Maps.newHashMap());
    }

    void closeOrder(String orderNo) throws Exception{
        Integer payType = 1;
        PayCore payCore = PayFactory.createPayInstance(payType);
        payCore.closeOrder(null, Maps.newHashMap());
    }
}
