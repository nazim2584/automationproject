package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.navigation.NavigateTo;
import starter.search.RegistrationPage;
import starter.search.SearchResult;

public class RegistrationStepDefinitions {

    @Steps
    NavigateTo navigateTo;

    @Steps
    RegistrationPage registration;

    @Steps
    SearchResult searchResult;

   
    @Given("As a user click on the Sign In link displayed on the top right corner")
    public void clickOnSIgnInButton() {
    	navigateTo.imdbHomePage();
    	registration.signInButton();
    }
    
    @And("click the Create a New Account button")
    public void clickOnCreateNewAccountButton() {
    	registration.createNewAccountButton();	
    }
    
    @When("create an  account by filling the registration form")
    public void fillRegistrationForm() {
    	registration.fillTheRegistrationForm();
       }
    
    @Then("Verify whether the newly registered user was able to login to the application")
    public void verifyThatUserIsAbleToLogin() {
        registration.verifyUserName();
    }
}
