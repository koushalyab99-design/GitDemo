package actionsDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); // global
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@class='a-button-text']")).click();
		
		
		// move to specific element
		Actions a = new Actions(driver);
		WebElement signIn = driver.findElement(By.xpath("//div[@class='nav-div']/a[@class='nav-a nav-a-2   nav-progressive-attribute']"));
		a.moveToElement(driver.findElement(By.xpath("//div[@class='nav-div']/a[@class='nav-a nav-a-2   nav-progressive-attribute']"))).build().perform();
		
		// sendkeys in capital letter
		WebElement cap = driver.findElement(By.id("twotabsearchtextbox"));
		a.moveToElement(cap).click().keyDown(Keys.SHIFT).sendKeys("google pixel").build().perform();
		
		cap.clear();
		
		//double click
		a.moveToElement(cap).click().keyDown(Keys.SHIFT).sendKeys("google pixel").doubleClick().build().perform();
		a.moveToElement(signIn).contextClick().build().perform();
		

	}

}
