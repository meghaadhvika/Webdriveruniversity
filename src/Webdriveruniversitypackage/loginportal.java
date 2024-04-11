package Webdriveruniversitypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginportal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91949\\Desktop\\automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Login-Portal/index.html?");
		driver.manage().window().maximize();
		WebElement Username = driver.findElement(By.xpath("//*[@id=\"text\"]"));
		Username.sendKeys("Megha U");
		WebElement Password = driver.findElement(By.xpath("//*[@id=\"password\"]"));
		Password.sendKeys("654321");
		WebElement Login = driver.findElement(By.id("login-button"));
		Login.click();
		driver.switchTo().alert().accept();
		
	}

}
