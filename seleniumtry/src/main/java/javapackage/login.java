package javapackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class login {
	WebDriver driver;
	private String url="https://www.google.com/ncr";
	//By Search_box = By.name("q");	
	By GoogleLogo=By.xpath("//img[@ alt='Google']");
	By Search_box = RelativeLocator.with(By.tagName("input")).below(GoogleLogo);
	public login(WebDriver driver) {
		this.driver=driver;
	}
	public login NavigateToUrl() {
     driver.navigate().to(url);
     return this;

	}
	public String getTitle() {
		return driver.getTitle();
	}
	
	public boolean IsLogoDisplayed() {
		return driver.findElement(GoogleLogo).isDisplayed();
	}
  public javapackage.Home SearchQuery(String query) {
		
		driver.findElement(Search_box).sendKeys(query, Keys.ENTER); 
		return new javapackage.Home(driver);
  }
}
