package com.takealot.pages;

import com.cucumber.listener.Reporter;
import com.takealot.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/* Created
 * by Lamee */
public class LoginPage extends Utility {
    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());
    @FindBy(xpath = "//a[contains(text(),'Login')]")
    WebElement _loginButton;

    @FindBy(xpath = "//input[@id='email']")
    WebElement _emailAddress;

    @FindBy(xpath = "//input[@id='password']")
    WebElement _password;

    @FindBy(xpath = "//button[contains(text(),'Login')]")
    WebElement _loginButton1;

    @FindBy(xpath = "//header/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/input[1]")
    WebElement _searchingLink;
    @FindBy(css = "body.chrome.desktop:nth-child(2) div.sf:nth-child(2) div.grid-container.search-listings-module_search-listings_2Lw_d:nth-child(5) div.grid-x.grid-margin-x div.cell.auto:nth-child(2) div.listings-container.listings-container-module_listings-container_AC4LI div.grid-x.grid-margin-x div.cell.small-3:nth-child(1) div.search-product.grid div.product-card.product-card-module_product-card_fdqa8 div.card-divider.product-card-module_card-divider_2MMWD div.product-card-module_add-to-cart-button-wrapper_3HLmD > button.button.expanded.add-to-cart-button.add-to-cart-button-module_add-to-cart-button_1a9gT.ghost")
    WebElement _addingTheGarminSmartWatch;
    @FindBy(xpath = "//header/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/input[1]")
    WebElement _searchingLink1;
    @FindBy(css = "body.chrome.desktop:nth-child(2) div.sf:nth-child(2) div.grid-container.search-listings-module_search-listings_2Lw_d:nth-child(5) div.grid-x.grid-margin-x div.cell.auto:nth-child(2) div.listings-container.listings-container-module_listings-container_AC4LI div.grid-x.grid-margin-x div.cell.small-3:nth-child(1) div.search-product.grid div.product-card.product-card-module_product-card_fdqa8 div.card-divider.product-card-module_card-divider_2MMWD div.product-card-module_add-to-cart-button-wrapper_3HLmD > button.button.expanded.add-to-cart-button.add-to-cart-button-module_add-to-cart-button_1a9gT.ghost")
    WebElement _addingTheGarminQuickFit;
    @FindBy(css = "body.chrome.desktop:nth-child(2) div.sf:nth-child(2) div.top-nav.top-nav-module_top-nav_2cmJW:nth-child(3) div.grid-container.top-nav-module_top-strip_2SdJ- div.grid-x.grid-margin-x div.auto.cell div.grid-x.grid-margin-x.align-right div.shrink.cell div.grid-x.grid-margin-x div.shrink.cell.top-nav-module_cart-wishlist-container_3Q3s9 div.mini-cart.mini-cart-module_mini-cart_3_CNC div.badge-button-outer > button.badge-button.mini-cart-button.dark-green.badge-icon.no-text.badge-count")
    WebElement _checkOutLink;
    @FindBy(xpath = "//h4[contains(text(),'Cart Summary')]")
    WebElement _cardSummary;
    @FindBy(css="body.chrome.desktop:nth-child(2) div.sf:nth-child(2) div.grid-container.cart.cart-content-module_cart_3W93Z:nth-child(5) div.grid-x.cart-content-module_cart-container_1ucKG:nth-child(2) section.cell.auto.cart-content-module_main-section_Gn9sj div.grid-x.grid-margin-x:nth-child(2) div.cell.large-3.cart-content-module_summary-container_1ZqsP:nth-child(2) div.cart-content-module_summary_2IGcE.cart-summary-module_cart-summary_1x3dS div.cart-summary-top-section.cart-summary-module_cart-summary-top-section_oxmIi div.cart-summary-module_cart-summary-container_14fkh div.grid-x.grid-margin-x div.cell.auto:nth-child(1) div.grid-x.cart-summary-module_cart-summary-item_2Csd2:nth-child(2) div.cell.auto:nth-child(1) p.cart-summary-module_cart-summary-item-count_3jkNC > span:nth-child(1)")
    WebElement _totalIteams;

    public void clickOnLoginLink() {
        Reporter.addStepLog("Clicking on login link : " + _loginButton.toString() + "<br>");
        log.info("Clicking on login link " + _loginButton.toString());
        clickOnElement(_loginButton);
    }

    public void set_emailAddress(String email) {
        Reporter.addStepLog("Set Email :" + email + "to email field :" + _emailAddress.toString());
        sendTextToElement(_emailAddress, email);
        log.info("Set Email :" + email + "to email field :" + _emailAddress.toString());

    }

    public void enterPassword(String password) {
        Reporter.addStepLog("Enter the password:" + password + "To Password :" + _password.toString());
        sendTextToElement(_password, password);
        log.info("Enter the password:" + password + "To Password :" + _password.toString());
    }

    public void clickOnLoginButton() {
        Reporter.addStepLog("Clicking on login link : " + _loginButton1.toString() + "<br>");
        log.info("Clicking on login link " + _loginButton1.toString());
        clickOnElement(_loginButton1);

    }

    public void set_searchingLink(String Watches) {
        Reporter.addStepLog("Searching watches : " + Watches + " " + " to searching field : " + _searchingLink.toString() + "<br>");
        sendTextToElement(_searchingLink, Watches);
        log.info("Searching Watches : " + _searchingLink + " " + " to searching field :" + _searchingLink.toString());
    }

    public void set_addingTheGarminSmartWatch() {
        Reporter.addStepLog("Adding TheGarminSmartWatch : " + " " + " to adding to the cart : " + _addingTheGarminSmartWatch.toString() + "<br>");
        clickOnElement(_addingTheGarminSmartWatch);
        log.info("Searching Watches : " + _addingTheGarminSmartWatch + " " + " to searching field :" + _addingTheGarminSmartWatch.toString());
    }

    public void set_searchingLink1(String Watches1) {
        Reporter.addStepLog("Searching watches : " + Watches1 + " " + " to searching field : " + _searchingLink1.toString() + "<br>");
        sendTextToElement(_searchingLink1, Watches1);
        log.info("Searching Watches : " + _searchingLink1 + " " + " to searching field :" + _searchingLink1.toString());
    }

    public void set_addingTheGarminQuickFit() {
        Reporter.addStepLog("Adding TheGarminSmartWatch : " + " " + " to adding to the cart : " + _addingTheGarminQuickFit.toString() + "<br>");
        clickOnElement(_addingTheGarminQuickFit);
        log.info("Searching Watches : " + _addingTheGarminQuickFit + " " + " to searching field :" + _addingTheGarminQuickFit.toString());
    }

    public void set_checkOutLink() {
        Reporter.addStepLog("Clicking on checkOutButton : " + _checkOutLink.toString() + "<br>");
        log.info("Clicking on checkOutButton " + _checkOutLink.toString());
        clickOnElement(_checkOutLink);


    }

    public void set_cardSummary() {
        Reporter.addStepLog("Clicking on cartSummary : " + _cardSummary.toString() + "<br>");
        log.info("Clicking on checkOutButton " + _cardSummary.toString());
        clickOnElement(_cardSummary);
    }

    public String totalIteamsMessage() {
        Reporter.addStepLog("Getting totalIteams  from : " + _totalIteams.toString());
        log.info("Getting totalIteams  from : " + _totalIteams.toString());
        return getTextFromElement(_totalIteams);

    }
    public void verifyUserShouldAddedWatchesSucessfully(String email,String password,String Watches,String Watches1){
        clickOnLoginLink();
        set_emailAddress(email);
        enterPassword(password);
        clickOnLoginButton();
        set_searchingLink(Watches);
        set_addingTheGarminSmartWatch();
        set_searchingLink1(Watches1);
        set_addingTheGarminQuickFit();
        set_checkOutLink();
        set_cardSummary();
        totalIteamsMessage();
    }
}
