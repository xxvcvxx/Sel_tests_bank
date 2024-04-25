package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class ManagerAddCustomerPage extends ManagerPage {
    public ManagerAddCustomerPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "/html/body/div/div/div[2]/div/div[2]/div/div/form/div[1]/input")
    private WebElement firstNameField;

    @FindBy(xpath = "/html/body/div/div/div[2]/div/div[2]/div/div/form/div[2]/input")
    private WebElement lastNameField;

    @FindBy(xpath = "/html/body/div/div/div[2]/div/div[2]/div/div/form/div[3]/input")
    private WebElement postCodeField;

    @FindBy(css = "body > div > div > div.ng-scope > div > div.ng-scope > div > div > form > button")
    private WebElement addCustomerButton;

    public ManagerAddCustomerPage addFirstName(String firstName) {
        firstNameField.sendKeys(firstName);
        return this;
    }

    public ManagerAddCustomerPage addLastName(String lastname) {
        lastNameField.sendKeys(lastname);
        return this;
    }

    public ManagerAddCustomerPage addPostCodeName(String postCode) {
        postCodeField.sendKeys(postCode);
        return this;
    }

    public ManagerAddCustomerPage addWithSuccessCustomer() {
        addCustomerButton.click();
        //driver.switchTo().alert().accept();
        return this;
    }

    public MainPage returntoMainPage() {
        homeButton.click();
        return new MainPage(driver);
    }

    public void asserterWithSuccessCustomer() {
        String alertSuccessText = "Customer added successfully with customer id :6";// tutaj zrobic zeby to Id sie zmieniało !
        Assert.assertEquals(driver.switchTo().alert().getText(), alertSuccessText);
    }

}
