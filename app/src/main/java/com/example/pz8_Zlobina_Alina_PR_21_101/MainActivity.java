package com.example.pz8_Zlobina_Alina_PR_21_101;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageButton btn = findViewById(R.id.btnMenu2);
    }

    @Override
    public void onClick(View v) {
        if (v.getId()== R.id.btnMenu2){
                Intent intent = new Intent(this, Bucket.class);
                startActivity(intent);
        }
        else
        {
            Toast toast = Toast.makeText(getApplicationContext(), "Куплено!", Toast.LENGTH_SHORT);
            toast.show();
        }
    }
}