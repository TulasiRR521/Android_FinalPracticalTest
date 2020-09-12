package com.example.myloginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void loginhere(View view) {
        Toast.makeText(this, "Login successful", Toast.LENGTH_SHORT).show();

    }

    public void registerhere(View view) {
        Intent i=new Intent(this,Registerpage.class);
        startActivity(i);
    }
}
