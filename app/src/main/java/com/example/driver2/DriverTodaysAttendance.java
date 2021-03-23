package com.example.driver2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DriverTodaysAttendance extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_driver_todays_attendance);
    }

    public void driverDailyViewMap(View view){
        Intent intent = new Intent(this, DriverDailyMap.class);
        startActivity(intent);
    }

    public void driverDailyStartJourney(View view){
        Intent intent = new Intent(this, DriverStartJourney.class);
        startActivity(intent);
    }
}