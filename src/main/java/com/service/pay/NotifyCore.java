package com.service.pay;

public interface NotifyCore {

    public String doPaySome(Order order) throws Exception;

    public String doCancelSome(Order order) throws Exception;

    public String doReturnSome(Order order) throws Exception;
}
