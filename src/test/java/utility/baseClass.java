package utility;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import pages.homePage;

import java.util.concurrent.TimeUnit;

public class baseClass {

    private static WebDriver driver;

    public static homePage visitSite() {
        driver.get("https://www.seleniumeasy.com/test");
        return new homePage(driver);
    }

    @BeforeSuite
    public static void setDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @AfterSuite
    public void closeDriver () {
        driver.quit();
    }
}
