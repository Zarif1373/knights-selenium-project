package tek.selenium.week_2.day_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PracticeHandleDropDown {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://tek-retail-ui.azurewebsites.net/selenium/dropdown");

        WebDriverWait driverWait = new WebDriverWait(driver, Duration.ofSeconds(5));
        By languageLocator = By.id("programmingLanguageSelect");
        WebElement languageElement = driverWait.until(ExpectedConditions.visibilityOfElementLocated(languageLocator));
        Select languageSelect = new Select(languageElement);
        languageSelect.selectByValue("java");
        Thread.sleep(1000);

        languageSelect.selectByVisibleText("Python");
        Thread.sleep(1000);

        languageSelect.selectByIndex(2);

        By countryLocator = By.xpath("/html/body/div/div[1]/div[2]/div/div[2]/select");
        WebElement countryElement = driverWait.until(ExpectedConditions.presenceOfElementLocated(countryLocator));
        Select countrySelect = new Select(countryElement);
        countrySelect.selectByVisibleText("India");

        driver.quit();
    }
}
