package dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); // global
		 driver.get("https://www.rahulshettyacademy.com/dropdownsPractise/");
		 driver.manage().window().maximize();
         driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
         Thread.sleep(2000);
         driver.findElement(By.xpath("//a[@value='CJB']")).click();
         driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
         //instead of index we can use parent child --> //div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']
	}

}
