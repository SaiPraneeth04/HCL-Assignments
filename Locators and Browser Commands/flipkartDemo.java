package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkartDemo {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://www.flipkart.com/");
		  String product1 = "Laptop";
		  driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']")).sendKeys(product1 + Keys.ENTER);
		  int n1 = 7;
		  List<WebElement> productList1 = driver.findElements(By.xpath("(//div[@class='RG5Slk'])"));
	        if (productList1.size() >= n1) {
	            WebElement nthProduct = productList1.get(n1 - 1);
	            System.out.println("--------------------------------------------------");
	            System.out.println("Search Query: " + product1);
	            System.out.println("The " + n1 + "th Product Name is: " + nthProduct.getText());
	            System.out.println("--------------------------------------------------");
	        } else {
	            System.out.println("Error: Less than " + n1 + " products found.");
	        }
	        driver.navigate().back();
		  Thread.sleep(3000);
		  String product2 = "TV";
		  driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']")).sendKeys(product2 + Keys.ENTER);

		  int n2 = 13;
		  List<WebElement> productList2 = driver.findElements(By.xpath("(//div[@class='RG5Slk'])"));
	        if (productList2.size() >= n2) {
	            WebElement nthProduct = productList2.get(n2 - 1);
	            System.out.println("--------------------------------------------------");
	            System.out.println("Search Query: " + product2);
	            System.out.println("The " + n2 + "th Product Name is: " + nthProduct.getText());
	            System.out.println("--------------------------------------------------");
	        } else {
	            System.out.println("Error: Less than " + n2 + " products found.");
	        }
	        driver.navigate().back();
		  Thread.sleep(3000);
		  String product3 = "smart phone";
		  driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']")).sendKeys(product3 + Keys.ENTER);

		  int n3 = 2;
		  List<WebElement> productList3 = driver.findElements(By.xpath("(//div[@class='RG5Slk'])"));
	        if (productList3.size() >= n3) {
	            WebElement nthProduct = productList3.get(n3 - 1);
	            System.out.println("--------------------------------------------------");
	            System.out.println("Search Query: " + product3);
	            System.out.println("The " + n3 + "th Product Name is: " + nthProduct.getText());
	            System.out.println("--------------------------------------------------");
	        } else {
	            System.out.println("Error: Less than " + n3 + " products found.");
	        }
		  driver.navigate().back();
		
	}
}







