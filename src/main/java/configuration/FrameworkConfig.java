package configuration;

import configuration.enumclass.BrowserType;
import org.aeonbits.owner.Config;


//@Config.Sources("file:${user.dir}/src/test/resources/configuration.properties")
@Config.Sources({"system:properties", "system:env", "file: ${user.dir}/src/test/resources/configuration.properties"})
public interface FrameworkConfig extends Config {


    @DefaultValue("chrome")
    @ConverterClass(StringToBrowserTypeConverter.class)
    BrowserType browser();
}
