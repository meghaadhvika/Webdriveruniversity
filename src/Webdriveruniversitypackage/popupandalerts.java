package Webdriveruniversitypackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class popupandalerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\91949\\Desktop\\automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://webdriveruniversity.com/Popup-Alerts/index.html");
driver.manage().window().maximize();
//WebElement javascriptalert = driver.findElement(By.id("button1"));
//javascriptalert.click();
//Alert alertbox = driver.switchTo().alert();
//alertbox.accept();

//WebElement modalpopup = driver.findElement(By.id("button2"));
//modalpopup.click();
//Alert alertbox = driver.switchTo().alert();
//alertbox.dismiss();

WebElement ajax = driver.findElement(By.id("button3"));
ajax.click();
driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
//driver.close();
	}

}
