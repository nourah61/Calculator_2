package testcases;

import io.appium.java_client.android.AndroidDriver;
import org.testng.annotations.Test;

public class TC03_CheckWIFI extends TestBases{

    @Test(priority = 2)
    public void checkWIFI() throws InterruptedException {
        ((AndroidDriver) driver).toggleWifi();
        Thread.sleep(5000);
    }

}
