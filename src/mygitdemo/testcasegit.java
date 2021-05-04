package mygitdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testcasegit {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\binna\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.co.uk/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[contains(text(),'register')]")).click();
		driver.findElement(By.xpath("//input[@id='firstname']")).click();
		driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("Sophia");
		driver.findElement(By.xpath("//input[@id='lastname']")).click();
		driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys("Egornu");
		driver.findElement(By.xpath("//input[@id='Email']")).click();
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("sophia.egornu@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).click();
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("So12345");
		driver.findElement(By.linkText("//button[@id='EMAIL_REG_FORM_SUBMIT']")).click();
		
	}

}
