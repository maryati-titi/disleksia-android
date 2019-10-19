package dyslexia.titi.frag27.repositories;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import static dyslexia.titi.frag27.utils.Constant.USER_ID;

public class SharedPreferenceRepository {
    private static SharedPreferences sharedPreferences;

    public static void setInt(Context context, String key, Integer value) {
        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        sharedPreferences.edit().putInt(key, value).apply();
    }

    public static Integer getInt(Context context, String key) {
        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        return sharedPreferences.getInt(key, 0);
    }

    public static void setBoolean(Context context, String key, Boolean value) {
        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        sharedPreferences.edit().putBoolean(key, value).apply();
    }

    public static void removeInt(Context context, String key) {
        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
    }

    public static Integer getUserId(Context context) {
        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        return sharedPreferences.getInt(USER_ID, 0);
    }
}
