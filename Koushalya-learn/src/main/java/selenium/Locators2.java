package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locators2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); // global
		String Username = "Koushalya";
		 driver.get("https://www.rahulshettyacademy.com/locatorspractice/");
		 driver.findElement(By.id("inputUsername")).sendKeys(Username);
		 driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		 driver.findElement(By.name("chkboxOne")).click();
		 driver.findElement(By.name("chkboxTwo")).click();
		 driver.findElement(By.className("signInBtn")).click();
		 Thread.sleep(2000);
		 String LoginMessage = driver.findElement(By.xpath("//div/p")).getText();
		 System.out.println(LoginMessage);
		// Assertion (actual,expected)
		 Assert.assertEquals(LoginMessage, "You are successfully logged in.");
		 String Username1 = driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText();
         System.out.println(Username1);
		 Assert.assertEquals(Username1, "Hello "+ Username+",");
		 
		 driver.findElement(By.xpath("//button[text()='Log Out']")).click();
		 driver.close();
	}

}
