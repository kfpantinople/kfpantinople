package com.example.joxxxx.footscapes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

import java.util.LinkedList;
import java.util.List;

public class SelfAwarenessCholericUI extends AppCompatActivity
{
    SelfAwarenessController saController;
    CheckBox[] cholerichoices;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_self_awareness_choleric_ui);
        saController = new SelfAwarenessController();
    }

    public CheckBox[] assigncb()
    {
        CheckBox[] cholericchoices = new CheckBox[]
                {
                        (CheckBox) findViewById(R.id.cb1),
                        (CheckBox) findViewById(R.id.cb2),
                        (CheckBox) findViewById(R.id.cb3),
                        (CheckBox) findViewById(R.id.cb4),
                        (CheckBox) findViewById(R.id.cb5),
                        (CheckBox) findViewById(R.id.cb6),
                        (CheckBox) findViewById(R.id.cb7),
                        (CheckBox) findViewById(R.id.cb8),
                        (CheckBox) findViewById(R.id.cb9),
                        (CheckBox) findViewById(R.id.cb10),
                        (CheckBox) findViewById(R.id.cb11),
                        (CheckBox) findViewById(R.id.cb12),
                        (CheckBox) findViewById(R.id.cb13),
                        (CheckBox) findViewById(R.id.cb14),
                        (CheckBox) findViewById(R.id.cb15),
                        (CheckBox) findViewById(R.id.cb16),
                        (CheckBox) findViewById(R.id.cb17),
                        (CheckBox) findViewById(R.id.cb18),
                        (CheckBox) findViewById(R.id.cb19),
                        (CheckBox) findViewById(R.id.cb20)
                };
        return cholericchoices;
    }

    public void buttonclick(View v)
    {
        Intent gosanguine = new Intent(this,SelfAwarenessSanguineUI.class);

        cholerichoices = assigncb();
        saController.calculateresult(1,cholerichoices);
        startActivity(gosanguine);
    }


}
