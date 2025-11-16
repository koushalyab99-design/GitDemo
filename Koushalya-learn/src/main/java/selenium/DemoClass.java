package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.chrome.driver", "D://chromedrivers/chromedriver.exe");
		//if the above path is not given -> selenium manager will take care
		//WebDriverManager.chromedriver().setup();
		//difference btw diver.close and driver.quit 
		//driver.close -> only closes the current window
		//driver.quit -> closes all associated windows
		WebDriver driver = new ChromeDriver();
		 driver.get("https://www.rahulshettyacademy.com/locatorspractice/");
		 //password rahulshettyacademy
		 System.out.println("Tab title: "+ driver.getTitle());
		 System.out.println("current URL: "+driver.getCurrentUrl());
		//Webdriver is an interface - created object for chromedriver -that uses method from webdriver 
		//driver.close();

	}

}