package tek.selenium.week_1.day_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeActivity2 {
    public static void main(String[] args) throws InterruptedException {
           /*
        Navigate to link https://tek-retail-ui.azurewebsites.net/selenium
        Click in Inputs
        then fill the form text, email, password
         */

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://tek-retail-ui.azurewebsites.net/selenium");

       By inputlocator =  By.linkText("Inputs");
        WebElement inputElement = driver.findElement(inputlocator);
        inputElement.click();

        By nameLocator = By.name("text");
        WebElement nameElement = driver.findElement(nameLocator);
        nameElement.sendKeys("Zarif");

        By emailLocator = By.name("email");
        WebElement emailElement = driver.findElement(emailLocator);
        emailElement.sendKeys("mohammad.karimi@tekschool.us");

        By passwordLocator = By.name("password");
        WebElement passwordElement = driver.findElement(passwordLocator);
        passwordElement.sendKeys("Jave@Hello$979o");

        By dateLocator = By.name("date");
        WebElement dateElement = driver.findElement(dateLocator);
        dateElement.sendKeys("08/31/2023");

        By ageLocator = By.name("number");
        WebElement ageElement = driver.findElement(ageLocator);
        ageElement.sendKeys("28");

        Thread.sleep(2000);
        driver.quit();
    }
}
