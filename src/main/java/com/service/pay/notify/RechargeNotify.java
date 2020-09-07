package com.service.pay.notify;

import com.service.pay.core.NotifyCore;

/**
 * 充值业务回调
 * @author pc
 */
public class RechargeNotify implements NotifyCore {
    @Override
    public String doPaySome(Object order) throws Exception {
        return null;
    }

    @Override
    public String doCancelSome(Object order) throws Exception {
        return null;
    }

    @Override
    public String doReturnSome(Object order) throws Exception {
        return null;
    }

    @Override
    public String doCloseSome(Object order) throws Exception {
        return null;
    }
}
