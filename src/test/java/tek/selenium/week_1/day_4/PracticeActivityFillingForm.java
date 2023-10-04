package tek.selenium.week_1.day_4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeActivityFillingForm {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://tek-retail-ui.azurewebsites.net/selenium");

        driver.findElement(By.linkText("Inputs")).click();
        driver.findElement(By.id("textInput")).sendKeys("Zarif");
        driver.findElement(By.name("email")).sendKeys("zarif@yahoo.com");
        driver.findElement(By.id("passwordInput")).sendKeys("Password@4235$$");
        driver.findElement(By.id("dateInput")).sendKeys("31/08/2023");
        driver.findElement(By.name("number")).sendKeys("28");

        Thread.sleep(2000);
        driver.quit();
    }
}
