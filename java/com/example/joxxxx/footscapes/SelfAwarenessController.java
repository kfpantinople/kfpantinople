package com.example.joxxxx.footscapes;

import android.content.Intent;
import android.widget.CheckBox;

/**
 * Created by Joxxxx on 19/09/2017.
 */

public class SelfAwarenessController
{
    Integer cholericchoice,melancholicchoice,sanguinechoice,phlegmaticchoice;

    public void SelfAwarenessController()
    {
        this.cholericchoice = 0;
        this.phlegmaticchoice = 0;
        this.sanguinechoice = 0;
        this.melancholicchoice = 0;
    }

    public void setCholericchoice(Integer choleric)
    {
        this.cholericchoice = choleric;
    }

    public void setSanguinechoice (Integer sanguine)
    {
        this.sanguinechoice = sanguine;
    }

    public void setMelancholicchoice (Integer melancholic)
    {
        this.melancholicchoice = melancholic;
    }

    public void setPhlegmaticchoice (Integer phlegmatic)
    {
        this.phlegmaticchoice = phlegmatic;
    }

    public Integer getCholericchoice()
    {
        return this.cholericchoice;
    }

    public Integer getSanguinechoice()
    {
        return this.sanguinechoice;
    }

    public Integer getMelancholicchoice()
    {
        return this.melancholicchoice;
    }

    public Integer getPhlegmaticchoice()
    {
        return this.phlegmaticchoice;
    }

    public String getResult()
    {
        if(getCholericchoice() > getSanguinechoice() && getCholericchoice() > getMelancholicchoice() &&
                getCholericchoice() > getPhlegmaticchoice())
        {
            return "Choleric";
        }
        else if (getSanguinechoice() > getCholericchoice() && getSanguinechoice() > getMelancholicchoice() &&
                getSanguinechoice() > getPhlegmaticchoice())
        {
            return "Sanguine";
        }
        else if (getMelancholicchoice() > getCholericchoice() && getMelancholicchoice() > getSanguinechoice() &&
                getMelancholicchoice() > getPhlegmaticchoice())
        {
            return "Melancholic";
        }
        else if (getPhlegmaticchoice() > getCholericchoice() && getPhlegmaticchoice() > getSanguinechoice() &&
                getPhlegmaticchoice() > getMelancholicchoice())
        {
            return "Phlegmatic";
        }
        else
        {
            return "void";
        }
    }
}
