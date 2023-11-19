package com.Lecture5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class second_july2023 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(10));
driver.get("https://rediff.com");

		String exepectedTitle = "Rediff.com: News | Rediffmail | Stock Quotes | Shopping";
		String actualTitle = driver.getTitle();
		String expURL = "https://www.rediff.com/";
		if(exepectedTitle.equals(actualTitle) && expURL.equals(driver.getCurrentUrl())) {
			System.out.println("Test case validated");
			}else {
				System.out.println("Test case is not validated");
			}
	//WebElement signInLink = driver.findElement(By.linkText("Sign in"));
	if(driver.findElement(By.linkText("Sign in")).isDisplayed() && driver.findElement(By.linkText("Sign in")).isEnabled()) {
		System.out.println("Sign in text box is working");
			}else{
				System.out.println("Sign in text box is not working");
	}
}

}