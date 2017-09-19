package com.example.joxxxx.bucketlisten;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class setpassword extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setpassword);
    }

    public void openlogin (View view)
    {
        Intent intent = new Intent(this, login.class);
        EditText newpass = (EditText)findViewById(R.id.editText2);
        EditText retype = (EditText)findViewById(R.id.editText3);
        if(newpass.getText().toString().isEmpty())
        {
            Toast.makeText(this,"Please fill up necessary fields",Toast.LENGTH_SHORT).show();
        }
        else if (retype.getText().toString().isEmpty())
        {
            Toast.makeText(this,"Please fill up necessary fields",Toast.LENGTH_SHORT).show();
        }
        if (newpass.getText().toString().equals(retype.getText().toString()))
        {
            startActivity(intent);
        }
        else
        {
            Toast.makeText(this,"Password do not match",Toast.LENGTH_SHORT).show();
        }

    }
}
