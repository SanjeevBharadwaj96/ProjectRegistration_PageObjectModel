package junitcucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ProjectDetails{
	@FindBy(how=How.XPATH, using="/html/body/table/tbody/tr[2]/td/input")
	 WebElement projectName;
	@FindBy(how=How.XPATH, using="/html/body/table/tbody/tr[4]/td/input")
	 WebElement clientName;
	@FindBy(how=How.XPATH, using="/html/body/table/tbody/tr[6]/td/input")
	 WebElement teamMember;
	@FindBy(name="submit1")
	 WebElement submit1;

	
	
}
