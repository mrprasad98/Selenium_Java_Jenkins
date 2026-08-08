package com.uiplayground;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UploadFileAutomation {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("http://uiplayground.techwithjatin.com/");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		By fileUploadMenuLinkLocator = By.xpath("//span[contains(text(),'File Upload')]/..");
		wait.until(ExpectedConditions.visibilityOfElementLocated(fileUploadMenuLinkLocator)).click();

		By fileInputLocator = By.xpath("//input[@data-testid=\"file-input\"]");

		wait.until(ExpectedConditions.presenceOfElementLocated(fileInputLocator))
				.sendKeys("C:\\Users\\hp\\Desktop\\file1.txt");
		
		By cardLocator=By.xpath("//div[@data-testid=\"file-list\"]");
		wait.until(ExpectedConditions.visibilityOfElementLocated(cardLocator));
		
		wait.until(ExpectedConditions.presenceOfElementLocated(fileInputLocator))
				.sendKeys("C:\\Users\\hp\\Desktop\\puppy.jpg");

		// C:\Users\hp\Desktop\file1.txt
		
		
		
		
		By multipleElementsLocator=By.xpath("//div[@data-testid=\"file-list\"]/div");
		
		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(multipleElementsLocator, 1));
		List<WebElement> multipleElements=driver.findElements(multipleElementsLocator);
		//System.out.println(multipleElements.size());
		
		for(WebElement temp:multipleElements)
		{
			
			System.out.print(temp.findElement(By.xpath(".//span[@class=\"file-name\"]")).getText());
			System.out.print(temp.findElement(By.xpath(".//span[@class=\"file-size\"]")).getText());
			System.out.print(temp.findElement(By.xpath(".//span[@class=\"file-status\"]")).getText());
		}
		
		
	}

}