package tek.selenium.week_3.day_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class PracticeActivity1 {
    // navigate to insurance app, and login and go to accounts
    // wait for spinner to disappear
    // and print the table headers one by one
    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://qa.insurance.tekschool-students.com/");
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        //Explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));

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
        By spinner = By.xpath("//app-spinner");
        wait.until(ExpectedConditions.not(ExpectedConditions.visibilityOfElementLocated(spinner)));

        By columnsLocator = By.xpath("//table/thead/tr/th");
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(columnsLocator));

        List<WebElement> columnsElements = driver.findElements(columnsLocator);

        for (WebElement element : columnsElements){
            System.out.println(element.getText());
        }
        driver.quit();
    }
}
