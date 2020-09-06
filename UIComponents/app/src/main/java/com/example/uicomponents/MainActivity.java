package com.example.uicomponents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    SeekBar mSeekbar;
    RatingBar mRatingBar;
    TextView rr,sr;
    ImageView myImage;
    ImageButton myImageButton;
    LinearLayout ll;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mSeekbar=findViewById(R.id.sb);
        mRatingBar=findViewById(R.id.rb);
        rr=findViewById(R.id.result_rb);
        sr=findViewById(R.id.sb_result);
        myImage=findViewById(R.id.iv);
        myImageButton=findViewById(R.id.ib);
        ll=findViewById(R.id.l1);
        mRatingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                rr.setText("Rating is: "+rating);
            }
        });
        mSeekbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                sr.setText("Progress is "+progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        myImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myImage.setImageResource(R.drawable.image_resources);
            }
        });
        myImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myImageButton.setImageResource(R.drawable.image_resources);
            }
        });


    }

    public void change(View view) {
        int i = 1;
        ll.setBackgroundColor(i);
    }
}
