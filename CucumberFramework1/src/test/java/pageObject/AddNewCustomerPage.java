package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class AddNewCustomerPage {
    WebDriver driver;

    public AddNewCustomerPage(WebDriver driver) {
        this.driver = driver;
      
    }

    // Login Page Elements
    By emailField = By.id("Email");
    By passwordField = By.id("Password");
    By loginButton = By.xpath("//button[contains(text(),'Log in')]");

    // Dashboard Page Elements
    By customersMenu = By.xpath("//a[@href='#']//p[contains(text(),'Customers')]");
    By customersMenuItem = By.xpath("//a[@href='/Admin/Customer/List']//p[contains(text(),'Customers')]");

    // Customers Page Elements
    By addNewButton = By.xpath("//a[@class='btn btn-primary']");

    // Add New Customer Page Elements
    By customerEmailField = By.id("Email");
    By customerPasswordField = By.id("Password");
    By firstNameField = By.id("FirstName");
    By lastNameField = By.id("LastName");
    By genderMaleRadio = By.id("Gender_Male");
    By genderFemaleRadio = By.id("Gender_Female");
    By dateOfBirthField = By.id("DateOfBirth");
    By companyNameField = By.id("Company");
    By customerRolesField = By.xpath("//div[@class='k-multiselect-wrap k-floatwrap']");
    By administratorsOption = By.xpath("//li[contains(text(),'Administrators')]");
    By forumModeratorsOption = By.xpath("//li[contains(text(),'Forum Moderators')]");
    By guestsOption = By.xpath("//li[contains(text(),'Guests')]");
    By registeredOption = By.xpath("//li[contains(text(),'Registered')]");
    By vendorsOption = By.xpath("//li[contains(text(),'Vendors')]");
    By managerOfVendorDropdown = By.id("VendorId");
    By adminCommentField = By.id("AdminComment");
    By saveButton = By.name("save");

    // Login Page Methods
    public void enterEmail(String email) {
    	driver.findElement(emailField).clear();
        driver.findElement(emailField).sendKeys(email);
    }

    public void enterPassword(String password) {
    	driver.findElement(passwordField).clear(); 
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickLogin() {
        driver.findElement(loginButton).click();
    }

    // Dashboard Page Methods
    public void clickCustomersMenu() {
        driver.findElement(customersMenu).click();
    }

    public void clickCustomersMenuItem() {
        driver.findElement(customersMenuItem).click();
    }

    // Customers Page Methods
    public void clickAddNewButton() {
        driver.findElement(addNewButton).click();
    }

    // Add New Customer Page Methods
    public void enterCustomerEmail(String email) {
        driver.findElement(customerEmailField).sendKeys(email);
    }

    public void enterCustomerPassword(String password) {
        driver.findElement(customerPasswordField).sendKeys(password);
    }

    public void enterFirstName(String firstName) {
        driver.findElement(firstNameField).sendKeys(firstName);
    }

    public void enterLastName(String lastName) {
        driver.findElement(lastNameField).sendKeys(lastName);
    }

    public void selectGender(String gender) {
        if (gender.equalsIgnoreCase("Male")) {
            driver.findElement(genderMaleRadio).click();
        } else {
            driver.findElement(genderFemaleRadio).click();
        }
    }

    public void enterDateOfBirth(String dob) {
        driver.findElement(dateOfBirthField).sendKeys(dob);
    }

    public void enterCompanyName(String companyName) {
        driver.findElement(companyNameField).sendKeys(companyName);
    }

    public void selectCustomerRoles(String role) {
        driver.findElement(customerRolesField).click();
        switch (role) {
            case "Administrators":
                driver.findElement(administratorsOption).click();
                break;
            case "Forum Moderators":
                driver.findElement(forumModeratorsOption).click();
                break;
            case "Guests":
                driver.findElement(guestsOption).click();
                break;
            case "Registered":
                driver.findElement(registeredOption).click();
                break;
            case "Vendors":
                driver.findElement(vendorsOption).click();
                break;
        }
    }

    public void selectManagerOfVendor(String value) {
        Select drp = new Select(driver.findElement(managerOfVendorDropdown));
        drp.selectByVisibleText(value);
    }

    public void enterAdminComment(String comment) {
        driver.findElement(adminCommentField).sendKeys(comment);
    }

    public void clickSave() {
        driver.findElement(saveButton).click();
    }

    public String getConfirmationMessage() {
        return driver.findElement(By.tagName("body")).getText();
    }
}
   

