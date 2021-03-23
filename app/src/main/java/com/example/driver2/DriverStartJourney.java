package com.example.driver2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.format.DateUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DriverStartJourney extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_driver_start_journey);

        TextView dateAndTime = (TextView)findViewById(R.id.txtDateAndTime);
        dateAndTime.setText(DateUtils.formatDateTime(this, System.currentTimeMillis(), DateUtils.FORMAT_SHOW_TIME | DateUtils.FORMAT_SHOW_DATE| DateUtils.FORMAT_NUMERIC_DATE));
    }

    public void viewMap(View view){
        Intent intent = new Intent(this, DriverDailyMap.class);
        startActivity(intent);
    }
}