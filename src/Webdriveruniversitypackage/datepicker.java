package Webdriveruniversitypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class datepicker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\91949\\Desktop\\automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://webdriveruniversity.com/Datepicker/index.html");
driver.manage().window().maximize();
String month = "March 1996";
String day = "3";
WebElement datepicker = driver.findElement(By.xpath("//*[@id=\"datepicker\"]"));


	}

}
