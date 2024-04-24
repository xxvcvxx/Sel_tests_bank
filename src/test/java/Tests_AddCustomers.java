import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.MainPage;

public class Tests_AddCustomers extends TestBase {
    @Test
    public void addCustomer() {
        new MainPage(TestBase.driver)
                .goToManagerPage()
                .addCustomer().addFirstName("test")
                .addLastName("test")
                .addFPostCodeName("test")
                .addCustomer();
    }
}
