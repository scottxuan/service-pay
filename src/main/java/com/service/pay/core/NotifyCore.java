package com.service.pay.core;

public interface NotifyCore {

    public String doPaySome(Object order) throws Exception;

    public String doCancelSome(Object order) throws Exception;

    public String doReturnSome(Object order) throws Exception;

    public String doCloseSome(Object order) throws Exception;
}
