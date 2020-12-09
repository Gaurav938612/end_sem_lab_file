package com.android.lab_file;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {
    EditText Userid,Firstname,Middlename,Lastname,Email,Contactnumber,Batchnumber,Address;
    String userid,firstname,middlename,lastname,email,contactnumber,batchnumber,address;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        Userid=findViewById(R.id.reg_userId);
        Firstname=findViewById(R.id.reg_firstnameId);
        Middlename=findViewById(R.id.reg_middlenameId);
        Lastname=findViewById(R.id.reg_lastnameId);
        Email=findViewById(R.id.reg_emailId);
        Contactnumber=findViewById(R.id.reg_contactId);
        Address=findViewById(R.id.reg_addressId);
        //imageView=findViewById(R.id.imageViewId);
    }

    public void Goback(View view) {
        startActivity(new Intent(this, LoginActivity.class));
        finish();
    }

    public void uploadPhoto(View view) {

    }

    public void Onreg_reset(View view) {
        Userid.setText("");
        Firstname.setText("");
        Middlename.setText("");
        Lastname.setText("");
        Email.setText("");
        Contactnumber.setText("");
        Address.setText("");
    }
}