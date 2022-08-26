package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class openUrl3 {
	@Test
	public void f() {
		
		System.setProperty("webdriver.chrome.driver", "E:/Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// open current url in browser
		driver.get("https://google.co.in");
		
		// alternative method to open url in browser
		driver.navigate().to("https://w3schools.com");
	}
}
