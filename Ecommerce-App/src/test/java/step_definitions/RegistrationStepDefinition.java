package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pagesContent.Registration;

import java.util.Random;



public class RegistrationStepDefinition {
    Registration register = TestBase.object.registrationPOM();
    @Given("user navigate to registration page")
    public void navigate_to_registration() {
        // user register using POM //
        register.registerEle();
    }
    // Valid Email with Random Generator //
    static Random randomGenerator = new Random();
    static int randomInt = randomGenerator.nextInt(1000);
    static String s = Integer.toString(randomInt);
    public static String email = "reem.abdulla1150" + s + "@gmail.com";
    public static String pass = "12345678";
    public static String FirstName = "Reem";
    public static String LastName = "Abdulla";

    @And("user fills registration form with valid data")
    public void new_user_fills_registration_form_with_valid_data() {
        // Fill valid Data using POM //
        register.registerData(FirstName, LastName, pass, email);
    }

    @When("user clicks on register button")
    public void user_click_register_button() {
        // click Register Button using POM //
        register.registerButtonEle();
    }
    @Then("a success message is displayed")
    public void a_success_message_is_displayed() {
        //Assertion1 using POM //
        register.registerAsserEle();
        System.out.println("Assertion: Your registration completed");
    }
    @And("user close driver")
        public void closer_driver(){

            // close driver using POM //
            register.registerLogoutEle();
        }

    }
