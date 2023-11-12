package july2023_lecture_5;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class first_july2023_lecture_5 {

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
		if(exepectedTitle.equals(actualTitle)) {
			System.out.println("My title is correct");
			}else {
				System.out.println("My title entered is incorrect");
			}
			
			String expURL = "https://www.rediff.com/";
			if(expURL.equals(driver.getCurrentUrl())){
				System.out.println("My URl is correct");
			}else {
				System.out.println("My entered URL is incorrect");
			}
		}
	}


