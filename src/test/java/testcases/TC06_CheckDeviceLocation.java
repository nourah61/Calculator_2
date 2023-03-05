package testcases;

import io.appium.java_client.android.AndroidDriver;
import org.testng.annotations.Test;

public class TC06_CheckDeviceLocation extends TestBases{

    @Test(priority = 5)
    public void checkDeviceLocation() throws InterruptedException {
        ((AndroidDriver) driver).toggleLocationServices();
        Thread.sleep(5000);
    }

}
