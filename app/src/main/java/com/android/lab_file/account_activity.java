package com.android.lab_file;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class account_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account_activity);
        TextView textView=findViewById(R.id.textview);
        textView.setText("Logged username : "+User.username);
    }
}