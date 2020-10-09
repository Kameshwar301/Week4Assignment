package week4.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWait {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(5000); //wait for 5 sec , its applicable immiediate nxt step only
		//then it will go
		driver.findElementById("username").sendKeys("yyyy");
		Thread.sleep(5000);//use this thread it will slow down me to run program
		driver.findElementById("password").sendKeys("yyyy");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

}
