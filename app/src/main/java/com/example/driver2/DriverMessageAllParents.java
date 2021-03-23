package com.example.driver2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class DriverMessageAllParents extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_driver_message_all_parents);

    }

    public void broadcastConfirmation(View view){
        EditText driverBroadcastMessage = (EditText)findViewById(R.id.edttxtDriverBroadcastMessage);
        String driverBroadcastMessageInput = driverBroadcastMessage.getText().toString();
        Intent intent = new Intent(this, DriverMessageAllParentsConfirmation.class);
        intent.putExtra("DRIVER_MESSAGE", driverBroadcastMessageInput);
        startActivity(intent);

    }


}