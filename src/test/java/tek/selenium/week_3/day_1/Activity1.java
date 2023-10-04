package tek.selenium.week_3.day_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity1 {
    public static void main(String[] args) throws InterruptedException {

        // navigate to insurance app, and login and go to accounts
        // wait for spinner to disappear
        // and print the table headers one by one

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://qa.insurance.tekschool-students.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        By usernameInput = By.xpath("//input[@name='username']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(usernameInput)).sendKeys("supervisor");

        By passwordInput = By.xpath("//input[@name='password']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(passwordInput)).sendKeys("tek_supervisor");

        By submitButton = By.xpath("//button[@type='submit']");
        wait.until(ExpectedConditions.elementToBeClickable(submitButton)).click();

        By accountLink = By.xpath("//a[@routerlink='/csr/accounts']");
        wait.until(ExpectedConditions.elementToBeClickable(accountLink)).click();

        By spinnerLocator = By.xpath("//app-spinner");
        wait.until(ExpectedConditions.not(ExpectedConditions.visibilityOfElementLocated(spinnerLocator)));

        By header1Locator = By.xpath("//table/thead/tr/th[1]");
        String header1Text = wait.until(ExpectedConditions.visibilityOfElementLocated(header1Locator)).getText();
        System.out.println(header1Text);

        By header2Locator = By.xpath("//table/thead/tr/th[2]");
        String header2Text = wait.until(ExpectedConditions.visibilityOfElementLocated(header2Locator)).getText();
        System.out.println(header2Text);

        By header3Locator = By.xpath("//table/thead/tr/th[3]");
        String header3Text = wait.until(ExpectedConditions.visibilityOfElementLocated(header3Locator)).getText();
        System.out.println(header3Text);

        By header4Locator = By.xpath("//table/thead/tr/th[4]");
        String header4Text = wait.until(ExpectedConditions.visibilityOfElementLocated(header4Locator)).getText();
        System.out.println(header4Text);

        By header5Locator = By.xpath("//table/thead/tr/th[5]");
        String header5Text = wait.until(ExpectedConditions.visibilityOfElementLocated(header5Locator)).getText();
        System.out.println(header5Text);

        By header6Locator = By.xpath("//table/thead/tr/th[6]");
        String header6Text = wait.until(ExpectedConditions.visibilityOfElementLocated(header6Locator)).getText();
        System.out.println(header6Text);

        By header7Locator = By.xpath("//table/thead/tr/th[7]");
        String header7Text = wait.until(ExpectedConditions.visibilityOfElementLocated(header7Locator)).getText();
        System.out.println(header7Text);

        By header8Locator = By.xpath("//table/thead/tr/th[8]");
        String header8Text = wait.until(ExpectedConditions.visibilityOfElementLocated(header8Locator)).getText();
        System.out.println(header8Text);

        Thread.sleep(5000);

        driver.quit();
    }
}
