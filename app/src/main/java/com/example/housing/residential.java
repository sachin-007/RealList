package com.example.housing;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.content.Intent;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class residential extends AppCompatActivity {

    Button commercialButton,residentialButton;
    private RadioGroup radioGroup;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_residential);


        radioGroup = findViewById(R.id.radio_group_options);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == R.id.Falt_Apartment) {
                    Falt_Apartment();
                } else if (checkedId == R.id.House) {
                    House();
                } else if (checkedId == R.id.Villa){
                    Villa();
                } else if (checkedId==R.id.Builder_Floor) {
                    Builder_Floor();
                } else if (checkedId==R.id.Plot) {
                    Plot();
                } else if (checkedId==R.id.Studio_Apartment) {
                    Studio_Apartment();
                }else if (checkedId==R.id.Penthouse)
                {
                    Penthouse();
                } else if (checkedId==R.id.farm_House) {
                    farm_House();
                }



            }
        });

        commercialButton = findViewById(R.id.commercialButton);
        residentialButton = findViewById(R.id.residentialButton);

        commercialButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the CommercialActivity
                Intent intent = new Intent(residential.this, residentialNcommercial.class);
                startActivity(intent);
            }
        });


//        RadioGroup radioGroupOptions = findViewById(R.id.radio_group_options);

//        radioGroupOptions.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(RadioGroup group, int checkedId) {
//                RadioButton selectedRadioButton = findViewById(checkedId);
//                String selectedOption = selectedRadioButton.getText().toString();
//
//                Intent intent = new Intent(residential.this, whereyoulocated.class);
//                intent.putExtra("selectedOption", selectedOption);
//                startActivity(intent);
//            }
//        });

    }

    private void Falt_Apartment() {
        Intent intent = new Intent(residential.this, sub1_flat_apartment.class);
        startActivity(intent);
    }

    private void House() {
        Intent intent = new Intent(residential.this, moredetailtogetreleventbuyers.class);
        startActivity(intent);
    }
    private void Villa() {
        Intent intent = new Intent(residential.this, Villa.class);
        startActivity(intent);
    }

    private void Builder_Floor() {
        Intent intent = new Intent(residential.this, BuilderFloor.class);
        startActivity(intent);
    }
    private void Plot() {
        Intent intent = new Intent(residential.this, activity_sub5_plt_width_any_boundary_gated_property_approval.class);
        startActivity(intent);
    }

    private void Studio_Apartment() {
        Intent intent = new Intent(residential.this, studio.class);
        startActivity(intent);
    }
    private void Penthouse() {
        Intent intent = new Intent(residential.this, penthouse.class);
        startActivity(intent);
    }

    private void farm_House() {
        Intent intent = new Intent(residential.this, farm_house.class);
        startActivity(intent);
    }


}