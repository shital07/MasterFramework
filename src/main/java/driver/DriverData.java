package driver;

import enums.BrowserType;
import enums.MobilePlatformType;
import enums.RemoteModeType;
import enums.RunMode;
import lombok.Builder;
import lombok.Getter;


@Getter
@Builder
public final class DriverData {

    private BrowserType browserType;
    private RunMode runMode;
    private RemoteModeType remoteModeType;
    private MobilePlatformType mobileplatformtype;

}
