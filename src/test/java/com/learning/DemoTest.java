package com.learning;

    import configuration.FrameworkConfig;
import org.aeonbits.owner.ConfigFactory;
import org.testng.annotations.Test;
public class DemoTest {

// want to run on local , remote(selenium grid , BS)


    @Test
    public void test(){

        FrameworkConfig config = ConfigFactory.create(FrameworkConfig.class);
        System.out.println(config.browser());



      /*  WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        driver.quit();*/
    }

}
