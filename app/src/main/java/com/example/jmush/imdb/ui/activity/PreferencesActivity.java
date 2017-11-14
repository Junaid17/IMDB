package com.example.jmush.imdb.ui.activity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;

import com.example.jmush.imdb.R;
import com.example.jmush.imdb.IMDBApplication;
import com.example.jmush.imdb.ui.activity.base.ToolbarActivity;
import com.example.jmush.imdb.ui.fragment.PreferencesFragment;

/**
 * Class used to store shared preferences of some details of the application
 * Uses a PreferencesFragment
 */
public class PreferencesActivity extends ToolbarActivity implements SharedPreferences.OnSharedPreferenceChangeListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        toolbar.setTitle(R.string.preferences);
        this.enableBackButton();

        PreferenceManager.getDefaultSharedPreferences(this).registerOnSharedPreferenceChangeListener(this);

        getFragmentManager().beginTransaction()
                            .replace(R.id.content, new PreferencesFragment()).commit();
    }

    @Override
    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String key) {
        if(key.equals(getResources().getString(R.string.soon_periodicity))){
            int days = Integer.parseInt(sharedPreferences.getString(key, "7"));
            ((IMDBApplication)getApplication()).refreshTheatersAlarm(days);
        }
    }
}
