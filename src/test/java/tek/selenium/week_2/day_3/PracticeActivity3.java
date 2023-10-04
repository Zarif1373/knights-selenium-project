package tek.selenium.week_2.day_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PracticeActivity3 {
    // Navigate to Facebook.com
    // Click on Create new account
    // dialog title is Sign up

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

    try {
        WebDriverWait driverWait = new WebDriverWait(driver, Duration.ofSeconds(5));
        By createAccountButtonLocator = By.linkText("Create new account");
        WebElement createAccountElement = driverWait.until(ExpectedConditions.visibilityOfElementLocated(createAccountButtonLocator));
        createAccountElement.click();

        By createAccountLocator = By.xpath("//*[@id=\"facebook\"]/body/div[3]/div[2]/div/div/div[1]/div32[23]");
        WebElement dialogTitleElement = driverWait.until(ExpectedConditions.visibilityOfElementLocated(createAccountLocator));
        String dialogText = dialogTitleElement.getText();
        System.out.println(dialogText);
    } catch (Exception e){
        System.out.println(e.getMessage());
      //  e.printStackTrace();
    }finally {
        driver.quit();
    }

    }
}
