package com.developeravsk.simplecalculator;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class FourthActivity  extends AppCompatActivity {
TextView result;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
        result=findViewById(R.id.value);
        String val=getIntent().getExtras().getString("abc");
        result.setText(val);
    }
}
