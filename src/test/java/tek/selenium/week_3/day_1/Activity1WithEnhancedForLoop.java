package tek.selenium.week_3.day_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Activity1WithEnhancedForLoop {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://qa.insurance.tekschool-students.com/");
        // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.findElement(By.name("username")).sendKeys("supervisor");
        driver.findElement(By.name("password")).sendKeys("tek_supervisor");
        driver.findElement(By.id("loginButton")).click();

        By accountLink = By.xpath("//a[@routerlink='/csr/accounts']");
        wait.until(ExpectedConditions.elementToBeClickable(accountLink)).click();

        By spinnerLocator = By.xpath("//app-spinner");
        wait.until(ExpectedConditions.not(ExpectedConditions.visibilityOfElementLocated(spinnerLocator)));

        By columnsLocator = By.xpath("//table/thead/tr/th");
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(columnsLocator));

        List<WebElement> columnsElements = driver.findElements(columnsLocator);

        for (WebElement element : columnsElements){
            System.out.print(element.getText() + ", ");
        }
        driver.quit();
    }
}
