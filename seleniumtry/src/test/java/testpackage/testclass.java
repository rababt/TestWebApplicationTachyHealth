package testpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import javapackage.login;

public class testclass {
	private WebDriver driver;

	@Test
	public void NavigateToTachhealthAndAssertPageTitle() {
		// System.setProperty("webdriver.chrome.driver",
		// "src/main/resources/chromedriver.exe");//relative path
		Assert.assertEquals(new login(driver).NavigateToUrl().getTitle(), "Google");

	}

	@Test
	public void NavigateToTachhealthAndAssertLogo() {

		By google_logo_image = By.xpath("//img[@ alt='Google']");
		// Assert.assertTrue(driver.findElement(google_logo_image).isDisplayed());
		Assert.assertTrue(new login(driver).NavigateToUrl().IsLogoDisplayed());

	}

	@Test
	public void searchForSelenium() {
		var result=new login(driver).SearchQuery("Selenium WebDriver").getresult();
	//	By result_status_label = By.id("result-stats");
		// Assert.assertNotEquals(driver.findElement(result_status_label).getText().isEmpty());
	//	Assert.assertFalse(driver.findElement(result_status_label).getText().isEmpty());
	       Assert.assertNotEquals(result," ");


	}

	@BeforeClass
	public void beforeClass() {

		WebDriverManager.chromedriver().setup();
	}

	@BeforeMethod
	public void beforeMethod() {
		driver = new ChromeDriver();
		// object=new login(driver);
		// object.NavigateToUrl();
		new login(driver).NavigateToUrl();
	}

	@AfterMethod
	public void AfterMethod() {
		driver.quit();

	}

}
