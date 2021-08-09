package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class formPage {
    WebDriver driver;
    WebDriverWait wait;


    public formPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        this.wait = new WebDriverWait(driver, 30);

    }


    @FindBy(name ="first_name") WebElement firstNameField;
    @FindBy(name = "last_name") WebElement lastNameField;
    @FindBy(name = "email") WebElement emailField;
    @FindBy(name = "phone") WebElement phoneNumberField;
    @FindBy(name = "address") WebElement addressField;
    @FindBy(name = "city") WebElement cityField;
    @FindBy(name = "state") WebElement selectState;
    @FindBy(name = "zip") WebElement zipCodeField;
    @FindBy(name= "website") WebElement websiteField;
    @FindBy(xpath = "//body[1]/div[2]/div[1]/div[2]/section[1]/form[1]/fieldset[1]/div[10]/div[1]/div[1]/label[1]/input[1]") WebElement hostRadioOption;
    @FindBy(name= "comment") WebElement commentField;
    @FindBy(className = "btn") WebElement sendButton;



    public void inputName (String firstName, String lastName)  {
        firstNameField.sendKeys(firstName);
        lastNameField.sendKeys(lastName);
    }

    public void inputContactDetails (String emailId, String phone) {
        emailField.sendKeys(emailId);
        phoneNumberField.sendKeys(phone);
    }

    public void inputAddress (String address, String city, String zip) {
        addressField.sendKeys(address);
        cityField.sendKeys(city);
        new Select(selectState).selectByIndex(3);
        zipCodeField.sendKeys(zip);
    }

    public void otherInformation (String web, String comments) {
        websiteField.sendKeys(web);
        hostRadioOption.click();
        commentField.sendKeys(comments);
    }

    public void submitForm () {
        sendButton.click();
    }
}
