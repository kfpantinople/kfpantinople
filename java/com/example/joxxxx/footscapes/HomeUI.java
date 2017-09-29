package com.example.joxxxx.footscapes;

import android.content.Context;
import android.content.Intent;
import android.location.LocationManager;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class HomeUI extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_ui);
    }

    private Boolean exit = false;
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
    }

    private boolean isGPSEnabled()
    {
        LocationManager cm = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
        return cm.isProviderEnabled(LocationManager.GPS_PROVIDER);
    }
    public void buttonclick (View v)
    {
        Intent gomenu = new Intent(this,MenuUI.class);
        Intent gopretest = new Intent(this,PreTestUI.class);
        Intent gochecklist = new Intent(this,ChecklistUI.class);
        Intent gobucketlistin = new Intent(this,BucketListInputUI.class);
        Intent gobucketlist = new Intent(this,BucketListUI.class);

        switch (v.getId())
        {
            case R.id.menuButton:
            {
                startActivity(gomenu);
                break;
            }
            case R.id.btnpretest:
            {
                startActivity(gopretest);
                break;
            }
            case R.id.startbtn:
            {
                if(isGPSEnabled())
                {
                    startActivity(gobucketlist);
                }
                else
                {
                    Toast.makeText(this,"Please enable GPS.",Toast.LENGTH_SHORT).show();
                }
                break;
            }
        }
    }
}
