package mavenn;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Elearning {
  WebDriver driver;
 
  @BeforeTest
  public void beforeTest() 
  {
	  WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	  driver.get("http://elearningm1.upskills.in/index.php?loginFailed=1&error=user_password_incorrect");
	  driver.manage().window().maximize();
	  
	  
  }
  @Test
  public void testcase1() throws InterruptedException 
  {
	  driver.findElement(By.xpath("//*[@id='login']")).sendKeys("rk123");
	  driver.findElement(By.xpath("//*[@name='password']")).sendKeys("123456");
	  driver.findElement(By.xpath("//*[@name='submitAuth']")).click();
	  driver.findElement(By.linkText("Compose")).click();
	  /*driver.findElement(By.xpath("//*[@placeholder='Username']")).sendKeys("Pradeep_20");
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("Pradeep123");
		driver.findElement(By.xpath("//*[@name='submitAuth']")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Compose")).click();*/
		driver.findElement(By.xpath("//*[@class='select2-search__field']")).click();
		driver.findElement(By.xpath("//*[@class='select2-search__field']")).sendKeys("krankgowda0495@gmail.com");
		//driver.findElement(By.xpath("//*[@name='title']")).sendKeys("working on E-learning");
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//*[@class='select2-search__field']")).sendKeys(Keys.DOWN);
		driver.findElement(By.className("form-control")).sendKeys("hii team");
		//driver.findElement(By.xpath("//*[@class='select2-search__field']")).sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div/iframe[@class='cke_wysiwyg_frame cke_reset']")).click(); 
		driver.findElement(By.xpath("//div/iframe[@class='cke_wysiwyg_frame cke_reset']")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//div/iframe[@class='cke_wysiwyg_frame cke_reset']")).sendKeys("Hello"+Keys.ENTER+"i am dahivada"
		+Keys.ENTER+Keys.ENTER+"Thanks & regards"+Keys.ENTER+"ias ");
		/*driver.findElement(By.xpath("//div/iframe[@class='cke_wysiwyg_frame cke_reset']")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//div/iframe[@class='cke_wysiwyg_frame cke_reset']")).sendKeys("i am Pradeep");
		driver.findElement(By.xpath("//div/iframe[@class='cke_wysiwyg_frame cke_reset']")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//div/iframe[@class='cke_wysiwyg_frame cke_reset']")).sendKeys("Thanks & regards");
		driver.findElement(By.xpath("//div/iframe[@class='cke_wysiwyg_frame cke_reset']")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//div/iframe[@class='cke_wysiwyg_frame cke_reset']")).sendKeys("Pradeep Vyas");*/
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='file-descrtiption']")).sendKeys("Introduction");
		driver.findElement(By.xpath("//*[@name='compose']")).click();
		driver.findElement(By.linkText("Logout")).click();
  }
  
  @AfterTest
  public void afterTest() 
  {
	  driver.close();
	  
  }

}
