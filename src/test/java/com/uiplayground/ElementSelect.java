package com.uiplayground;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementSelect {

	public static void main(String[] args) {
		System.out.println("------------Task 3------------");

		WebDriver driver = new ChromeDriver();
		driver.get("http://uiplayground.techwithjatin.com/");
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Explicit Waits')]/..")))
				.click();

		By checkboxLocator = By.xpath("//input[@data-testid=\"wait-selected-target\"]");
		WebElement checkbox = wait.until(ExpectedConditions.visibilityOfElementLocated(checkboxLocator));
		boolean status = checkbox.isSelected();
		System.out.println(status);

		By triggerButtonLocator = By.xpath("//button[@data-testid=\"btn-trigger-selected\"]");
		WebElement trigger = wait.until(ExpectedConditions.elementToBeClickable(triggerButtonLocator));
		trigger.click();
		
		boolean status2=wait.until(ExpectedConditions.elementToBeSelected(checkbox));
		System.out.println(status2);

	}

}
