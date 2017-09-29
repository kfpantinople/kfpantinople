package com.example.joxxxx.footscapes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class UpcomingUI extends AppCompatActivity {

    AccountController aController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upcoming_ui);
        aController = new AccountController();
    }

    public void buttonclick(View v)
    {
        Intent gohome = new Intent(this,HomeUI.class);

        aController.setUpcoming(true);
        startActivity(gohome);
    }
}
