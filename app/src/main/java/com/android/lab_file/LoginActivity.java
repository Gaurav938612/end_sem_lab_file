package com.android.lab_file;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    EditText Username, Password;
    Button btn1, btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Username=findViewById(R.id.etName);
        Password=findViewById(R.id.etPassword);
        btn1 = findViewById(R.id.btnLogin);
        btn2 = findViewById(R.id.btnReset);

        btn1.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View view) {
                String username=Username.getText().toString();
                String password=Password.getText().toString();
                if(username.equals("user1234") && password.equals("1234")){
                    User.username=username;
                    startActivity(new Intent(LoginActivity.this,HomeActivity.class));
                }
                else{
                    Toast.makeText(LoginActivity.this,"Invalid username or password",Toast.LENGTH_SHORT).show();
                }
            }

        });




    }
    public void Onreset(View view) {
        Username.setText("");
        Password.setText("");

    }


    public void Onregister(View view) {
        startActivity(new Intent(this, RegisterActivity.class));
    }

}