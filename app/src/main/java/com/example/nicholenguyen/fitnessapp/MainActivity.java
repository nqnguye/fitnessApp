package com.example.nicholenguyen.fitnessapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Person p;

        Spinner spinner_gender = (Spinner) findViewById(R.id.gender_spinner);
        ArrayAdapter<String> adapter_gender = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, Gender);
        adapter_gender.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_gender.setAdapter(adapter_gender);

        Spinner spinner_weight = (Spinner) findViewById(R.id.weight_spinner);
        ArrayAdapter<String> adapter_weight = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, Weight);
        adapter_weight.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_weight.setAdapter(adapter_weight);
    }


    public void sendMessage(View view) {
        Intent intent = new Intent(this, Next.class);
        EditText editHeightFeet = (EditText) findViewById(R.id.edit_height_feet);
        EditText editHeightIn = (EditText) findViewById(R.id.edit_height_in);
        EditText editWeight = (EditText) findViewById(R.id.edit_weight);
        EditText editAge = (EditText) findViewById(R.id.edit_age);
        String gender = ((Spinner)findViewById(R.id.gender_spinner)).getSelectedItem().toString();
        Person p = new Person(Integer.parseInt(editAge.getText().toString()), Integer.parseInt(editHeightFeet.getText().toString()),
                Integer.parseInt(editHeightIn.getText().toString()), Integer.parseInt(editWeight.getText().toString()), gender);

        intent.putExtra("person", p);
        startActivity(intent);
        // Do something in response to button
    }
    static final String[] Gender = new String[]{"Male", "Female"};

    static final String[] Weight = new String[]{"lb", "kg"};

    static final String[] Height = new String[]{"in", "m"};

}