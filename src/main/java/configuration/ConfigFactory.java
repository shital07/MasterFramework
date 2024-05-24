package configuration;

import org.aeonbits.owner.ConfigCache;

public final class ConfigFactory {
    private ConfigFactory() {

    }

    public static FrameworkConfig getConfig() {
        return ConfigCache.getOrCreate(FrameworkConfig.class);


    }

    public static MobileConfig getMobileConfig() {
        return ConfigCache.getOrCreate(MobileConfig.class);
    }
}
