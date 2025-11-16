package dropdown;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); // global
		 driver.get("https://www.rahulshettyacademy.com/dropdownsPractise/");
		 WebElement StaticDropdown1 = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		 StaticDropdown sd = new StaticDropdown();
		 sd.staticDropdown(StaticDropdown1);
		 
		 //static dropdown  
		 

}
	public void staticDropdown(WebElement we)
	 {
	  Select dropdown = new Select(we);
	 // dropdown.selectByIndex(3);
	 // System.out.println(dropdown.getFirstSelectedOption().getText());
	  
	 // dropdown.selectByVisibleText("AED");
	//  System.out.println(dropdown.getFirstSelectedOption().getText());
	  
	  dropdown.selectByValue("USD");
	  System.out.println("Selected Currency: " +dropdown.getFirstSelectedOption().getText());
	  
      
}
	

	
}

