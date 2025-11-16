package actionsDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Framedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); // global
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		
		//switch to frame by id, webelement 
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		
		System.out.println(driver.findElement(By.id("draggable")).isEnabled());
		
		// drag and drop
		
		Actions a = new Actions(driver);
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement trgt = driver.findElement(By.id("droppable"));
		
		a.dragAndDrop(source, trgt).build().perform();
		
		//switch to normal window
		driver.switchTo().defaultContent();
		
	}

}
