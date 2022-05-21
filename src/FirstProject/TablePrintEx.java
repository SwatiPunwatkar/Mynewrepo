package FirstProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TablePrintEx {
	public static void main(String[]args) {
		 System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("file:///F:/JAVA/Syllanium/javabykiran-Selenium-Softwares/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
	
		 driver.findElement(By.xpath("/html/body/div/div[2]/form/div[1]/input")).sendKeys("kiran@gmail.com");
			driver.findElement(By.xpath("/html/body/div/div[2]/form/div[2]/input")).sendKeys("123456");
			driver.findElement(By.xpath("/html/body/div/div[2]/form/div[3]/div/button")).click();
			driver.findElement(By.xpath("/html/body/div/aside/section/ul/li[3]/a")).click();
			
			List<WebElement>row= driver.findElements(By.tagName("tr"));
			for(int i=1;i<5;i++) {
				
			
				List<WebElement>column= row.get(i).findElements(By.tagName("td"));	
				System.out.println(" ");
				for(int j=1;j<8;j++) {
					System.out.print (column.get(j).getText()+"        ");
				}
				
				
				
			}
	
	
	
	}

}
