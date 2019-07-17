package com.example.finalsproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {

    TextView txtWelcome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        txtWelcome = findViewById(R.id.tvWelcome);
        SharedPreferences sp = getSharedPreferences("userInfo", Context.MODE_PRIVATE);
        String fname = sp.getString("fname", "");
        txtWelcome.setText("Welcome " + fname);
    }

    public void goContinue(View v) {
        Intent i = new Intent(this, Main4Activity.class);
        startActivity(i);
    }
}
