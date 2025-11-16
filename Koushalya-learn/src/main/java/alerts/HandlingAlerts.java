package alerts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class HandlingAlerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Koushalya";

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); // global
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//div/fieldset/input[@id='name']")).sendKeys(name);
		driver.findElement(By.xpath("//div/fieldset/input[@id='alertbtn']")).click();
		String alert = driver.switchTo().alert().getText();
		System.out.println(alert);
		if (alert.equalsIgnoreCase("Hello " + name + ", share this practice page and share your knowledge")) {
			System.out.println("Pass");
			Assert.assertTrue(true);

		} else {
			System.out.println("fail");
		}
		driver.switchTo().alert().accept();

		driver.findElement(By.xpath("//div/fieldset/input[@id='name']")).sendKeys(name);
		driver.findElement(By.xpath("//div/fieldset/input[@id='confirmbtn']")).click();
		String Confirmalert = driver.switchTo().alert().getText();
		System.out.println(Confirmalert);
		driver.switchTo().alert().accept();
	}

}
