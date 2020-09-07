package com.service.pay.wechat.condition;

import lombok.Data;

/**
 * @author : pc
 * @date : 2020/9/7
 */
@Data
public class PayQrCodeCondition {
    private String appid;
    private String mch_id;
    private String nonce_str;
    private String sign;
    private String body;
    private String out_trade_no;
    private String total_fee;
    private String spbill_create_ip;
    private String auth_code;
}
