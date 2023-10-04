package tek.selenium.week_1.day_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseLocator2 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://tek-retail-ui.azurewebsites.net/selenium");

     //   Thread.sleep(1000);
       By inputLink = By.linkText("Inputs");
        WebElement inputLinkElement = driver.findElement(inputLink);
        inputLinkElement.click();

        Thread.sleep(2000);
        driver.quit();
    }
}
