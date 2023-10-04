package tek.selenium.week_1.day_4;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActivityFillingForm {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://tek-retail-ui.azurewebsites.net/selenium/inputs");

        driver.findElement(By.linkText("Inputs")).click();

        driver.findElement(By.id("textInput")).sendKeys("Zarif");
        driver.findElement(By.id("emailInput")).sendKeys("zarif@gmail.com");
        driver.findElement(By.name("password")).sendKeys("las@losj432");
        driver.findElement(By.name("date")).sendKeys("08/31/2023");
        driver.findElement(By.name("number")).sendKeys("28");
        WebElement range = driver.findElement(By.id("rangeInput"));
        for (int i = 0; i <= 25; i++) {
            range.sendKeys(Keys.ARROW_RIGHT);
        }
        Thread.sleep(5000);
        driver.quit();
    }
}
