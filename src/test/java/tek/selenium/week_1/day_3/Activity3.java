package tek.selenium.week_1.day_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Activity3 {
    public static void main(String[] args) {
        /*
        navigate to https//bbc.com
        and print the text of all links this home page.
         */
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://www.bbc.com/");

            By anchorTagLocator = By.tagName("a");
            List<WebElement> linksElements = driver.findElements(anchorTagLocator);
//            for(WebElement element : linksElements){
//                String linkText = element.getText();
//                System.out.println(linkText);
//            }

            for(int i = 0; i < linksElements.size(); i++){
                String linkText = linksElements.get(i).getText();
                System.out.println(linkText);
            }
            driver.quit();
    }
}
