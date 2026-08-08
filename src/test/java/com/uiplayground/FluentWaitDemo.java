package com.uiplayground;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		Wait<WebDriver> wait = new FluentWait<>(driver)
				.withTimeout(Duration.ofSeconds(15))
				.pollingEvery(Duration.ofSeconds(1))
				.ignoring(NoSuchElementException.class);

		WebElement w = wait.until(ExpectedConditions.elementToBeClickable(By.id("")));
		w.click();

	}

}
