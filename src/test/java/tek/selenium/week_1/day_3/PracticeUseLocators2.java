package tek.selenium.week_1.day_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeUseLocators2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://tek-retail-ui.azurewebsites.net/selenium/inputs");

        By inputlink = By.linkText("Inputs");
        WebElement inputlinkElement = driver.findElement(inputlink);
        inputlinkElement.click();

        Thread.sleep(3000);
        driver.quit();
    }
}
