package com.example.joxxxx.bucketlisten;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class forgotpassword extends AppCompatActivity
{
    ForgotPasswordController fpController;
    EditText email;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgotpassword);
        fpController = new ForgotPasswordController();
    }

    public void buttonclick(View view)
    {
        Intent goverify = new Intent(this, verify.class);
        email = (EditText)findViewById(R.id.fg_email);

        fpController.setEmail(email);

        if(fpController.verifyEmail()==1)
        {
            Toast.makeText(this, "Please enter recovery email", Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(this, "Sent verification through email", Toast.LENGTH_SHORT).show();
            startActivity(goverify);
        }
    }
}
