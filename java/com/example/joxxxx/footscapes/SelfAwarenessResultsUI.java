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

        saController = new SelfAwarenessController();
        //result = (TextView)findViewById(R.id.tvtempresult);
        //result.setText(saController.getResult());
    }

    public void buttonclick(View v)
    {
        Intent gologin = new Intent(this, LoginUI.class);

        startActivity(gologin);
    }
}
