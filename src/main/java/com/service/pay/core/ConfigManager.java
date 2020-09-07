package com.service.pay.core;

/**
 * @author scottxuan
 */
public class ConfigManager {
    private static final ConfigManager MANAGER = new ConfigManager();
    private HostConfig config;

    private ConfigManager() {
    }

    public static void setConfig(HostConfig config) {
        if (config != null) {
            MANAGER.config = config;
        }
    }

    public static HostConfig getConfig() {
        return MANAGER.config;
    }

    static {
        setConfig(new HostConfig());
    }
}