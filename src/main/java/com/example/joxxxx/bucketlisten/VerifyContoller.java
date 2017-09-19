package com.example.joxxxx.bucketlisten;

import android.widget.EditText;

import java.util.Random;

/**
 * Created by Joxxxx on 19/09/2017.
 */

public class VerifyContoller
{
    Integer codein,randomcodeint;
    Random randomcode;

    public void VerifyContoller()
    {
        codein = 0;
        randomcodeint = 0;
        randomcode = new Random();
    }

    public void setCodein(EditText code)
    {
        this.codein = Integer.parseInt(code.getText().toString());
    }

    public void setRandomcodeint()
    {
        this.randomcodeint = randomcode.nextInt(1000);
    }

    public Integer getCodein()
    {
        return this.codein;
    }

    public Integer getRandomcodeint()
    {
        return this.randomcodeint;
    }

    public Integer verifycode()
    {
        if(getCodein() == getRandomcodeint())
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
}
