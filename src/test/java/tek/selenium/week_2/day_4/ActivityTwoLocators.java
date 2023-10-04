package tek.selenium.week_2.day_4;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class ActivityTwoLocators {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://tek-retail-ui.azurewebsites.net/selenium");

//Tag Name Locator: //Syntax: By.tagName("tag_name")
// Explanation: This locator identifies elements by their HTML tag name (e.g., div, a, input).
// It returns a list of all elements with the specified tag.
 By tNameLocators = By.tagName("a");
 List<WebElement> tagElement = driver.findElements(tNameLocators);
 for( WebElement element: tagElement) {
     String text = element.getText();
     System.out.println(" List of items under tag a : " + text);
     if (text.equals("Context Menu")) {
 //        tagElement.click();
     }
 }

// Link Text and Partial Link Text Locators:
// Syntax: By.linkText("exact_text") and By.partialLinkText("partial_text")
// Explanation: These locators are used to find anchor (link) elements by their visible text.
// linkText matches the exact text, while partialLinkText matches a part of the text.
 By linkTextLocator = By.linkText("Dynamic Content");
 WebElement lElement = driver.findElement(linkTextLocator);
 lElement.click(); By partialLinkedText = By.partialLinkText("Dynamic ");
 WebElement partialLinkTextElement = driver.findElement(partialLinkedText); partialLinkTextElement.click();


    }
}
