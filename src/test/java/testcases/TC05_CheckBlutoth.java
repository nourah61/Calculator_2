package testcases;

import io.appium.java_client.android.AndroidDriver;
import org.testng.annotations.Test;

public class TC05_CheckBlutoth extends TestBases{

    @Test(priority = 4)
    public void checkBlutoth() throws InterruptedException {
        ((AndroidDriver) driver).toggleAirplaneMode();
        Thread.sleep(5000);
    }

}
