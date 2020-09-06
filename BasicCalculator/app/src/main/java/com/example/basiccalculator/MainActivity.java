package com.example.basiccalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText ed1,ed2;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1=findViewById(R.id.e1);
        ed2=findViewById(R.id.e2);
        tv=findViewById(R.id.text1);
    }

    public void add(View view) {
        int a,b,c;
        a=Integer.parseInt(ed1.getText().toString());
        b=Integer.parseInt(ed2.getText().toString());
        c=a+b;
        tv.setText("  "+c);

    }

    public void sub(View view) {
        int a,b,c;
        a=Integer.parseInt(ed1.getText().toString());
        b=Integer.parseInt(ed2.getText().toString());
        c=a-b;
        tv.setText("   "+c);
    }

    public void mult(View view) {
        int a,b,c;
        a=Integer.parseInt(ed1.getText().toString());
        b=Integer.parseInt(ed2.getText().toString());
        c=a*b;
        tv.setText("   "+c);
    }

    public void div(View view) {
        int a,b,c;
        a=Integer.parseInt(ed1.getText().toString());
        b=Integer.parseInt(ed2.getText().toString());
        c=a%b;
        tv.setText("   "+c);
    }
}
