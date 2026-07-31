package com.uiplayground;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SpinnerDemo {

	public static void main(String[] args) {
		System.out.println("------------Task 4------------");

		WebDriver driver = new ChromeDriver();
		driver.get("http://uiplayground.techwithjatin.com/");
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Explicit Waits')]/..")))
				.click();
		
		By spinnerLocator=By.xpath("//div[@data-testid=\"wait-invisible-target\"]");
		WebElement spinner=wait.until(ExpectedConditions.visibilityOfElementLocated(spinnerLocator));
		System.out.println(spinner.isDisplayed());
		
		// click on Trigger  sothat spinner will disappear
		By triggerLocator=By.xpath("//button[@data-testid=\"btn-trigger-invisible\"]");
		wait.until(ExpectedConditions.elementToBeClickable(triggerLocator)).click();
		
		boolean status=wait.until(ExpectedConditions.invisibilityOfElementLocated(spinnerLocator));
				System.out.println("Is the spinner disappear"+status);
		

	}

}
