package com.example.finalsproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.*;

import com.google.android.material.snackbar.Snackbar;

public class Main5Activity extends AppCompatActivity {

    TextView txtMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        txtMessage = findViewById(R.id.tvMessage);
    }

    public void goLogout(View v) {
        Intent i = new Intent(this, Main4Activity.class);
        startActivity(i);
    }

    public void showToast(View v) {
        Toast.makeText(this, "THIS IS A TOAST...", Toast.LENGTH_LONG).show();
    }

    public void showSnackbar(View v) {
        Snackbar.make(v, "THIS IS A SNACKBAR...", Snackbar.LENGTH_LONG).show();
    }

    public void showMessage(View v) {txtMessage.setText("SHOW MESSAGE BUTTON CLICKED...");
    }

    public void showAndroidStudioWebsite(View v){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://developer.android.com/"));
        startActivity(i);
    }
}
