package newTask;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class NewtaskStepDef {

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

		List<List<String>> data1 = Credentials.raw();

		driver.findElement(By.cssSelector("#loginForm > div > input:nth-child(1)")).sendKeys(data1.get(0).get(0));
		driver.findElement(By.cssSelector("#loginForm > div > input:nth-child(2)")).sendKeys(data1.get(0).get(1));

		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
		// E,K,V must be a scalar (String, Integer, Date, enum etc)

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

	@Then("^Moves to new task page$")
	public void moves_to_new_task_page() {

		driver.switchTo().frame("mainpanel");
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//*[@id=\'navmenu\']/ul/li[6]/a"))).build().perform();
		driver.findElement(By.xpath("//*[@id=\'navmenu\']/ul/li[6]/ul/li[1]/a")).click();
	}

	@Then("^User enters new task details$")
	public void user_enters_new_task_details(DataTable TaskData) {
			
		List<List<String>> dealValues = TaskData.raw();

		driver.findElement(By.xpath("//*[@id=\'title\']")).sendKeys(dealValues.get(0).get(0));

		Select dropdown = new Select(driver.findElement(By.xpath("//*[@id=\'deadline_day\']")));
		dropdown.selectByVisibleText(dealValues.get(0).get(1));

		// dropdown.selectByIndex(4);
		// dropdown.selectByValue("8");

		Select dropdown1 = new Select(driver.findElement(By.xpath("//*//*[@id=\'deadline_month\']")));
		dropdown1.selectByVisibleText(dealValues.get(0).get(2));

		Select dropdown2 = new Select(driver.findElement(By.xpath("//*//*[@id=\'deadline_year\']")));
		dropdown2.selectByVisibleText(dealValues.get(0).get(3));

		Select dropdown3 = new Select(driver.findElement(
				By.xpath("//*[@id=\"taskForm\"]/table/tbody/tr[2]/td[1]/table/tbody/tr[3]/td[2]/select[4]")));
		dropdown3.selectByVisibleText(dealValues.get(0).get(4));

		Select dropdown4 = new Select(driver.findElement(
				By.xpath("//*[@id=\"taskForm\"]/table/tbody/tr[2]/td[1]/table/tbody/tr[3]/td[2]/select[5]")));
		dropdown4.selectByVisibleText(dealValues.get(0).get(5));

		Select dropdown5 = new Select(driver
				.findElement(By.xpath("//*[@id=\"taskForm\"]/table/tbody/tr[2]/td[1]/table/tbody/tr[5]/td[2]/select")));
		dropdown5.selectByVisibleText(dealValues.get(0).get(6));

		driver.findElement(By.xpath("//*[@id=\"completion\"]")).sendKeys(dealValues.get(0).get(7));

		Select dropdown6 = new Select(driver
				.findElement(By.xpath("//*[@id='taskForm']/table/tbody/tr[2]/td[1]/table/tbody/tr[7]/td[2]/select")));
		dropdown6.selectByVisibleText(dealValues.get(0).get(8));

		driver.findElement(By.xpath("//*[@id=\"taskForm\"]/table/tbody/tr[2]/td[1]/table/tbody/tr[10]/td[2]/input[3]"))
				.sendKeys(dealValues.get(0).get(9));

		Select dropdown7 = new Select(driver
				.findElement(By.xpath("//*[@id=\"taskForm\"]/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[2]/select")));
		dropdown7.selectByVisibleText(dealValues.get(0).get(10));

		/*try{
		    // Waits for 20 seconds
		    WebDriverWait wait = new WebDriverWait(driver, 20);

		        {
		        	Select dropdown7 = new Select(driver
		    				.findElement(By.xpath("//*[@id=\"taskForm\"]/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[2]/select")));
		        
		        	dropdown7.selectByVisibleText(dealValues.get(0).get(10));
		        }
		   
		}catch(Throwable e){
		    System.out.println("Error found: "+e.getMessage());
		}*/

		// dropdown7.selectByValue("");
		// dropdown7.selectByIndex(1);
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
		// E,K,V must be a scalar (String, Integer, Date, enum etc)

	}

	@Then("^Click on Save$")
	public void click_on_Save() {

		driver.findElement(By.xpath("//*[@id=\"taskForm\"]/table/tbody/tr[1]/td/input")).click();
	

	}

	@Then("^Close the browser$")
	public void close_the_browser() {
		driver.close();
	}

}
