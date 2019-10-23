package dyslexia.titi.app;

import android.content.Intent;

import androidx.test.espresso.intent.Intents;
import androidx.test.espresso.intent.rule.IntentsTestRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import dyslexia.app.ui.authentication.MainActivity;
import dyslexia.app.ui.authentication.login.LoginActivity;

import static androidx.test.espresso.intent.Intents.intended;
import static androidx.test.espresso.intent.matcher.IntentMatchers.hasComponent;

@RunWith(AndroidJUnit4.class)
public class MainActivityTest {

    @Rule
    public IntentsTestRule<MainActivity> intentsTestRule =
            new IntentsTestRule<>(MainActivity.class);


    @Test
    public void goToLoginScreen() {
        Intents.init();
        intentsTestRule.launchActivity(new Intent());
        intended(hasComponent(LoginActivity.class.getName()));
        Intents.release();
    }

    @Test
    public void register() {
    }
}
