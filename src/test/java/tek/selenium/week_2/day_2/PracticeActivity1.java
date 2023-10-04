package tek.selenium.week_2.day_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeActivity1 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://happy-desert-0f05d560f.1.azurestaticapps.net/");

        Thread.sleep(1000);

        By titleLocator = By.xpath("/html/body/app-root/app-login/mat-toolbar/span[1]");
        WebElement titleElement = driver.findElement(titleLocator);
        String sectionTitle = titleElement.getText();

        System.out.println(sectionTitle);

        driver.quit();
    }
}
