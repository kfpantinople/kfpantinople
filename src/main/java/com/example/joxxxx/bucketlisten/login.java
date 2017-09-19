package com.example.joxxxx.bucketlisten;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

public class login extends AppCompatActivity
{
    public LoginController loginController;
    private FirebaseAuth mAuth;
    public EditText username,password;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        loginController = new LoginController();
    }

    public void buttonclicker (View v)
    {
        username = (EditText)findViewById(R.id.username);
        password = (EditText)findViewById(R.id.password);
        switch (v.getId())
        {
            case R.id.button_logn:
            {
                Intent goselfaware = new Intent(this, SelfAwareness.class);

                loginController.setPassword(password);
                loginController.setUsername(username);

                switch (loginController.verifyuser(username,password))
                {
                    case 0:
                    {
                        Toast.makeText(this, "Login button clicked.", Toast.LENGTH_SHORT).show();
                        startActivity(goselfaware);
                        break;
                    }
                    case 1:
                    {
                        Toast.makeText(this, "Username empty.", Toast.LENGTH_SHORT).show();
                        break;
                    }
                    case 2:
                    {
                        Toast.makeText(this, "Password empty.", Toast.LENGTH_SHORT).show();
                        break;
                    }
                    case 3:
                    {
                        Toast.makeText(this, "Username and password incorrect.", Toast.LENGTH_SHORT).show();
                        break;
                    }
                }
                break;
            }
            case R.id.button_register:
            {
                Intent gosignup = new Intent(this, Register.class);
                startActivity(gosignup);
                break;
            }
            case R.id.forgotpass:
            {
                Intent goforgotpass = new Intent(this, forgotpassword.class);
                startActivity(goforgotpass);
                break;
            }
        }
    }
}
