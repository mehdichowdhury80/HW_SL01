package pages;

import java.security.PublicKey;

import javax.security.auth.login.LoginContext;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v113.tethering.Tethering;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public WebDriver driver;

	public HomePage(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "cms-homepage-header-logo-unauth")
	WebElement logo;

	@FindBy(name = "user-d")
	WebElement userId;

	@FindBy(name = "pass-d")
	WebElement passWord;

	@FindBy(id = "cms-login-submit")
	WebElement logInButton;
	
	@FindBy(id = "cms-close-subscribe")
	WebElement close;
	
	@FindBy(id= "cms-forgot-userid")
	WebElement forgotUserId;
	
	@FindBy(name = "cms-forgotid-firstName")
	WebElement enterFirstNam;
	
	@FindBy(name = "cms-forgotid-lastName")
	WebElement enterLastNam;

	public void clickLogo() throws InterruptedException {
		logo.click();
		Thread.sleep(3000);

	}

	public void clickUserId() throws InterruptedException {
		userId.click();
		Thread.sleep(3000);
	}

	public void inputTextUserIdField() throws InterruptedException {
		userId.sendKeys("Mehdi");
		Thread.sleep(5000);
	}

	public void clickPassword() throws InterruptedException {
		passWord.click();
		Thread.sleep(3000);
	}
	
	public void inputTextPassword() throws InterruptedException {
		passWord.sendKeys("parse reeeeeee");
		Thread.sleep(3000);
	}

	public void clickLogInButton() throws InterruptedException {
		logInButton.click();
		Thread.sleep(3000);
	}
	public void clickCloseButton() throws InterruptedException {
		close.click();
		Thread.sleep(3000);
	}
	public void forgotUserId() throws InterruptedException {
		forgotUserId.click();
		Thread.sleep(3000);
	}
	public void clickEnterFirstName() throws InterruptedException {
		enterFirstNam.click();
		Thread.sleep(3000);
		enterFirstNam.sendKeys("Mehdi");
		Thread.sleep(3000);
		
	}
	public void clickEnterLastName() throws InterruptedException {
		enterLastNam.click();
		Thread.sleep(3000);
		enterLastNam.sendKeys("Bokth");
		Thread.sleep(3000);
	}
	

}
