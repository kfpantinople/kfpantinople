package com.example.joxxxx.footscapes;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginUI extends AppCompatActivity
{
    public AccountController loginController;
    public EditText username,password;
    private Boolean exit = false;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_ui);
        loginController = new AccountController();
    }

    @Override
    public void onBackPressed() {
        if (exit) {
            finish(); // finish activity
        } else {
            Toast.makeText(this, "Press Back again to Exit.",
                    Toast.LENGTH_SHORT).show();
            exit = true;
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    exit = false;
                }
            }, 5 * 1000);

        }
    }

    public void buttonclicker (View v)
    {
        username = (EditText)findViewById(R.id.username);
        password = (EditText)findViewById(R.id.password);
        Intent goemailverify = new Intent(this, EmailVerifyUI.class);
        Intent goregister = new Intent(this, RegisterUI.class);
        Intent gohpretest = new Intent(this, PreTestUI.class);
        switch (v.getId())
        {
            case R.id.button_logn:
            {
                loginController.setPassword(password);
                loginController.setUsername(username);

                switch (loginController.verifyUser(username,password))
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
