package configuration;

import configuration.converter.StringToRemoteModeTypeConverter;
import configuration.converter.StringToRunmodeConverter;
import configuration.converter.StringToURLConverter;
import enums.RemoteModeType;
import enums.RunMode;
import org.aeonbits.owner.Config;

import java.net.URL;


@Config.Sources("file:${user.dir}/src/test/resources/mobile.properties")
public interface MobileConfig extends Config {


    @ConverterClass(StringToURLConverter.class)
    URL localurl();



    @ConverterClass(StringToURLConverter.class)
    URL appapkpath();



    @Key("runmobilemode")
    @ConverterClass(StringToRunmodeConverter.class)
    RunMode runmobilemode();

    @Key("remotemobilemodetype")
    @ConverterClass(StringToRemoteModeTypeConverter.class)
    RemoteModeType remotemobilemodetype();
}
