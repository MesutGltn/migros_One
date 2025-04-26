import androidx.test.espresso.Espresso;
import androidx.test.espresso.action.ViewActions;
import androidx.test.espresso.assertion.ViewAssertions;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.ext.junit.rules.ActivityScenarioRule;

import com.example.myapp.SignUpScreenActivity;
import org.junit.Rule;
import org.junit.Test;

public class SignUpScreenUITest {

    @Rule
    public ActivityScenarioRule<SignUpScreenActivity> activityRule =
            new ActivityScenarioRule<>(SignUpScreenActivity.class);

    @Test
    public void testUserCanSignUp() {
        // Kullanıcı adı gir
        Espresso.onView(ViewMatchers.withId(R.id.nameField))
                .perform(ViewActions.typeText("Mesut"), ViewActions.closeSoftKeyboard());

        // E-posta gir
        Espresso.onView(ViewMatchers.withId(R.id.emailField))
                .perform(ViewActions.typeText("testmesut@example.com"), ViewActions.closeSoftKeyboard());

        // Şifre gir
        Espresso.onView(ViewMatchers.withId(R.id.passwordField))
                .perform(ViewActions.typeText("Test1234"), ViewActions.closeSoftKeyboard());


        // "Register" düğmesine tıkla
        Espresso.onView(ViewMatchers.withId(R.id.SigUp))
                .perform(ViewActions.click());

        // Başarılı mesajını kontrol et
        Espresso.onView(ViewMatchers.withText("başarılı kayıt sonrası Membership successful!))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
    }
}
