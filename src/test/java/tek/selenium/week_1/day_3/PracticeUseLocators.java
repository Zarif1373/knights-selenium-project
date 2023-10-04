package tek.selenium.week_1.day_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.*;

public class PracticeUseLocators {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://happy-desert-0f05d560f.1.azurestaticapps.net/");

        // 1) Locate teh element with By
        By usernameLocator = By.name("username");
        // 2) Find the element with driver
        WebElement usernameElement = driver.findElement(usernameLocator);
        // 3) perform action -> send text to input
        usernameElement.sendKeys("azgfds");

        By passwordLocator = By.name("password");
        WebElement passwordElement = driver.findElement(passwordLocator);
        passwordElement.sendKeys("asdgf");
       // passwordElement.sendKeys("tek_supervisor");

        By loginButtonLocator = By.id("loginButton");
        WebElement loginButtonElement = driver.findElement(loginButtonLocator);
        loginButtonElement.click();

        // Using className for locator.
        By bannerLocator = By.className("banner error ng-star-inserted");
        WebElement bannerElement = driver.findElement(bannerLocator);
        String errorMessage = bannerElement.getText();
        System.out.println(errorMessage);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.quit();
    }
}
