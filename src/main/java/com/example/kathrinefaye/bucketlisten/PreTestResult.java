package com.example.kathrinefaye.bucketlisten;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class PreTestResult extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pre_test_result);
    }

    public void desSuggest(View view) {
        // TODO Auto-generated method stub
        Intent i=new Intent(this, DesinationSuggestions.class);
        startActivity(i);
    }


}
