package com.example.joxxxx.bucketlisten;

import android.widget.EditText;

/**
 * Created by Joxxxx on 18/09/2017.
 */

public class ForgotPasswordController
{
    String email;
    public ForgotPasswordController()
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

    public Integer verifyEmail()
    {
        if (getEmail().isEmpty())
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
}
