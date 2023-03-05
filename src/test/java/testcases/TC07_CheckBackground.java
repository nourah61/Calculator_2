package testcases;

import org.testng.annotations.Test;

import java.time.Duration;

public class TC07_CheckBackground extends TestBases{

    @Test(priority = 1)
    public void checkBackground() throws InterruptedException {
        driver.runAppInBackground(Duration.ofSeconds(10));
        Thread.sleep(5000);
    }

}
