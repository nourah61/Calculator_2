package org.example.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class P01caluclautorhomepage {
    public P01caluclautorhomepage(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(xpath = "//android.widget.Button[@index='14']")
    public WebElement number1;

    @AndroidFindBy(xpath = "//android.widget.Button[@index='11']")
    public WebElement number5;

    @AndroidFindBy(xpath = "//android.widget.Button[@index='17']")
    public WebElement plucputton;

    @AndroidFindBy(xpath = "//android.widget.Button[@index='20']")
    public WebElement ecualbutton;
}
