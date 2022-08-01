package mavenn;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Assestment11 {
  WebDriver driver;
  @BeforeTest
  public void beforeTest() 
  {
	  WebDriverManager.chromedriver();
	  driver=new ChromeDriver();
	  driver.get("https://demo.guru99.com/test/newtours/");
	  driver.manage().window().maximize();
	  
  }

  @Test
  public void f() 
  {
	  driver.findElement(By.name("userName")).sendKeys("sunil");
	  driver.findElement(By.name("password")).sendKeys("sunil");
	  driver.findElement(By.xpath("//*[@type='submit']")).click();
	  //driver.
	  
	  
  }
  
  
  
  
  @AfterTest
  public void afterTest() {
  }

}
