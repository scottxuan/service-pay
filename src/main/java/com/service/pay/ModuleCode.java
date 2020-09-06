package com.service.pay;

public enum ModuleCode {
    /**
     * 充值
     */
    RECHARGE(1),
    /**
     * 喜鹊到
     */
    XI_QUE_DAO(2),
    /**
     * 喜鹊汇
     */
    XI_QUE_HUI(3),
    ;

    private int code;

    ModuleCode(int code) {
        this.code = code;
    }

    public static ModuleCode getByCode(int code){
        for (ModuleCode value : ModuleCode.values()) {
            if (value.code == code) {
                return value;
            }
        }
        return null;
    }
}
