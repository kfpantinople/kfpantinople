package com.example.kathrinefaye.bucketlisten;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Pre_test extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pre_test);
    }
    public void pretesResult(View view) {
        // TODO Auto-generated method stub
        Intent i=new Intent(this, DesinationSuggestions.class);
        startActivity(i);
    }
}
