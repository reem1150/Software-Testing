package pagesContent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Registration{
    public WebDriver driver;

    public Registration(WebDriver driver)
    {
        this.driver = driver;
    }
    By registerLinkPOM = By.linkText("Register");
    By registerFNamePOM = By.id("FirstName");
    By registerGenderPOM = By.id("gender-female");
    By registerLUsernamePOM = By.id("LastName");
    By registerMailPOM = By.id("Email");
    By registerPassPOM  = By.id("Password");
    By registerConfigPassPOM = By.id("ConfirmPassword");
    By registerBtnPOM = By.id("register-button");
    By registerAsser1POM = By.className("ico-account");
    By registerAsser2POM = By.cssSelector("div[class=\"result\"]");
    By registerClosePOM = By.className("ico-logout");
    //------------------------------------------------------------------------------//

    public void registerEle()
    {
        // Register
        driver.findElement(registerLinkPOM).click();
    }
    //------------------------------------------------------------------------------//

    public void registerData(String FirstName, String LastName, String pass, String email)
    {
        // Select Gender //
        driver.findElement(registerGenderPOM).click();

        // Enter First Name //
        driver.findElement(registerFNamePOM).click();
        driver.findElement(registerFNamePOM).clear();
        driver.findElement(registerFNamePOM).sendKeys(FirstName);
        // Enter Last Name //
        driver.findElement(registerLUsernamePOM).click();
        driver.findElement(registerLUsernamePOM).clear();
        driver.findElement(registerLUsernamePOM).sendKeys(LastName);

        // Write valid Email //
        driver.findElement(registerMailPOM).click();
        driver.findElement(registerMailPOM).clear();
        driver.findElement(registerMailPOM).sendKeys(email);
        System.out.println(email);

        // Write Password //
        driver.findElement(registerPassPOM).click();
        driver.findElement(registerPassPOM).clear();
        driver.findElement(registerPassPOM).sendKeys(pass);
        // Confirm Password //
        driver.findElement(registerConfigPassPOM).click();
        driver.findElement(registerConfigPassPOM).clear();
        driver.findElement(registerConfigPassPOM).sendKeys(pass);
    }

    public void registerButtonEle()
    {
        // Press Register Button //
        driver.findElement(registerBtnPOM).click();
    }
    //------------------------------------------------------------------------------//

    public String registerAsserEle()
    {
        // Registration Assertion_1 //
        Assert.assertTrue(driver.findElement(registerAsser1POM).isDisplayed(), "Assertion False: User couldn't register");

        // Registration Assertion_2 //
        String actualResult = driver.findElement(registerAsser2POM).getText();
        return actualResult;
    }

    public void registerLogoutEle()
    {
        // Logout after registering //
        driver.findElement(registerClosePOM).click();
    }
}


