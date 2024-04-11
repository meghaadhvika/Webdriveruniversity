package Webdriveruniversitypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Contactus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\91949\\Desktop\\automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://webdriveruniversity.com/Contact-Us/contactus.html");
driver.manage().window().maximize();
//WebElement Contact_Us = driver.findElement(By.id("contact-us"));
//Contact_Us.click();
WebElement FirstName = driver.findElement(By.xpath("//*[@id=\"contact_form\"]/input[1]"));
FirstName.sendKeys("Megha");
WebElement LastName = driver.findElement(By.name("last_name"));
LastName.sendKeys("U");
WebElement Email = driver.findElement(By.name("email"));
Email.sendKeys("megha1234@gmail.com");
WebElement Comments = driver.findElement(By.name("message"));
Comments.sendKeys("About server");
//WebElement Submit = driver.findElement(By.xpath("//*[@value ='SUBMIT']"));
//Submit.click();
WebElement Reset = driver.findElement(By.xpath("//*[@value = 'RESET']"));
Reset.click();

	}

}
