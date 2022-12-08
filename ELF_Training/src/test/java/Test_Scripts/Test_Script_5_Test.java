package Test_Scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test_Script_5_Test {
	
	
	public WebDriver driver;
	@Test
	public void testacript() {
	
	
	System.setProperty("webdriver.chrome.driver","./driver/Chromedriver.exe");
	
	 driver=new ChromeDriver();
	 
	
	driver.get("https://www.suzukimotorcycle.co.in/");
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	driver.quit();
}
}


