package com.example.joxxxx.footscapes;

import android.widget.EditText;

/**
 * Created by Joxxxx on 19/09/2017.
 */

public class LoginController
{
    String username,password;

    public LoginController()
    {
        username = new String();
        password = new String();
        username.equals("");
        password.equals("");
    }

    public  String getPassword()
    {
        return this.password;
    }

    public String getUsername(){ return this.username; }

    public void setUsername(EditText user)
    {
        this.username = user.getText().toString();
    }

    public void setPassword(EditText pass)
    {
        this.password = pass.getText().toString();
    }

    public Integer verifyuser (EditText username,EditText password)
    {
        setUsername(username);
        setPassword(password);
        if(this.username.equals(this.password))
        {
            return 0;
        }
        else if (this.username.isEmpty())
        {
            return 1;
        }
        else if (this.password.isEmpty())
        {
            return 2;
        }
        else if (!this.username.equals(this.password));
        {
            return 3;
        }
    }
}
