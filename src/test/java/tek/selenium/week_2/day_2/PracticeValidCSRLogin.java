package tek.selenium.week_2.day_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeValidCSRLogin {
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
        driver.findElement(By.name("password")).sendKeys("tek_supervisor");
        driver.findElement(By.id("loginButton")).click();

        Thread.sleep(1000);
        WebElement titleLoggedElement = driver.findElement(By.xpath("/html/body/app-root/app-home-page/div/app-toolbar/mat-toolbar/button[2]/span[1]"));
        String titleLoggedText = titleLoggedElement.getText();

        String expectedText = "Supervisor";
       String actualUserName = titleLoggedText.substring(0, expectedText.length());

        if(actualUserName.equals(expectedText)){
            System.out.println("Test Passed");
            System.out.println("Actual User Name: " + actualUserName);
        } else {
            System.out.println("Test Failed");
        }
        Thread.sleep(1000);

        driver.quit();

    }
}
