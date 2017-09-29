package com.example.joxxxx.footscapes;

import android.widget.EditText;

/**
 * Created by Joxxxx on 28/09/2017.
 */

public class CodeVerificationController
{
    Integer codein,randomcodeint;

    public void CodeVerificationController()
    {
        codein = 0;
        randomcodeint = 0;
    }

    public void setCodein(EditText code)
    {
        this.codein = Integer.parseInt(code.getText().toString());
    }

    public void setRandomcodeint(Integer randomcode)
    {
        this.randomcodeint = randomcode;
    }

    public Integer getCodein()
    {
        return this.codein;
    }

    public Integer getRandomcodeint()
    {
        return this.randomcodeint;
    }

    public Boolean verifycode()
    {
        if(getCodein().equals(getRandomcodeint()))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
