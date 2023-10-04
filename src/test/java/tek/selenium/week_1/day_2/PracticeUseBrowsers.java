package tek.selenium.week_1.day_2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class PracticeUseBrowsers {
    public static void main(String[] args) throws InterruptedException {

        // WebDriverManager Library was required for setup each browser before Selenium v4.4.0

        // to open a browser we need to instantiate new object of that browser.
        WebDriver driver = new ChromeDriver();

        // navigate to the url
        driver.get("https://happy-desert-0f05d560f.1.azurestaticapps.net/");
        driver.manage().window().maximize();

        String title = driver.getTitle();
        System.out.println("Title: " + title);


        //  By usernameInput = new
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        driver.quit();

        // Edge Browser
        WebDriver edgeDriver = new EdgeDriver();
        edgeDriver.get("https://google.com");
        edgeDriver.manage().window().maximize();
        String edgeTitle = edgeDriver.getTitle();
        System.out.println("Title in Edge: " + edgeTitle);
        edgeDriver.quit();
    }
}
