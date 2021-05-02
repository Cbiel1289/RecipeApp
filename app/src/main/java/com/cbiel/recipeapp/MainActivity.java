package com.cbiel.recipeapp;
//Cameron Biel
//Final Project
//Spring 2021

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    /* Define the UI elements */
    private EditText eName;
    private EditText ePassword;
    private TextView eAttempts;
    private Button eLogin;
    private int counter = 5;

    String userName = "";
    String userPassword = "";


    class Credentials
    {
        String name = "Admin";
        String password = "Panther$";
    }
    boolean isValid = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        eName = findViewById(R.id.etName);
        ePassword = findViewById(R.id.etPassword);
        eAttempts = findViewById(R.id.tvAttempts);
        eLogin = findViewById(R.id.btnLogin);


        eLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                userName = eName.getText().toString();
                userPassword = ePassword.getText().toString();

                if(userName.isEmpty() || userPassword.isEmpty())
                {
                    Toast.makeText(MainActivity.this, "Enter a name and password", Toast.LENGTH_LONG).show();
                }else {

                    isValid = validate(userName, userPassword);

                    if (!isValid) {

                        counter--;
                        eAttempts.setText("Attempts Remaining: " + String.valueOf(counter));

                        if (counter == 0) {
                            eLogin.setEnabled(false);
                            Toast.makeText(MainActivity.this, "No attempts remaining", Toast.LENGTH_LONG).show();
                        }
                        else {
                            Toast.makeText(MainActivity.this, "Please enter the correct data", Toast.LENGTH_LONG).show();
                        }
                    }
                    else {
                        startActivity(new Intent(MainActivity.this, HomePage.class));
                    }

                }
            }
        });
    }
    private boolean validate(String userName, String userPassword)
    {

        Credentials credentials = new Credentials();

        if(userName.equals(credentials.name) && userPassword.equals(credentials.password))
        {
            return true;
        }
        return false;
    }
}