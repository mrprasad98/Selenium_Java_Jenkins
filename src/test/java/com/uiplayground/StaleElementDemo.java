package com.uiplayground;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StaleElementDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://uiplayground.techwithjatin.com/");
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Explicit Waits')]/..")))
				.click();

		By staleElementLocator = By.xpath("//div[@data-testid='wait-stale-target']");
		WebElement staleElement = wait.until(ExpectedConditions.visibilityOfElementLocated(staleElementLocator));
		System.out.println(staleElement.getAttribute("data-render-key"));

		By triggerLocator = By.xpath("//button[@data-testid=\"btn-trigger-stale\"]");
		WebElement trigger = wait.until(ExpectedConditions.elementToBeClickable(triggerLocator));
		trigger.click();

		boolean b = wait.until(ExpectedConditions.stalenessOf(staleElement));
		System.out.println(b);
		staleElement.click();
		
		//WebElement newone = wait.until(ExpectedConditions.visibilityOfElementLocated(staleElementLocator));
		//System.out.println(newone.getAttribute("data-render-key"));

	}

}
