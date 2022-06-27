package mailtest;

import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import mailpages.HomePage;
import mailpages.LoginPage;
import mailpages.SocialPage;

public class Tests {

	WebDriver driver;
	Date date = new Date();
	String FullTitle = "Task" + " , " + date.toString();

	@BeforeClass
	public void beforeClass() {

		System.setProperty("webdriver.chrome.driver", "E:/Selenium/Proj_TestNG/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://mail.google.com//");
		driver.manage().window().maximize();

	}

	@Test(dataProvider = "DataProvider")
	public void Test_Login(String[] data) {

		LoginPage login = new LoginPage(driver);

		login.EnterMail(data[0]);
		login.PressNext();
		login.EnterPassword(data[1]);
		login.PressNext();

		System.out.println("Login Is Successful");

	}

	@Test(dataProvider = "DataProvider")
	public void Test_SendMail(String[] data) {

		HomePage Home = new HomePage(driver);

		Home.ClickCompose();
		Home.RecipientsMail(data[2]);
		Home.Subject(data[3]);
		Home.Boday(data[4]);
		Home.LabelAsSocial(data[5]);
		Home.ClickSend();

	}

	@Test(dataProvider = "DataProvider")
	public void SubjectBodyAndStarredEmail(String[] data) {

		SocialPage Socail = new SocialPage(driver);

		Socail.InboxClick();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Socail.SocialTabClick();
		Socail.VerifySubjectBodyAndStarredEmail(data[3], data[4]);

	}

	@DataProvider(name = "DataProvider")
	public String[][] dataProviderMethod() {

		String[][] data = new String[][] {

				{ "keepEmailID", "keepYourPassword", "ToEmailID", "EmailSubject", "Test Email Body", "Social" } };
		return data;

	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

}
