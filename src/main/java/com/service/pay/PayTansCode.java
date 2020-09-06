package com.service.pay;

/**
 * @author scottxuan
 */

public enum PayTansCode {
    /**
     * 统一下单
     */
    ORDER(1),
    /**
     * 订单查询
     */
    QUERY(2),
    /**
     * 订单退款
     */
    REFUND(3),
    /**
     * 退款查询
     */
    REFUND_QUERY(4),
    /**
     * 订单取消
     */
    CANCEL(5),
    /**
     * 订单关闭
     */
    CLOSE(6),
    ;

    int code;

    PayTansCode(int code) {
        this.code = code;
    }

    public static PayTansCode getByCode(int code){
        for (PayTansCode value : PayTansCode.values()) {
            if (value.code == code) {
                return value;
            }
        }
        return null;
    }
}
