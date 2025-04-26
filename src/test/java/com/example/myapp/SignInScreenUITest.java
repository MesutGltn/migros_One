import androidx.test.espresso.Espresso;
import androidx.test.espresso.action.ViewActions;
import androidx.test.espresso.assertion.ViewAssertions;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.ext.junit.rules.ActivityScenarioRule;

import com.example.myapp.SignInScreenActivity;
import org.junit.Rule;
import org.junit.Test;

public class SignInScreenUITest {

    @Rule
    public ActivityScenarioRule<SignInScreenActivity> activityRule =
            new ActivityScenarioRule<>(SignInScreenActivity.class);

    @Test
    public void testUserCanSignIn() {
        // E-posta gir
        Espresso.onView(ViewMatchers.withId(R.id.emailField))
                .perform(ViewActions.typeText("testmesut@example.com"), ViewActions.closeSoftKeyboard());

        // Şifre gir
        Espresso.onView(ViewMatchers.withId(R.id.passwordField))
                .perform(ViewActions.typeText("Test1234"), ViewActions.closeSoftKeyboard());

        // "Login" düğmesine tıkla
        Espresso.onView(ViewMatchers.withId(R.id.loginButton))
                .perform(ViewActions.click());

        // "Welcome" mesajını kontrol et
        Espresso.onView(ViewMatchers.withText("Welcome,Mesut"))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
    }
}
