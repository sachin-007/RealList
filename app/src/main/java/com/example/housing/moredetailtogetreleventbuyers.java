package com.example.housing;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

public class moredetailtogetreleventbuyers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moredetailtogetreleventbuyers);





                // Get references to views
                EditText editTextSquareFoot = findViewById(R.id.edit_text_square_foot);
                Spinner spinnerUnit = findViewById(R.id.spinner_unit);

                // Define the units for the Spinner
                String[] units = {"sqft", "sqyrd", "sqm","Acre","Bighe","Hectare","Marla"};

                // Create an ArrayAdapter with the units and set it to the Spinner
                ArrayAdapter<String> adapter = new ArrayAdapter<>(
                        this, android.R.layout.simple_spinner_item, units);
                adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                spinnerUnit.setAdapter(adapter);
            }
        }
