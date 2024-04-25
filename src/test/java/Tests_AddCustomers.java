import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.MainPage;

public class Tests_AddCustomers extends TestBase {
    @Test
    public void addCustomerWithButtonClickAlert() {
        new MainPage(TestBase.driver)
                .goToManagerPage()
                .addCustomer()
                .addFirstName("test")
                .addLastName("test")
                .addPostCodeName("test") //+ Keys.ENTER)
                .addWithSuccessCustomer()
                .asserterWithSuccessCustomer();
    }

    @Test
    public void addCustomerOnEnterAlert() {
        new MainPage(TestBase.driver)
                .goToManagerPage()
                .addCustomer()
                .addFirstName("test")
                .addLastName("test")
                .addPostCodeName("test" + Keys.ENTER)
                .asserterWithSuccessCustomer();
    }
}
