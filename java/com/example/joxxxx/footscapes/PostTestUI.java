package com.example.joxxxx.footscapes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class PostTestUI extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post_test_ui);
    }

    public void buttonclick (View v)
    {
        Intent gojournal = new Intent(this,JournalUI.class);
        startActivity(gojournal);
    }
}
