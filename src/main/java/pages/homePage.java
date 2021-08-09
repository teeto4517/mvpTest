package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class homePage {
    WebDriver driver;
    WebDriverWait wait;

    public homePage (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        this.wait = new WebDriverWait(driver, 30);

    }
    @FindBy(xpath = "//body/div[@id='easycont']/div[1]/div[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/i[1]" )
    WebElement expandInputForm;
    @FindBy(xpath = "//body/div[@id='easycont']/div[1]/div[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[5]") WebElement clickForm;
    @FindBy(xpath = "//body[1]/div[3]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[5]/i[1]") WebElement expandAlertsAndModals;
    @FindBy(xpath = "//body[1]/div[3]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[5]/ul[1]/li[2]") WebElement clickAlertsAndModals;
    @FindBy(xpath = "//body/div[@id='easycont']/div[1]/div[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[6]") WebElement expandListBox;
    @FindBy(xpath = "//body/div[@id='easycont']/div[1]/div[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[6]/ul[1]/li[1]") WebElement clickList;


    public formPage navigateInputForm () {
        expandInputForm.click();
        clickForm.click();
        wait.until(ExpectedConditions.urlContains("input-form-demo.html"));
        return new formPage(driver);
    }

    public alertsAndModalPage navigateAlertsAndModal () {
        expandAlertsAndModals.click();
        clickAlertsAndModals.click();
        wait.until(ExpectedConditions.urlContains("bootstrap-modal-demo.html"));
        return new alertsAndModalPage(driver);
    }

    public listPage listView () {
        expandListBox.click();
        clickList.click();
        wait.until(ExpectedConditions.urlContains("bootstrap-dual-list-box-demo.html"));
        return new listPage(driver);
    }
}
