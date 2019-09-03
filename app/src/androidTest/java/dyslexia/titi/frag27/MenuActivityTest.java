package dyslexia.titi.frag27;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;
import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isClickable;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
// Created by Arif Ikhsanudin on 9/3/2019.

@RunWith(AndroidJUnit4.class)
@LargeTest
public class MenuActivityTest {

    @Rule
    public ActivityTestRule<MenuActivity> activityTestRule = new ActivityTestRule<>(MenuActivity.class);

    @Test
    public void testView() {
        onView(withText("KAMUS")).check(matches(isDisplayed()));
        onView(withText("PERBAIKAN KATA")).check(matches(isDisplayed()));
    }

    @Test
    void testButton() {
        onView(withText("KAMUS")).check(matches(isClickable()));
    }
}
