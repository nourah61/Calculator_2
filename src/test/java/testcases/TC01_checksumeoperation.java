package testcases;

import org.example.pages.P01caluclautorhomepage;
import org.testng.annotations.Test;

public class TC01_checksumeoperation extends TestBases {
P01caluclautorhomepage caluclautorhomepage;
@Test (priority = 1)
    public void checksumoperation() throws InterruptedException {
    caluclautorhomepage = new P01caluclautorhomepage(driver);
    caluclautorhomepage.number1.click();
    caluclautorhomepage.plucputton.click();
    caluclautorhomepage.number5.click();
    caluclautorhomepage.ecualbutton.click();
    Thread.sleep(20000);
}
}
