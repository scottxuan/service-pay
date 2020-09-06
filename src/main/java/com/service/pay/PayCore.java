package com.service.pay;

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
    void payOrder(Order order, Map<String, String> params) throws Exception;

    /**
     * 订单查询
     * @param order
     * @param payParams
     * @throws Exception
     */
    void queryOrder(Order order, Map<String, String> payParams) throws Exception;

    /**
     * 订单退款
     * @param order
     * @param payParams
     * @throws Exception
     */
    void refundOrder(Order order, Map<String, String> payParams) throws Exception;

    /**
     * 订单退款查询
     * @param order
     * @param payParams
     * @throws Exception
     */
    void refundQuery(Order order, Map<String, String> payParams) throws Exception;

    /**
     * 订单取消
     * @param order
     * @param payParams
     * @throws Exception
     */
    void cancelOrder(Order order, Map<String, String> payParams) throws Exception;

    /**
     * 关闭订单
     * @param order
     * @param payParams
     * @throws Exception
     */
    void closeOrder(Order order, Map<String, String> payParams) throws Exception;

}
