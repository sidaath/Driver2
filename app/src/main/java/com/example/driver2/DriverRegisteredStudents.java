package com.example.driver2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DriverRegisteredStudents extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_driver_registered_students);
    }

    public void driverChangeOrderOfPickup(View view){
        Intent intent = new Intent(this, DriverSetOrderOfPickup.class);
        startActivity(intent);
    }
}