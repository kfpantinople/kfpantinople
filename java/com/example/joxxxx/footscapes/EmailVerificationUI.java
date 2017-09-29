package com.example.joxxxx.footscapes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class EmailVerificationUI extends AppCompatActivity
{
    AccountController evController;
    EditText email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email_verification_ui);
        evController = new AccountController();
    }

    public void buttonclick(View view)
    {
        Intent gocodeverify = new Intent(this,CodeVerificationUI.class);

        email = (EditText)findViewById(R.id.fg_email);

        evController.setEmail(email);

        if(evController.verifyEmail())
        {
            Toast.makeText(this, "Please enter recovery email", Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(this, "Sent verification through email", Toast.LENGTH_SHORT).show();
            startActivity(gocodeverify);
        }
    }
}
