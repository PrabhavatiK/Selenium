package Sel;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Myntra {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.myntra.com");
		Thread.sleep(2000);
		Actions actions=new Actions(driver);
		WebElement men = driver.findElement(By.xpath("(.//a[text()='Men'])[1]"));
		actions.moveToElement(men).perform();
		Thread.sleep(4000);
		driver.findElement(By.xpath(".//a[text()='Formal Shirts']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(".//div[@class='brand-more']")).click();
		Thread.sleep(4000);
		JavascriptExecutor javascriptExecutor=(JavascriptExecutor)driver;
		javascriptExecutor.executeScript("window.scrollBy(0,150)");
		Thread.sleep(4000);
		javascriptExecutor.executeScript("document.querySelector(\"ul[class$='FilterDirectory-list']\").scrollLeft=400 ");
	}
}
