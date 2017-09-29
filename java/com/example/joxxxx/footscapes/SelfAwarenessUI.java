package com.example.joxxxx.footscapes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SelfAwarenessUI extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_self_awareness_ui);
    }

    public void buttonclick (View v)
    {
        Intent goresult = new Intent(this ,SelfAwarenessResultsUI.class);
        startActivity(goresult);
        finish();
    }
}
