package BDDCuc.FreeCRM_Cucumber;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FreeCRM1StepDef {

	WebDriver driver ;

	@Given("^The home page Url$")

	public void The_home_page_Url()
	{ 

		WebDriverManager.chromedriver().setup();

		/* System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
 		System.setProperty("webdriver.gecko.driver", "E:\\geckodriver.exe");
		driver  = new FirefoxDriver();
		driver.get("https://www.freecrm.com"); */


		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.navigate().to("https://www.freecrm.com");
	}


	@When("^User Entered into CRM page the page title is FreeCRM$")

	public void user_Entered_into_CRM_page_the_page_title_is_FreeCRM()

	{
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Free CRM in the cloud software boosts sales", title);
	}

	@Then("^User entered \"([^\"]*)\"$")

	public void User_entered(String Username)
	{

		driver.findElement(By.cssSelector("#loginForm > div > input:nth-child(1)")).sendKeys(Username);

	}

	@Then("^Entered \"([^\"]*)\"$")

	public void Entered(String Password) {

		driver.findElement(By.cssSelector("#loginForm > div > input:nth-child(2)")).sendKeys(Password);
	}

	@Then("^Click on login button$")

	public void Click_on_login_button()
	{

		WebElement loginbtn = driver.findElement(By.cssSelector("input[value='Login']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", loginbtn);

		//driver.findElement(By.cssSelector("input[value='Login']")).click();

	}

	@Then("^User entered into home page the title is CRMPRO$")

	public void  User_entered_into_homepage_the_title_is_CRMPRO()
	{
		String title = driver.getTitle();

		System.out.println("Home page title :"+title);

		Assert.assertEquals("CRMPRO", title);

	}

	@Then ("^Close the browser$")

	public void Close_the_browser() {

		driver.close();
		driver.quit();
	}
}
