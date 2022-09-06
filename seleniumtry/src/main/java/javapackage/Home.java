package javapackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Home {

	WebDriver driver;
	private By Result_State=By.id("result-stats");
	public Home(WebDriver driver) {
		this.driver=driver;
	}
	public String getresult() {
	
	return	driver.findElement(Result_State).getText();
	}
}
