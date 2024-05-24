package configuration;

import configuration.converter.StringToURLConverter;
import org.aeonbits.owner.Config;

import java.net.URL;


@Config.Sources("file:${user.dir}/src/test/resources/mobile.properties")
public interface MobileConfig extends Config {


    @ConverterClass(StringToURLConverter.class)
    URL localurl();



    @ConverterClass(StringToURLConverter.class)
    URL appapkpath();
}
