package dropdown;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutosuggestiveDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); // global
		 driver.get("https://www.rahulshettyacademy.com/dropdownsPractise/");
		 WebElement we = driver.findElement(By.id("autosuggest"));
         Thread.sleep(3000); 
         AutosuggestiveDropdown asd = new AutosuggestiveDropdown();
         asd.SelectCountry(we , "Br","Brunei Darussalam");
         
        
         
         
	}
	
	public void SelectCountry (WebElement we , String S1, String S2)
     {
	 we.sendKeys(S1);
     List<WebElement> options = we.findElements(By.xpath("//li[@class='ui-menu-item']/a"));
     for (WebElement option : options) {
    	
         if(option.getText().equalsIgnoreCase(S2))
         {
        	 System.out.println("Country selected: "+option.getText());
        	 option.click();
        	 
         }
         
     
     }
     
     

}
}
