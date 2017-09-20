package com.example.joxxxx.footscapes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginUI extends AppCompatActivity
{
    public LoginController loginController;
    public EditText username,password;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_ui);
        loginController = new LoginController();
    }

    public void buttonclicker (View v)
    {
        username = (EditText)findViewById(R.id.username);
        password = (EditText)findViewById(R.id.password);
        Intent goemailverify = new Intent(this, EmailVerifyUI.class);
        Intent goregister = new Intent(this, RegisterUI.class);
        Intent gohpretest = new Intent(this, HomePretestUI.class);
        switch (v.getId())
        {
            case R.id.button_logn:
            {
                loginController.setPassword(password);
                loginController.setUsername(username);

                switch (loginController.verifyuser(username,password))
                {
                    case 0:
                    {
                        Toast.makeText(this, "Login button clicked.", Toast.LENGTH_SHORT).show();
                        startActivity(gohpretest);
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
                startActivity(goregister);
                break;
            }
            case R.id.forgotpass:
            {
                startActivity(goemailverify);
                break;
            }
        }
    }
}
