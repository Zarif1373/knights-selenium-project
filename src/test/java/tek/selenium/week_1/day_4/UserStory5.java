package tek.selenium.week_1.day_4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UserStory5 {
    public static void main(String[] args) {
        /*
        AS CSR User when navigating to <Tek Insurance Portal>
        Login button should be disabled
        After entering username and password login button should enabled
         */
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://happy-desert-0f05d560f.1.azurestaticapps.net/");

        By loginLocator = By.id("loginButton");
        WebElement loginButtonElement = driver.findElement(loginLocator);
        boolean isEnabled = loginButtonElement.isEnabled();

        if(isEnabled == false){
            System.out.println("Test Passed");
            System.out.println("Button is disabled");
        } else {
            System.out.println("Test Failed");
            System.out.println("Button is enabled");
        }
        driver.quit();

//        WebElement Login = driver.findElement(By.id("loginButton"));
//        System.out.println(" Is the login button enabled before entering the output: "
//                + Login.isEnabled());
//
//        WebElement userName = driver.findElement(By.name("username"));
//        userName.sendKeys("supervisor");
//
//        WebElement password = driver.findElement(By.name("password"));
//        password.sendKeys("sghfdklse987");
//
//        WebElement login = driver.findElement(By.id("loginButton"));
//        System.out.println("Login button enabled after entering the input: "
//                + login.isEnabled());

//        driver.quit();

    }
}
