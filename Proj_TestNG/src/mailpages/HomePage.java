package mailpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

	WebDriver Homedriver;
	WebDriverWait wait;

	// locators
	By ComposeLocator = By.xpath("//div[@class='z0']//div[@role='button']");
	By SendToLocator = By.xpath("//textarea[@name='to']");
	By SubjectLocator = By.xpath("//input[@name='subjectbox']");
	By BodyLocator = By.xpath("//div[@aria-label='Message Body']");
	By SendButtonLocator = By.xpath("//div[@class='dC']/div[contains(text(),'Send')]");
	By LabelAsSocialLocator = By.xpath("//td[@class='gU az5']/div//div[@aria-label='More options']");
	By LabelTextLocator = By.xpath("//div[@class='J-Ph Gi J-N']//div[contains(text(),'Label')]");
	By SearchTextLocator = By.xpath("//input[@aria-label='Label-as menu open']");
	By CheckBoxLocator = By.xpath("//div[@class='J-M agd jQjAxd aX1']//span/b[contains(text(),'Social')]");

	// constructor
	public HomePage(WebDriver driver) {
		Homedriver = driver;

	}

	public void ClickCompose() {

		Homedriver.findElement(ComposeLocator).click();
	}

	public void RecipientsMail(String Recipient) {

		Homedriver.findElement(SendToLocator).sendKeys(Recipient);
	}

	public void Subject(String FullTitle) {

		Homedriver.findElement(SubjectLocator).sendKeys(FullTitle);
	}

	public void Boday(String bodyText) {

		Homedriver.findElement(BodyLocator).sendKeys(bodyText);

	}

	public void LabelAsSocial(String labelAsSocial) {

		Homedriver.findElement(LabelAsSocialLocator).click();
		Homedriver.findElement(LabelTextLocator).click();
		Homedriver.findElement(SearchTextLocator).sendKeys(labelAsSocial);
		Homedriver.findElement(CheckBoxLocator).click();
	}

	public void ClickSend() {
		Homedriver.findElement(SendButtonLocator).click();
	}

}
