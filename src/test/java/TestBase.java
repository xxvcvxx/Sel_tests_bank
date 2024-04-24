import config.Config;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {
    public static WebDriver driver;

    @BeforeMethod
    public static void baseBeforeMethod() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get(new Config().getApplicationURL());
    }

    @AfterMethod
    public void baseAfterMethod() {
        driver.quit();
    }
}
