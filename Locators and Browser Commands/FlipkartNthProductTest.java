package Selectors;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class FlipkartNthProductTest {

    @Test
    public void searchAndPrintNthProduct() throws InterruptedException {
        // 1. Initialize WebDriver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // 2. Launch Flipkart
        driver.get("https://www.flipkart.com/");
        String productName = "Laptop";
        int n = 7; // The Nth number from your table

        // 4. Find Search Bar and enter input
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys(productName);
        searchBox.sendKeys(Keys.ENTER);
        
        Thread.sleep(3000);
        
        List<WebElement> productList = driver.findElements(By.xpath("(//div[@class='RG5Slk'])"));
        if (productList.size() >= n) {
            WebElement nthProduct = productList.get(n - 1);
            System.out.println("--------------------------------------------------");
            System.out.println("Search Query: " + productName);
            System.out.println("The " + n + "th Product Name is: " + nthProduct.getText());
            System.out.println("--------------------------------------------------");
        } else {
            System.out.println("Error: Less than " + n + " products found.");
        }

    }
}
