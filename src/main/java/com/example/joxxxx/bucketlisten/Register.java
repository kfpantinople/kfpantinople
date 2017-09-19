package com.example.joxxxx.bucketlisten;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class Register extends AppCompatActivity {

    RegisterController registerController;
    EditText name,age,gender,bday,mobile,email,username,pass,retyepass;
    String[] accountinfo;
    Boolean emptyflag;
    CheckBox terms;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        registerController = new RegisterController();
        accountinfo = new String[9];
        terms = (CheckBox)findViewById(R.id.checkboxterms);
    }

    public void buttonclick (View view)
    {
        Intent intent = new Intent(this, SelfAwareness.class);
        setUserInfo();
        if(terms.isChecked())
        {
            startActivity(intent);
        }
        else
        {
            Toast.makeText(this,"Please fill all fields",Toast.LENGTH_SHORT).show();
        }
    }

    public void setUserInfo ()
    {
        name = (EditText)findViewById(R.id.edittextname);
        age = (EditText)findViewById(R.id.edittextage);
        gender = (EditText)findViewById(R.id.edittextgender);
        bday = (EditText)findViewById(R.id.edittextbirthdate);
        mobile = (EditText)findViewById(R.id.edittextmobile);
        email = (EditText)findViewById(R.id.edittextemail);
        username = (EditText)findViewById(R.id.edittextusername);
        pass = (EditText)findViewById(R.id.edittextpassword);
        retyepass = (EditText)findViewById(R.id.edittextretype);

        registerController.setName(name);
        registerController.setAge(age);
        if(gender.getText().toString().equals("m")||gender.getText().toString().equals("f")||gender.getText().toString().equals("F")||gender.getText().toString().equals("M"))
        {
            registerController.setGender(gender);
        }
        else
        {
            Toast.makeText(this,"Please enter F or M Only",Toast.LENGTH_SHORT).show();
        }
        registerController.setBirthdate(bday);
        registerController.setMobile(mobile);
        registerController.setEmail(email);
        registerController.setUsername(username);
        registerController.setPassword(pass);
        registerController.setRetype(retyepass);
        //registerController.setValues();
        //accountinfo = registerController.getValues();

        /*for (int i=0;i<10;i++)
        {
            if(accountinfo[i].isEmpty())
            {
                emptyflag = emptyflag && false;
            }
            else
            {
                emptyflag = emptyflag && true;
            }
        }
        return emptyflag;*/
    }

}
