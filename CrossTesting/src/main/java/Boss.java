import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Boss

{
WebDriver dr;
@Before
public void startBrowser() throws InterruptedException
{
   String s =System.getProperty("Browser");
   
   if(s.equals("f"))
   {
	   dr = new FirefoxDriver();
	   dr.get("http://www.cnn.com/");
	   dr.manage().window().maximize();
	   Thread.sleep(4000);
   }
   
   else if (s.equals("c"))
   {
	System.setProperty("webdriver.chrome.driver", "/Users/phugelzensherpa/Documents/workspace/CrossTesting");
	dr = new ChromeDriver(); 
	dr.manage().window().maximize();
	dr.get("http://www.cnn.com/");
   }
   else if(s.equals("ie"))
   {
	  System.setProperty("webdriver.ie.driver", "/Users/phugelzensherpa/Documents/workspace/CrossTesting");
	   dr=new InternetExplorerDriver();
	   dr.manage().window().maximize();	   
	   dr.get("http://www.cnn.com/");
   }
   else
	   dr=new FirefoxDriver();
   dr.get("http://www.cnn.com/");
   
 
}
	
@Test
public void test01()
{
	
}


}
