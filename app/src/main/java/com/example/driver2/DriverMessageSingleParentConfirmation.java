package com.example.driver2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class DriverMessageSingleParentConfirmation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_driver_message_single_parent_confirmation);
        TextView unconfirmedMessage = (TextView)findViewById(R.id.txtSingleParentMessage);
        unconfirmedMessage.setText(getIntent().getStringExtra("DRIVER_MESSAGE"));
    }

    public void editMessage(View view){
        onBackPressed();
    }
}