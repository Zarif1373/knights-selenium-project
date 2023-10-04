package tek.selenium.week_1.day_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class PracticeActivity3 {
    public static void main(String[] args) throws InterruptedException {
         /*
        navigate to https://bbc.com
        and print the text of all links this home page.
         */
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://bbc.com");

        Thread.sleep(3000);
        By linkLocators = By.tagName("a");
        List<WebElement> linkElements = driver.findElements(linkLocators);

        for (WebElement element : linkElements){
            String linkText = element.getText();
            System.out.println(linkText);
        }
//        for (int i = 0; i < linkElements.size(); i++){
//            String linkText = linkElements.get(i).getText();
//            System.out.println(linkText);
//        }
        driver.quit();
    }
}
