package tek.selenium.Scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeInvalidUserName {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://happy-desert-0f05d560f.1.azurestaticapps.net/");

        By userNameLocator = By.name("username");
        WebElement userNameElement = driver.findElement(userNameLocator);
        userNameElement.sendKeys("sljkflj");

        By passwordLocator = By.name("password");
        WebElement passwordElement = driver.findElement(passwordLocator);
        passwordElement.sendKeys("ljksf@5433");

        By loginButtonLocator = By.id("loginButton");
        WebElement loginButtonElement = driver.findElement(loginButtonLocator);
        loginButtonElement.click();

        Thread.sleep(1000);
        By errorLocator = By.className("error");
        WebElement errorElement = driver.findElement(errorLocator);
        String errorMessage = errorElement.getText();

        String expectedError = "Username not found";

        if(errorMessage.equals(expectedError)){
            System.out.println("Test Passed");
            System.out.println("Error is: " + errorMessage);
        } else {
            System.out.println("Test Failed");
        }

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }
}
