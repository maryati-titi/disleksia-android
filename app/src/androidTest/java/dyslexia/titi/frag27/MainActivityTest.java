package dyslexia.titi.frag27;

import android.content.Context;

import androidx.test.InstrumentationRegistry;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class MainActivityTest {

    @Test
    public void useAppContext() {
        Context appContext = InstrumentationRegistry.getTargetContext();
        assertEquals("dyslexia.titi.frag27", appContext.getPackageName());
    }
}
