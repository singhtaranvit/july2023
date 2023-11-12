package july2023_lecture_5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebElement_Path 
{
public static WebDriver driver;

public static void main(String[] args) throws InterruptedException {
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("http://rediff.com");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.findElement(By.className("signin")).click();
	driver.findElement(By.id("login1")).sendKeys("taran_benipal");
	driver.findElement(By.name("passwd")).sendKeys("Benip@l0307");
	driver.findElement(By.className("signinbtn")).click();
	Thread.sleep(5000);
	//driver.findElement(By.xpath("/html/body/div/div[3]/div/form/div[7]/a")).click();
	WebElement profileName = driver.findElement(By.linkText("T Singh"));
	if(profileName.isDisplayed()) {
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[6]/a")).click();
	}else {		
		System.out.println("Profile does not exist");
	}
	Thread.sleep(2000);
	WebElement actualLogoutMessage = driver.findElement(By.xpath("//p[text()='You have successfully signed out of Rediffmail.']"));
	String abc = actualLogoutMessage.getText();
	System.out.println(abc);
	Thread.sleep(1000);
	String expectedLogoutMessage = "You have successfully signed out of Rediffmail.";
	if(abc.contains(expectedLogoutMessage)) {
		System.out.println("Test case pass");
			}else {
				System.out.println("Test case fail");
				Thread.sleep(1000);
			}
	driver.quit();
	
	}
}
