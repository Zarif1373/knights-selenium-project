package tek.selenium.week_2.day_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity2UsingCssLocator {

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

        Thread.sleep(1000);

        WebElement titleElement = driver.findElement(By.cssSelector("body > app-root > app-login > mat-toolbar > span:nth-child(2)"));
        System.out.println(titleElement.getText());

        By sectionTitleLocator = By.cssSelector("body > app-root > app-login > div > mat-card > mat-card-title:nth-child(1) > strong");
        WebElement sectionTitleElement = driver.findElement(sectionTitleLocator);
        String sectionTitleText = sectionTitleElement.getText();
        System.out.println(sectionTitleText);

        By subTitleLocator = By.cssSelector("body > app-root > app-login > div > mat-card > mat-card-title:nth-child(2)");
        WebElement subTitleElement = driver.findElement(subTitleLocator);
        String subTitleText = subTitleElement.getText();
        System.out.println(subTitleText);

        driver.findElement(By.name("username")).sendKeys("WrongUserName");
        driver.findElement(By.name("password")).sendKeys("tek_supervisor");
        driver.findElement(By.id("loginButton")).click();
        Thread.sleep(1000);

        WebElement errorMessageElement = driver.findElement(By.className("error"));
        System.out.println("Error: " + errorMessageElement.getText());

        Thread.sleep(1000);
        driver.quit();
    }
}
