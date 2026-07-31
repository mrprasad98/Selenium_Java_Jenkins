package com.uiplayground;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementClickable {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("http://uiplayground.techwithjatin.com/");
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Explicit Waits')]/..")))
				.click();

		// Task 2 : ElementClickable
		/*
		 * Task 2 — elementToBeClickable Read and print the disabled attribute of
		 * data-testid="wait-clickable-target" before triggering Click
		 * data-testid="btn-trigger-clickable" Wait until the button becomes clickable
		 * Re-locate and print disabled again — must change from "true" to null Locator:
		 * //*[@data-testid='wait-clickable-target']
		 */
		By disabledButtonLocator = By.xpath("//button[@data-testid=\"wait-clickable-target\"]");
		WebElement disabledButton = wait.until(ExpectedConditions.visibilityOfElementLocated(disabledButtonLocator));
		System.out.println(disabledButton.getAttribute("disabled"));

		//System.out.println("Is element enabled : " + disabledButton.isEnabled());

		By triggerLocator = By.xpath("//button[@data-testid=\"btn-trigger-clickable\"]");
		WebElement trigger = wait.until(ExpectedConditions.visibilityOfElementLocated(triggerLocator));
		trigger.click();
		
		System.out.println(disabledButton.getAttribute("disabled"));

	}
}
