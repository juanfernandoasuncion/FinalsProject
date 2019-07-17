package com.example.finalsproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    EditText txtFirstName, txtLastName, txtUsername, txtPassword, txtEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        txtFirstName = (findViewById(R.id.etFirstName));
        txtLastName = (findViewById(R.id.etLastName));
        txtUsername = (findViewById(R.id.etUsername));
        txtPassword = (findViewById(R.id.etPassword));
        txtEmail = (findViewById(R.id.etEmail));
    }

    public void goContinue(View v) {
        Intent i = new Intent(this, Main3Activity.class);
        startActivity(i);
    }

    public void goSignUp(View v) {
        SharedPreferences sp = getSharedPreferences("userInfo", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        editor.putString("fname", txtFirstName.getText().toString());
        editor.putString("lname", txtLastName.getText().toString());
        editor.putString("uname", txtUsername.getText().toString());
        editor.putString("pword", txtPassword.getText().toString());
        editor.putString("email", txtEmail.getText().toString());
        editor.commit();
        Toast.makeText(this, "SAVED", Toast.LENGTH_LONG).show();
    }
}
