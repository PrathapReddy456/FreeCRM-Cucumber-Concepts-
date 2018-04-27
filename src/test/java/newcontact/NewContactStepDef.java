 package newcontact;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class NewContactStepDef {

	WebDriver driver;

	@Given("^The home page Url$")
	public void the_home_page_Url() {
		//WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver", "E:/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.navigate().to("https://www.freecrm.com");
	}

	@When("^User entered into CRM page the page title is FreeCRM$")
	public void user_entered_into_CRM_page_the_page_title_is_FreeCRM() {
		String title = driver.getTitle();
		System.out.println(title);
	
	}

	@Then("^User entered \"([^\"]*)\"$")
	public void user_entered(String Username) {
		driver.findElement(By.cssSelector("#loginForm > div > input:nth-child(1)")).sendKeys(Username);
	}

	@Then("^Entered \"([^\"]*)\"$")
	public void entered(String Password) {
		driver.findElement(By.cssSelector("#loginForm > div > input:nth-child(2)")).sendKeys(Password);
	}

	@Then("^Click on login button$")
	public void click_on_login_button() {
		WebElement loginbtn = driver.findElement(By.cssSelector("input[value='Login']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", loginbtn);
	}

	@Then("^User entered into home page the title is CRMPRO$")
	public void user_entered_into_home_page_the_title_is_CRMPRO() {
		String title = driver.getTitle();
		System.out.println("Home page title :"+title);
		Assert.assertEquals("CRMPRO", title);
	}

	@Then("^Moves to new contact page$")
	public void moves_to_new_contact_page() {
		driver.switchTo().frame("mainpanel");
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.cssSelector("css=a[href='https://www.freecrm.com/system/index.cfm?action=contact']"))).build().perform();
		driver.findElement(By.cssSelector("css=a[href=\'https://www.freecrm.com/system/index.cfm?action=contact&sub=load&edit=1\']")).click();
	}

	@Then("^User select\"([^\"]*)\" and enter \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void user_select_and_enter_and(String title, String FirstName, String MiddleName, String LastName, String Suffix){

		Select dropdown= new Select(driver.findElement(By.xpath("\"//*[@id='contactForm']/table/tbody/tr[2]/td[1]/table/tbody/tr[1]/td[2]/select\"")));
		//dropdown.selectByIndex(4);
		dropdown.selectByVisibleText(title);
		// dropdown.selectByValue("8");

		driver.findElement(By.cssSelector("#first_name")).sendKeys(FirstName);
		driver.findElement(By.cssSelector("#middle_initial")).sendKeys(MiddleName);
		driver.findElement(By.cssSelector("#surname")).sendKeys(LastName);
		Select dropdown2= new Select(driver.findElement(By.xpath("\"//*[@id='contactForm']/table/tbody/tr[2]/td[1]/table/tbody/tr[1]/td[2]/select\"")));
		dropdown2.selectByVisibleText(Suffix);
	}

	@Then("^Select Receive Email and AllowCalls as No$")
	public void select_Receive_Email_and_AllowCalls_as_No() {
		driver.findElements(By.xpath("//*[@id=\"contactForm\"]/table/tbody/tr[2]/td[2]/table/tbody/tr[9]/td[2]/input[2]")).get(0).click();
		driver.findElements(By.xpath("//*[@id=\"contactForm\"]/table/tbody/tr[2]/td[2]/table/tbody/tr[11]/td[2]/input[2]")).get(0).click();
	}

	@Then("^Click on Save$")
	public void click_on_Save() {
		driver.findElements(By.xpath("//*[@id=\"contactForm\"]/table/tbody/tr[1]/td/input[2]")).get(0).click();

		/* WebElement loginbtn = driver.findElement(By.cssSelector("input[value='Login']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", loginbtn);*/

	}

	@Then("^Close the browser$")
	public void close_the_browser() {

		driver.close();
		driver.quit();
	}



}
