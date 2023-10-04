package tek.selenium.week_1.day_4;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity5 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://tek-retail-ui.azurewebsites.net/selenium");

        By linkInputLocator = By.linkText("Inputs");
        WebElement linkInputElement = driver.findElement(linkInputLocator);
        linkInputElement.click();
        Thread.sleep(2000);
        By rangeLocator = By.id("rangeInput");

        // Using For Loop
        for (int i=0; i < 10; i++){
            Thread.sleep(100);
            WebElement rangeElement = driver.findElement(rangeLocator);
            rangeElement.sendKeys((Keys.ARROW_RIGHT));
        }


        Thread.sleep(2000);
        driver.quit();
    }
}
