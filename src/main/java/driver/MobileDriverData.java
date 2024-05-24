package driver;

import enums.MobilePlatformType;
import enums.RemoteModeType;
import enums.RunMode;
import lombok.Builder;
import lombok.Getter;


@Builder
@Getter
public final class MobileDriverData {

    private MobileDriverData(){

    }
    private RunMode runMode;
    private RemoteModeType remoteModeType;
    private MobilePlatformType mobilePlatformType;
}
