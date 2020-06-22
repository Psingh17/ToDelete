package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.concurrent.TimeUnit;

public class GoogleSearchSteps {
    WebDriver driver = null;

    @Given("browser is open")
    public void browser_is_open() {
        String projectPath= System.getProperty("user.dir");
        System.out.println("proj path-->"+projectPath);
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Psingh\\IdeaProjects\\CucumberPractice\\src\\test\\resources\\Browsers\\chromedriver.exe");
        driver= new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }


    @And("user is on google search page")
    public void user_is_on_google_search_page() {
        driver.navigate().to("https://google.com");
    }


    @When("user enter a text to search")
    public void user_enter_a_text_to_search() {
        driver.findElement(By.name("q")).sendKeys("Google");


    }


    @And("hits enter")
    public void hits_enter() {
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
    }


    @Then("user is navigated to search result page")
    public void user_is_navigated_to_search_result_page() {
        System.out.println(driver.getPageSource().contains("Google Account"));

    }

}
