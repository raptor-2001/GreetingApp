package com.prathamyadav006.greetingapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button send_button;
    EditText send_text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        send_button = (Button)findViewById(R.id.nextPage);
        send_text = (EditText)findViewById(R.id.nameInput);
    }

    public void createGreetingPage(View view) {
       String name = send_text.getText().toString();
       Intent intent = new Intent(this ,greeting_page.class);
       intent.putExtra("name",name);
       startActivity(intent);
    }


}