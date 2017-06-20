package com.example.android.miwok;

/**
 * Created by Avneet on 2017-06-19.
 */

public class Word {


    private String mDefaultTranslation;

    private String mMiwokTranslation;

    public Word(String vDefault, String vMiwok)
    {
        mDefaultTranslation = vDefault;
        mMiwokTranslation = vMiwok;
    }

    // Get the name of the Android version

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    // Get the Android version number
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }
}