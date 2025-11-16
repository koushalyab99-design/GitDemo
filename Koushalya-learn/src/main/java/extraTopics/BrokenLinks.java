package extraTopics;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class BrokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); // global
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		List <WebElement> Links =driver.findElements(By.cssSelector("li[class='gf-li'] a"));
		
		 SoftAssert a = new SoftAssert();
	   for(int i=0;i<Links.size();i++)
	    {
	    	String url = Links.get(i).getAttribute("href");
	    	System.out.println(i +" ."+ url);
	    	
	    	//String url = driver.findElement(By.cssSelector("a[href*='brokenlink']")).getAttribute("href");
            HttpURLConnection conn =(HttpURLConnection)new URL(Links.get(i).getAttribute("href")).openConnection();
             conn.setRequestMethod("HEAD");
             conn.connect();
             int responsecode = conn.getResponseCode();
             System.out.println("Response Code: "+responsecode);
             
             a.assertTrue(responsecode < 400, "it is a broken link");
				/*
				 * if(responsecode > 400) { System.out.println("it is a broken link"); }
				 */
	    }
		
		a.assertAll();

	}
}


