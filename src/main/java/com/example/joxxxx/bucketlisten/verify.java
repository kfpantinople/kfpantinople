package com.example.joxxxx.bucketlisten;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class verify extends AppCompatActivity {

    VerifyContoller verifyContoller;
    EditText incode;
    TextView random;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify);
        verifyContoller = new VerifyContoller();
    }

    public void buttonclick (View view)
    {
        Intent intent = new Intent(this, setpassword.class);
        incode = (EditText)findViewById(R.id.code);

        verifyContoller.setCodein(incode);

        if(verifyContoller.verifycode()==1)
        {
            startActivity(intent);
        }
        else
        {
            Toast.makeText(this, "Wrong Verification Code. Try Again.", Toast.LENGTH_SHORT).show();
        }
    }

}
