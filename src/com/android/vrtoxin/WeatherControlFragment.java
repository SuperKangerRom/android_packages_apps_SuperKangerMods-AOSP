/*
 * Copyright (C) 2016 The VRToxin Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.android.vrtoxin;

import android.os.Bundle;
import android.preference.ListPreference;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceChangeListener;
import android.preference.PreferenceCategory;
import android.preference.PreferenceFragment;
import android.preference.PreferenceScreen;
import android.provider.Settings;
import android.provider.Settings.SettingNotFoundException;
import android.support.annotation.NonNull;

import com.android.vrtoxin.R;
import com.android.vrtoxin.Utils;

public class WeatherControlFragment extends PreferenceFragment {

    private static final String KEY_LOCK_SCREEN_WEATHER = "lock_screen_weather_settings";

    private Preference mWeather;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        addPreferencesFromResource(R.xml.weather_control_fragment);

        mWeather = (Preference)findPreference(KEY_LOCK_SCREEN_WEATHER);
    }

    public boolean onPreferenceChange(Preference preference, Object objValue) {

        return false;
    }

    @Override
    public boolean onPreferenceTreeClick(PreferenceScreen prefScreen, @NonNull Preference pref) {
        if (pref == mWeather) {
            ((VRToxinActivity)getActivity()).displaySubFrag(getString(R.string.lock_screen_weather_frag_title));

            return true;
        }

        return false;
    }
}
