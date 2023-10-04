package tek.selenium.week_1.day_4;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeActivity5 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://tek-retail-ui.azurewebsites.net/selenium");

        driver.findElement(By.linkText("Inputs")).click();
        driver.findElement(By.id("rangeInput"));

        for (int i=0; i<10; i++){
            Thread.sleep(100);
            driver.findElement(By.id("rangeInput")).sendKeys(Keys.ARROW_RIGHT);
        }
        Thread.sleep(2000);
        driver.quit();
    }
}
