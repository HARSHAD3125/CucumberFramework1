package pageObject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;                                //1.Create feature file
                                                                               //2.Create page object      
public class SearchCustomerpage {                                                 //a.Find web elements
WebDriver ldriver;                                                                //b. Action perform
	
	public SearchCustomerpage(WebDriver rDriver)
	{
		ldriver=rDriver;
		
		PageFactory.initElements(rDriver, this);
	}
	
	@FindBy(id="SearchEmail")
	WebElement emailAdd;
	
	@FindBy(id="search-customers")
	WebElement searchBtn;
	
	@FindBy(xpath="//table[@class='table table-bordered table-hover table-striped dataTable no-footer']")
	WebElement searchResult;
	
	@FindBy(xpath="//table[@class='table table-bordered table-hover table-striped dataTable no-footer']//tbody/tr")
	List<WebElement> tableRows;
	
	@FindBy(xpath="//table[@class='table table-bordered table-hover table-striped dataTable no-footer']//tbody/tr[1]/td")
	List<WebElement> tableColumns;
	
	
	
	
	//Action method to perform email address
	public void enterEmailAdd(String email)
	{
		emailAdd.sendKeys(email);
	
	}
	//Action method to perform click action on search button
	public void clickSearchButton()
	{
		searchBtn.click();
	}
	
	public boolean searchCustomerByEmail(String email)
	{
		boolean found = false;
		
		//total no. of rows
		
		//total no. of columns
	}
}
