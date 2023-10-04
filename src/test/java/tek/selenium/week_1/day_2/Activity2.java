package tek.selenium.week_1.day_2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.Scanner;

public class Activity2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://happy-desert-0f05d560f.1.azurestaticapps.net/");
        driver.manage().window().maximize();

        String title = driver.getTitle();

        if(title.equals("Tek Insurance Service")) {
            System.out.println("Passed");
            System.out.println("Title: " + title);
        } else {
            System.out.println("Failed");
        }
        driver.quit();
    }
}
