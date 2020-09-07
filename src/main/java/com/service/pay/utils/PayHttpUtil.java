package com.service.pay.utils;

import com.scottxuan.base.utils.XmlUtil;
import com.scottxuan.core.http.HttpClient;
import com.service.pay.wechat.request.WeChatPayRequest;
import com.service.pay.wechat.response.WeChatPayResponse;

/**
 * @author : pc
 * @date : 2020/9/7
 */
public class PayHttpUtil {
    public static <T extends WeChatPayResponse> T execute(WeChatPayRequest<T> request) {
        String result = HttpClient.execute(request.getUrl(), request.getParams(), request.getParamType(), request.getMethod());
        return XmlUtil.xmlToBean(result, request.getResponse());
    }
}
