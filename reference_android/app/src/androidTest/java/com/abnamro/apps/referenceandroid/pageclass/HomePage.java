package com.abnamro.apps.referenceandroid.pageclass;


import com.abnamro.apps.referenceandroid.helpers.Helper;
import com.abnamro.apps.referenceandroid.pageobjects.HomePageObjects;

/**
 * This class will expose and implement all behaviors in Home Page.
 * This extends Helper class to use generic functions
 */
public class HomePage extends Helper {

    // Object to access Home page objects
    private HomePageObjects homeObject = new HomePageObjects();

    /**
     * Function to verify user is in Home page
     */
    public void verifyUserIsInHomePage()
    {
        isElementDisplayed(homeObject.pageTitle);
    }

    /**
     * Function to verify all links and text in Home page
     */
    public void verifyHomePage() {


        //Verify all elements in the main page
        isElementDisplayed(homeObject.statusBar);
        isElementDisplayed(homeObject.pageTitle);
        isElementDisplayed(homeObject.toolBar);
        isElementDisplayed(homeObject.overFlowMenuButton);
        isElementDisplayed(homeObject.messageIcon);
        isElementDisplayed(homeObject.body);
        isElementDisplayed(homeObject.bodyTextHelloWorld);

        //Verify all texts in the main page

        isElementDisplayed(homeObject.pageTitle);
        verifyText(homeObject.bodyTextHelloWorld,HomePageObjects.bodyText);

    }

    /**
     * Function to tap on message icon
     */
    public void tapAndVerifyMessageIcon()
    {
        isElementDisplayed(homeObject.messageIcon);
        tapAnElement(homeObject.messageIcon);

    }

    /**
     * Function to verify snack bar text
     */
    public void verifySnackBarText()
    {
        isElementDisplayed(homeObject.snackBarText);
        verifyText(homeObject.snackBarText,HomePageObjects.messageText);

    }

    /**
     * Function to verify that snack bar has hidden after the click
     */
    public void verifySnackBarHasHidden(){
       delay(3000);
       isTextNotDisplayed(HomePageObjects.messageText);
    }

    /**
     * Function to verify that settings text has hidden
     */
    public void verifySettingsTextNotavailable(){
        delay(3000);
        isTextNotDisplayed(HomePageObjects.settingsText);
    }

    /**
     * Function to tap on more icon then settings
     */
    public void tapAndVerifyMoreIcon()
    {
        // Tap on Ellipsis and navigate to settings
        tapAnElement(homeObject.overFlowMenuButton);
        isElementDisplayed(homeObject.settingsLink);
        verifyText(homeObject.settingsLink ,HomePageObjects.settingsText);


    }
}
