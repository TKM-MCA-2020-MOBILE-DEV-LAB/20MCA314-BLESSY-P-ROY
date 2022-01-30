package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    EditText username,password;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username=(EditText) findViewById(R.id.username);
        password=(EditText)findViewById(R.id.password);
        login=(Button)findViewById(R.id.login);
    }

    public void fn(View view) {
        String n = username.getText().toString();
        String w = password.getText().toString();
        if((n.equals("admin"))&&(w.equals("admin")))
        {
            Toast.makeText(this, "Authorized", Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(this, "Not authorized", Toast.LENGTH_SHORT).show();
        }

    }
}