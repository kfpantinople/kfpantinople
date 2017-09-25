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


    public void calculateresult (Integer temperament, CheckBox[] choices)
    {
        for(Integer i=0;i<20;i++)
        {
            if(choices[i].isChecked())
            {
                switch (temperament)
                {
                    case 1:
                    {
                        cholericchoice = cholericchoice + 1;
                        break;
                    }
                    case 2:
                    {
                        sanguinechoice = sanguinechoice + 1;
                        break;
                    }
                    case 3:
                    {
                        melancholicchoice = melancholicchoice + 1;
                        break;
                    }
                    case 4:
                    {
                        phlegmaticchoice = phlegmaticchoice + 1;
                        break;
                    }
                }
            }
        }
    }

    public String getResult()
    {
        if(cholericchoice > sanguinechoice && cholericchoice > melancholicchoice &&
                cholericchoice > phlegmaticchoice)
        {
            return "Choleric";
        }
        else if (sanguinechoice > cholericchoice && sanguinechoice > melancholicchoice &&
                sanguinechoice > phlegmaticchoice)
        {
            return "Sanguine";
        }
        else if (melancholicchoice > cholericchoice && melancholicchoice > sanguinechoice &&
                melancholicchoice > phlegmaticchoice)
        {
            return "Melancholic";
        }
        else if (phlegmaticchoice > cholericchoice && phlegmaticchoice > sanguinechoice &&
                phlegmaticchoice > melancholicchoice)
        {
            return "Phlegmatic";
        }
        else
        {
            return "void";
        }
    }
}
