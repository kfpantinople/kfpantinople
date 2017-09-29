package com.example.joxxxx.footscapes;

import android.widget.EditText;

/**
 * Created by Joxxxx on 19/09/2017.
 */

public class SetPasswordController
{
    String password,retype;

    public void SetPasswordController()
    {
        password = new String();
        retype = new String();
        password.equals("");
        retype.equals("");
    }

    public void setPassword (EditText pass)
    {
        this.password = pass.getText().toString();
    }

    public void setRetype (EditText retypepass)
    {
        this.retype = retypepass.getText().toString();
    }

    public String getPassword()
    { return this.password;}

    public String getRetype()
    { return this.retype;}

    public Boolean verifypassword()
    {
        if(getRetype().equals(getPassword()))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
