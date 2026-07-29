package com.uiplayground;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RegistrationForm {

	public static void main(String[] args) {

		WebDriver wd = new ChromeDriver();

		wd.get("http://uiplayground.techwithjatin.com");

		wd.manage().window().maximize();

		// Locator
		By firstNameLocator = By.xpath("//input[@id='firstName']");
		WebElement firstName = wd.findElement(firstNameLocator);
		firstName.sendKeys("Rajendra");

		// Locator

		By lastNameLocator = By.xpath("//input[@id='lastName']");
		WebElement lastName = wd.findElement(lastNameLocator);
		lastName.sendKeys("P");

		// Locator

		By emailLocator = By.xpath("//input[@id='email']");
		WebElement email = wd.findElement(emailLocator);
		email.sendKeys("rajendra@gmail.com");

		// Locator

		By passwordLocator = By.xpath("//input[@id='password']");
		WebElement password = wd.findElement(passwordLocator);
		password.sendKeys("12345");

		// Locator

		By phoneNumberLocator = By.xpath("//input[@data-testid='input-phone']");
		WebElement phoneNumber = wd.findElement(phoneNumberLocator);
		phoneNumber.sendKeys("8965487963");

		// Locator

		By dobLocator = By.xpath("//input[@data-testid='input-dob']");
		WebElement dob = wd.findElement(dobLocator);
		dob.sendKeys("04");
		dob.sendKeys("06");
		dob.sendKeys("1986");

		// Locator
		By femaleRadioButton = By.xpath("//input[@data-testid='input-gender-female']");
		WebElement femaleRadio = wd.findElement(femaleRadioButton);
		femaleRadio.click();

		By maleRadioButton = By.xpath("//input[@data-testid='input-gender-male']");
		WebElement maleRadio = wd.findElement(maleRadioButton);
		maleRadio.click();

		// Locator
		By termsAndConditionsCheckBoxLocator = By.xpath("//input[@data-testid='input-terms']");
		WebElement termsAndConditionsCheckBox = wd.findElement(termsAndConditionsCheckBoxLocator);
		termsAndConditionsCheckBox.click();

		// Locator
		By countryDropdown = By.xpath("//select[@data-testid='input-country']");
		WebElement country = wd.findElement(countryDropdown);

		Select sel = new Select(country);
		sel.selectByVisibleText("Japan");
		sel.selectByIndex(0);
		sel.selectByValue("Singapore");

		// Locator
		By registerButton = By.tagName("button");
		WebElement register = wd.findElement(registerButton);
		register.click();

		// Locator

		By registrationMessage = By.xpath("//div[contains(text(),'Registration Successful!')]");
		WebElement registration = wd.findElement(registrationMessage);

		System.out.println(registration.getText());

		// Locator
		By welecomeMessage = By.xpath("//div[@data-testid='registration-success']/div[3]");
		WebElement welcome = wd.findElement(welecomeMessage);
		System.out.println(welcome.getText());
		wd.close();

	}

}
