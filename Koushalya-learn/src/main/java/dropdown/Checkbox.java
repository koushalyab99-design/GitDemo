package dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Checkbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); // global
		 driver.get("https://www.rahulshettyacademy.com/dropdownsPractise/");
		WebElement we =driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily"));
		//check assertion
		Assert.assertFalse(we.isSelected());
		//Assert.assertTrue(we.isSelected());
		//System.out.println(we.isSelected());
		we.click();
		Assert.assertTrue(we.isSelected());
		//Assert.assertFalse(we.isSelected());
		System.out.println(we.isSelected());
		//System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		Assert.assertEquals(driver.findElements(By.cssSelector("input[type='checkbox']")).size(), 6);
		List<WebElement> chbOptions=driver.findElements(By.xpath("//input[@type='checkbox']/following-sibling::label"));
		for (WebElement chboption:chbOptions)
		{
			System.out.println(chboption.getText());
		}
         Thread.sleep(3000); 
         
         

	}

	

}
