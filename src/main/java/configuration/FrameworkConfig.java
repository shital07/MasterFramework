package configuration;

import configuration.converter.StringToBrowserTypeConverter;
import configuration.converter.StringToRemoteModeTypeConverter;
import configuration.converter.StringToRunmodeConverter;
import configuration.converter.StringToURLConverter;
import enums.BrowserType;
import enums.RemoteModeType;
import enums.RunMode;
import org.aeonbits.owner.Config;

import java.net.URL;


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


    @ConverterClass(StringToURLConverter.class)
    URL seleniumgridurl();

    @ConverterClass(StringToURLConverter.class)
    URL browserstackurl();

}
