package com.example.starwars.model;

import com.example.starwars.R;
import com.google.gson.annotations.SerializedName;

public class People {

    @SerializedName("name")
    private String mName;

    @SerializedName("heighn")
    private String mHeight;

    @SerializedName("mass")
    private String mMass;

    @SerializedName("hair_color")
    private String mHair_color;

    @SerializedName("skin_color")
    private String mSkin_color;

    @SerializedName("eye_color")
    private String mEye_color;

    @SerializedName("birth_year")
    private String mBirth_year;

    @SerializedName("gender")
    private String mGender;

    @SerializedName("homeworld")
    private String mHomeworld;

    //private Integer mImage = R.drawable.ic_account_circle_black;

    public String getName() {
        return mName;
    }
}
