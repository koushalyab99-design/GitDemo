package selenium;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserActivities {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); // global
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		 driver.get("https://www.rahulshettyacademy.com/locatorspractice/");
		 Thread.sleep(5000);
		 driver.navigate().back();
		 Thread.sleep(5000);
		 driver.navigate().forward();
	}

}
