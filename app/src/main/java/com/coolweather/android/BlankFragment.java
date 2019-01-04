package com.coolweather.android;


import android.app.ActionBar;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.CheckBoxPreference;
import android.preference.Preference;
import android.preference.PreferenceFragment;
import android.preference.SwitchPreference;
import android.support.v4.app.Fragment;
import android.support.v7.preference.PreferenceFragmentCompat;
import android.support.v7.preference.PreferenceManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.support.v7.preference.PreferenceFragmentCompat;
import android.widget.Toast;

public class BlankFragment extends PreferenceFragment{
    EditText editText;
    SharedPreferences sharedPreferences;
    SwitchPreference switchPreference;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.app_preferences);
        SettingActivity settingActivity=(SettingActivity)getActivity();
        settingActivity.findViewById(R.id.edit_time);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        sharedPreferences= PreferenceManager.getDefaultSharedPreferences(getActivity());
        switchPreference=(SwitchPreference)findPreference("key1");

    }

}
