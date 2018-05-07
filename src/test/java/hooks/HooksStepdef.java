package hooks;

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

import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HooksStepdef {
	WebDriver driver;

	@Before

	public void the_home_page_Url() {
		System.setProperty("webdriver.chrome.driver", "E:/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.navigate().to("https://www.freecrm.com");
		driver.findElement(By.name("username")).sendKeys("naveenk");
		driver.findElement(By.name("password")).sendKeys("test@123");
		WebElement loginbtn = driver.findElement(By.cssSelector("input[value='Login']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", loginbtn);
	}

	@After
	public void close_the_browser() {
		driver.close();
	}

	@Given("^User is on Case Page$")
	public void user_is_on_Case_Page() {
		driver.switchTo().frame("mainpanel");
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//*[@id=\'navmenu\']/ul/li[7]/a"))).build().perform();
		driver.findElement(By.xpath("//*[@id=\'navmenu\']/ul/li[7]/ul/li[1]/a")).click();
	}

	@When("^User enters Case details$")
	public void user_enters_Case_details(DataTable casedata) {

		for (Map<String, String> deal2 : casedata.asMaps(String.class, String.class)) {

			driver.findElement(By.xpath("//*[@id=\"title\"]")).sendKeys(deal2.get("Title"));
			driver.findElements(
					By.xpath("//*[@id=\'caseForm\']/table/tbody/tr[2]/td[1]/table/tbody/tr[5]/td[2]/input[2]")).get(0)
					.click();
			Select dropdown = new Select(driver.findElement(
					By.xpath("//*[@id=\'caseForm\']/table/tbody/tr[2]/td[2]/table/tbody/tr[1]/td[2]/select")));
			dropdown.selectByVisibleText(deal2.get("Type"));

			driver.findElement(
					By.xpath("//*[@id=\'caseForm\']/table/tbody/tr[2]/td[2]/table/tbody/tr[5]/td[2]/input[3]"))
					.sendKeys(deal2.get("Contact"));

			WebDriverWait wait = new WebDriverWait(driver, 10);
			WebElement element = wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("//*[@id=\'caseForm\']/table/tbody/tr[1]/td/input")));
			element.click();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException ie1) {
				ie1.printStackTrace();
			}

			// Write code here that turns the phrase above into concrete actions
			// For automatic transformation, change DataTable to one of
			// List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
			// E,K,V must be a scalar (String, Integer, Date, enum etc)

		}
	}

	@Then("^User is created new case$")
	public void user_is_created_new_case() {
		System.out.println("User Created New Case");

	}
	
	
	@Given("^User is on doc page$")
	public void user_is_on_doc_page()  {
		driver.switchTo().frame("mainpanel");
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//*[@id=\'navmenu\']/ul/li[13]/a"))).build().perform();
		driver.findElement(By.xpath("//*[@id=\'navmenu\']/ul/li[13]/ul/li[1]/a")).click();
	   
	}

	@When("^User enters doc details$")
	public void user_enters_doc_details(DataTable docdata) {
		for (Map<String, String> deal3 : docdata.asMaps(String.class, String.class)) {

			driver.findElement(By.xpath("//*[@id=\"title\"]")).sendKeys(deal3.get("Title"));
			driver.findElement(By.xpath("//*[@id=\"version\"]")).sendKeys(deal3.get("Version"));
			driver.findElement(By.xpath("//*[@id=\"tags\"]")).sendKeys(deal3.get("Hooks"));
		
		
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
	   
	}
	}

	@Then("^User is created new doc$")
	public void user_is_created_new_doc()  {
		
		System.out.println("User Created New doc");

	    
	}


}