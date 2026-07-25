package com.selenium.first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonTest2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://uiplayground.techwithjatin.com/");
		driver.manage().window().maximize();
		WebElement ele = driver.findElement(By.xpath("//*[@data-testid=\"input-gender-female\"]"));
		if (ele.isDisplayed()) {
			ele.click();
			System.out.println("Element clicked");
		} else {
			System.err.println("Not Clicked");
		}
		driver.close();
	}

}
