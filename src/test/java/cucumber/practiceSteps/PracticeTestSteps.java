package cucumber.practiceSteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PracticeTestSteps {
    private static WebDriver driver;

    @Given("Iopen browser {string}")
    public void iopen_browser(String browser) {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://qa.insurance.tekschool-students.com/");
    }

    @When("Isending username {string} and password {string}")
    public void isendingCredential(String username, String password) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username"))).sendKeys(username);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password"))).sendKeys(password);
    }

    @When("IClick on login button")
    public void iclickOnLoginButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
        wait.until(ExpectedConditions.elementToBeClickable(By.id("loginButton"))).click();
    }

    @Then("ILogin Successfully")
    public void ilogin_successfully() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
        String titleText1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//app-toolbar/mat-toolbar/span[1]"))).getText();

        String expectedText1 = "Tek Insurance App";
        System.out.println(titleText1);
        Thread.sleep(3000);
    }

    @Then("IClose Browser")
    public void iCloseBrowser(){
        driver.quit();
    }
}
