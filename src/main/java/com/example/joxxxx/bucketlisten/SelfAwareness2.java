package com.example.joxxxx.bucketlisten;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SelfAwareness2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_self_awareness2);
    }
    public void goselfawareness3 (View view)
    {
        Intent intent = new Intent(this, SelfAwareness3.class);
        startActivity(intent);
    }
}
