package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class ImplicitlyWait {
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	WebElement element = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[6]/a"));
	Actions action = new Actions(driver);
	action.moveToElement(element).perform();
	
	driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[6]/div[2]/div[1]/nav[2]/ul/li[1]/a")).click();
	
	
		
		
	
	}}