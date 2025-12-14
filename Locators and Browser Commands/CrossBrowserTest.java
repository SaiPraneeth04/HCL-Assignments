package Locators;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class CrossBrowserTest {
  @Test
  public void BrowserTest() throws InterruptedException {
	  Scanner sc = new Scanner(System.in);

      System.out.print("Enter browser name (chrome / edge / firefox): ");
      String browser = sc.nextLine();
      sc.close();

      WebDriver driver = null;

      if (browser.equalsIgnoreCase("chrome")) {
          driver = new ChromeDriver();
      } else if (browser.equalsIgnoreCase("edge")) {
          driver = new EdgeDriver();
      } else if (browser.equalsIgnoreCase("firefox")) {
          driver = new FirefoxDriver();
      } else {
          System.out.println("Invalid browser name!");
          System.exit(0);
      }

      driver.manage().window().maximize();

      driver.get("https://www.wikipedia.org/");
      Thread.sleep(3000);
      System.out.println("Title of the page is: " + driver.getTitle());

      driver.quit();
  }
}


