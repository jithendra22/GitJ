package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Rediffloginpage1 {

	WebDriver driver;

	public Rediffloginpage1(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void Rediffloginpage(WebDriver driver) {
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = ".//*[@id='login1']")
	WebElement username;

	@FindBy(name = "passwd")
	WebElement Password;
system.out.println("jithendra");
	@FindBy(linkText = "Home")
	WebElement home;

	@FindBy(name = "proceed")
	WebElement go;

	public WebElement Emaild() {
		return username;
	}

	public WebElement Password() {
		return Password;
	}

	public WebElement Home() {
		return home;
	}

}
