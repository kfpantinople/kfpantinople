package com.example.joxxxx.bucketlisten;

import android.app.Activity;
import android.widget.EditText;

/**
 * Created by Joxxxx on 16/09/2017.
 */

public class RegisterController extends Activity
{
    String[] values;
    String name,age,gender,birthdate,mobile,email,username,password,retype;

    public RegisterController()
    {
        values = new String[9];
        name = new String();
        age = new String();
        gender = new String();
        birthdate = new String();
        mobile = new String();
        email = new String();
        username = new String();
        password = new String();
        retype = new String();
        name.equals("");
        age.equals("");
        gender.equals("");
        birthdate.equals("");
        mobile.equals("");
        email.equals("");
        username.equals("");
        password.equals("");
        retype.equals("");
    }

    public void setName (EditText edittextname){ this.name = edittextname.getText().toString(); }
    public void setAge (EditText edittextage){ this.name = edittextage.getText().toString();}
    public void setGender (EditText edittextgender){ this.gender = edittextgender.getText().toString();}
    public void setBirthdate (EditText edittextbirth){ this.birthdate = edittextbirth.getText().toString();}
    public void setMobile (EditText edittextmobile){ this.mobile = edittextmobile.getText().toString();}
    public void setEmail (EditText edittextemail){ this.email = edittextemail.getText().toString();}
    public void setUsername (EditText edittextusername){ this.username = edittextusername.getText().toString();}
    public void setPassword (EditText edittextpassword){ this.password = edittextpassword.getText().toString();}
    public void setRetype (EditText edittextretype){ this.retype = edittextretype.getText().toString();}
    public void setValues ()
    {
        this.values[0] = getName();
        this.values[1] = getAge();
        this.values[2] = getGender();
        this.values[3] = getBirthdate();
        this.values[4] = getMobile();
        this.values[5] = getEmail();
        this.values[6] = getUsername();
        this.values[7] = getPassword();
        this.values[8] = getRetype();
    }
    public String getName (){return this.name;}
    public String getAge (){return this.age;}
    public String getGender (){ return this.gender;}
    public String getBirthdate (){ return this.birthdate;}
    public String getMobile (){ return this.mobile;}
    public String getEmail(){ return this.email;}
    public String getUsername(){ return this.username;}
    public String getPassword(){return this.password;}
    public String getRetype(){return this.retype;}
    public String[] getValues(){ return this.values;}
}
