package com.example.joxxxx.footscapes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MenuUpcomingUI extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_upcoming_ui);
    }

    public void buttonclick (View v)
    {
        switch (v.getId())
        {
            case R.id.btnchklist:
            {
                Intent gocklist = new Intent(this,ChecklistUI.class);
                startActivity(gocklist);
                break;
            }
            case R.id.btnbucketlist:
            {
                Intent gobcktlist = new Intent(this,BucketListInputUI.class);
                startActivity(gobcktlist);
                break;
            }
        }
    }
}
