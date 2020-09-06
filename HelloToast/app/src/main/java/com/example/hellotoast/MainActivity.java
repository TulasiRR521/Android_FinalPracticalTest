package com.example.hellotoast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int count=0;
    TextView mTextview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTextview=findViewById(R.id.tv);
        if(savedInstanceState!=null && savedInstanceState.containsKey("ap")){
            count=savedInstanceState.getInt("ap");
            mTextview.setText(String.valueOf(count));
        }

    }

    public void ShowToast(View view)
    {
        Toast.makeText(this, "Welcome", Toast.LENGTH_SHORT).show();
    }

    public void showCount(View view) {
       count++;
       mTextview.setText(String.valueOf(count));
        Toast.makeText(this, "count value is "+count, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("ap",count);
    }
}
