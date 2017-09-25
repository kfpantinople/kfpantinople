package com.example.joxxxx.footscapes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

public class SelfAwarenessMelancholicUI extends AppCompatActivity
{
    SelfAwarenessController saController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_self_awareness_melancholic_ui);
    }

    public void buttonclick(View v)
    {
        Intent gophlegmatic = new Intent(this,SelfAwarenessPhlegmaticUI.class);

        saController.calculateresult(3,assigncb());
        startActivity(gophlegmatic);
    }

    public CheckBox[] assigncb()
    {
        CheckBox[] melancholicchoices = new CheckBox[]
                {
                        (CheckBox)findViewById(R.id.cb1),
                        (CheckBox)findViewById(R.id.cb2),
                        (CheckBox)findViewById(R.id.cb3),
                        (CheckBox)findViewById(R.id.cb4),
                        (CheckBox)findViewById(R.id.cb5),
                        (CheckBox)findViewById(R.id.cb6),
                        (CheckBox)findViewById(R.id.cb7),
                        (CheckBox)findViewById(R.id.cb8),
                        (CheckBox)findViewById(R.id.cb9),
                        (CheckBox)findViewById(R.id.cb10),
                        (CheckBox)findViewById(R.id.cb11),
                        (CheckBox)findViewById(R.id.cb12),
                        (CheckBox)findViewById(R.id.cb13),
                        (CheckBox)findViewById(R.id.cb14),
                        (CheckBox)findViewById(R.id.cb15),
                        (CheckBox)findViewById(R.id.cb16),
                        (CheckBox)findViewById(R.id.cb17),
                        (CheckBox)findViewById(R.id.cb18),
                        (CheckBox)findViewById(R.id.cb19),
                        (CheckBox)findViewById(R.id.cb20)
                };
        return melancholicchoices;
    }
}
