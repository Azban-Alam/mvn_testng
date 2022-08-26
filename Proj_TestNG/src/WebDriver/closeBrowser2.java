package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class closeBrowser2 {
	@Test
	public void f() {

		System.setProperty("webdriver.chrome.driver",
				"E:/Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.co.in");

		driver.close();

		// Close the current window, quitting the browser if it's the last
		// window currently open.
	}
}
