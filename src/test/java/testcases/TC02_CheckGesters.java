package testcases;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.DeviceRotation;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TC02_CheckGesters extends TestBases{


    @Test(priority = 1)
    public void CheckRoutation() throws InterruptedException {
        DeviceRotation rotation = new DeviceRotation(0,0,90); //  object
        driver.rotate(rotation);
        Thread.sleep(5000);
        rotation = new DeviceRotation(0,0,90); //
        driver.rotate(rotation);
        Thread.sleep(5000);
    }
//    @Test(priority = 2)
//    public void checkWIFI() throws InterruptedException {
//        ((AndroidDriver) driver).toggleWifi();
//        Thread.sleep(5000);
//    }
//    @Test(priority = 3)
//    public void checkMobileData() throws InterruptedException {
//        ((AndroidDriver) driver).toggleData();
//        Thread.sleep(5000);
//    }
//    @Test(priority = 4)
//    public void checkBlutoth() throws InterruptedException {
//        ((AndroidDriver) driver).toggleAirplaneMode();
//        Thread.sleep(5000);
//    }
//    @Test(priority = 5)
//    public void checkDeviceLocation() throws InterruptedException {
//        ((AndroidDriver) driver).toggleLocationServices();
//        Thread.sleep(5000);
//    }
//
//    @Test(priority = 6)
//    public void checkBackground() throws InterruptedException {
////        ((AndroidDriver) driver).toggleLocationServices();
//        Thread.sleep(5000);
//    }



}
