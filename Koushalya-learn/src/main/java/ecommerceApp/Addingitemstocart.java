package ecommerceApp;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Addingitemstocart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); // global
		 driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		 driver.manage().window().maximize();
		 
		 
//		 String product ="Cauliflower - 1 Kg";
//		 
//		 driver.findElement(By.xpath("//div/h4[text()='"+product+"']/following-sibling::div/button[text()='ADD TO CART']")).click() ;

		 
		 // iterate through web elements
		 
		 String[] itemsinCart= {"Tomato","Beans","Carrot","Brinjal","Nuts Mixture"};
		 
		 //convert to arraylist
		List Cart =Arrays.asList(itemsinCart);
		System.out.println(Cart);
		 
		 
		 List<WebElement> WebElements= driver.findElements(By.cssSelector("h4.product-name"));
		 
		 for( int i=0;i<WebElements.size();i++ )
		 {
			 String item[]= WebElements.get(i).getText().split("-");
			 String formatteditem = item[0].trim();
			
			 //System.out.println(item1[0]);
			 if(Cart.contains(formatteditem))
			 {
				 System.out.println(formatteditem);
				 driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				// Thread.sleep(5000);
				 //driver.findElement(By.xpath("//div/h4[text()='"+formatteditem+"']/following-sibling::div/button[text()='ADD TO CART']")).click() ;
				  //break;
			 }
			
		 }
		 
		 
		 
		 
	}

}
