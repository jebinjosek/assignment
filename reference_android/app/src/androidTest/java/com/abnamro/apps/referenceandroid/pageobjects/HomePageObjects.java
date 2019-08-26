package com.abnamro.apps.referenceandroid.pageobjects;

import android.support.test.espresso.matcher.ViewMatchers;
import com.abnamro.apps.referenceandroid.R;
import org.hamcrest.Matcher;
import static android.support.test.espresso.matcher.ViewMatchers.*;

/**
 * This class will store all objects and constants in Home Page
 */

public  class HomePageObjects {

    // Page Element Locators
    public Matcher statusBar = withId(android.R.id.statusBarBackground);
    public Matcher body = ViewMatchers.withId(R.id.fragment);
    public Matcher toolBar = withId(R.id.toolbar);
    public Matcher messageIcon = withId(R.id.fab);
    public Matcher overFlowMenuButton = withContentDescription("More options");
    public Matcher bodyTextHelloWorld = withId(R.id.helloworldtext);
    public Matcher pageTitle = withText(R.string.app_name);
    public Matcher settingsLink = withId(R.id.title);
    public Matcher snackBarText = withId(R.id.snackbar_text);
    //Page Constants
    public static final String bodyText="Hello World!";
    public static final  String messageText="Replace with your own action";
    public static final  int settingsText=R.string.action_settings;

}
