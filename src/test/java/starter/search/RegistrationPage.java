/**
 * 
 */
package starter.search;

import java.util.Random;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;

/**
 * @author NAZIM KHAN
 *
 */
public class RegistrationPage extends UIInteractionSteps {

   
    @Step("As a user click on the Sign In link displayed on the top right corner")
    public void signInButton() {
        $(RegistrationORPage.SIGN_IN_BTTON).click();
    }
    
    @Step("click the Create a New Account button")
    public void createNewAccountButton() {
        $(RegistrationORPage.CREATE_BUUTON).click();
    }
    
    @Step("create an  account by filling the registration form")
    public void fillTheRegistrationForm() {
        $(RegistrationORPage.CUSTOMER_NAME).sendKeys("Automation");
        $(RegistrationORPage.EMAIL).sendKeys(getRandomNumberString()+"auto@gmail.com");
        $(RegistrationORPage.PASSWORD).sendKeys("Automation123");
        $(RegistrationORPage.REENTER_PASSWORD).sendKeys("Automation123");
        $(RegistrationORPage.SUBMIT_BUTTON).click();
        
    }
    
    @Step("Verify whether the newly registered user was able to login to the application")
    public void verifyUserName() {
        $(RegistrationORPage.USER_NAME).isDisplayed();
    }
    
    public static String getRandomNumberString() {
        // It will generate 6 digit random Number.
        // from 0 to 999999
        Random rnd = new Random();
        int number = rnd.nextInt(999999);

        // this will convert any number sequence into 6 character.
        return String.format("%06d", number);
    }
}
