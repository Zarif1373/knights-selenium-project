package tek.selenium.week_1.day_4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeActivity4 {
    public static void main(String[] args) throws InterruptedException {
        /*
        Navigate to google.com and search for something
         */

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");

        driver.findElement(By.id("APjFqb")).sendKeys("SDET Interview");
        driver.findElement(By.name("btnK")).click();

        Thread.sleep(2000);
        driver.quit();
    }
}
