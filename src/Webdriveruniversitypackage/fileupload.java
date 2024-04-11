package Webdriveruniversitypackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileupload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91949\\Desktop\\automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://webdriveruniversity.com/File-Upload/index.html");
		driver.manage().window().maximize();
		WebElement fileupload = driver.findElement(By.id("myFile"));
		fileupload.sendKeys("C:\\Users\\91949\\Pictures\\wall.jpg");
		WebElement Submit = driver.findElement(By.id("submit-button"));
		Submit.click();
		Alert alertbox = driver.switchTo().alert();
		alertbox.accept();
		
	}

}
