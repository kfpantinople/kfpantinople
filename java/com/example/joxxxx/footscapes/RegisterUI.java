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
    AccountController registerController;
    EditText name,age,gender,bday,mobile,email,username,pass,retyepass;
    CheckBox terms;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_ui);
        registerController = new AccountController();
        terms = (CheckBox)findViewById(R.id.checkboxterms);
    }

    public void buttonclick (View view)
    {
        Intent gosacholeric = new Intent(this, SelfAwarenessCholericUI.class);
        registerController.setName(name);
        registerController.setAge(age);
        registerController.setGender(gender);
        registerController.setBirthdate(bday);
        registerController.setMobile(mobile);
        registerController.setEmail(email);
        registerController.setUsername(username);
        registerController.setPassword(pass);
        registerController.setRePassword(retyepass);
        registerController.setValues();

        if((terms.isChecked())&&((registerController.getName().isEmpty())||(registerController.getAge().isEmpty())||
                (registerController.getGender().isEmpty())||(registerController.getBirthdate().isEmpty())||(registerController.getMobile().isEmpty())||
                (registerController.getEmail().isEmpty())||(registerController.getUsername().isEmpty())||(registerController.getPassword().isEmpty())||
                (registerController.getRePassword().isEmpty())))
        {
            Toast.makeText(this,"Please fill all fields",Toast.LENGTH_SHORT).show();
        }
        else
        {
            startActivity(gosacholeric);
        }
    }
}
