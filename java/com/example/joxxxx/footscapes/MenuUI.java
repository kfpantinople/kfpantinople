package com.example.joxxxx.footscapes;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MenuUI extends AppCompatActivity {

    AccountController aController;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_ui);
        aController = new AccountController();
    }

    /*private Boolean exit = false;
    @Override
    public void onBackPressed() {
        if (exit) {
            finish(); // finish activity
        } else {
            Toast.makeText(this, "Press Back again to Exit.",
                    Toast.LENGTH_SHORT).show();
            exit = true;
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    exit = false;
                }
            }, 5 * 1000);

        }
    }*/

    public void buttonclick(View v)
    {
        Intent goupcoming = new Intent(this, MenuUpcomingUI.class);
        Intent gosettings = new Intent(this,MenuSettingsUI.class);
        Intent gotraveljour = new Intent(this, MenuMyTravelJournalUI.class);
        Intent goterms = new Intent(this, TermsAndConditionsUI.class);
        Intent gohelp = new Intent(this,HelpCenterUI.class);
        Intent gouser = new Intent(this,UserProfileUI.class);
        Intent gologin = new Intent(this, LoginUI.class);

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
                //if(aController.getUpcoming())
                    startActivity(goupcoming);
                //else
                    //Toast.makeText(this,"No Upcoming Travels",Toast.LENGTH_SHORT).show();
                break;
            }
            case R.id.tvsettings:
            {
                startActivity(gosettings);
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
