package Assignment19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class tollTip {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com");
		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");

		WebElement hover = driver.findElement(By.id("autocomplete"));
		System.out.println(hover.getAttribute("placeholder"));
		String tooltipText = hover.getAttribute("id");
		System.out.println("Tooltip text is: " + tooltipText);
	}

}
