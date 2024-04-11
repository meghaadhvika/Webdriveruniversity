package Webdriveruniversitypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class drpdnchkrdbut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\91949\\Desktop\\automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.navigate().to("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
driver.manage().window().maximize();
Select Dropdown1 = new Select (driver.findElement(By.xpath("//*[@id=\"dropdowm-menu-1\"]")));
Dropdown1.selectByValue("python");
Select Dropdown2 = new Select (driver.findElement(By.id("dropdowm-menu-2")));
Dropdown2.selectByIndex(2);
Select Dropdown3 = new Select (driver.findElement(By.id("dropdowm-menu-3")));
Dropdown3.selectByVisibleText("CSS");
WebElement Checkboxes = driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/label[2]/input"));
Checkboxes.click();
WebElement radiobutton = driver.findElement(By.xpath("//*[@id=\"radio-buttons\"]/input[3]"));
radiobutton.click();
WebElement selectedanddisabled = driver.findElement(By.xpath("//*[@id=\"radio-buttons-selected-disabled\"]/input[1]"));
selectedanddisabled.click();
Select dropdown = new Select (driver.findElement(By.id("fruit-selects")));
dropdown.selectByVisibleText("Pear");
//dropdown.selectByIndex(1);

	}

}
