package junitcucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage {

	@FindBy(how = How.ID, using = "fName")
	WebElement firstName;
	@FindBy(how = How.ID, using = "lName")
	WebElement lastName;
	@FindBy(how = How.ID, using = "email_id")
	WebElement emailId;
	@FindBy(how = How.ID, using = "mobile_no")
	WebElement mobileNo;
	@FindBy(how = How.ID, using = "address")
	WebElement address;
	@FindBy(how = How.ID, using = "city")
	WebElement city;
	/*@FindBy(how = How.ID, using = "state")
	Select state;*/
	@FindBy(name = "submit")
	WebElement submit;
	
	  
		

	 

}
