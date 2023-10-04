package tek.selenium.week_2.day_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PracticeUseImplicitWait {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        // Add implicit wait.
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        driver.get("https://happy-desert-0f05d560f.1.azurestaticapps.net/");

        WebElement pageTitleElement = driver.findElement(By.xpath("/html/body/app-root/app-login/div/mat-card/mat-card-title[1]/strong"));
        System.out.println(pageTitleElement.getText());

        //Explicitly Wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        By userNameInputLocator = By.name("username");
        WebElement userNameInputElement = wait.until(ExpectedConditions.presenceOfElementLocated(userNameInputLocator));
        userNameInputElement.sendKeys("Wrong username");

        By passwordInputLocator = By.name("password");
        WebElement passwordInputElement = wait.until(ExpectedConditions.presenceOfElementLocated(passwordInputLocator));
        passwordInputElement.sendKeys("Wrong password");

        By loginButtonLocator = By.id("loginButton");
        WebElement loginButtonElement = wait.until(ExpectedConditions.elementToBeClickable(loginButtonLocator));
        loginButtonElement.click();

        By errorLocator = By.className("error");
        WebElement errorElement = wait.until(ExpectedConditions.visibilityOfElementLocated(errorLocator));
        String errorText = errorElement.getText();
        System.out.println(errorText);
        driver.quit();
    }
}
