package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Header {
    protected WebDriver driver;

    public Header(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    private final String titleText = "XYZ Bank";
    @FindBy(css = ".box>strong")
    private WebElement title;

    public Header assertTitle() {
        Assert.assertEquals(title.getText(), titleText);
        return this;
    }
}
