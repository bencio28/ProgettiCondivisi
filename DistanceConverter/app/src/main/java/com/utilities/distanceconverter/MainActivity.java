package com.utilities.distanceconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    final double M2KM = 1.6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText milesToConvert = findViewById(R.id.miglia_da_convertire_editText);
        TextView kmResult = findViewById(R.id.chilometri_corrispondenti_textView);
        Button convertButton = findViewById(R.id.converti_button);

        String  milesStringToConvert = milesToConvert.getText().toString();


        convertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String  milesStringToConvert = milesToConvert.getText().toString();
                double miles = Double.parseDouble(milesStringToConvert);
                double kilometers = miles * M2KM;
                String finalResult = String.format("%.2f km", kilometers);
                kmResult.setText(finalResult);
            }

        });

    }


}


