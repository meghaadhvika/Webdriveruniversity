package Webdriveruniversitypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\91949\\Desktop\\automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://webdriveruniversity.com/Actions/index.html");
driver.manage().window().maximize();
driver.switchTo().frame(1);
WebElement sourceelement = driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
WebElement targetelement = driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
Actions ac = new Actions(driver);
ac.clickAndHold(sourceelement).moveToElement(targetelement).release().build().perform();
		
		
	}

}
