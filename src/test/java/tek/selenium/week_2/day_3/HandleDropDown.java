package tek.selenium.week_2.day_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HandleDropDown {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://tek-retail-ui.azurewebsites.net/selenium/dropdown");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        Thread.sleep(1000);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        By languageLocator = By.id("programmingLanguageSelect");
        WebElement languageElement = wait.until(ExpectedConditions.
                visibilityOfElementLocated(languageLocator));
        Select languageSelect = new Select(languageElement);
        languageSelect.selectByVisibleText("Python");
        Thread.sleep(1000);
        languageSelect.selectByValue("java");

        Thread.sleep(1000);
        languageSelect.selectByIndex(0);

        By countryLocator = By.xpath("/html/body/div/div[1]/div[2]/div/div[2]/select");
        WebElement countryElement = wait.until(ExpectedConditions.
                visibilityOfElementLocated(countryLocator));
        Select countrySelect = new Select(countryElement);
        countrySelect.selectByVisibleText("Afghanistan");
        Thread.sleep(1000);
        languageSelect.selectByValue("Cuba");

        Thread.sleep(1000);
        languageSelect.selectByIndex(4);

        driver.quit();
    }
}
