package com.example.joxxxx.footscapes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ChecklistUI extends AppCompatActivity {

    List<String> checklist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checklist_ui);
        checklist = new ArrayList<String>();
    }

    public void buttonclick(View v)
    {
        Intent gohome = new Intent(this,HomeUI.class);
        CheckBox c1,c2,c3,c4,c5,c6;
        c1 = (CheckBox)findViewById(R.id.cb1);
        c2 = (CheckBox)findViewById(R.id.cb2);
        c3 = (CheckBox)findViewById(R.id.cb3);
        c4 = (CheckBox)findViewById(R.id.cb4);
        c5 = (CheckBox)findViewById(R.id.cb5);
        c6 = (CheckBox)findViewById(R.id.cb6);

        if(c1.isChecked())
        {
            checklist.add(c1.getText().toString());
        }
        if(c2.isChecked())
        {
            checklist.add(c2.getText().toString());
        }
        if(c3.isChecked())
        {
            checklist.add(c3.getText().toString());
        }
        if(c4.isChecked())
        {
            checklist.add(c4.getText().toString());
        }
        if(c5.isChecked())
        {
            checklist.add(c5.getText().toString());
        }
        if(c6.isChecked())
        {
            checklist.add(c6.getText().toString());
        }

        startActivity(gohome);
        finish();
    }
}
