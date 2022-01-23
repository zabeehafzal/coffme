package com.example.coffme;

import androidx.appcompat.app.AppCompatActivity;

import android.os.ParcelUuid;
import android.widget.Button;
import android.content.Intent;
import android.view.View;
import android.os.Bundle;

public class cupp extends AppCompatActivity {
    public Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cupp);

        button = (Button) findViewById(R.id.btnmain);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent  intent = new Intent(cupp.this, Dashboard.class);
                startActivity(intent);
            }
        });


    }
}