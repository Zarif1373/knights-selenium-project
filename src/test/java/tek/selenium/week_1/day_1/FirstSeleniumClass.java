package tek.selenium.week_1.day_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumClass {

    public static void main(String[] args) {
        // 1) Create a new object of ChromeDriver
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://google.com");

    }
}
