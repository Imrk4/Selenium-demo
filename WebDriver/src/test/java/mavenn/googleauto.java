package mavenn;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.asm.Advice.Enter;

import org.testng.annotations.BeforeTest;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class googleauto {
  WebDriver driver;
  @BeforeTest
  public void beforeTest() 
  {
	  WebDriverManager.chromedriver().setup();
	 	driver=new ChromeDriver();;
		//driver.get("https://opensource-demo.orangehrmlive.com/");
	 	//driver.get("https:www.google.com");
	 	//driver.get("https://demoqa.com/upload-download");
	 	//driver.get("https://demoqa.com/alerts");
	 	//driver.get("file:///C:/Users/USER/Downloads/table.html");
	 	//driver.get("https://demoqa.com/webtables");
	 	//driver.get("https://demoqa.com/buttons");
	 	//driver.get("https://www.google.com/maps");
	 	//driver.get("https://www.youtube.com/");
	 	driver.navigate().to("https://demoqa.com/text-box");
	 	//driver.get("https://demoqa.com/checkbox");
	 	driver.manage().window().maximize();
  }
  @Test(enabled=false)
  
  public void f() throws InterruptedException, AWTException 
  {
	  WebElement Linkk= driver.findElement(By.linkText("Gmail"));
		 Thread.sleep(3000);
		 Actions acttt= new Actions(driver);
		 acttt.contextClick(Linkk).build().perform();
		 Robot rbt=new Robot();
		 rbt.keyPress(KeyEvent.VK_DOWN);
		 rbt.keyPress(KeyEvent.VK_DOWN);
		 Thread.sleep(2000);
		 rbt.keyPress(KeyEvent.VK_UP);
		 rbt.keyPress(KeyEvent.VK_ENTER);
		 Thread.sleep(300);
		 String Title= driver.getTitle();
		 System.out.println(Title);
		 
		 rbt.keyPress(KeyEvent.VK_CONTROL);
		 rbt.keyPress(KeyEvent.VK_TAB);
		 Thread.sleep(300);
		 String Title1= driver.getTitle();
		 System.out.println(Title1);
		 
		 
		 /*acttt.keyDown(Keys.CONTROL).sendKeys(Keys.TAB).build().perform();
		 Thread.sleep(3000);
		 String Title= driver.getTitle();
		 System.out.println(Title);
		 acttt.keyDown(Keys.CONTROL).sendKeys(Keys.TAB).build().perform();
		 String Title1= driver.getTitle();
		 System.out.println(Title1);*/
		 

		
		 
		 
		 
		 
  }
  
  @Test(enabled=false)
  public void testcase2() throws InterruptedException
  {
	  driver.findElement(By.id("alertButton")).click();
	  Alert alt= driver.switchTo().alert();
	  System.out.println(alt.getText());
	  Thread.sleep(3000);
	  alt.accept();
	  driver.findElement(By.id("confirmButton")).click();
	  Thread.sleep(3000);
	  alt.dismiss();
	  driver.findElement(By.id("promtButton")).click();
	  Thread.sleep(3000);
	  alt.sendKeys("rajkumar");
	  Thread.sleep(3000);
	  System.out.println(alt.getText());
	  alt.accept();
	  driver.findElement(By.id("timerAlertButton")).click();
	  WebDriverWait wt= new WebDriverWait(driver, 180);
	  wt.until(ExpectedConditions.alertIsPresent());
	  //Thread.sleep(7000);
	  alt.accept();
	  
	  
	  
	  
  }
@Test(enabled=false)
public void testcase3()
{
	String q=driver.findElement(By.xpath("//tbody/tr[1]/td[2]")).getText();
	System.out.println(q);
}
  
@Test(enabled=false)
public void testcase4() throws InterruptedException
{
	driver.findElement(By.name("search_query")).sendKeys("kannada songs");
	Thread.sleep(3000);
	driver.findElement(By.id("search-icon-legacy")).click();
	//Thread.sleep(5000);
	//driver.findElement(By.id("mouseover-overlay")).click();
	
	
	
	/* driver.findElement(By.xpath("//*[@id='hArJGc']")).click();
	 Thread.sleep(4000);
	 driver.findElement(By.xpath("//*[@tooltip='Choose starting point, or click on the map...']")).click();
	 Thread.sleep(4000);
	 driver.findElement(By.xpath("//*[@tooltip='Choose starting point, or click on the map...']")).sendKeys("bidar",Keys.ENTER);
	 driver.findElement(By.xpath("//*[@tooltip=\"Choose destination, or click on the map...\"]")).click();
	 Thread.sleep(4000);
	 driver.findElement(By.xpath("//*[@tooltip=\"Choose destination, or click on the map...\"]")).sendKeys("banglore",Keys.ENTER);*/
	//driver.findElement(By.id("hArJGc")).click();
	//driver.navigate().to("https://www.google.com/maps/dir///@21.125498,81.914063,5z");
	  //driver.findElement(By.xpath("//*[@class='tactile-searchbox-input']")).click();
	  //driver.findElement(By.className("tactile-searchbox-input")).sendKeys(Keys.ENTER);
	  //driver.findElement(By.className("tactile-searchbox-input")).sendKeys("Bengaluru");
	  
	  //driver.findElement(By.xpath("//*[@class='tactile-searchbox-input']")).sendKeys("bengaluru");
	 // Thread.sleep(2000);
	 //driver.findElement(By.xpath("//*[@class='tactile-searchbox-input']")).sendKeys(Keys.ENTER);
	  
	
	
	//String a=driver.findElement(By.xpath("//*[@class='ReactTable -striped -highlight']")).getText();
	
	//System.out.println(a);
	
	//WebElement a=driver.findElement(By.xpath("/*[contains(text(),'abhi@gmail.com')]//preceding-sibling::td[3]"));
	//System.out.println(a);
	///tbody/tr[2]/td[1]//following-sibling::td[3]
	//driver.findElement(By.xpath("//*[contains(text(),'Cierra')]//following-sibling::div[6]/div/span[2]"));
	
	
	
}
  @Test(enabled=false)
  public void testcaseclick5() throws InterruptedException
  {
	  WebElement a=driver.findElement(By.id("doubleClickBtn"));
	  Actions act= new Actions(driver);
	  act.moveToElement(a).doubleClick().build().perform();
	  
	  WebElement  b=driver.findElement(By.id("rightClickBtn"));
	  act.contextClick(b).build().perform();
	  
	  //Dynamic click
	   String dynamicid=driver.findElement(By.xpath("//*[text()='Click Me']")).getAttribute("id");
	   System.out.println(dynamicid);
	   WebElement click=driver.findElement(By.id(dynamicid));
	   act.moveToElement(click).click().build().perform();
	   
	  //driver.navigate().refresh();
	  //Thread.sleep(3000);
	  //String dynamicid1=driver.findElement(By.xpath("//*[text()='Click Me']")).getAttribute("id");
	  //System.out.println(dynamicid1);
	 // WebElement click=driver.findElement(By.id(dynamicid1));
	 // act.moveToElement(click).click().build().perform();
	  
	  
	  
	  
	  
	  
  }

  @Test
  public void Qapractice() throws InterruptedException
  {
	  driver.findElement(By.id("userName")).sendKeys("Rajkumar");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@class='mr-sm-2 form-control']")).sendKeys("Rajkumarhalburge@gmail.com");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@placeholder='Current Address']")).sendKeys("#34 halburge kardiyal");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id='permanentAddress']")).sendKeys("same as current");
	  Thread.sleep(2000);
	  driver.findElement(By.id("submit")).click();
	  Thread.sleep(2000);
  }
  @Test(enabled=false)
  public void checkbox() throws InterruptedException
  {
	  //iver.findElement(By.xpath("//*[@class='rct-checkbox']")).click();
	  driver.findElement(By.xpath("//*[@title='Expand all']")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@title='Collapse all']")).click();
  }
  
  
  
  @AfterTest
  public void afterTest() throws InterruptedException {
	  Thread.sleep(11000);
	  driver.close();
	 // driver.findElement(By.id("uploadFile")).sendKeys("C://Users//USER//Documents//Zoom");
	  
  }

}
