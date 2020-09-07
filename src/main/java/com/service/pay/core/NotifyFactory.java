package com.service.pay.core;

import com.service.pay.enums.ModuleCode;
import com.service.pay.notify.RechargeNotify;

public class NotifyFactory {

    public static NotifyCore createInstance(Integer code){
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
