package driver;

import enums.BrowserType;
import enums.RemoteModeType;
import enums.RunMode;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;



@AllArgsConstructor
@Getter
public final class WebDriverData {


    private BrowserType browserType;
    private RemoteModeType remoteModeType;


}
