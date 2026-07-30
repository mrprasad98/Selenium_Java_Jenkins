package com.uiplayground;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebElement {

	public static void main(String[] args) throws InterruptedException {
		long start = System.currentTimeMillis();
		WebDriver driver = new ChromeDriver();
		driver.get("http://uiplayground.techwithjatin.com/");
		driver.manage().window().maximize();
		By dynamicElementMenuLinkLocator = By.xpath("//span[contains(text(),'Dynamic Elements')]");
		WebElement dynamicElementMenuLink = driver.findElement(dynamicElementMenuLinkLocator);
		dynamicElementMenuLink.click();

		By addMenuItemLocator = By.xpath("//button[@data-testid='btn-add-item']");
		WebElement addMenu = driver.findElement(addMenuItemLocator);

		addMenu.click();
		Thread.sleep(3000);
		addMenu.click();
		Thread.sleep(3000);
		addMenu.click();
		Thread.sleep(3000);

		By foodCardLocator = By.xpath("//div[@class='swiggy-card']");

		List<WebElement> foodItemList = driver.findElements(foodCardLocator);

		for (WebElement foodItem : foodItemList) {

			By itemNameLocator = By.xpath(".//div[@class='swiggy-name']");
			WebElement itemName = foodItem.findElement(itemNameLocator);
			System.out.println(itemName.getText());

			By priceLocator = By.xpath(".//span[@class='swiggy-price']");
			WebElement price = foodItem.findElement(priceLocator);
			System.out.println(price.getText());

		}

		By liveCounterLocator = By.xpath("//div[@id='live-counter']");
		WebElement liveCounter = driver.findElement(liveCounterLocator);
		System.out.println(liveCounter.getText());

		By hideMenuLocator = By.xpath("//button[@data-testid='btn-toggle-visibility']");
		WebElement hideMenu = driver.findElement(hideMenuLocator);
		hideMenu.click();

		By hiddenMessageLocator = By.xpath("//span[@data-testid='visibility-state']");
		WebElement hiddenMessage = driver.findElement(hiddenMessageLocator);
		System.out.println(hiddenMessage.getText());
		long end = System.currentTimeMillis();
		System.out.println("Duration" + (start - end) / 1000);
	}

}
