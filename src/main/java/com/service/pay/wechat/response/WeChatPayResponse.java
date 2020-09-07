package com.service.pay.wechat.response;


import com.scottxuan.core.http.HttpResponse;
import lombok.Data;

/**
 * @author : pc
 * @date : 2020/9/7
 */
@Data
public class WeChatPayResponse extends HttpResponse {
    private static final String SUCCESS_CODE = "SUCCESS";
    private String return_code;
    private String return_msg;

    private String result_code;
    private String err_code;
    private String err_code_des;

    /**
     * 接口通信情况
     * @return
     */
    @Override
    public boolean isSuccess() {
        return SUCCESS_CODE.equals(return_code);
    }

    /**
     * 业务结果
     * @return
     */
    public boolean bizIsSuccess(){
        return SUCCESS_CODE.equals(err_code);
    }
}
