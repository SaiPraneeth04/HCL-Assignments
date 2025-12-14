package Selectors;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AnchorTagHrefDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.vedantu.com/");
		List<WebElement> allAnchors = driver.findElements(By.tagName("a"));
		System.out.println("All href values of anchor tags:\n");
		
		for(WebElement anchor : allAnchors) {
			String hrefValue = anchor.getAttribute("href");
			System.out.println(hrefValue);
		}
		System.out.println("\nTotal number of <a> tags: "+allAnchors.size());
	}

}
