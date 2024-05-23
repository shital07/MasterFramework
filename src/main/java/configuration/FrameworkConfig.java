package configuration;

import configuration.converter.StringToBrowserTypeConverter;
import configuration.converter.StringToRemoteModeTypeConverter;
import configuration.converter.StringToRunmodeConverter;
import enums.BrowserType;
import enums.RemoteModeType;
import enums.RunMode;
import org.aeonbits.owner.Config;


//@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources("file:${user.dir}/src/test/resources/configuration.properties")
//@Config.Sources({"system:properties", "system:env", "file: ${user.dir}/src/test/resources/configuration.properties"})
public interface FrameworkConfig extends Config {


    // @DefaultValue("chrome")
    @ConverterClass(StringToBrowserTypeConverter.class)
    BrowserType browser();
    String url();

    @ConverterClass(StringToRunmodeConverter.class)
    RunMode runmode();

    @ConverterClass(StringToRemoteModeTypeConverter.class)
    RemoteModeType remotemodetype();



}
