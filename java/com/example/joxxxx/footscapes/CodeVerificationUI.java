package com.example.joxxxx.footscapes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class CodeVerificationUI extends AppCompatActivity {
    CodeVerificationController cvController;
    EditText incode;
    TextView randomcodegen;
    Random randomcode;
    Integer randomgencode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_code_verification_ui);
        cvController = new CodeVerificationController();
        randomcode = new Random();
        randomgencode =randomcode.nextInt(1000);
        randomcodegen = (TextView)findViewById(R.id.randcode);
        randomcodegen.setText(randomgencode.toString());
    }

    public void buttonclick (View view)
    {
        Intent intent = new Intent(this, SetPasswordUI.class);
        incode = (EditText)findViewById(R.id.code);

        cvController.setCodein(incode);
        cvController.setRandomcodeint(randomgencode);

        if(cvController.verifycode())
        {
            startActivity(intent);
        }
        else
        {
            Toast.makeText(this, "Wrong Verification Code. Try Again.", Toast.LENGTH_SHORT).show();
        }
    }
}
