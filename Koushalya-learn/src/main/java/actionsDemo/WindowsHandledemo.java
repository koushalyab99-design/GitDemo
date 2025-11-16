package actionsDemo;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandledemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); // global
		driver.get("https://www.rahulshettyacademy.com/loginpagePractise/");
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector(".blinkingText")).click();
		
		// get window information and store it in set
		
		Set<String> windows= driver.getWindowHandles();
		
		// iterate to get the window information
		Iterator<String> i=windows.iterator();
		
		// .next to store the first index for parentID
		String parentID = i.next();
		
		// .next to store the second index in childID
		String childID = i.next();
		
		//switch to child window
		driver.switchTo().window(childID);
		
		String userID =driver.findElement(By.xpath("//p[@class='im-para red']/strong/a")).getText();
		
		driver.switchTo().window(parentID);
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(userID);
		
		
		

	}

}
