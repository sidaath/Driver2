package com.example.driver2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class DriverMessageSingleParent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_driver_message_single_parent);
    }

    public void sendMessage(View view){
        EditText driverMessage = (EditText)findViewById(R.id.edttxtDriverSingleParentMessage);
        String driverMessageInput = driverMessage.getText().toString();
        Intent intent = new Intent(this, DriverMessageSingleParentConfirmation.class);
        intent.putExtra("DRIVER_MESSAGE", driverMessageInput);
        startActivity(intent);
    }
}