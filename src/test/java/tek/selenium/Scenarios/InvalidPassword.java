package tek.selenium.Scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvalidPassword {
    public static void main(String[] args) throws InterruptedException {
        // then create object of ChromeDriver class.
        //
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        // navigate
        driver.get("https://happy-desert-0f05d560f.1.azurestaticapps.net/");

        By userNameLocator = By.name("username");
        WebElement userNameElement = driver.findElement(userNameLocator);
        userNameElement.sendKeys("supervisor");

        By passwordLocator = By.name("password");
        WebElement passwordElement = driver.findElement(passwordLocator);
        passwordElement.sendKeys("fwe@lg$233");

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
