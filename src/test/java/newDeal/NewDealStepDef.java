package newDeal;

import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class NewDealStepDef {
	WebDriver driver;



	@Given("^The home page Url$")
	public void the_home_page_Url() {
		System.setProperty("webdriver.chrome.driver", "E:/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.navigate().to("https://www.freecrm.com");
	}

	@When("^User is on CRM page the page title is FreeCRM$")
	public void user_is_on_CRM_page_the_page_title_is_FreeCRM() {
		String title = driver.getTitle();
		System.out.println(title);

	}

	@Then("^User entered Username and Password$")
	public void user_entered_Username_and_Password(DataTable Credentials) {

		for (Map<String, String> deal : Credentials.asMaps(String.class, String.class)) {

			// List<Map<String, String>> deal
			// =Credentials.asMaps(String.class,String.class);

			driver.findElement(By.name("username")).sendKeys(deal.get("Username"));
			driver.findElement(By.name("password")).sendKeys(deal.get("Password"));
		}
	}

	@Then("^User Clicks on login button$")
	public void user_Clicks_on_login_button() {
		WebElement loginbtn = driver.findElement(By.cssSelector("input[value='Login']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", loginbtn);

	}

	@Then("^Now user in home page the title is CRMPRO$")
	public void now_user_in_home_page_the_title_is_CRMPRO() throws Throwable {
		String title = driver.getTitle();
		System.out.println("Home page title :" + title);
		Assert.assertEquals("CRMPRO", title);
	}

	@Then("^Moves to New Deal page$")
	public void moves_to_New_Deal_page() {

		driver.switchTo().frame("mainpanel");
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//*[@id=\'navmenu\']/ul/li[5]/a"))).build().perform();
		driver.findElement(By.xpath("//*[@id=\"navmenu\"]/ul/li[5]/ul/li[1]/a")).click();
	}

	@Then("^User enters new deal details$")
	public void user_enters_new_deal_details(DataTable dealdata) {

		for (Map<String, String> deal2 : dealdata.asMaps(String.class, String.class)) {

			driver.findElement(By.xpath("//*[@id=\'title\']")).sendKeys(deal2.get("Title"));
			driver.findElement(
					By.xpath("//*[@id=\'prospectForm\']/table/tbody/tr[2]/td[1]/table/tbody/tr[3]/td[2]/input[3]"))
					.sendKeys(deal2.get("Company"));
			
			driver.findElement(By.id("probability")).sendKeys(deal2.get("Probability %"));

			Select dropdown = new Select(driver.findElement(By.xpath("//*[@id=\'owner_user_id\']")));
			dropdown.selectByVisibleText(deal2.get("Owner"));

			driver.findElements(
					By.xpath("//*[@id=\'prospectForm\']/table/tbody/tr[2]/td[2]/table/tbody/tr[6]/td[2]/input[2]"))
					.get(0).click();
			driver.findElements(
					By.xpath("//*[@id=\'prospectForm\']/table/tbody/tr[2]/td[2]/table/tbody/tr[9]/td[2]/input")).get(0)
					.click();
			
			WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element =	wait.until (ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='submit'and @value='Save']")));
			element.click();
			try{
				   Thread.sleep(5000);
				  }catch (InterruptedException ie1) {
				    ie1.printStackTrace();
				  } 
			
			//WebDriverWait wait1 = new WebDriverWait(driver, 10);
			//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			Actions action = new Actions(driver);
			action.moveToElement(driver.findElement(By.xpath("//*[@id=\'navmenu\']/ul/li[5]/a"))).build().perform();
			driver.findElement(By.xpath("//*[@id=\"navmenu\"]/ul/li[5]/ul/li[1]/a")).click();
			
		
			// Write code here that turns the phrase above into concrete actions
			// For automatic transformation, change DataTable to one of
			// List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
			// E,K,V must be a scalar (String, Integer, Date, enum etc)
		}
	}
	
	@Then("^Close the browser$")
	public void close_the_browser() {
		driver.close();
	}

}
