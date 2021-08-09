package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class alertsAndModalPage {
    WebDriver driver;
    WebDriverWait wait;

    public alertsAndModalPage (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        this.wait = new WebDriverWait(driver, 30);

    }

    @FindBy(xpath = "//body/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/a[1]")
    WebElement clickLaunchModal;
    @FindBy(id = "myModal0") WebElement modal;
    @FindBy(linkText = "Save changes") WebElement saveChangesButton;


    public void clickModal () throws InterruptedException {
        clickLaunchModal.click();
        Thread.sleep(3000);
        driver.switchTo().activeElement();
        saveChangesButton.click();
        Thread.sleep(3000);
    }

    public void checkModalDisplay() {
        wait.until(ExpectedConditions.invisibilityOf(modal));
    }

}
