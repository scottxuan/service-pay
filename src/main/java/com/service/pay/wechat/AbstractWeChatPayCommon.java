package com.service.pay.wechat;

import com.service.pay.core.PayCore;

import java.util.Map;

/**
 * @author : pc
 * @date : 2020/9/7
 */
public abstract class AbstractWeChatPayCommon implements PayCore {

    @Override
    public void queryOrder(Object order, Map<String, String> payParams) throws Exception {

    }
}
