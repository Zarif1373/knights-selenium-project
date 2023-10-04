package tek.selenium.week_2.day_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PPracticeActivity1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://happy-desert-0f05d560f.1.azurestaticapps.net/");

        WebElement titleElement = driver.findElement(By.xpath("/html/body/app-root/app-login/mat-toolbar/span[1]"));
        String titleText = titleElement.getText();
        System.out.println(titleText);

        WebElement subTitleElement = driver.findElement(By.xpath("/html/body/app-root/app-login/div/mat-card/mat-card-title[1]/strong"));
        System.out.println(subTitleElement.getText());

        WebElement miniSubTitleElement = driver.findElement(By.xpath("/html/body/app-root/app-login/div/mat-card/mat-card-title[2]"));
        System.out.println(miniSubTitleElement.getText());

        driver.findElement(By.name("username")).sendKeys("supervisor");
        driver.findElement(By.name("password")).sendKeys("sagljhks");
        driver.findElement(By.id("loginButton")).click();

        Thread.sleep(1000);
        WebElement errorElement = driver.findElement(By.xpath("/html/body/app-root/app-login/div/mat-card/mat-card-content/app-banner/div"));
        String errorText = errorElement.getText();
        String expectedText = "Password Not Matched";


        if(errorText.equals(expectedText)){
            System.out.println("Test Passed");
            System.out.println("Error: " + errorText);
        } else {
            System.out.println("Test Failed");
        }
        Thread.sleep(1000);

        driver.quit();

    }
}
