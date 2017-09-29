package com.example.joxxxx.footscapes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MenuSettingsUI extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_settings_ui);
    }

    public void buttonclick(View v)
    {
        switch (v.getId())
        {
            case R.id.btnchange:
            {
                Intent gochange = new Intent(this,SetPasswordUI.class);
                startActivity(gochange);
                break;
            }
            case R.id.btnreport:
            {
                Intent goreport = new Intent(this,ReportUI.class);
                startActivity(goreport);
                break;
            }
        }
    }
}
