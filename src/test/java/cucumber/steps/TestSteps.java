package cucumber.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TestSteps {
    private static WebDriver driver;

    @Given("open browser {string}")
    public void openBrowser(String browser){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://qa.insurance.tekschool-students.com/");
    }

    @When("sending username {string} and password {string}")
    public void sendingCredential(String username, String password) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username"))).sendKeys(username);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password"))).sendKeys(password);
    }

    @When("Click on login button")
    public  void clickOnLoginButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
        wait.until(ExpectedConditions.elementToBeClickable(By.id("loginButton"))).click();
    }

    @Then("Login Successfully")
    public  void login_successfully() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
        String titleText = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//app-toolbar/mat-toolbar/span[1]"))).getText();
        String expectedText = "Tek Insurance Applications";
        System.out.println(titleText);
        Thread.sleep(3000);
    }

    @Then("close browser")
    public void closeBrowser(){
        driver.quit();
    }
}
