package dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class E2E {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); // global
		 driver.get("https://www.rahulshettyacademy.com/dropdownsPractise/");
		 driver.manage().window().maximize();
		 
		 //Autosuggest
		 WebElement we = driver.findElement(By.id("autosuggest"));
         Thread.sleep(3000); 
         AutosuggestiveDropdown asd = new AutosuggestiveDropdown();
         asd.SelectCountry(we , "ind","INDIA");
         
         //Departure and arrival city
         driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
         Thread.sleep(2000);
         WebElement we1=driver.findElement(By.xpath("//a[@value='CJB']"));
         System.out.println("Departure city: "+we1.getText());
         we1.click();
         WebElement we2=driver.findElement(By.xpath("(//a[@value='MAA'])[2]"));
         System.out.println("Departure city: "+we2.getText());
         we2.click();
         
         
         //Calendar
         //Thread.sleep(3000);
         WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
         //WebElement element1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='picker-first2']/button[@class='ui-datepicker-trigger']")));
        // element1.click();
         WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(@class,'ui-state-active')]")));
         element.click();
        // driver.findElement(By.xpath("//a[contains(@class,'ui-state-active')]")).click();
         
         
         
         
         
         Thread.sleep(3000);
		 //driver.findElement(By.xpath("//div[@class='picker-first2']/button[@class='ui-datepicker-trigger']")).click();
		 //Thread.sleep(3000);
		 //driver.findElement(By.xpath("//a[contains(@class,'ui-state-active')]")).click();
		// driver.get("https://www.rahulshettyacademy.com/dropdownsPractise/");
		 
		 //Currency currency
		 WebElement StaticDropdown1 = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		 StaticDropdown sd = new StaticDropdown();
		 sd.staticDropdown(StaticDropdown1);
		 
		 //Select adults
		 driver.findElement(By.id("divpaxinfo")).click();
			int i=1;
			while(i<=6)
			{
			driver.findElement(By.id("hrefIncAdt")).click();
			i++;
			}
			System.out.println("People selected: "+driver.findElement(By.id("divpaxinfo")).getText());
			
			driver.findElement(By.id("btnclosepaxoption")).click();
			
    		//select checkbox
			WebElement we3 =driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily"));
			we3.click();
			System.out.println("Checkbox selected: "+ driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_friendsandfamily']/following-sibling::label")).getText());
            
			
	}

}
