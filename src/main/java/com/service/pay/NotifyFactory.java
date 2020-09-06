package com.service.pay;

public class NotifyFactory {

    public static NotifyCore createNotifyInstance(Integer code){
        ModuleCode moduleCode = ModuleCode.getByCode(code);
        NotifyCore notifyCore;
        switch (moduleCode){
            case RECHARGE:
                notifyCore = new RechargeNotify();
                break;
            default:
                throw new RuntimeException("业务不支持!");
        }
        return notifyCore;
    }
}
