package configuration;

import configuration.converter.StringToMobilePlatformType;
import configuration.converter.StringToRemoteModeTypeConverter;
import configuration.converter.StringToRunmodeConverter;
import configuration.converter.StringToURLConverter;
import enums.MobilePlatformType;
import enums.RemoteModeType;
import enums.RunMode;
import org.aeonbits.owner.Config;

import java.net.URL;


@Config.Sources("file:${user.dir}/src/test/resources/mobile.properties")
public interface IMobileConfig extends Config {


    @ConverterClass(StringToURLConverter.class)
    URL localurl();


    @Key("appapkpath")
    @DefaultValue("/Users/megatron/Desktop/workspace_shital/MasterFramework/src/main/resources/apk/ApiDemos-debug.apk")
    String appapkpath();


    @Key("runmobilemode")
    @ConverterClass(StringToRunmodeConverter.class)
    RunMode runmobilemode();

    @Key("remotemobilemodetype")
    @ConverterClass(StringToRemoteModeTypeConverter.class)
    RemoteModeType remotemobilemodetype();


    @ConverterClass(StringToMobilePlatformType.class)
    MobilePlatformType platformtype();
}
