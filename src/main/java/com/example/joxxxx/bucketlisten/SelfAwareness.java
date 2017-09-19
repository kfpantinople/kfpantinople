package com.example.joxxxx.bucketlisten;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SelfAwareness extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_self_awareness);
    }

    public void goselfawareness2 (View view)
    {
        Intent intent = new Intent(this, SelfAwareness2.class);
        startActivity(intent);
    }
}
