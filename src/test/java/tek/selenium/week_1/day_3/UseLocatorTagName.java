package tek.selenium.week_1.day_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class UseLocatorTagName {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://tek-retail-ui.azurewebsites.net/selenium");

        // find all the link in this page
        // in HTML all links are <a></a> so you can use tagName
        // there is possibility to have more than 1 element
        // So we have to use driver.findElements();
        By anchorTagLocator = By.tagName("a");
        List<WebElement> linksElements = driver.findElements(anchorTagLocator);
        for (WebElement element : linksElements){
            String linkText = element.getText();
            System.out.println(linkText);
        }

        driver.quit();
    }
}
