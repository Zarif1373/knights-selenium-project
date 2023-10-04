package tek.selenium.week_1.day_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UserStory4 {
    public static void main(String[] args) throws InterruptedException {
        /*
        As CSR User when navigating to <Tek Insurance Portal>
        And Entering wrong username and password error message should
        Shown with message Password Not Matched
         */

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://happy-desert-0f05d560f.1.azurestaticapps.net/");

        By userNameInput = By.name("username");
        WebElement userNameElement = driver.findElement(userNameInput);
        userNameElement.sendKeys("supervisor");

        By passwordInput = By.name("password");
        WebElement passwordElement = driver.findElement(passwordInput);
        passwordElement.sendKeys("Java@Hello@9797");

        By loginButtonLocator = By.id("loginButton");
        WebElement loginButtonElement = driver.findElement(loginButtonLocator);
        loginButtonElement.click();

        Thread.sleep(1000);
        By errorLocator = By.className("error");
        WebElement errorElement = driver.findElement(errorLocator);
        String errorMessage = errorElement.getText();

        String expectedErrorMessage = "Password Not Matched";

        if(errorMessage.equals(expectedErrorMessage)){
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }

        driver.quit();
    }
}
