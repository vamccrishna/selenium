package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Hrmlogin {
	//FirefoxDriver driver;
	static ChromeDriver driver;

	@BeforeTest
	public void open(){
		//driver=new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\NaveenKumar\\Downloads\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com");
	}
	@Test
	public static void verifylogin(String u,String p){
		driver.findElementById("txtUsername").clear();
		//driver.findElementById("txtUsername").sendKeys("admin");
		driver.findElementById("txtUsername").sendKeys(u);
		driver.findElementById("txtPassword").clear();
		//driver.findElementById("txtPassword").sendKeys("admin123");
		driver.findElementById("txtPassword").sendKeys(p);
		driver.findElementById("btnLogin").click();
		Sleeper.sleepTightInSeconds(5);
}
	@Test(priority=1)
	public void loginstatus(){
		//String actual=driver.findElementByLinkText("Welcome Admin").getText();
		//String expected="Welcome Admin";
		 //Assert.assertEquals(actual, expected);
		String str=driver.findElementByLinkText("Welcome Admin").getText();
		if(str.contains("Welcome")){
			System.out.println("pass");}
		
		
	else{
		System.out.println("fail");}
	
		 
	}
	@Test(priority=2)
	public void logout(){
		driver.findElementByLinkText("Welcome Admin").click();
		Sleeper.sleepTightInSeconds(5);
		driver.findElementByLinkText("Logout").click();
		Sleeper.sleepTightInSeconds(5);
	}
	@AfterTest
	public void close(){
		driver.close();
		
		
	}
	

}
