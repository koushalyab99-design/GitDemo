package waits;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitOne {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2)); // global
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();

		// String product ="Cauliflower - 1 Kg";

        //driver.findElement(By.xpath("//div/h4[text()='"+product+"']/following-sibling::div/button[text()='ADD TO CART']")).click() ;

		// iterate through web elements

		String[] itemsinCart = { "Tomato", "Beans", "Carrot", "Brinjal", "Nuts Mixture" };
		List Cart = Arrays.asList(itemsinCart);
		System.out.println(Cart);
		// convert to arraylist
		//WaitOne wo = new WaitOne();
		addToCart(driver, Cart);
		
		driver.findElement(By.xpath("//img[@alt='Cart']")).click();
		driver.findElement(By.xpath("//div[@class='action-block']/button[text()='PROCEED TO CHECKOUT']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter promo code']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//button[@class='promoBtn']")).click();
		
		//explicit wait - applies to specific element
		WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(5));
		wdw.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='promoInfo']")));
		System.out.println(driver.findElement(By.xpath("//span[@class='promoInfo']")).getText());
		

	}
	


	public static void addToCart(WebDriver driver, List Cart)
	{

		List<WebElement> WebElements = driver.findElements(By.cssSelector("h4.product-name"));

		for (int i = 0; i < WebElements.size(); i++) {
			String item[] = WebElements.get(i).getText().split("-");
			String formatteditem = item[0].trim();

			// System.out.println(item1[0]);
			if (Cart.contains(formatteditem)) {
				System.out.println(formatteditem);
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				// Thread.sleep(5000);
				// driver.findElement(By.xpath("//div/h4[text()='"+formatteditem+"']/following-sibling::div/button[text()='ADD
				// TO CART']")).click() ;
				// break;
			}

		}
	}

}
