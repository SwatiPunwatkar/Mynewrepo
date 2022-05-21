package FirstProject;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testing {
	public static void main(String[]args) {
		 System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("file:///F:/JAVA/Syllanium/javabykiran-Selenium-Softwares/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
	String name=driver.findElement(By.tagName("a")).getText();
	System.out.println(name);
	System.out.println(driver.getTitle());
	driver.findElement(By.linkText("Register a new membership")).click();
	System.out.println(driver.getTitle());
	driver.findElement(By.partialLinkText("al")).click();
	System.out.println(driver.getTitle());
	driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
	driver.findElement(By.id("password")).sendKeys("123456");
	driver.findElement(By.xpath("//button")).click();
	driver.findElement(By.partialLinkText("info")).click();
	//List<WebElement>objLinks=driver.findElements(By.tagName("a"));
	//for (WebElement objCurrentLink : objLinks) {
		 
		// String strLinkText=objCurrentLink.getText();
		 //System.out.println(  strLinkText);
		 
		 List<WebElement>we=driver.findElements(By.partialLinkText("info"));
		 System.out.println(we.size());
		 for (WebElement webElement : we) {
			 webElement.click();
		}
	//WebElement dropdownField= driver.findElement(By.id())
	}

}
