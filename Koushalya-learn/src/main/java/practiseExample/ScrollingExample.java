package practiseExample;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ScrollingExample {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); // global
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=1000");
		
		List <WebElement> tableno = driver.findElements(By.xpath("//div[@class='tableFixHead']/table/tbody/tr/td[4]"));
		int j=0;
		for(int i=0; i<tableno.size();i++)
		{
			j = j +Integer.parseInt(tableno.get(i).getText());
		}
		
		System.out.println("Actual sum of the numbers in table: "+j);
		
		String ExpectedNum=driver.findElement(By.xpath("//div[@class='totalAmount']")).getText().split(":")[1].trim();
		System.out.println("Expected sum of numbers: "+ExpectedNum);
		int expectednum= Integer.parseInt(ExpectedNum);
		Assert.assertEquals(j, expectednum);


}
}