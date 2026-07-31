package com.uiplayground;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementVisibilityDemo {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("http://uiplayground.techwithjatin.com/");
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Explicit Waits')]/..")))
				.click();

		// Task 1 : Element Visibility

		// button[@data-testid="btn-trigger-visible"]

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@data-testid=\"btn-trigger-visible\"]")))
				.click();

		System.out.println(wait
				.until(ExpectedConditions
						.visibilityOfElementLocated(By.xpath("//div[@data-testid=\"wait-visibility-target\"]")))
				.getText());

	}

}
