package com.example.joxxxx.footscapes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class PreTestResultUI extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pre_test_result_ui);
    }

    public void buttonclick (View v)
    {
        Intent gosuggestions = new Intent(this,SelectDestinationUI.class);
        startActivity(gosuggestions);
    }
}
