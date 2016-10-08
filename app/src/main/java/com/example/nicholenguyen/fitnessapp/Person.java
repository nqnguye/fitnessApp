package com.example.nicholenguyen.fitnessapp;

import android.os.Parcelable;

import java.io.Serializable;

/**
 * Created by Blake on 08-Oct-16.
 */

public class Person implements Serializable {
    int weight;
    int heightFeet;
    int heightIn;
    String gender;
    int age;

    Person(int age_in, int heightFeet_in, int heightIn_in, int weight_in, String gender_in)
    {
        gender = gender_in;
        age = age_in;
        heightFeet = heightFeet_in;
        heightIn = heightIn_in;
        weight = weight_in;
    }


}
