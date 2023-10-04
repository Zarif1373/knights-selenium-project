package tek.selenium.week_2.day_3;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
public class Activity3 {
//Navigate to Facebook.com
//Click on Create new Account.
//Validate dialog title is Sign Up
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");

        driver.findElement(By.linkText("Create new account")).click();
        //Explicit Wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        By dialogeTitleLocator = By.xpath("//*[@id=\"facebook\"]/body/div[3]" +
                "/div[2]/div/div/div[1]/div[1]");
        WebElement dialogeTitleElement = wait.until(ExpectedConditions.
                presenceOfElementLocated(dialogeTitleLocator));
        String actualDialogTitle = "Sign Up";
        String expectedDialogTitle = dialogeTitleElement.getText();

        if(expectedDialogTitle.equals(actualDialogTitle)){
            System.out.println("Test Passed");
            System.out.println("Dialog Title: " + expectedDialogTitle);
        } else {
            System.out.println("Test Failed");
            System.out.println("Dialoge Title: " + dialogeTitleElement.getText());
        }
        //implicit Wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.quit();
    }
}
