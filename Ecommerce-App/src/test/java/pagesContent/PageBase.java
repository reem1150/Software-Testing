package pagesContent;

import org.openqa.selenium.WebDriver;

public class PageBase {
    public WebDriver driver;


    public PageBase(WebDriver driver) {
        this.driver = driver;
    }

    public Registration registrationPOM() {
        return new Registration(driver);
    }
}