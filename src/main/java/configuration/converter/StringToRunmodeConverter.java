package configuration.converter;

import enums.RunMode;
import org.aeonbits.owner.Converter;

import java.lang.reflect.Method;

public class StringToRunmodeConverter implements Converter<RunMode> {
    @Override
    public RunMode convert(Method method, String s) {
        return RunMode.valueOf(s);
    }
}
