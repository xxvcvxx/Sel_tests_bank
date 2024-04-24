package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class MainPage {
    protected WebDriver driver;
    private final String titleText = "XYZ Bank";
    private final String homeButtonText = "Home";
    private final String customerLoginButtonText = "Customer Login";
    private final String bankManagerLoginText = "Bank Manager Login";

    public MainPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = ".box>strong")
    private WebElement title;
    @FindBy(css = ".box.mainhdr button.btn.home")
    private WebElement homeButton;
    @FindBy(css = ".ng-scope button.btn.btn-primary.btn-lg ")
    private WebElement customerLoginButton;
    @FindBy(css = "body > div > div > div.ng-scope > div > div.borderM.box.padT20 > div:nth-child(3) > button")
    private WebElement bankManagerButton;

    public MainPage assertTitle() {
        Assert.assertEquals(title.getText(), titleText);
        return this;
    }

    public MainPage assertHomeButtonText() {
        Assert.assertEquals(homeButton.getText(), homeButtonText);
        return this;
    }

    public MainPage assertCustomerLoginButtonText() {
        Assert.assertEquals(customerLoginButton.getText(), customerLoginButtonText);
        return this;
    }

    public MainPage assertBankManagerButtonText() {
        Assert.assertEquals(bankManagerButton.getText(), bankManagerLoginText);
        return this;
    }
}