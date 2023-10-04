package tek.selenium.week_1.day_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeUserStory3 {
    public static void main(String[] args) {
            /*
        As CSR User when navigating to <Tek Insurance Portal>
        And Entering wrong username and password error message should
        Shown with message User not found and also Password Not Match
         */

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://happy-desert-0f05d560f.1.azurestaticapps.net/");

        By usernamelocator = By.name("username");
        WebElement usernameElement = driver.findElement(usernamelocator);
        usernameElement.sendKeys("ljafds");

        By passwordlocator = By.name("password");
        WebElement passwordElement = driver.findElement(passwordlocator);
        passwordElement.sendKeys("ljafds");

        By loginButtonLocator = By.name("mat-button-focus-overlay");
        WebElement loginButtonElement = driver.findElement(loginButtonLocator);
        loginButtonElement.click();
    }
}
