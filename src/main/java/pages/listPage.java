package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static org.testng.Assert.assertEquals;

public class listPage {
    WebDriver driver;
    WebDriverWait wait;


    public listPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        this.wait = new WebDriverWait(driver, 30);
    }

    @FindBy(className = "btn") WebElement selectAll;
    @FindBy(className = "active") List <WebElement> searchResult;

    public void countList (String keyword) {
        selectAll.click();
        assertEquals(5, searchResult.size());
    }
}
