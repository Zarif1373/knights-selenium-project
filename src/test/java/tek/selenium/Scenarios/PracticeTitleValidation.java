package tek.selenium.Scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeTitleValidation {
    /* As User when navigating to https://happy-desert-0f05d560f.1.azurestaticapps.net/ I should see
    Page title as Tek Insurance Service.
    In order to validate do simple if / else and print pass or fails
     */
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://happy-desert-0f05d560f.1.azurestaticapps.net/");
        String title = driver.getTitle();
        By userInputLocator = By.name("name");

        if(title.equals("Tek Insurance Service")){
            System.out.println("Test Passed");
        }else {
            System.out.println("Test Failed");
            System.out.println("Expecting to be Tek Insurance Service " + "but it was " + title);
        }
        driver.quit();
    }
}