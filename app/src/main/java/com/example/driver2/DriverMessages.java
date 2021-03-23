package com.example.driver2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DriverMessages extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_driver_messages);
    }

    public void messagesInbox(View view){
        Intent intent = new Intent(this, DriverMessageInbox.class);
        startActivity(intent);
    }

    public void messageAllParents(View view){
        Intent intent = new Intent(this, DriverMessageAllParents.class);
        startActivity(intent);

    }

    public void messageSingleParent(View view){
        Intent intent = new Intent(this, DriverMessageSingleParent.class);
        startActivity(intent);

    }
}