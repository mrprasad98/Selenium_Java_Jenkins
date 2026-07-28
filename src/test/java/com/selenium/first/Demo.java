package com.selenium.first;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		WebDriver wd = new ChromeDriver();
		wd.get("D:\\Developer1\\Selenium_Java_Jenkins\\Demo\\index.html");
		String pageTitle = wd.getTitle();
		System.out.println(pageTitle);
		String pageSource = wd.getPageSource();
		System.out.println(pageSource);
		wd.close();

	}

}
