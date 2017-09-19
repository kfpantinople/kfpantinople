package com.example.joxxxx.bucketlisten;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SelfAwareness3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_self_awareness3);
    }
    public void goselfawareness4 (View view)
    {
        Intent intent = new Intent(this, SelfAwareness4.class);
        startActivity(intent);
    }
}
