package tek.selenium.week_1.day_4;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity4 {
    /*
    Search something in google
     */
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");

        By searchFieldLocator = By.id("input");
        WebElement searchFieldElement = driver.findElement(searchFieldLocator);
        searchFieldElement.sendKeys("Java is fun");
        searchFieldElement.sendKeys(Keys.RETURN);

//        By inputLocator = By.id("APjFqb");
//        WebElement inputElement = driver.findElement(inputLocator);
//        inputElement.sendKeys("SDET interview");
//        inputElement.sendKeys(Keys.RETURN);
//
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        driver.quit();
    }
}
