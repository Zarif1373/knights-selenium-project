package tek.selenium.Scenarios;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleValidation {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://happy-desert-0f05d560f.1.azurestaticapps.net/");
        String actualTitle = driver.getTitle();

        if (actualTitle.endsWith("Tek Insurance Service")) {
            System.out.println("Passed");
            System.out.println("Title: " + actualTitle);
        } else {
            System.out.println("Test Failed");
            System.out.println("Expecting to be Tek Insurance Service " + "but it was " + actualTitle);
        }
        driver.quit();
    }
}
