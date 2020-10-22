package utilities;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class WebActions {
	private WebDriver driver;

	public WebActions(String Url) {
		driver =  loadurl(Url);

	}


	public WebDriver loadurl(String url){

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\tools\\Chromedriver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);	
		return driver;

	}

	/**
	 * function will click on the locator based on the locator type.
	 * @param locatorType
	 * @param Locator
	 */
	public boolean click(String locatorType, String Locator){
		try{
			element(locatorType,Locator).click();
		}catch (NoSuchElementException ne){
			return false;
		}catch (Exception e) {
			return false;
		} 
		return true;
	}

	/**
	 * This function is used to enter value in a field
	 * @param locatorType
	 * @param Locator
	 * @param inputValue
	 * @return
	 */
	public boolean enterData(String locatorType, String Locator, String inputValue){
		try{
			element(locatorType,Locator).sendKeys(inputValue);
		}catch (NoSuchElementException ne){
			return false;
		}catch (Exception e) {
			return false;
		} 
		return true;
	}

	/**
	 * This function helps to navigate URL directly
	 * @param url
	 * @return
	 */
	public boolean navigate(String url){
		try{
			driver.navigate().to(url);
		}catch (NoSuchElementException ne){
			return false;
		}catch (Exception e) {
			return false;
		} 
		return true;
	}

	/**
	 * This will return the driver
	 * @return
	 */
	public WebDriver getDriver(){
		return driver;

	}

	/**
	 * This will help to identify locator is present on the page or not
	 * @param locatorType
	 * @param Locator
	 * @return
	 */
	public boolean elementPresent(String locatorType, String Locator){
		try{
			element(locatorType,Locator);
		}catch (NoSuchElementException ne){
			return false;
		}catch (Exception e) {
			return false;
		} 
		return true;
	}

	public WebElement element(String LocatorType, String Locator){
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)							
				.withTimeout(Duration.ofSeconds(60)) 			
				.pollingEvery(Duration.ofSeconds(5)) 			
				.ignoring(NoSuchElementException.class);
		
		
		WebElement ele=null;
		switch(LocatorType){
		case("id"):
			ele=driver.findElement(By.id(Locator));
		break;

		case("className"):
			ele=driver.findElement(By.className(Locator));
		break;

		case("xpath"):
			ele=driver.findElement(By.xpath(Locator));
		break;

		case("name"):
			ele=driver.findElement(By.name(Locator));
		break;

		case("linkText"):
			ele=driver.findElement(By.linkText(Locator));
		break;
		case("tagName"):
			ele=driver.findElement(By.tagName(Locator));
		break;
		}

		return ele;

	}

}