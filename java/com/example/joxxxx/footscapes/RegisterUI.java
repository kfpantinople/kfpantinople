package com.example.joxxxx.footscapes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterUI extends AppCompatActivity
{
    AccountController rController;
    EditText name,age,gender,bday,mobile,email,username,pass,retyepass;
    CheckBox terms;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_ui);
        rController = new AccountController();
        terms = (CheckBox)findViewById(R.id.checkboxterms);
    }

    public void buttonclick (View view)
    {
        Intent gosa = new Intent(this, SelfAwarenessUI.class);

        name = (EditText)findViewById(R.id.edittextname);
        age = (EditText)findViewById(R.id.edittextage);
        gender = (EditText)findViewById(R.id.edittextgender);
        bday = (EditText)findViewById(R.id.edittextbirthdate);
        mobile = (EditText)findViewById(R.id.edittextmobile);
        email = (EditText)findViewById(R.id.edittextemail);
        username = (EditText)findViewById(R.id.edittextusername);
        pass = (EditText)findViewById(R.id.edittextpassword);
        retyepass = (EditText)findViewById(R.id.edittextretype);

        //rController.setValues();
        rController.setName(name);
        rController.setAge(age);
        rController.setGender(gender);
        rController.setBirthdate(bday);
        rController.setMobile(mobile);
        rController.setEmail(email);
        rController.setUsername(username);
        rController.setPassword(pass);
        rController.setRePassword(retyepass);

        if (!(terms.isChecked())&&((rController.getName().isEmpty())||(rController.getAge().isEmpty())||
                (rController.getGender().isEmpty())||(rController.getBirthdate().isEmpty())||(rController.getMobile().isEmpty())||
                (rController.getEmail().isEmpty())||(rController.getUsername().isEmpty())||(rController.getPassword().isEmpty())||
                (rController.getRePassword().isEmpty())))
        {
            Toast.makeText(this,"Please fill all fields",Toast.LENGTH_SHORT).show();
        }
        else
        {
            if(rController.getRePassword().equals(rController.getPassword()))
            {
                startActivity(gosa);
                finish();
            }
            else
            {
                Toast.makeText(this,"Password do not match",Toast.LENGTH_SHORT).show();
            }
        }
    }
}
