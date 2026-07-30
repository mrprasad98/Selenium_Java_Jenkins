package com.uiplayground;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitDemo {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("http://uiplayground.techwithjatin.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		By dynamicElementMenuLinkLocator = By.xpath("//span[contains(text(),'Dynamic Elements')]");
		WebElement dynamicElementMenuLink = driver.findElement(dynamicElementMenuLinkLocator);
		dynamicElementMenuLink.click();

		By addMenuItemLocator = By.xpath("//button[@data-testid='btn-add-item']");
		WebElement addMenu = driver.findElement(addMenuItemLocator);

		addMenu.click();
		
		addMenu.click();
		addMenu.click();

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

	}

}
