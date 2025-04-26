package com.example.myapp;

import androidx.test.espresso.Espresso;
import androidx.test.espresso.assertion.ViewAssertions;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.ext.junit.rules.ActivityScenarioRule;

import com.example.myapp.InitialScreenActivity;
import org.junit.Rule;
import org.junit.Test;

import static android.os.Build.VERSION_CODES.R;

public class InitialScreenUITest {

    @Rule
    public ActivityScenarioRule<InitialScreenActivity> activityRule =
            new ActivityScenarioRule<>(InitialScreenActivity.class);

    @Test
    public void testButtonsDisplayed() {
        // "Sign In" düğmesinin görüntülendiğini kontrol et
        Espresso.onView(ViewMatchers.withId(R.id.SignIn))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));

        // "Sign Up" düğmesinin görüntülendiğini kontrol et
        Espresso.onView(ViewMatchers.withId(R.id.SignUp))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
    }
}
