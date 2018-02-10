package com.keerti.hybrid_frame_work;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GenericKeywords {
	public WebDriver driver;
	public Properties prop;
	
	public void openBrowser(String broserType) {
		if (broserType.equals("Firefox")) {
			driver = new FirefoxDriver();
			
		}else if (broserType.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\SeleniumEnvironment SetUP\\EXEs\\chromedriver.exe");
			driver= new ChromeDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	public void navigate(String url) {
		driver.get(url);
		
	}
	
	public void click(String locator) {
		
	}
	
	public void input(String locator,String data) {
		
	}
	
	public void verifyText(String locator,String expectetd) {
		
	}
	
}


