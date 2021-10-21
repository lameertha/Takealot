package com.takealot.cucumber.stepdefs;

import com.takealot.pages.LoginPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

/* Created
 * by Lamee */public class LoginStepdefs {
    @Given("^I am on login page$")
    public void iAmOnLoginPage() {

    }
    @When("^I click on login link$")
    public void iClickOnLoginLink() {
        new LoginPage().clickOnLoginLink();
    }

    @And("^I enter the email \"([^\"]*)\"$")
    public void iEnterTheEmail(String email)  {
        new LoginPage().set_emailAddress(email);

    }

    @And("^I enter the Password \"([^\"]*)\"$")
    public void iEnterThePassword(String password)  {
        new LoginPage().enterPassword(password);

    }

    @And("^I click on login Button$")
    public void iClickOnLoginButton() {
        new LoginPage().clickOnLoginButton();
    }

    @And("^I searching link\"([^\"]*)\"$")
    public void iSearchingLink(String watches,String watches1)  {
        new LoginPage().set_searchingLink(watches);
        new LoginPage().set_searchingLink(watches1);

    }

    @And("^I adding to The GarminSmart Watch in the cart$")
    public void iAddingToTheGarminSmartWatchInTheCart() {
        new LoginPage().set_addingTheGarminSmartWatch();
    }

    @And("^I adding to TheGarminQuickFit band in the cart$")
    public void iAddingToTheGarminQuickFitBandInTheCart() {
        new LoginPage().set_addingTheGarminQuickFit();
    }

    @And("^I click on checkOutLink$")
    public void iClickOnCheckOutLink() {
        new LoginPage().set_checkOutLink();
    }

    @And("^I click on card summary$")
    public void iClickOnCardSummary() {
        new LoginPage().set_cardSummary();
    }

    @Then("^I should get iteams added message \"([^\"]*)\"$")
    public void iShouldGetIteamsAddedMessage(){

        Assert.assertEquals(true, new LoginPage().totalIteamsMessage());


    }


}
