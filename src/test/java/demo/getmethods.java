package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getmethods {
	public static String browser = "chrome";
	public static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();

		driver.get("https://www.saucedemo.com");
		
		driver.findElement(By.id("user-name")).sendKeys("abhilashbabu");

		driver.findElement(By.id("user-name")).clear();
		System.out.println(driver.getPageSource());
		System.out.println(driver.getTitle());
		System.out.println(driver.getWindowHandle());
		System.out.println(driver.getWindowHandles());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.findElement(By.name("user-name")).getClass());
		System.out.println(driver.findElement(By.name("user-name")).getAttribute("placeholder"));
		System.out.println(driver.findElement(By.xpath("//*[@id=\"login-button\"]")).getCssValue("cursor"));
		System.out.println(driver.findElement(By.xpath("//*[@id=\"login-button\"]")).getTagName());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"login-button\"]")).getLocation());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"login-button\"]")).getSize());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"login-button\"]")).getText());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"login-button\"]")).isDisplayed());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"login-button\"]")).isEnabled());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"login-button\"]")).isSelected());
		
		

	}
}