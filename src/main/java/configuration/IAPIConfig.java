package configuration;

import configuration.converter.StringToURLConverter;
import org.aeonbits.owner.Config;

import java.net.URL;


@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources("file:${user.dir}/src/test/resources/api.properties")
public interface IAPIConfig extends Config {



   // @ConverterClass(StringToURLConverter.class)
    String baseurl();


  //  @ConverterClass(StringToURLConverter.class)
    @Key("list.users.endurl")
    String endurl();
}
