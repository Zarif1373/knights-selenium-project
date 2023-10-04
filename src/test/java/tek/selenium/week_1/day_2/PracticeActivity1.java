package tek.selenium.week_1.day_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.Scanner;

public class PracticeActivity1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // open Chrome Browser and navigate to Facebook page.
     //   WebDriver driver = input.next();

      String browserType = input.next();
      WebDriver driver;

      if(browserType.equals("chrome")){
          driver = new ChromeDriver();
      } else if (browserType.equals("edge")){
          driver = new EdgeDriver();
      } else {
          // Intentiona stop execution of application with throw keyword
          throw new RuntimeException();
      }

        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");

        // print the title and quite browser
        String title = driver.getTitle();
        System.out.println("Title: " + title);

        By userInput = By.name("email");
        WebElement facebookElement = driver.findElement(userInput);
        facebookElement.sendKeys("Ahmad@gmail.com");

        By userPassword = By.name("pass");
        WebElement faceBookPassword = driver.findElement(userPassword);
        faceBookPassword.sendKeys("Ahmad%98");

        try {
            Thread.sleep(2000);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

        if (title.equals("Facebook - log in or sign up")){
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }
        driver.quit();
    }
}
