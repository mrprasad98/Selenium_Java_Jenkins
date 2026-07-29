package com.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PhoenixLoginAutomation {

	public static void main(String[] args) throws InterruptedException {
		WebDriver wd = new ChromeDriver();
		wd.get("http://phoenix.techwithjatin.com/sign-in");
		
		Thread.sleep(3000);
		
		//Locate element - Eyes [By - id, name, class, css selector, xpath ....]
		By userNameTextBoxLocator=By.id("username");
		//Find the element - By using eyes
		WebElement userName=wd.findElement(userNameTextBoxLocator);
		//Perform Operation
		userName.clear();
		userName.sendKeys("iamfd");
		
		By passwordTextBoxLocator=By.id("password");
		WebElement pwd=wd.findElement(passwordTextBoxLocator);
		pwd.clear();
		pwd.sendKeys("password");
		
		By button=By.xpath("//span[contains(text(),'Sign in')]");
		WebElement bu=wd.findElement(button);
		bu.click();

	}

}
