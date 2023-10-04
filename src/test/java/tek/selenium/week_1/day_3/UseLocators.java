package tek.selenium.week_1.day_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseLocators {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://happy-desert-0f05d560f.1.azurestaticapps.net/");
        // 1) locate the element with By
        By userNameLocator = By.name("username");
        // 2) Find the element with driver
        WebElement userNameElement = driver.findElement(userNameLocator);
        // 3)
        userNameElement.sendKeys("WrongPassword");

        By passwordLocator = By.name("password");
        WebElement passwordElement = driver.findElement(passwordLocator);
        passwordElement.sendKeys("tek_supervisor");

        By loginButtonLocator = By.id("Login");
        WebElement loginButtonElement = driver.findElement(loginButtonLocator);
        loginButtonElement.click();
        Thread.sleep(5000);

        By bannerLocator = By.className("banner error ng-star-inserted");
        WebElement bannerElement = driver.findElement(bannerLocator);
        String errorMessage = bannerElement.getText();
        System.out.println(errorMessage);


        driver.quit();
    }
}
