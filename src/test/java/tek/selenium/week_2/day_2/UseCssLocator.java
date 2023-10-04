package tek.selenium.week_2.day_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseCssLocator {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://happy-desert-0f05d560f.1.azurestaticapps.net/");
        Thread.sleep(1000);

        By pageTitleLocator = By.cssSelector("body > app-root > app-login > mat-toolbar > span:nth-child(2)");
        WebElement pageTitleElement = driver.findElement(pageTitleLocator);
        System.out.println(pageTitleElement.getText());

        WebElement subTitle = driver.findElement(By.cssSelector("body > app-root > app-login > div > mat-card > mat-card-title:nth-child(1) > strong"));
        System.out.println(subTitle.getText());
        Thread.sleep(1000);
        driver.quit();
    }
}
