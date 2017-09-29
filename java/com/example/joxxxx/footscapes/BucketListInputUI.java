package com.example.joxxxx.footscapes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

import java.util.ArrayList;
import java.util.List;

public class BucketListInputUI extends AppCompatActivity {

    List<String> checklist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bucket_list_input_ui);
        checklist = new ArrayList<String>();
    }

    public void buttonclick(View v)
    {
        Intent gohome = new Intent(this,HomeUI.class);
        CheckBox c1,c2,c3,c4,c5,c6;
        c1 = (CheckBox)findViewById(R.id.cbec);
        c2 = (CheckBox)findViewById(R.id.cbt);
        c3 = (CheckBox)findViewById(R.id.cbf);
        c4 = (CheckBox)findViewById(R.id.cbw);
        c5 = (CheckBox)findViewById(R.id.cbpt);
        c6 = (CheckBox)findViewById(R.id.cbpb);
    }
}
