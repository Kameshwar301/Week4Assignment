package week4.day2.Assignment;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
	    ChromeDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("http://leafground.com/pages/Alert.html");
	    driver.findElementByXPath("//button[text()='Alert Box']").click();

	    //alert box accept
	    driver.switchTo().alert().accept();
	    
	    //Confirm Box alert
	    driver.findElementByXPath("//button[text()='Confirm Box']").click();
	    Thread.sleep(1000);
	    driver.switchTo().alert().accept();
	    WebElement result = driver.findElementById("result");
	    System.out.println(result.getText());
	    driver.findElementByXPath("//button[text()='Confirm Box']").click();
	    Thread.sleep(1000);
	    driver.switchTo().alert().dismiss();
	    WebElement result2 = driver.findElementById("result");
	    System.out.println (result2.getText());
	    
	    //Confirm Prompt Box Alert
	    driver.findElementByXPath("//button[text()='Prompt Box']").click();
	    Alert alert = driver.switchTo().alert();
	    alert.sendKeys("Kameshwar");
	    Thread.sleep(1000);
	    alert.accept();
	    WebElement text = driver.findElementById("result1");
	    String text2 = text.getText();
	    if(text2.contains("Kameshwar")){
	    	System.out.println("Contains name:"+text2);}
	    	else {
	    		System.out.println("No name");
	    	}
	    
	    //line-break alert
	    driver.findElementByXPath("//button[text()='Line Breaks?']").click();
	    Alert alert1=driver.switchTo().alert();
	    Thread.sleep(1000);
	    alert1.accept();
	    
	    //Sweet Alert
	    driver.findElementByXPath("//button[text()='Sweet Alert']").click();
	    Thread.sleep(1000);
	    driver.findElementByXPath("//button[text()='OK']").click();
        
	    
	    driver.close();
	}

}
