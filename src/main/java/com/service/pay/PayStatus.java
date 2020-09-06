package com.service.pay;

public enum PayStatus {
    /**
     * 未支付
     */
    NON_PAY(0,"未支付"),

    /**
     * 支付中
     */
    PAY_DOING(5,"支付中"),

    /**
     * 支付成功
     */
    PAY_SUCCESS(10,"支付成功"),

    /**
     * 支付失败
     */
    PAY_FAIL(15,"支付失败"),

    /**
     * 退款中
     */
    REFUND_DOING (20,"退款中"),

    /**
     * 退款成功
     */
    REFUND＿SUCCESS (25,"退款成功"),

    /**
     * 退款失败
     */
    REFUND＿FAIL (30,"退款失败"),

    /**
     * 撤销中
     */
    CANCEL_DOING(35,"撤销中"),

    /**
     * 撤销成功
     */
    CANCEL_SUCCESS(40,"撤销成功"),

    /**
     * 撤销失败
     */
    CANCEL_FAIL(45,"撤销失败"),

    ;

    /**
     * 支付状态
     */
    private int status;

    private String name;

    PayStatus(int status,String name) {
        this.status = status;
        this.name = name;
    }

    public static PayStatus getByStatus(int status){
        for (PayStatus value : PayStatus.values()) {
            if (value.status == status) {
                return value;
            }
        }
        return null;
    }
}
