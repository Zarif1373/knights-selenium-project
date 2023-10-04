package tek.selenium.week_1.day_4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeUserStory5 {
    public static void main(String[] args) {
        /*
        As Selenium Activity
        As CSR User when navigating to<Tek Insurance Portal>
        Login button should be disabled (element.isEnabled())
        After entering username and password login button should be enabled
         */
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://happy-desert-0f05d560f.1.azurestaticapps.net/");

        By loginButtonLocator = By.id("loginButton");
        WebElement loginButtonElement = driver.findElement(loginButtonLocator);
        boolean isDisabled = loginButtonElement.isEnabled();

        if (isDisabled == false){
            System.out.println("Test Passed");
            System.out.println("Login button is disabled");
        } else {
            System.out.println("Button is enabled");
        }

        driver.findElement(By.name("username")).sendKeys("supervisor");
        driver.findElement(By.name("password")).sendKeys("lajsflsdjf");

        boolean isEnabled = driver.findElement(By.id("loginButton")).isEnabled();

        if (isEnabled == true){
            System.out.println("Test Passed");
            System.out.println("Login button is enabled");
        } else {
            System.out.println("Button is enabled");
        }

//        By userNameLocator = By.name("username");
//        WebElement userNameElement = driver.findElement(userNameLocator);
//        userNameElement.sendKeys("supervisor");
//
//        By passwordLocator = By.name("username");
//        WebElement passwordElement = driver.findElement(passwordLocator);
//        passwordElement.sendKeys("supervisor");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();

    }
}
