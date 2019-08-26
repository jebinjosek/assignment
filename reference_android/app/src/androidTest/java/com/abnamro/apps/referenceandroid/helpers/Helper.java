package com.abnamro.apps.referenceandroid.helpers;

import android.support.test.espresso.ViewInteraction;
import org.hamcrest.Matcher;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.doesNotExist;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.*;

/**
 * This class contains generic functions useful for all page classes like click ,tap etc
 */
public class Helper {

    /**
     * This is a function  to tap an element.
     * @param element : Matcher , Element needs to be tap  eg: withId(android.R.id.statusBarBackground);
     */
    protected void tapAnElement(Matcher element)

    {
        onView(element).perform(click());
    }



    /**
     * This function will verify that the element is displayed
     * @param element : Matcher , Element need to be verify  eg: withId(android.R.id.statusBarBackground);
     */
    protected void isElementDisplayed(Matcher element)

    {
        onView(element).check(matches(isDisplayed()));
    }


    /**
     * This function will verify that particular text is not available
     * @param text : String , Text which is not available
     */
    protected void isTextNotDisplayed(String text)

    {
        onView(withText(text)).check(doesNotExist());
    }


    /**
     * This function will verify that particular text is available
     * @param element : Matcher , Element contains searching text eg: withId(android.R.id.statusBarBackground);
     * @param  expectedText : String , Text to search in the page
     */
    protected void verifyText(Matcher element, String expectedText)
    {
        final ViewInteraction check = onView(element).check(matches(withText(expectedText)));

    }

    /**
     * This function will introduce delay for specified time
     * @param time : long , Time to wait in milli seconds
     */
    protected void delay(long time)

    {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
