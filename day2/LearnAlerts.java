package week4.day2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnAlerts {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://leafground.com/pages/Alert.html");
		
		driver.findElementByXPath("//button[text()='Alert Box']").click();
		//switch my control to alert 
		//Alert is interface
//		Alert alert = driver.switchTo().alert();
//		
//		String text = alert.getText();
//		System.out.println(text);
		
		//for pronbt freeze string text
		/* alert.sendKeys("i accept"); */ // in java script we can not see action in visibly and it do in back end
		Thread.sleep(1000);
		//to click Ok button in the alert
		/* alert.accept(); */
		//to click cancel button
		/*alert.dismiss();*/
		/*String text = alert.getText(); // if give after it shows accept there is no exception 
		System.out.println(text);*/

	}

}
