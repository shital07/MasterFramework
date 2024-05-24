package configuration.converter;

import enums.MobilePlatformType;
import org.aeonbits.owner.Converter;

import java.lang.reflect.Method;

public class StringToMobilePlatformType implements Converter {
    @Override
    public Object convert(Method method, String s) {
        return MobilePlatformType.valueOf(s);
    }
}
