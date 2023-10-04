package tek.selenium.week_3.day_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PracticeHandleTables {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://happy-desert-0f05d560f.1.azurestaticapps.net/");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));

       By userNameInput = By.xpath("//input[@name='username']");
       wait.until(ExpectedConditions.visibilityOfElementLocated(userNameInput)).sendKeys("supervisor");

       By passwordInput = By.xpath("//input[@name='password']");
       wait.until(ExpectedConditions.visibilityOfElementLocated(passwordInput)).sendKeys("tek_supervisor");

       By submitButton = By.xpath("//button[@type='submit']");
       wait.until(ExpectedConditions.elementToBeClickable(submitButton)).click();

       By accountLink = By.xpath("//a[@routerlink='/csr/accounts']");
       wait.until(ExpectedConditions.elementToBeClickable(accountLink)).click();

       // Wait until not visibility of spinner
        // this will wait until the spinner is not visible
       By spinnerLocator = By.xpath("//app-spinner");
       wait.until(ExpectedConditions.not(ExpectedConditions.visibilityOfElementLocated(spinnerLocator)));

       By accountDetailLink = By.xpath("//table/tbody/tr[1]/td[8]");
       wait.until(ExpectedConditions.visibilityOfElementLocated(accountDetailLink)).click();

       By accountDetailTitle = By.xpath("//app-account-detail/mat-card/mat-card-title");
       String titleText = wait.until(ExpectedConditions.visibilityOfElementLocated(accountDetailTitle)).getText();
       System.out.println(titleText);

        driver.quit();
    }
}
