package dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class EnabledOrDisabled {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); // global
		 driver.get("https://www.rahulshettyacademy.com/dropdownsPractise/");
		 driver.manage().window().maximize();
		// System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled()); --> not working
		 driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		 //System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());--> not working
		 if(driver.findElement(By.id("Div1")).getDomAttribute("style").contains("1"))
		 {
			 Assert.assertTrue(true);
			 System.out.println("element is enabled");
		 }
		 else
		 {
			 System.out.println("element is disabled");
			 Assert.assertFalse(false);
			
		 }

	}

}
