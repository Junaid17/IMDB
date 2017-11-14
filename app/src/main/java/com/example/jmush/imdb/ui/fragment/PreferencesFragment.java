package com.example.jmush.imdb.ui.fragment;

import android.os.Bundle;
import android.preference.PreferenceFragment;

import com.example.jmush.imdb.R;

/**
 * Preferences fragment, loading the preferences.xml
 * For Android 3.0 and higher, you should instead use this fragment instead of PreferencesActivity
 */
public class PreferencesFragment extends PreferenceFragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        addPreferencesFromResource(R.xml.preferences);
    }
}
