package com.example.myapp;

import androidx.test.espresso.Espresso;
import androidx.test.espresso.action.ViewActions;
import androidx.test.espresso.assertion.ViewAssertions;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.ext.junit.rules.ActivityScenarioRule;

import org.junit.Rule;
import org.junit.Test;

import static jdk.internal.loader.URLClassPath.check;

public class ProfileScreenUITest {

    @Rule
    public ActivityScenarioRule<ProfileScreenActivity> activityRule =
            new ActivityScenarioRule<>(ProfileScreenActivity.class);

    @Test
    public void testProfileScreenContentAndSignOut() {
        // Ad kontrolü
        Espresso.onView(ViewMatchers.withId(R.id.nameTextView))
                .check(ViewAssertions.matches(ViewMatchers.withText("Mesut")));

        // Email kontrolü
        Espresso.onView(ViewMatchers.withId(R.id.emailTextView))
                .check(ViewAssertions.matches(ViewMatchers.withText("testmesut@example.com")));

        // Additional txt kontrolü
        Espresso.onView(ViewMatchers.withId(R.id.Membershipsuccessful!))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));

        // "Sign Out" düğmesine tıkla
        Espresso.onView(ViewMatchers.withId(R.id.SignOut))
                .perform(ViewActions.click());

        // Ana ekrana dönüş kontrolü
        Espresso.onView(ViewMatchers.withId(R.id.SignIn))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
    }
}
