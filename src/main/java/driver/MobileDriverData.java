package driver;

import enums.MobilePlatformType;
import enums.RemoteModeType;
import enums.RunMode;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;


@AllArgsConstructor
@Getter
public final class MobileDriverData {


    private RemoteModeType remoteModeType;
    private MobilePlatformType mobilePlatformType;
}
