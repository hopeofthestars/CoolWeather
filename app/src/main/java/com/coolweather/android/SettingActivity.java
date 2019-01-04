package com.coolweather.android;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.CheckBoxPreference;
import android.preference.Preference;
import android.preference.PreferenceActivity;
import android.preference.SwitchPreference;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.preference.PreferenceManager;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.app.ActionBar;
import android.preference.Preference.OnPreferenceChangeListener;
import android.preference.Preference.OnPreferenceClickListener;


public class SettingActivity extends AppCompatActivity {

    Float time;
    SharedPreferences sharedPreferences;
    SwitchPreference switchPreference;
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

      /*Fragment preferenceFragment = new BlankFragment();
      FragmentTransaction transaction = getFragmentManager().beginTransaction();
      transaction.add(R.id.list_container,preferenceFragment).commit();*/
      editText=(EditText)findViewById(R.id.edit_time);
      BlankFragment blankFragment=(BlankFragment)getFragmentManager().findFragmentById(R.id.blankfragment);
     // sharedPreferences= PreferenceManager.getDefaultSharedPreferences(getActivity());
      switchPreference=(SwitchPreference)blankFragment.findPreference("key1");
        SharedPreferences preferences=getSharedPreferences("data",MODE_PRIVATE);
        String text=String.valueOf(preferences.getFloat("time",8));
        editText.setText(text);
        Button btn_back=(Button)findViewById(R.id.btn_back);
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        time=Float.parseFloat(editText.getText().toString());
        SharedPreferences.Editor editor=getSharedPreferences("data",MODE_PRIVATE).edit();
        editor.putFloat("time",time);
        editor.apply();
    }
}
