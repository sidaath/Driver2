package com.example.driver2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void startJourney(View view){
        Intent intent = new Intent(this, DriverStartJourney.class);
        startActivity(intent);
    }

    public  void messages(View view){
        Intent intent = new Intent(this, DriverMessages.class);
        startActivity(intent);
    }

    public  void todaysAttendance(View view){
        Intent intent = new Intent(this, DriverTodaysAttendance.class);
        startActivity(intent);
    }

    public  void payments(View view){
        Intent intent = new Intent(this, DriverPayments.class);
        startActivity(intent);
    }

    public  void registeredStudents(View view){
        Intent intent = new Intent(this, DriverRegisteredStudents.class);
        startActivity(intent);
    }
}