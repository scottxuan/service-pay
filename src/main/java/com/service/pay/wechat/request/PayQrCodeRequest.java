package com.service.pay.wechat.request;

import com.scottxuan.base.utils.XmlUtil;
import com.service.pay.enums.PayUrl;
import com.service.pay.wechat.condition.PayQrCodeCondition;
import com.service.pay.wechat.response.PayQrCodeResponse;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author : pc
 * @date : 2020/9/7
 */
@Data
@AllArgsConstructor
public class PayQrCodeRequest implements WeChatPayRequest<PayQrCodeResponse> {

    private PayQrCodeCondition condition;

    @Override
    public Class<PayQrCodeResponse> getResponse() {
        return PayQrCodeResponse.class;
    }

    @Override
    public String getUrlNoHost() {
        return PayUrl.WE_CHAT_PAY_QR_CODE;
    }

    @Override
    public String getParams() {
        if (null == condition) {
            return "";
        }
        return XmlUtil.beanToXml(condition,PayQrCodeCondition.class);
    }
}
