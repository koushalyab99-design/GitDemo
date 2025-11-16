package selenium;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locators {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); // global
		 driver.get("https://www.rahulshettyacademy.com/locatorspractice/");
		 driver.findElement(By.id("inputUsername")).sendKeys("Koushalya");
		 driver.findElement(By.name("inputPassword")).sendKeys("123456");
		 driver.findElement(By.name("chkboxOne")).click();
		 driver.findElement(By.name("chkboxTwo")).click();
		 driver.findElement(By.className("signInBtn")).click();
		 System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		 driver.findElement(By.linkText("Forgot your password?")).click();
		 
		 Locators loc =new Locators();
		 String Password =loc.getPassword(driver);
		 
	    driver.findElement(By.xpath("//button[normalize-space()='Go to Login']")).click();
	    driver.findElement(By.id("inputUsername")).sendKeys("Koushalya");
		 driver.findElement(By.name("inputPassword")).sendKeys(Password);
		 driver.findElement(By.className("signInBtn")).click();
		 Thread.sleep(2000);
		 String LoginMessage = driver.findElement(By.xpath("//div/p")).getText();
		 System.out.println(LoginMessage);
		// Assertion (actual,expected)
		 Assert.assertEquals(LoginMessage, "You are successfully logged in.");
		
}
	
	public String getPassword(WebDriver driver)
	{
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Koushalya");
		 driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("koushalya@gmail.com");
		 driver.findElement(By.xpath("(//input[@type='text'])[2]") ).clear();
		 driver.findElement(By.cssSelector("input[placeholder='Email']:nth-child(3)")).sendKeys("koushalya@gmail.com");
		 driver.findElement(By.xpath("//form/input[3]")).sendKeys("6374370430");
		 driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
		 String newPass= driver.findElement(By.xpath("//p[@class='infoMsg']")).getText();
			 System.out.println(newPass); 
			 String[] split =newPass.split("'"); 
			 String newPass1= split[1];
			 System.out.println(newPass1);
			 return newPass1;
	}

}
