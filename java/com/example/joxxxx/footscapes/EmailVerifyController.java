package com.example.joxxxx.footscapes;

import android.widget.EditText;

/**
 * Created by Joxxxx on 19/09/2017.
 */

public class EmailVerifyController
{
    String email;
    public EmailVerifyController()
    {
        email = new String();
        email.equals("");
    }

    public void setEmail(EditText edittextemail)
    {
        this.email = edittextemail.getText().toString();
    }

    public String getEmail()
    {
        return this.email;
    }

    public Boolean verifyEmail()
    {
        if (getEmail().isEmpty())
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
