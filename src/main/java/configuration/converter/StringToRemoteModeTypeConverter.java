package configuration.converter;

import enums.RemoteModeType;
import org.aeonbits.owner.Converter;

import java.lang.reflect.Method;

public class StringToRemoteModeTypeConverter implements Converter<RemoteModeType> {
    @Override
    public RemoteModeType convert(Method method, String s) {
        return RemoteModeType.valueOf(s);
    }
}
