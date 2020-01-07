package testcases;

import objectrepository.RediffLoginpage;
import objectrepository.Rediffloginpage;
import objectrepository.Rediffloginpage1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Loginapplication {
// Login page class implemented in normal page object pattern style
	
	// Home page class implemented in Page object factory methdos
	@Test
	public <RediffHomepage> void Login()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		Rediffloginpage1 rd=new Rediffloginpage1(driver);
		rd.Emaild().sendKeys("hello");
		rd.Password().sendKeys("hello");
		//rd.submit().click();
		rd.Home().click();
		RediffHomepage rh=new RediffHomepage(driver);
		rh.Search().sendKeys("rediff");
		 rh.Submit().click();
		
		
		
		
		
		
		
		
		
		
	
		
	}
	
	
	
}

