package mailpages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SocialPage {
	WebDriver SocialPage;
	WebDriverWait wait;

	By InboxLocator = By.xpath("//a[contains(text(),'Inbox')]");
	By SocialTabLocator = By.xpath("//div[@aria-label='Social']");
	By EmailSubjectLocator = By.xpath("//*[@class='yW']/span");
	By PasswordLocator = By.xpath("//input[@name='password']");
	By StarredLocator = By.xpath("//div[@class='zd bi4']/span");
	By EmailBodyLocator = By.xpath("//div[@class='a3s aiL ']");

	public SocialPage(WebDriver driver) {
		SocialPage = driver;
	}

	public void InboxClick() {

		SocialPage.findElement(InboxLocator).click();

	}

	public void SocialTabClick() {

		SocialPage.findElement(SocialTabLocator).click();

	}

	public void VerifySubjectBodyAndStarredEmail(String EmailSubject, String EmailBodyText) {
		// wait = new WebDriverWait(Logindriver,15);
		// wait.until(ExpectedConditions.visibilityOfElementLocated(PasswordLocator));

		List<WebElement> a = SocialPage.findElements(EmailSubjectLocator);
		System.out.println(a.size());
		for (int i = 0; i < a.size(); i++) {
			System.out.println(a.get(i).getText());
			if (a.get(i).getText().equals("EmailSubject")) {

				System.out.println("Subject Of Email Verified");

				// if u want to click on the specific mail then here u can pass it
				a.get(i).click();

				List<WebElement> b = SocialPage.findElements(EmailBodyLocator);
				System.out.println(b.size());
				for (int j = 0; j < b.size(); j++) {
					System.out.println(b.get(j).getText());
					if (a.get(j).getText().equals("EmailBodyText")) {

						System.out.println("Body Of Email Verified");

						SocialPage.findElement(StarredLocator).click();
						System.out.println("Email Starred Successfully");

					}
				}
			}
		}

	}

	

}
