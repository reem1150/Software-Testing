package step_definitions;

import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pagesContent.PageBase;

public class TestBase {

        public static WebDriver driver;
        static PageBase object;

    @BeforeAll
    public static void open_chrome() {
        //select chromedriver to open browser
        // instead of using System.setProperty()
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        // **Open home page and maximize
        //String url = "https://demo.nopcommerce.com/";
        //driver.navigate().to(url);
        driver.navigate().to("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        object = new PageBase(driver);
    }
    @AfterAll
    public static void closes_driver() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}