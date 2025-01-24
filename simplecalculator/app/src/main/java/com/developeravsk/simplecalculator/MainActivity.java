package com.developeravsk.simplecalculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

// Activity class
public class MainActivity extends AppCompatActivity {

    //ui defined component
    Button add, subtract, gotobutton;
    TextView result;
    int counter = 0;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //introduce your layout
        setContentView(R.layout.activity_main);

        //object initialization using id
        add = findViewById(R.id.add_data);
        subtract = findViewById(R.id.subtract_data);
        result = findViewById(R.id.display_value);
        gotobutton=findViewById(R.id.next_screen_button);

        gotobutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            //define what needs to be done after clicking this button
                Intent i=new Intent(MainActivity.this, SecondActivity.class);
                startActivity(i);
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // define what to do when add button is clicked
                counter++;
                result.setText("" + counter);
            }
        });

        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //define what to do when subtract button is clicked
                counter--;
                result.setText("" + counter);
            }
        });
    }
}