package mavenn;

import org.testng.annotations.Test;

import com.github.dockerjava.api.model.Link;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class Orangeex1 {
  WebDriver driver;
  
	@BeforeTest
  public void beforeTest() {
		WebDriverManager.chromedriver().setup();
	 	driver=new ChromeDriver();;
		driver.get("https://opensource-demo.orangehrmlive.com/");
	 	//driver.get("https:www.google.com");
  }
 
  
  @Test
  public void f() throws InterruptedException {
	  driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	  driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(3000);
	List<WebElement> link =driver.findElements(By.tagName("a"));
		System.out.println("total number of links"+link.size());
		/*for (int i=0; i<link.size(); i++)
		{
			System.out.println(link.get(i).getText());
		}*/
		//for enhanced loop
		/*for (WebElement e:link)
		{
			String eachlink= e.getText();
			System.out.println(eachlink);
		}*/
		//driver.findElement(By.partialLinkText("Welcome")).click();
		//Thread.sleep(3000);
		//driver.findElement(By.linkText(""Logout")).click();
		driver.findElement(By.linkText("PIM")).click();
		//driver.navigate().back();
		//driver.navigate().forward();
		//driver.navigate().refresh();
		//driver.navigate().to("https://www.google.co.in/");
		Actions act= new Actions(driver);
		WebElement cllink = driver.findElement(By.linkText("configuration"));
		act.moveToElement(cllink).build().perform();
		act.sendKeys(Keys.ARROW_DOWN).build().perform();
		act.sendKeys(Keys.ARROW_DOWN).build().perform();
		act.sendKeys(Keys.ARROW_DOWN).build().perform();
		act.sendKeys(Keys.RETURN).build().perform();
		
	  
  }
 
@Test(enabled=false)
  public void testcase2() throws InterruptedException
  {
	  driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	  driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(3000);
		Actions actt= new Actions(driver);
		actt.sendKeys(Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.RETURN);
  }
  
  @Test(enabled=false)
  public void testcase3() throws InterruptedException
  {
	  WebElement Linkk= driver.findElement(By.linkText("Gmail"));
		 Thread.sleep(3000);
		 Actions acttt= new Actions(driver);
		 acttt.contextClick(Linkk).build().perform();
		 //actt.sendKeys(Keys.ARROW_DOWN).build().perform();
		 //actt.sendKeys(Keys.ENTER).build().perform();
		   
  }
  
  @AfterTest
  public void afterTest() throws InterruptedException 
  {
	 
  }

}
