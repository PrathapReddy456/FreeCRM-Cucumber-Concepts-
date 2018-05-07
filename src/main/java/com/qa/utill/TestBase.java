package com.qa.utill;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;



public class TestBase {

	public static WebDriver driver;
	public static Properties prop;
	
	
	public TestBase() {
		try {
			prop = new Properties();
			FileInputStream fis= new FileInputStream("C:/Users/RITHWIK/My_Work2/FreeCRM-Cucumber/src/main/java/com/qa/config/Config.properties");
					
					prop.load(fis);
		}catch (IOException e) {
			e.getMessage();
		}
	}
	
	public static void Intialization() {
		
		String browserName = prop.getProperty("browser");
		if(browserName.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", "E:/chromedriver.exe");
		driver = new ChromeDriver();
		}
		else if (browserName.equals("FireFox")) {
			System.setProperty("webdriver.gecko.driver", "E:/geckodriver.exe");
			driver = new FirefoxDriver();
		}
	
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(TestUtill.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(TestUtill.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		driver.navigate().to(prop.getProperty("url"));
		
		PageFactory.initElements(driver,TestBase.class );
	}
}
