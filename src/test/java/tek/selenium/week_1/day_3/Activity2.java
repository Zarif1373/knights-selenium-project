package tek.selenium.week_1.day_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity2 {
    public static void main(String[] args)  {
        /*
        Navigate to link https://tek-retail-ui.azurewebsites.net/selenium
        Click in Inputs
        then fill the form text, email, password
         */
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://tek-retail-ui.azurewebsites.net/selenium");

        By inputLink = By.linkText("Inputs");
        WebElement inputLinkElement = driver.findElement(inputLink);
        inputLinkElement.click();

        By nameInput = By.name("text");
        WebElement nameInputElement = driver.findElement(nameInput);
        nameInputElement.sendKeys("Zarif");

        By emailInput = By.name("email");
        WebElement emailElement = driver.findElement(emailInput);
        emailElement.sendKeys("mohammad.karimi@tekschool.us");

        By passwordInput = By.name("password");
        WebElement passwordInputElement = driver.findElement(passwordInput);
        passwordInputElement.sendKeys("Hello@Java@98697");

        By dateInput = By.name("date");
        WebElement dateInputElement = driver.findElement(dateInput);
        dateInputElement.sendKeys("08/30/2023");

        By ageInput = By.name("number");
        WebElement ageInputElement = driver.findElement(ageInput);
        ageInputElement.sendKeys("28");

        By rangeInput = By.name("range");
        WebElement rangeInputElement = driver.findElement(rangeInput);
        rangeInputElement.sendKeys("15");

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }

}
