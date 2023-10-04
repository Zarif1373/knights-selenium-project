package tek.selenium.week_2.day_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Activity2 {

    // Use Css Selector
    // Navigate to Insurance app.
    // print Page title
    // print customer service portal title
    // print second section title (Login)
    // Enter WrongUser Name
    // Enter Wrong password
    // Click login
    // Print error message.

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://happy-desert-0f05d560f.1.azurestaticapps.net/");

        WebElement pageTitleElement = driver.findElement(By.cssSelector("body > app-root > app-login > mat-toolbar > span:nth-child(2)"));
        System.out.println("Page Title: " + pageTitleElement.getText());

        WebElement portalTitleElement = driver.findElement(By.cssSelector("body > app-root > app-login > div > mat-card > mat-card-title:nth-child(1) > strong"));
        System.out.println("Portal Title: "  + portalTitleElement.getText());

        WebElement subTitleElement = driver.findElement(By.cssSelector("body > app-root > app-login > div > mat-card > mat-card-title:nth-child(2)"));
        System.out.println("SubTitle: " + subTitleElement.getText());

        driver.findElement(By.name("username")).sendKeys("WrongUserName");
        driver.findElement(By.name("password")).sendKeys("WrongPassword");
        driver.findElement(By.id("loginButton")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
       // Thread.sleep(2000);
        WebElement errorElement = driver.findElement(By.cssSelector("body > app-root > app-login > div > mat-card > mat-card-content > app-banner > div"));
        System.out.println("Error: " + errorElement.getText());

        Thread.sleep(1000);
        driver.quit();
    }
}
