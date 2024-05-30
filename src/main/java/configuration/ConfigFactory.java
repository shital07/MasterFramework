package configuration;

import org.aeonbits.owner.ConfigCache;

public final class ConfigFactory {
    private ConfigFactory() {

    }

    public static IFrameworkConfig getConfig() {
        return ConfigCache.getOrCreate(IFrameworkConfig.class);


    }

    public static IMobileConfig getMobileConfig() {
        return ConfigCache.getOrCreate(IMobileConfig.class);
    }


    public static IAPIConfig getAPIConfig(){
       return ConfigCache.getOrCreate(IAPIConfig.class);
    }
}
