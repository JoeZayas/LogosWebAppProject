package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.*;
import java.util.Properties;
import java.util.logging.Logger;

public class LoginStepDef {

    public static WebDriver driver;
    @Given("user is navigated to logos.com home page")
    public void user_is_navigated_to_logos_com_home_page() {



        //System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");

        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();

        driver.get("https://www.logos.com/");


    }

    @When("user clicks on sign in button at top right of page")
    public void user_clicks_on_sign_in_button_at_top_right_of_page() {
        driver.findElement(By.xpath("//a[@class='Button__ButtonCore-sc-1lgbbz6-0 hdfEXs sc-nVkyK sc-ehCJOs dfAta-D']")).click();

    }

    @Then("user is navigated to auth window")
    public void user_is_navigated_to_auth_window() {
       //driver.findElement(By.xpath("//input[@autocomplete='username']")).click();
        String title = driver.getTitle();

        if(title == "auth") {
            System.out.println("The title is " + title);
        }else{
            System.out.println("test failed");
        }
    }

    @Then("user enters username and password")
    public void user_enters_username_and_password() {
        driver.findElement(By.xpath("//input[@autocomplete='username']")).sendKeys("jzayas743@students.sbts.edu");

        driver.findElement(By.xpath("//input[@autocomplete='current-password']")).sendKeys("Southern2017");
    }

    @Then("user clicks on sign in button")
    public void user_clicks_on_sign_in_button() {
        driver.findElement(By.xpath("//button[@class='Button__ButtonCore-sc-1lgbbz6-0 fpTIsD']")).click();
    }

    @Then("user is navigated back to logo.com home page")
    public void user_is_navigated_back_to_logo_com_home_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
