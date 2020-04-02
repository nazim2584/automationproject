package starter.search;

import org.openqa.selenium.By;

class RegistrationORPage {
    static By SIGN_IN_BTTON = By.linkText("Sign In");
    static By CREATE_BUUTON = By.xpath("//*[@id=\"signin-options\"]/div/div[2]/a");
    static By CUSTOMER_NAME = By.id("ap_customer_name");
    static By EMAIL= By.id("ap_email");
    static By PASSWORD = By.id("ap_password");
    static By REENTER_PASSWORD=By.id("ap_password_check");
    static By SUBMIT_BUTTON=By.id("continue");
    static By USER_NAME=By.xpath("//*[@id=\"imdbHeader\"]/div[2]/div[5]/div/label[2]/div/span");
}
