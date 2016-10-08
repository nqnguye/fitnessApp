package com.example.nicholenguyen.fitnessapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.TextView;

public class Next extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        Intent intent = getIntent();
        Person p = (Person) intent.getSerializableExtra("person"); //Obtaining data

        double bmi = calcBMI(p.weight, p.heightFeet, p.heightIn);

        TextView textView = (TextView) findViewById(R.id.text_id);
        textView.setText(Integer.toString(p.age) + " years old, " +
                Integer.toString(p.heightFeet) + " feet " + Integer.toString(p.heightIn) +
                " inches tall and a BMI of " + Double.toString(bmi));


        ViewGroup layout = (ViewGroup) findViewById(R.id.activity_next);
    }

    public double calcBMI(int weight, int height_feet, int height_in)
    {
        double weight_kilo = ((double)weight) * .45;

        double height = ((double)(height_feet * 12 + height_in)) * .025;
        height *= height;

        return (weight_kilo / height);
    }


}
