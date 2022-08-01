package mavenn;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

@Test
public class Workingwithelements1 {

	WebDriver driver;
	 @BeforeTest
	  public void beforeTest()
	 {
		 	WebDriverManager.chromedriver().setup();
		 	driver=new ChromeDriver();
			//driver.get("https://opensource-demo.orangehrmlive.com/");
		 	driver.get("https://demo.guru99.com/test/newtours/");
			driver.manage().window().maximize();
			
			
			/*String Title=driver.getTitle();
			String Url=driver.getCurrentUrl();
			System.out.println(Title+"  "+Url);
			Assert.assertEquals(Title,"OrangeHRM");
			Assert.assertEquals(Url,"https://opensource-demo.orangehrmlive.com/");*/
	  }
	public void f() throws InterruptedException
{
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		String username=driver.findElement(By.id("txtUsername")).getAttribute("value");
		System.out.println(username);
		Assert.assertEquals(username,"Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		String password=driver.findElement(By.id("txtPassword")).getAttribute("value");
		System.out.println(password);
		Assert.assertEquals(password,"admin123");
		//Assert.assertEquals("admin123","admin123");
		String login=driver.findElement(By.id("btnLogin")).getAttribute("value");
		System.out.println(login);
		driver.findElement(By.id("btnLogin")).click();
		//Assert.assertEquals(login,"LOGIN");
		Thread.sleep(3000);
		String Title=driver.getTitle();
		if (Title.equalsIgnoreCase(Title))
		{
		driver.findElement(By.id("welcome")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[3]/a")).click();
		}
		 else {
			System.out.println("it is not same");
		}
}
	public void testcase1() throws InterruptedException
	{
		WebElement UN = driver.findElement(By.xpath("//*[@name='userName']"));
		if (UN.isEnabled())
		{
			UN.clear();
			UN.sendKeys("sunil");
		}
		if(UN.isDisplayed())
		{
			System.out.println(UN.getAttribute("value"));
		}
		else {
			System.out.println("Password tex feild is disabled");
		}
		WebElement PS= driver.findElement(By.xpath("//*[@name='password']"));
		if (PS.isEnabled())
		{
			PS.clear();
			PS.sendKeys("sunil");
		}
		if(PS.isDisplayed())
		{
			System.out.println(PS.getAttribute("value"));
			
		}
		else{
			System.out.println("enter valid user name");
		}
		WebElement SB=driver.findElement(By.xpath("//*[@name='submit']"));
		if (SB.isEnabled());
		{
			SB.click();
			
		}
		String hd=driver.findElement(By.xpath("//tbody/tr/td/h3")).getText();
		Assert.assertEquals("Login Successfully", hd);
		driver.findElement(By.linkText("Flights")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@name='tripType' and @value='oneway']")).click();
		WebElement gg= driver.findElement(By.name("passCount"));
		Select s1= new Select(gg);
		s1.selectByIndex(2);
		Thread.sleep(3000);
		s1.selectByValue("2");
		Thread.sleep(3000);
		WebElement dp=driver.findElement(By.name("fromPort"));
		Select sel3= new Select(dp);
		List<WebElement> values3= sel3.getOptions();
		System.out.println(values3.size());
		for (int i=0; i<values3.size(); i++)
		{
			System.out.println(values3.get(i).getText());
		}
		sel3.selectByIndex(5);
		WebElement free=sel3.getFirstSelectedOption();
		System.out.println(free.getAttribute("value"));
		
		
		
		
		
				
	}
	

@AfterTest
public void afterTest()
{
	  //driver.close();
}

}

