package steps;

import com.baseclasses.baseuse;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class login extends baseuse {

    @Given("user is on Login page")
    public void userIsOnLoginPage() throws InterruptedException {
        Thread.sleep(5000);
        String title= driver.getTitle();
        if(title.equals("Account Login")){
            System.out.println("user is on Login Page");
        }
    }
    @When("user enter the username & password")
    public void userEnterTheUsernamePassword() throws InterruptedException {
        driver.findElement(By.name("email")).sendKeys("priyankadurga.t@gmail.com");
        Thread.sleep(5000);
        driver.findElement(By.name("password")).sendKeys("Priyank@123");
        Thread.sleep(5000);
    }

    @Then("user click on submit")
    public void userClickOnSubmit() throws InterruptedException {
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        Thread.sleep(5000);
    }
    
    public void setMethod() {
        System.out.println("Hey Priyanka");
    }


}
