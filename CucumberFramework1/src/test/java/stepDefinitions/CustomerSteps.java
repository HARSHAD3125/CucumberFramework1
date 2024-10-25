package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObject.AddNewCustomerPage;

public class CustomerSteps {
   public WebDriver driver;
   public AddNewCustomerPage addNewCustomerPage;

    @Given("User Launch Chrome browser")
    public void user_Launch_Chrome_browser(){
    	WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        addNewCustomerPage = new AddNewCustomerPage(driver);
    }

    @When("User Open URL {string}")
    public void user_Open_URL(String url) {
        driver.get(url);
    }

    @And("User enters Email as {string} and password as {string}")
    public void user_enters_Email_as_and_password_as(String email, String password) {
        addNewCustomerPage = new AddNewCustomerPage(driver);
        addNewCustomerPage.enterEmail(email);
        addNewCustomerPage.enterPassword(password);
    }

    @And("Click on Login")
    public void click_on_Login() {
        addNewCustomerPage.clickLogin();
    }

    @Then("User can view Dashboard")
    public void user_can_view_Dashboard() {
        String actualTitle = driver.getTitle();
        Assert.assertEquals("Dashboard / nopCommerce administration", actualTitle);
    }

    @When("User click on customers menu")
    public void user_click_on_customers_menu() {
        addNewCustomerPage.clickCustomersMenu();
    }

    @And("Click on customers menu item")
    public void click_on_customers_menu_item() {
        addNewCustomerPage.clickCustomersMenuItem();
    }

    @And("Click on Add new button")
    public void click_on_Add_new_button() {
        addNewCustomerPage.clickAddNewButton();
    }

    @Then("User can view Add new customer page")
    public void user_can_view_Add_new_customer_page() {
        String actualTitle = driver.getTitle();
        Assert.assertEquals("Add a new customer / nopCommerce administration", actualTitle);
    }

    @When("User enter customer info")
    public void user_enter_customer_info() {
        addNewCustomerPage.enterCustomerEmail("admin@yourstore.com");
        addNewCustomerPage.enterCustomerPassword("admin");
        addNewCustomerPage.enterFirstName("Test");
        addNewCustomerPage.enterLastName("Customer");
        addNewCustomerPage.selectGender("Male");
        addNewCustomerPage.enterDateOfBirth("01/01/1990");
        addNewCustomerPage.enterCompanyName("Test Company");
        addNewCustomerPage.selectCustomerRoles("Guests");
        addNewCustomerPage.selectManagerOfVendor("Vendor 1");
        addNewCustomerPage.enterAdminComment("This is a test comment.");
    }

    @And("Click on save button")
    public void click_on_save_button() {
        addNewCustomerPage.clickSave();
    }

    @Then("User can view confirmation message {string}")
    public void user_can_view_confirmation_message(String expectedMessage) {
        String bodyText = addNewCustomerPage.getConfirmationMessage();
        Assert.assertTrue(bodyText.contains(expectedMessage));
    }

    @And("close browser")
    public void close_browser() {
        driver.quit();
    }
}