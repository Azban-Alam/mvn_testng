package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class findElements {
	@Test
	public void f() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:/Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// open current url in browser
		driver.get("https://google.co.in");
		
		Thread.sleep(5000);
		
		// process to find single elements
		WebElement wele = driver.findElement(By.tagName("a"));
		wele.sendKeys("Selenium Testing");
		
		System.out.println(wele.getSize());
	
		driver.close();
		
	}
}
