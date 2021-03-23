package com.example.driver2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class DriverMessageAllParentsConfirmation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_driver_message_all_parents_confirmation);
        TextView unconfirmed = (TextView)findViewById(R.id.txtBroadCastMessage);

        unconfirmed.setText(getIntent().getStringExtra("DRIVER_MESSAGE"));
        }

    public void editBroadcast(View view){
        onBackPressed();
    }

    }