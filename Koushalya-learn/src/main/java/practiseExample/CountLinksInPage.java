package practiseExample;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountLinksInPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); // global
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
        
		List <WebElement> Links =driver.findElements(By.tagName("a"));
		System.out.println("Number of links in entire page: " +Links.size());
		
		//Limiting webdriver scope
		WebElement footdriver = driver.findElement(By.id("gf-BIG"));
		
		System.out.println("Number of links in footer: "+footdriver.findElements(By.tagName("a")).size());
		
		// Limiting webdriver scope to a column
		
		WebElement columndriver = footdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		
		int Size = columndriver.findElements(By.tagName("a")).size();
		System.out.println("Number of links in first column: "+ Size);
		int i=1;
		while(i<Size)
		{
			String ClickOnKeys =Keys.chord(Keys.CONTROL,Keys.ENTER);
			columndriver.findElements(By.tagName("a")).get(i).sendKeys(ClickOnKeys);
			i++;
		}
			
		Set <String> wh = driver.getWindowHandles();
	    Iterator	j = wh.iterator();
		   
		   
		   while(j.hasNext())
		   {
			   driver.switchTo().window((String) j.next());
			   System.out.println(driver.getTitle());
		   }
		   
		   driver.switchTo().defaultContent();
					
			
		}
		

}

