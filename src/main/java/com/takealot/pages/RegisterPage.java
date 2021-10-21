package com.takealot.pages;

import com.cucumber.listener.Reporter;
import com.takealot.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/* Created
 * by Lamee */
public class RegisterPage extends Utility {
    private static final Logger log = LogManager.getLogger(RegisterPage.class.getName());

    @FindBy(xpath = "//a[contains(text(),'Register')]")
    WebElement _registerLink;
    @FindBy(xpath = "//input[@id='firstname']")
    WebElement _firstName;
    @FindBy(xpath = "//input[@id='surname']")
    WebElement _lastName;
    @FindBy(xpath = "//input[@id='email']")
    WebElement _emailAddress;
    @FindBy(css = "#email2")
    WebElement _reTypeEmailAddress;
    @FindBy(xpath = "//input[@id='password']")
    WebElement _password;
    @FindBy(css = "#password2")
    WebElement _reTypePassword;
    @FindBy(css = "#telno1")
    WebElement _mobileNumber;
    @FindBy(xpath = "//body/div[3]/div[2]/form[1]/p[11]/input[1]")
    WebElement _registerNowButton;
    @FindBy(xpath = "//h3[contains(text(),'Welcome to the TAKEALOT.com family!')]")
    WebElement _getTheWelcomeMessage;

    public void clickOnRegisterLink() {
        Reporter.addStepLog("Clicking on register link : " + _registerLink.toString() + "<br>");
        clickOnElement(_registerLink);
        log.info("Clicking on register link : " + _registerLink.toString());
    }

    public void enterFirstName(String firstName) {
        Reporter.addStepLog("Entering first name : " + firstName + " to first name: " + _firstName.toString());
        sendTextToElement(_firstName, firstName);
        log.info("Entering first name : " + firstName + " to first name: " + _firstName.toString());
    }

    public void enterLastName(String lastName) {
        Reporter.addStepLog("Entering last name : " + lastName + " to first name: " + _lastName.toString());
        sendTextToElement(_lastName, lastName);
        log.info("Entering first name : " + lastName + " to first name: " + _lastName.toString());

    }

    public void enterEmailAddress(String email) {
        Reporter.addStepLog("Set Email :" + email + "to email field :" + _emailAddress.toString());
        sendTextToElement(_emailAddress, email);
        log.info("Set Email :" + email + "to email field :" + _emailAddress.toString());

    }

    public void reTypeEmailAddress(String email2) {
        Reporter.addStepLog("Set Email :" + email2 + "to email field :" + _reTypeEmailAddress.toString());
        sendTextToElement(_reTypeEmailAddress, email2);
        log.info("Set Email :" + email2 + "to email field :" + _reTypeEmailAddress.toString());
    }

    public void enterPassword(String password) {
        Reporter.addStepLog("Enter the password:" + password + "To Password :" + _password.toString());
        sendTextToElement(_password, password);
        log.info("Enter the password:" + password + "To Password :" + _password.toString());
    }

    public void reTypePassword(String password2) {
        Reporter.addStepLog("Enter the password:" + password2 + "To Password :" + _reTypePassword.toString());
        sendTextToElement(_reTypePassword, password2);
        log.info("Enter the password:" + password2 + "To Password :" + _reTypePassword.toString());
    }

    public void enterMobileNumber(int mobileNumber) {
        Reporter.addStepLog("Enter the password:" + mobileNumber + "To Password :" + _mobileNumber.toString());
        sendTextToElement(_mobileNumber, mobileNumber);
        log.info("Enter the password:" + mobileNumber + "To Password :" + _mobileNumber.toString());
    }
    public void ClickOnRegisterButton() {
        Reporter.addStepLog("Click On Register Button :" + _registerNowButton.toString());
        clickOnElement(_registerNowButton);
        log.info("Click On Register Button :" + _registerNowButton.toString());
    }

    public void setConfirmRegistrationMessage(String welcomeMessage) {
        Reporter.addStepLog("Set Confirm RegistrationMessage:" +_getTheWelcomeMessage+"to confirm message :"+ _getTheWelcomeMessage.toString());
        clickOnElement(_getTheWelcomeMessage);
        log.info("Set Confirm RegistrationMessage:" +welcomeMessage+"to confirm message :"+ _getTheWelcomeMessage.toString());
    }
    public void verifyUserShouldRegisterSuccessfullyWithValidCredentials(String firstName,String lastName,String email,String email2,String password,String password2,int mobileNumber,String welcomeMessage){
        clickOnRegisterLink();
        enterFirstName(firstName);
        enterLastName(lastName);
        enterEmailAddress(email);
        reTypeEmailAddress(email2);
        enterPassword(password);
        reTypePassword(password2);
        enterMobileNumber(mobileNumber);
        ClickOnRegisterButton();
        setConfirmRegistrationMessage("");
    }
}
