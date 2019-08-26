package com.abnamro.apps.referenceandroid.test;

import android.content.pm.ActivityInfo;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import com.abnamro.apps.referenceandroid.MainActivity;
import com.abnamro.apps.referenceandroid.pageclass.HomePage;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 *  This class contains all test cases to execute in landscape mode
 */
@RunWith(AndroidJUnit4.class)
public class TestCaseLandscapeMode {


    @Rule
    public ActivityTestRule<MainActivity> mActivityRule =
            new ActivityTestRule<>(MainActivity.class);

    /**
     * This function will set the screen mode as landscape mode
     */
    @Before
    public void setLandscapeMode(){
        mActivityRule.getActivity().setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

    }


    //Initialize Page Class Object to access Home Page functions
   private HomePage homePageObject = new HomePage();


    /**
     * Test Case name - verifyAllElementsInMainPage,
     * Will verify all the elements and texts in Home page
     */
    @Test
    public void verifyAllElementsInHomePage() {
        homePageObject.verifyHomePage();
    }


    /**
     * Test Case name - verifyMessageIconFunctionality,
     * Will verify snack bar and message displayed when tap on message icon
     * verify snack bar has hidden after few seconds
     */
    @Test
    public void verifyMessageIconFunctionality()
    {
        homePageObject.verifyUserIsInHomePage();
        homePageObject.tapAndVerifyMessageIcon();
        homePageObject.verifySnackBarText();
        homePageObject.verifySnackBarHasHidden();

    }


    /**
     * Test Case name - verifyOverFlowMenuButtonFunctionality,
     * Will verify settings link in overflow button
     */
    @Test
    public void verifyOverFlowMenuButtonFunctionality()

    {
        homePageObject.verifyUserIsInHomePage();
        homePageObject.tapAndVerifyMoreIcon();

    }

    /**
     * Test Case name - verifySnackBarTextAndSettingsLinksHidden,
     * Will verify snackbar text and settings text not available when user land in home page
     */
    @Test
    public void verifySnackBarTextAndSettingsLinksHidden()

    {

        homePageObject.verifyUserIsInHomePage();
        homePageObject.verifySnackBarHasHidden();
        homePageObject.verifySettingsTextNotavailable();

    }




}
