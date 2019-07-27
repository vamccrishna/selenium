package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class mouse {
ChromeDriver driver;
@BeforeTest
public void data(){
System.setProperty("webdriver.chrome.driver", "C:\\Users\\NaveenKumar\\Downloads\\chromedriver_win32\\chromedriver.exe");
driver=new ChromeDriver();
//driver.get("https://www.google.com/");
driver.get("https://www.flipkart.com/");
}
@Test
	public void dat123(){
	WebElement men=driver.findElementByLinkText("Gmail");
	Actions ac=new Actions(driver);
	ac.moveToElement(men).build().perform();
}}

