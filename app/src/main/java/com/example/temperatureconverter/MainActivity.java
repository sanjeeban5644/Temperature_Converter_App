package com.example.temperatureconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private TextView fardisplay;
    private TextView kelvindisplay;
    private EditText celciusdata;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        fardisplay = findViewById(R.id.fardisplay);
        kelvindisplay = findViewById(R.id.kelvindisplay);
        celciusdata = findViewById(R.id.celciusdata);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = celciusdata.getText().toString();
                float cel = Float.parseFloat(s);
                float kel = (float) (cel + 273.15);
                float far = (float)((cel*1.8)+32);
                kelvindisplay.setText("The Temperature in Kelvin is : "+kel);
                fardisplay.setText("The Temperature in Farenheit is : "+far);

            }
        });


    }
}