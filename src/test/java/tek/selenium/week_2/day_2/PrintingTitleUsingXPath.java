package tek.selenium.week_2.day_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintingTitleUsingXPath {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://happy-desert-0f05d560f.1.azurestaticapps.net/");

        By headerLocator = By.xpath("html/body/app-root/app-login/" +
                "mat-toolbar/span[1]");
        WebElement headerElement = driver.findElement(headerLocator);
        String headerText = headerElement.getText();
        System.out.println(headerText);

        By mainTitleLocator = By.xpath("/html/body/app-root/app-login/div/mat-card/mat-card-title[1]/strong");
        WebElement mainTitleElement = driver.findElement(mainTitleLocator);
        String mainTitleText = mainTitleElement.getText();
        System.out.println(mainTitleText);

        By titleLocator = By.xpath("/html/body/app-root/app-login/div/mat-card/mat-card-title[2]");
        WebElement titleElement = driver.findElement(titleLocator);
        String titleText = titleElement.getText();
        System.out.println("Sub Title: " + titleText);

       By usernameLocator = By.name("username");
       WebElement usernameElement = driver.findElement(usernameLocator);
       usernameElement.sendKeys("WrongUserName");

        By passwordLocator = By.name("password");
        WebElement passwordElement = driver.findElement(passwordLocator);
        passwordElement.sendKeys("WrongPassword");

        By loginLocator = By.id("loginButton");
        WebElement loginElement = driver.findElement(loginLocator);
        loginElement.click();
        Thread.sleep(1000);
       By errorLocator = By.xpath("/html/body/app-root/app-login/div/mat-card/mat-card-content/app-banner/div");
       WebElement errorElement = driver.findElement(errorLocator);
       String errorText = errorElement.getText();
       System.out.println("Error Message: " + errorText);
       driver.quit();


    }
}
