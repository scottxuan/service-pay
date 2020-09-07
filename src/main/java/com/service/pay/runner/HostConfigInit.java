package com.service.pay.runner;

import com.service.pay.core.ConfigManager;
import com.service.pay.core.HostConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @author : pc
 * @date : 2020/9/7
 */
@Component
@Slf4j
public class HostConfigInit implements CommandLineRunner {

    @Value("${we.chat.host:https://api.weixin.qq.com}")
    private String weChatHost;

    @Override
    public void run(String... args) throws Exception {
        log.info("ApplicationHostInit -- run -- start");
        HostConfig hostConfig = new HostConfig();
        hostConfig.setWeChatHost(weChatHost);
        ConfigManager.setConfig(hostConfig);
        log.info("ApplicationHostInit -- run -- end");
    }
}
