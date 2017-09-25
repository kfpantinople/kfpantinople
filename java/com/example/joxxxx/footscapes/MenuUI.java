package com.example.joxxxx.footscapes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MenuUI extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_ui);
    }

    public void buttonclick(View v)
    {
        Intent goachieve = new Intent(this,MenuAchievementUI.class);
        Intent goupcoming = new Intent(this, MenuUpcomingUI.class);
        Intent gosettings = new Intent(this,MenuSettingsUI.class);
        Intent gotraveljour = new Intent(this, MenuMyTravelJournalUI.class);
        Intent gomoments = new Intent(this, MenuMomentsUI.class);
        Intent goterms = new Intent(this, TermsAndConditionsUI.class);
        Intent gohelp = new Intent(this,HelpCenterUI.class);
        Intent gouser = new Intent(this,UserProfileUI.class);
        Intent gologin = new Intent(this, LoginUI.class);
        //Intent gosettings;

        switch (v.getId())
        {
            case R.id.tvuser:
            {
                startActivity(gouser);
                break;
            }
            case R.id.tvmtj:
            {
                startActivity(gotraveljour);
                break;
            }
            case R.id.tvuocoming:
            {
                startActivity(goupcoming);
                break;
            }
            case R.id.tvmoments:
            {
                startActivity(gomoments);
                break;
            }
            case R.id.tvachieve:
            {
                startActivity(goachieve);
                break;
            }
            case R.id.tvsettings:
            {
                //startActivity(gosettings);
                break;
            }
            case R.id.tvtac:
            {
                startActivity(goterms);
                break;
            }
            case R.id.tvhc:
            {
                startActivity(gohelp);
                break;
            }
            case R.id.tvlogout:
            {
                startActivity(gologin);
                break;
            }
        }
    }
}
