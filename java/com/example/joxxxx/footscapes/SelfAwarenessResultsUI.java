package com.example.joxxxx.footscapes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SelfAwarenessResultsUI extends AppCompatActivity
{
    SelfAwarenessController saController;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_self_awareness_results_ui);
        result = (TextView)findViewById(R.id.tvtempresult);
    }

}
