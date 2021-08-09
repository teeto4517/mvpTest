package e2e;

import com.github.javafaker.Faker;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.formPage;
import pages.homePage;
import utility.baseClass;

public class formTest extends baseClass  {

    homePage home;
    formPage form;
    Faker faker = new Faker();

    String fakerFirstName = faker.name().firstName();
    String fakerLastName = faker.name().lastName();
    String fakerEmail = faker.internet().emailAddress();
    String fakerPhone = faker.number().digits(10);
    String fakerAddress = faker.address().streetAddress();
    String fakerCity = faker.address().city();
    String fakerZipCode = faker.address().zipCode();
    String fakerWeb = faker.internet().domainName();
    String fakerComment = faker.lorem().sentence();

    @Test
    public void setForm ()  {
        home = baseClass.visitSite();
        form = home.navigateInputForm();
        form.inputName(fakerFirstName,fakerLastName);
        form.inputContactDetails(fakerEmail,fakerPhone);
        form.inputAddress(fakerAddress,fakerCity,fakerZipCode);
        form.otherInformation(fakerWeb,fakerComment);
        form.submitForm();
    }
}
