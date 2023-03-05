package testcases;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.example.capbailities.Capbalities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;

import java.io.IOException;



public class TestBases extends Capbalities {

    static AndroidDriver<AndroidElement> driver;
    @BeforeTest
    public static void prepare() throws IOException {
        // TODO start application with appium
        driver = baseCapabilities("AppName");

        //driver.captureScreenshot(driver, "startApp");// take screenshot for app when start
    }

    @AfterClass
    public static void TearDown() {
        driver.quit();
    }


}
