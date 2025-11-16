package differentFeatures;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class InvokingMultipleTabsWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.setAcceptInsecureCerts(true);
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); // global
		driver.get("http://www.rahulshettyacademy.com/angularpractice/");
		driver.manage().window().maximize();
		
		
		//switch to new tab
		driver.switchTo().newWindow(WindowType.WINDOW);
		Set<String> wh= driver.getWindowHandles();
		Iterator<String> i =wh.iterator();
		String parentId = i.next();
		String childId = i.next();
		
		driver.switchTo().window(childId);
		
		driver.get("http://www.rahulshettyacademy.com/");
		
		String name =driver.findElement(By.xpath("//a[contains(text(),'All-Access Membership-Complete Access to 25+ Cours')]")).getText();
        
		driver.switchTo().window(parentId);
		
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys(name);
		
	}

}
