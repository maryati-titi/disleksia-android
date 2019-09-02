package dyslexia.titi.frag27;

import android.accessibilityservice.AccessibilityService;
import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Build;

import androidx.test.core.app.ApplicationProvider;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import dyslexia.titi.frag27.login.LoginActivity;
import dyslexia.titi.frag27.login.RegisterActivity;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.robolectric.Shadows.shadowOf;
// Created by Arif Ikhsanudin on 9/2/2019.

@RunWith(RobolectricTestRunner.class)
@Config(sdk = Build.VERSION_CODES.P)
public class MainActivityTest {

    private Activity activity;

    @Before
    public void setUp() {
        activity = Robolectric.buildActivity(MainActivity.class)
                .create()
                .resume()
                .get();
    }

    @Test
    public void shouldNotBeNull() throws Exception {
        assertNotNull(activity);
    }

    @Test
    public void onCreate() {
    }

    @Test
    public void masuk() {
        activity.findViewById(R.id.btnLogin).performClick();

        Intent loginIntent = new Intent(activity, LoginActivity.class);
        Intent actual = shadowOf((AccessibilityService) ApplicationProvider.getApplicationContext()).getNextStartedActivity();
        assertEquals(loginIntent.getComponent(), actual.getComponent());
    }

    @Test
    public void register() {
        activity.findViewById(R.id.btnRegister).performClick();

        Intent registerIntent = new Intent(activity, RegisterActivity.class);
        Intent actual = shadowOf((Application) ApplicationProvider.getApplicationContext()).getNextStartedActivity();
        assertEquals(registerIntent .getComponent(), actual.getComponent());
    }
}
