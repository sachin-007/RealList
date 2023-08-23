package com.example.housing;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

public class Industrial_land extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_industrial_land);

        ImageView backbtn= findViewById(R.id.backbtn);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });


        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Spinner unitSpinner = findViewById(R.id.unitvalues);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Spinner unitSpinner1 = findViewById(R.id.unitvalues1);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Spinner unitSpinner2 = findViewById(R.id.unitvalues2);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Spinner unitSpinner3 = findViewById(R.id.unitvalues3);

        ArrayAdapter<CharSequence> unitAdapter = new ArrayAdapter<CharSequence>(
                this,
                android.R.layout.simple_spinner_item, // Default layout for all items
                getResources().getStringArray(R.array.unitvalues)
        ) {
            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                View view = super.getView(position, convertView, parent);

                // Change text color of the selected item to black
                if (position == unitSpinner.getSelectedItemPosition()) {
                    TextView textView = (TextView) view.findViewById(android.R.id.text1);
                    textView.setTextColor(Color.BLACK);
                }

                return view;
            }
        };

        unitAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        unitSpinner.setAdapter(unitAdapter);



        ArrayAdapter<CharSequence> unitAdapter1 = new ArrayAdapter<CharSequence>(
                this,
                android.R.layout.simple_spinner_item, // Default layout for all items
                getResources().getStringArray(R.array.unitvalues)
        ) {
            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                View view = super.getView(position, convertView, parent);

                // Change text color of the selected item to black
                if (position == unitSpinner1.getSelectedItemPosition()) {
                    TextView textView = (TextView) view.findViewById(android.R.id.text1);
                    textView.setTextColor(Color.BLACK);
                }

                return view;
            }
        };

        unitAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        unitSpinner1.setAdapter(unitAdapter1);


        ArrayAdapter<CharSequence> unitAdapter2 = new ArrayAdapter<CharSequence>(
                this,
                android.R.layout.simple_spinner_item, // Default layout for all items
                getResources().getStringArray(R.array.unitvalues)
        ) {
            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                View view = super.getView(position, convertView, parent);

                // Change text color of the selected item to black
                if (position == unitSpinner2.getSelectedItemPosition()) {
                    TextView textView = (TextView) view.findViewById(android.R.id.text1);
                    textView.setTextColor(Color.BLACK);
                }

                return view;
            }
        };

        unitAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        unitSpinner2.setAdapter(unitAdapter2);

        ArrayAdapter<CharSequence> unitAdapter3 = new ArrayAdapter<CharSequence>(
                this,
                android.R.layout.simple_spinner_item, // Default layout for all items
                getResources().getStringArray(R.array.unitvalues)
        ) {
            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                View view = super.getView(position, convertView, parent);

                // Change text color of the selected item to black
                if (position == unitSpinner3.getSelectedItemPosition()) {
                    TextView textView = (TextView) view.findViewById(android.R.id.text1);
                    textView.setTextColor(Color.BLACK);
                }

                return view;
            }
        };

        unitAdapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        unitSpinner3.setAdapter(unitAdapter3);
    }
}