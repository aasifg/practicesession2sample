package concepts;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learnlocators {
	
	WebDriver driver;
	
	@Before
	public void init() {
		System.setProperty("webdriver.chrome.driver","driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://objectspy.space/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
	}
	@Test
	public void locateElements() throws InterruptedException {
		driver.findElement(By.name("firstname")).sendKeys("Aasif");
//		driver.findElement(By.linkText("OS-API Product FrontEnd")).click();
//		driver.navigate().back();
		//driver.findElement(By.partialLinkText("TF-API Product ")).click();
//		driver.findElement(By.id("photo")).sendKeys("C:\\Users\\aasif\\OneDrive\\Desktop\\Techfios\\Selenium class 3 notes");!!You did not mention folder name and also did not do .docx at end. that was the mistake
		
		driver.findElement(By.id("photo")).sendKeys("C:\\Users\\aasif\\OneDrive\\Desktop\\Techfios\\Weekly study notes\\Selenium class 3 notes.docx");
		//file uploaded remember this method is used if tag is input. if its a different tag you need to use the Robot method to upload
		
		
		//CSS
		driver.findElement(By.cssSelector("input#tool-2")).click();
		driver.findElement(By.cssSelector("input[name=lastname]")).sendKeys("is learning Selenium");
		driver.findElement(By.cssSelector("input[name=exp][id=exp-6]")).click();
		
		
		//xpath
		//absolute
		driver.findElement(By.xpath("html/body/div/div[2]/div[2]/form/div[13]/input")).sendKeys("I find absolute Xpath real funny and complicating");
		driver.findElement(By.xpath("//input[@id='profession-1']")).click();
		driver.findElement(By.xpath("//*[@id=\"continents\"]/option[6]")).click();
	}
	
	@After
	public void tearDown() {
	//	driver.close();
	//	driver.quit();
		
	}
	
	

}
