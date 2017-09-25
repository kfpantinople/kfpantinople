package com.example.joxxxx.footscapes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class SetPasswordUI extends AppCompatActivity
{
    SetPasswordController spController;
    EditText passwrd,retypepasswrd;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_password_ui);
        spController = new SetPasswordController();

    }

    public void buttonclick(View v)
    {
        Intent gologin = new Intent(this, LoginUI.class);
        passwrd = (EditText)findViewById(R.id.pass);
        retypepasswrd = (EditText)findViewById(R.id.retypepass);

        spController.setPassword(passwrd);
        spController.setRetype(retypepasswrd);

        if(passwrd.getText().toString().isEmpty()||retypepasswrd.getText().toString().isEmpty())
        {
            Toast.makeText(this,"Please fill up fields.",Toast.LENGTH_SHORT).show();
        }
        else
        {
            if(spController.verifypassword())
            {
                Toast.makeText(this,"Password has been changed",Toast.LENGTH_SHORT).show();
                startActivity(gologin);
            }
            else
            {
                Toast.makeText(this,"Password do not match",Toast.LENGTH_SHORT).show();
            }
        }
    }
}
