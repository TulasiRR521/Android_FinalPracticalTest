package com.example.reg_s160712;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class details extends AppCompatActivity {
    TextView t_details,t_details1,t_details2,t_details3,t_details4,t_details5,t_details6;
    String name,roll,mail,phone,password,gender,branch;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        t_details=findViewById(R.id.txt_details);
        t_details1=findViewById(R.id.txt_details1);
        t_details2=findViewById(R.id.txt_details2);
        t_details3=findViewById(R.id.txt_details3);
        t_details4=findViewById(R.id.txt_details4);
        t_details5=findViewById(R.id.txt_details5);
        t_details6=findViewById(R.id.txt_details6);
        name=getIntent().getExtras().getString("value1");
        roll=getIntent().getExtras().getString("value");
        mail=getIntent().getExtras().getString("value2");
        phone=getIntent().getExtras().getString("value3");
        password=getIntent().getExtras().getString("value4");
        gender=getIntent().getExtras().getString("value5");
        branch=getIntent().getExtras().getString("value6");


        t_details.setText(name+"\n"+roll+"\n"+mail+"\n"+phone+"\n"+password+"\n"+gender+"\n"+branch);

    }
}
