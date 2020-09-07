package com.service.pay.wechat.request;

import com.scottxuan.core.http.HttpMethod;
import com.scottxuan.core.http.HttpRequest;
import com.scottxuan.core.http.ParamType;
import com.service.pay.core.ConfigManager;
import com.service.pay.wechat.response.WeChatPayResponse;

/**
 * @author : pc
 * @date : 2020/9/7
 */
public interface WeChatPayRequest<T extends WeChatPayResponse> extends HttpRequest {

    /**
     * 获取请求url , 不含host
     * @return
     */
    String getUrlNoHost();

    /**
     * 获取返回值转Class类型
     * @return
     */
    @Override
    Class<T> getResponse();

    /**
     * 微信支付默认为POST
     * @return
     */
    @Override
    default HttpMethod getMethod() {
        return HttpMethod.POST;
    }

    /**
     * 构建请求url,拼接host
     * @return
     */
    @Override
    default String getUrl() {
        return ConfigManager.getConfig().getWeChatHost() + getUrlNoHost();
    }

    /**
     * 微信支付相关参数类型为XML
     * @return
     */
    @Override
    default ParamType getParamType(){
        return ParamType.XML;
    }
}
