package tek.selenium.week_1.day_3;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeUseLocatorTagName {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://tek-retail-ui.azurewebsites.net/selenium/inputs");

        // find all the links in this page
        // in HTML all Links are <a></a> so you use tagName
        // there is possibility to have more than 1 element with same tagName in webPage
        // So we have to use driver.findElements();

        By anchorTagLocator = By.tagName("a");
        List<WebElement> linkElements = driver.findElements(anchorTagLocator);

        for (WebElement element : linkElements){
            String linkText = element.getText();
            System.out.println(linkText);
        }
        driver.quit();
    }
}
