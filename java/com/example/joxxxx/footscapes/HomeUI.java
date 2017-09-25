package com.example.joxxxx.footscapes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HomeUI extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_ui);
    }

    public void buttonclick (View v)
    {
        Intent gomenu = new Intent(this,MenuUI.class);
        Intent gopretest = new Intent(this,PreTestUI.class);

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
        }
    }
}
