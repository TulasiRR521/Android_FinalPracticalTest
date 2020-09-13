package com.example.reg_s160712;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText ed_name,ed_roll,ed_mail,ed_phone,ed_pass;
    RadioButton r_male,r_female;
    Spinner s_branch;
    Button b;
    String name,roll,mail,phone,password,gender,branch;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed_name=findViewById(R.id.e_name);
        ed_roll=findViewById(R.id.e_roll);
        ed_mail=findViewById(R.id.e_mail);
        ed_phone=findViewById(R.id.e_phone);
        ed_pass=findViewById(R.id.e_pass);
        r_male=findViewById(R.id.male);
        r_female=findViewById(R.id.female);
        s_branch=findViewById(R.id.branches);
        b=findViewById(R.id.button);
    }

    public void submit(View view) {

            if (ed_name.getText().toString().length() == 0 || ed_roll.getText().toString().length() == 0 || ed_mail.getText().toString().length() == 0
                || ed_phone.getText().toString().length() == 0 || ed_pass.getText().toString().length() == 0
                ||(r_male.getText().toString().length()==0 && r_female.getText().toString().length()==0))
            {
                Toast.makeText(this, "All fields are required please fill", Toast.LENGTH_SHORT).show();
            }
            else {

                Intent i = new Intent(MainActivity.this, details.class);
                roll = ed_roll.getText().toString();
                i.putExtra("value", roll);
                name = ed_name.getText().toString();
                i.putExtra("value1", name);
                mail = ed_mail.getText().toString();
                i.putExtra("value2", mail);
                phone = ed_phone.getText().toString();
                i.putExtra("value3", phone);
                password = ed_pass.getText().toString();
                i.putExtra("value4", password);
                if (r_male.isChecked()) {
                    gender = r_male.getText().toString();
                } else if (r_female.isChecked()) {
                    gender = r_female.getText().toString();
                }
                i.putExtra("value5", gender);
                branch = s_branch.getSelectedItem().toString();
                i.putExtra("value6", branch);
                startActivity(i);
                finish();
            }
        }
    }

