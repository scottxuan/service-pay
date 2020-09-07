package com.service.pay.core;


import java.util.Map;

/**
 * @author scottxuan
 */
public interface PayCore {

    /**
     * 统一下单
     * @param order
     * @param params
     */
    void payOrder(Object order, Map<String, String> params) throws Exception;

    /**
     * 订单查询
     * @param order
     * @param payParams
     * @throws Exception
     */
    void queryOrder(Object order, Map<String, String> payParams) throws Exception;

    /**
     * 订单退款
     * @param order
     * @param payParams
     * @throws Exception
     */
    void refundOrder(Object order, Map<String, String> payParams) throws Exception;

    /**
     * 订单退款查询
     * @param order
     * @param payParams
     * @throws Exception
     */
    void refundQuery(Object order, Map<String, String> payParams) throws Exception;

    /**
     * 订单取消
     * @param order
     * @param payParams
     * @throws Exception
     */
    void cancelOrder(Object order, Map<String, String> payParams) throws Exception;

    /**
     * 关闭订单
     * @param order
     * @param payParams
     * @throws Exception
     */
    void closeOrder(Object order, Map<String, String> payParams) throws Exception;

}
