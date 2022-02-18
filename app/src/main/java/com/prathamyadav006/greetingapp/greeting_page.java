package com.prathamyadav006.greetingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class greeting_page extends AppCompatActivity {
    TextView receiver_msg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_greeting_page);
        receiver_msg = (TextView)findViewById(R.id.greetText);
        Intent intent = getIntent();
        String personName = intent.getStringExtra("name");

        receiver_msg.setText(personName);

    }

}