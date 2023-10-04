package tek.selenium.week_2.day_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://happy-desert-0f05d560f.1.azurestaticapps.net/");

        By headerLocator = By.xpath("html/body/app-root/app-login/" +
                "mat-toolbar/span[1]");
        WebElement headerElement = driver.findElement(headerLocator);
        String headerText = headerElement.getText();
        System.out.println(headerText);

        System.out.println(driver.findElement(By.xpath("/html/body/app-root/app-login/div/mat-card/" +
                "mat-card-title[1]/strong")).getText());
        System.out.println(driver.findElement(By.xpath("/html/body/app-root/app-" +
                "login/div/mat-card/mat-card-title[2]")).getText());

        driver.findElement(By.name("username")).sendKeys("Zarif");
        driver.findElement(By.name("password")).sendKeys("Password352$%23@");
        driver.findElement(By.id("loginButton")).click();
        Thread.sleep(1000);
        WebElement errorElement = driver.findElement(By.xpath("/html/body/app-root/app-login/div/mat-card/mat-card-content/app-banner/div"));
        String errorText = errorElement.getText();
        System.out.println(errorText);
        driver.quit();
    }
}
