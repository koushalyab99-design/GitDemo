package dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); // global
		 driver.get("https://www.rahulshettyacademy.com/dropdownsPractise/");
		 driver.manage().window().maximize();
		 
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
         WebElement element1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='picker-first2']/button[@class='ui-datepicker-trigger']")));
         element1.click();
         WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(@class,'ui-state-active')]")));
         element.click();

	}

}
