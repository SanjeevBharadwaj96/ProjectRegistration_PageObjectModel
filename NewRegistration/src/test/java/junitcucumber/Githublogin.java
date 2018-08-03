package junitcucumber;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.google.common.util.concurrent.Service.State;

public class Githublogin {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("D:\\NewRegistration\\WebContent\\registration.html");
		RegisterPage page1 = PageFactory.initElements(driver, RegisterPage.class);
		page1.firstName.sendKeys("SANJEEV");
		Thread.sleep(100);
		page1.lastName.sendKeys("bHARDWAJ");
		Thread.sleep(100);
		page1.emailId.sendKeys("ssbharadwaj@gmail.com");
		Thread.sleep(100);
		page1.mobileNo.sendKeys("9849465163");
		Thread.sleep(100);
		page1.address.sendKeys("HYDERABAD");
		Thread.sleep(100);
		page1.city.sendKeys("HYDERABAD");
		Thread.sleep(100);
		Select select = new Select(driver.findElement(By.id("state")));
		select.selectByIndex(1);
		Thread.sleep(100);
		page1.submit.click();
		Thread.sleep(200);
		driver.navigate().to("file:///D:\\NewRegistration\\WebContent\\projectdetails.html");
		ProjectDetails page2 = PageFactory.initElements(driver, ProjectDetails.class);
		Thread.sleep(100);
		page2.projectName.sendKeys("bArCLAYS");
		Thread.sleep(100);
		page2.clientName.sendKeys("Yash geel");
		Thread.sleep(100);
		page2.teamMember.sendKeys("4");
		Thread.sleep(100);
		page2.submit1.click();
		Thread.sleep(100);
		driver.get("file:///D:\\NewRegistration\\WebContent\\projectSuccess.html");

	}
}
