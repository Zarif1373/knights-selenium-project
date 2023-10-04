package tek.selenium.week_2.day_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PracticeActivity4 {
        /*
navigate to https://tek-retail-ui.azurewebsites.net/selenium/dropdown
in Select website's language drop down
select what ever language you want.
make use using wait implicit and explicit
*/

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://tek-retail-ui.azurewebsites.net/selenium/dropdown");

        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));

        WebDriverWait driverWait = new WebDriverWait(driver, Duration.ofSeconds(2));
        By languageLocator = By.cssSelector("#languageSelect");
        WebElement languageElement = driverWait.until(ExpectedConditions.visibilityOfElementLocated(languageLocator));
        Select languageSelect = new Select(languageElement);
        languageSelect.selectByVisibleText("English");
        Thread.sleep(1000);

        languageSelect.selectByIndex(2);
        Thread.sleep(1000);

        languageSelect.selectByValue("Persian");
        Thread.sleep(1000);

        driver.quit();
    }

}
