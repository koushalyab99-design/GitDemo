package practiseExample;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CalendarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); // global
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.manage().window().maximize();
		
		String month = "1";
		String day = "3";
		String year = "2040";
		
		String[] dateSelect = {month,day,year};
		
		driver.findElement(By.xpath("//button[@class='react-date-picker__calendar-button react-date-picker__button']")).click();
		driver.findElement(By.xpath("//button[@class='react-calendar__navigation__label']")).click();
		String currentyear = driver.findElement(By.xpath("//span[@class='react-calendar__navigation__label__labelText react-calendar__navigation__label__labelText--from']")).getText();
		System.out.println(currentyear);
		
		WebElement currentyearlink = driver.findElement(By.xpath("//span[@class='react-calendar__navigation__label__labelText react-calendar__navigation__label__labelText--from']"));
		
		int i=1;
		while (i>0)
		{	
	    if (year.equalsIgnoreCase(currentyear))
	    {
		break; 
    	}
	    else
	    {
		 driver.findElement(By.xpath("//button[contains(text(),'›')]")).click();
		 currentyear = currentyearlink.getText();
	    }
	    i++;
		}
		String selectedmonth = driver.findElement(By.xpath("//div[@class='react-calendar__viewContainer']//button["+ month +"]/abbr")).getText();
		
		driver.findElement(By.xpath("//div[@class='react-calendar__viewContainer']//button["+ month +"]")).click();
		
		//String selectedmonth =driver.findElement(By.xpath("//div[@class='react-calendar__viewContainer']//button["+ month +"]")).getText();
		
		System.out.println(selectedmonth);
		driver.findElement(By.xpath("//abbr[@aria-label='"+selectedmonth+" "+day+","+" "+year+"']")).click();
		
		
		List<WebElement> elements= driver.findElements(By.cssSelector(".react-date-picker__inputGroup__input"));
	    
		for(int j =0; j<elements.size();j++)
		{
			System.out.println(elements.get(j).getAttribute("value"));
			Assert.assertEquals(elements.get(j).getAttribute("value"), dateSelect[j]);
		}
		


	}

}
