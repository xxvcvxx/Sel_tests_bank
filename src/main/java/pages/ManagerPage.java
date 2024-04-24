package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ManagerPage extends Header {
    public ManagerPage(WebDriver driver) {
        super(driver);
    }
//dlaczego selektor css nei dziala ?
    @FindBy(xpath = "/html/body/div/div/div[2]/div/div[1]/button[1]")
    public WebElement addCustomerButton;

    public ManagerAddCustomerPage addCustomer()
    {
        addCustomerButton.click();
        return new ManagerAddCustomerPage((driver));
    }
}
