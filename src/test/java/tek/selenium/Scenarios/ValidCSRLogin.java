package tek.selenium.Scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidCSRLogin {
    // User Story # 6
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://happy-desert-0f05d560f.1.azurestaticapps.net/");
        Thread.sleep(1000);

        driver.findElement(By.name("username")).sendKeys("supervisor");
        driver.findElement(By.name("password")).sendKeys("tek_supervisor");
        driver.findElement(By.id("loginButton")).click();
        Thread.sleep(1000);

        WebElement TekTitle = driver.findElement(By.xpath("/html/body/app-root/app-home-page/div/app-toolbar/mat-toolbar/span[1]"));
        String TekTitleText = TekTitle.getText();
        String expectedPageTitle = "Tek Insurance App";
        if(TekTitleText.equals(expectedPageTitle)){
            System.out.println("Test Passed");
            System.out.println("Title Page: " + TekTitleText);
        } else {
            System.out.println("Test Failed");
        }

        WebElement loggedIn = driver.findElement(By.xpath("/html/body/app-root/app-home-page/div/app-toolbar/mat-toolbar/button[2]"));
        String loggedInText = loggedIn.getText();
        String expectedUserName = "Supervisor";
        System.out.println(loggedInText);

        String actualUserName = loggedInText.substring(0, expectedUserName.length());

        if (actualUserName.equals(expectedUserName)){
            System.out.println("User name is correctly printed");
        } else {
            System.out.println("UserName wrong Test Failed");
        }
        Thread.sleep(1000);

        driver.quit();
    }
}
