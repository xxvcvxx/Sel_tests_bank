import org.testng.annotations.Test;
import pages.MainPage;

public class SimpleTest extends TestBase {

    @Test
    public void findHeader() {
        new MainPage(TestBase.driver)
                .assertTitle();
    }

    @Test
    public void homeButtonText() {
        new MainPage(TestBase.driver)
                .assertHomeButtonText();
    }

    @Test
    public void customerLoginButtonText() {
        new MainPage(TestBase.driver)
                .assertCustomerLoginButtonText();
    }

    @Test
    public void BankManagerButtonText() {
        new MainPage(TestBase.driver)
                .assertBankManagerButtonText();
    }
}
