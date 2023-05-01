package com.example.pz8_Zlobina_Alina_PR_21_101;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Map extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);
        Button bn = findViewById(R.id.button12);
    }

    @Override
    public void onClick(View v) {
        if (v.getId()== R.id.button12){
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }
        else
        {
            Toast toast = Toast.makeText(getApplicationContext(), "Так нельзя!", Toast.LENGTH_SHORT);
            toast.show();
        }
    }
}