package pageObject;

/*import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver ldriver;
	
	public LoginPage(WebDriver rDriver)
	{
		ldriver=rDriver;
		
		PageFactory.initElements(rDriver, this);
	}


@FindBy(id = "Email")
WebElement email;

@FindBy(id = "Password")
WebElement password;

@FindBy(xpath = "//button[@class='button-1 login-button']")
WebElement Loginbtn;

@FindBy(linkText = "Logout")
WebElement LogOutbtn;

public void enterEmail(String emailAddress)
{
	email.clear();
	email.sendKeys(emailAddress);
}
public void enterPassword(String pwd)
{
	password.clear();
	password.sendKeys(pwd);
}
public void clickOnLoginButton()
{
    Loginbtn.click();
}
public void clickOnLogoutButton()
{
    LogOutbtn.click();
}

} */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    By emailField = By.id("Email");
    By passwordField = By.id("Password");
    By loginButton = By.xpath("//button[@class='button-1 login-button']");
    By logoutLink = By.linkText ("Logout");

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

    public void clickLogout() {
        driver.findElement(logoutLink).click();
    }
}