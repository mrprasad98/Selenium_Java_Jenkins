package com.xpathAxis;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class XpathAxisDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		//self
		By phoneLocator=By.xpath("//input[@id='phone']/self::input");
		WebElement phone=wait.until(ExpectedConditions.visibilityOfElementLocated(phoneLocator));
		phone.sendKeys("Rajendara");
        //preceding sibling
		By emailLocator=By.xpath("//input[@id=\"phone\"]/preceding-sibling::input[@id='email']");
		WebElement email=wait.until(ExpectedConditions.visibilityOfElementLocated(emailLocator));
		email.sendKeys("rajendra.m@gmail.com");
	}

}
