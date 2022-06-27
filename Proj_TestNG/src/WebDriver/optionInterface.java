package WebDriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class optionInterface {
	@Test
	public void f() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:/Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// open current url in browser
		driver.get("https://google.co.in");
		
		String x = driver.manage().getClass().getSimpleName();
		
		System.out.println("Name :"+x);
		
	}
}
