package week4.day1.Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1a {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://leafground.com/pages/table.html");
		
		//To get the total coloumns in table
		
		WebElement togetcoloumns = driver.findElementByXPath("//table[@id='table_id']/tbody/tr");
		List<WebElement> totalcolList = togetcoloumns.findElements(By.tagName("th"));
		System.out.println("No of coloumns in table are:"+totalcolList.size());
		
		//To get the total rows in table
		
		WebElement toGetRows = driver.findElementByXPath("//table[@id='table_id']/tbody");
		List<WebElement> totalRows = toGetRows.findElements(By.tagName("tr"));
		System.out.println("the total row is:"+totalRows.size());
		
		
		
		 for (int i = 3; i <=3; i++) { 
			 WebElement element = driver.findElementByXPath("//table[@id='table_id']//tr["+i+"]/td[1]");
				   String text = element.getText(); 
				   System.out.println(text);
				   for (int j = 2; j <= 6; j++) {
					   WebElement elm = driver.findElementByXPath("//table[@id='table_id']//tr["+i+"]/td["+j+"]");
					   String text1 = elm.getText(); 
					   System.out.print(" "+text1);
					  
				}
				   
				  }
		 
		 List<Integer> neval = new ArrayList<Integer>();
		 for (int k = 2; k <= 5; k++) {
			 WebElement elem = driver.findElementByXPath("//table[@id='table_id']//tr["+k+"]/td[2]");
			 String text2 = elem.getText();
			 System.out.println(" "+text2);
			
			 //removing special characters
			 String newtext = text2.replaceAll("%", "");
			 
			 neval.add(Integer.parseInt(newtext));
			 
			 System.out.println(newtext);
			 
			
			 }
		 Collections.sort(neval);
		 Integer lowest = neval.get(0);
		 driver.findElementByXPath("//td[contains(text(),'"+lowest+"')]/follwing-sibling::td/input");
				
	}

}
