package tek.selenium.week_1.day_2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverConfiguration {

    public static void main(String[] args) throws Exception {

        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        // maximize the browser window size
        driver.manage().window().maximize();
        Thread.sleep(1000 * 5);
        driver.quit();
    }
}
