package tek.selenium.week_1.day_2;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class UseBrowsers {

    public static void main(String[] args) {

        // WebDriverManager Library was required for setup each browser before Selenium V4.4.0

        // to open a browser we need to instantiate new object of that browser.
        ChromeDriver chromeDriver = new ChromeDriver();

        // navigate to a URL
        chromeDriver.get("https://google.com");
        String googleTitle =  chromeDriver.getTitle();
        System.out.println(googleTitle);
        chromeDriver.quit();

        // Edge Browser
        EdgeDriver edgeDriver = new EdgeDriver();
        edgeDriver.get("https://google.com");
        String titleWithEdge = edgeDriver.getTitle();
        System.out.println(titleWithEdge);
        edgeDriver.quit();



    }
}
