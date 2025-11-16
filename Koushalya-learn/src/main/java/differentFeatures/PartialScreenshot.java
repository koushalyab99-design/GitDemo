package differentFeatures;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.apache.commons.io.FileUtils;

public class PartialScreenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		ChromeOptions options = new ChromeOptions();
		options.setAcceptInsecureCerts(true);
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); // global
		driver.get("http://www.rahulshettyacademy.com/angularpractice/");
		driver.manage().window().maximize();
		WebElement name = driver.findElement(By.xpath("//input[@name='name']"));
		name.sendKeys("Core Java");
		File file= name.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(file, new File("Partial.png"));

	}

}
