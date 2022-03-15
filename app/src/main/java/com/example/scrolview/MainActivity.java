package com.example.scrolview;

import android.icu.util.TimeUnit;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    TextView textView1;
    TextView textView2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView=findViewById(R.id.day);
        textView1=findViewById(R.id.hour);
        textView2=findViewById(R.id.minute);


        setDate();
    }

    void setDate() {

        Locale locale = new Locale("tr", "TR");
        Calendar now = Calendar.getInstance(locale);
        Calendar target = Calendar.getInstance(locale);
        target.set(2022, 5, 18,10,15);

        long diff = target.getTimeInMillis() - now.getTimeInMillis();
        long days = diff / 1000 / 60 / 60 / 24;
        long hours = (diff / 1000 / 60 / 60) % 24;
        long minutes = (diff / 1000 / 60 ) % 60;

        String day=String.valueOf(days);
        String hour=String.valueOf(hours);
        String minute=String.valueOf(minutes);


        textView.setText(day);
        textView1.setText(hour);
        textView2.setText(minute);
    }
}