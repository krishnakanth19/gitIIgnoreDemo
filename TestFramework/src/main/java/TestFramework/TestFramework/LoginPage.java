package TestFramework.TestFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	
	public WebDriver driver;
	public WebDriverWait wait;
	private final String url = "https://www.google.com/gmail/";
	private final By username = By.id("identifierId");
	private final By next = By.xpath("//span[contains(text(),'Next')]");
	private final By password = By.name("password");
	
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, 10);
	}
	
	public void launchApp() {
		driver.navigate().to(url);
	}
	
	public void loginToGmail() {
		driver.findElement(username).sendKeys("krishnakanthkarimaddula");
		driver.findElement(next).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(password));
		driver.findElement(password).sendKeys("123456789");
		driver.findElement(next).click();
	}
	

}
