package com.developeravsk.intentwithresult;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    EditText data;
    Button goback;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        data=findViewById(R.id.et);
        goback=findViewById(R.id.goback);

        goback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userData=data.getText().toString();
                Intent i=new Intent();
                i.putExtra("data",userData);
                setResult(RESULT_OK,i);
                finish();
            }
        });
    }
}
