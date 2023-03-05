package testcases;

import io.appium.java_client.android.AndroidDriver;
import org.testng.annotations.Test;

public class TC04_CheckMobileData extends TestBases{

    @Test(priority = 3)
    public void checkMobileData() throws InterruptedException {
        ((AndroidDriver) driver).toggleData();
        Thread.sleep(5000);
    }
}
