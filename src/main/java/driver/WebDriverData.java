package driver;

import enums.BrowserType;
import enums.RemoteModeType;
import enums.RunMode;
import lombok.Builder;
import lombok.Getter;


@Builder
@Getter
public final class WebDriverData {


    private BrowserType browserType;
    private RunMode runMode;
    private RemoteModeType remoteModeType;
    private WebDriverData(){

    }


}
