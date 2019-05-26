package com.mytaxi.android_demo.activities;

import android.os.SystemClock;
import android.support.test.espresso.Espresso;

import com.mytaxi.android_demo.ActivityRule;
import com.mytaxi.android_demo.R;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.Espresso.onData;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.matcher.ViewMatchers.isDescendantOfA;
import static android.support.test.espresso.matcher.ViewMatchers.withClassName;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.CoreMatchers.allOf;
import static org.hamcrest.CoreMatchers.anything;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.everyItem;


public class MainActivityTest {
@Rule
public ActivityRule<MainActivity> mActivityrule=new ActivityRule<MainActivity>(MainActivity.class);

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void Test() throws Exception
    {

        onView(withId(R.id.edt_username)).perform(typeText("crazydog335"));
        //SystemClock.sleep(60000);
        onView(withId(R.id.edt_password)).perform(typeText("venture"));
        SystemClock.sleep(8000);
        onView(withId(R.id.btn_login)).perform(click());
        SystemClock.sleep(10000);
        //Search sa
        onView(withId(R.id.textSearch)).perform(typeText("sa"));

        SystemClock.sleep(5000);
//        ViewInteraction perform =  onData(anything())
//                .atPosition(2)
//                .perform(click());
//        SystemClock.sleep(5000);
       // textView.check(matches(withText(containsString("Sarah"))));
        //onView(withText(R.string.Sarah)).perform(click());
        //       ViewInteraction perform =  onData(anything())
//                .atPosition(2)
//                .perform(click());
//        SystemClock.sleep(5000);
        // textView.check(matches(withText(containsString("Sarah"))))
        // onData(withText("Sarah Scott")).perform(click());
        // onData(withText("Sarah Scott")).inAdapterView(isAssignableFrom(AdapterView.class)).perform(click());
        //onData(withText("Sarah Scott")).inAdapterView(withText("Sarah Scott")).atPosition(1).perform(click());
        //onData(anything()).inAdapterView(withContentDescription("Sarah")).atPosition(1).perform(click());
        //onData(anything()).inAdapterView(withText("Sarah Scott")).atPosition(0).perform(click());
        //onData(hasToString(startsWith("Sarah"))).perform(click());
       //com.mytaxi.android_demo:id/searchContainer

       // System.out.println("TEST");

        //System.out.println("onView(isDescendantOfA(withId(R.id.searchContainer))) = " + isDescendantOfA(withId(R.id.searchContainer)));
        SystemClock.sleep(10000);


    }
}