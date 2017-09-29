package com.example.joxxxx.footscapes;

import android.content.Intent;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class PreTestUI extends AppCompatActivity
{
    int ave=0;
    Boolean flag = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pre_test_ui);
    }

    public void buttonclick (View v)
    {
        Intent gosuggestions = new Intent(this,SelectDestinationUI.class);

        int tot;

        tot = tally();
        if(flag)
        {
            ave = tot/15;
            Toast.makeText(this,"" + ave,Toast.LENGTH_SHORT).show();
            startActivity(gosuggestions);
        }
        else
        {
            Toast.makeText(this,"Please follow instructions.",Toast.LENGTH_SHORT).show();
        }
    }

    public Integer tally()
    {
        EditText e1,e2,e3,e4,e5,e6,e7,e8,e9,e10,e11,e12,e13,e14,e15;
        int total=0;


        e1 = (EditText)findViewById(R.id.et1);
        e2 = (EditText)findViewById(R.id.et2);
        e3 = (EditText)findViewById(R.id.et3);
        e4 = (EditText)findViewById(R.id.et4);
        e5 = (EditText)findViewById(R.id.et5);
        e6 = (EditText)findViewById(R.id.et6);
        e7 = (EditText)findViewById(R.id.et7);
        e8 = (EditText)findViewById(R.id.et8);
        e9 = (EditText)findViewById(R.id.et9);
        e10 = (EditText)findViewById(R.id.et10);
        e11 = (EditText)findViewById(R.id.et11);
        e12 = (EditText)findViewById(R.id.et12);
        e13 = (EditText)findViewById(R.id.et13);
        e14 = (EditText)findViewById(R.id.et14);
        e15 = (EditText)findViewById(R.id.et15);

        if(!e1.getText().toString().isEmpty())
        {
            if(Integer.parseInt(e1.getText().toString()) == 0 || Integer.parseInt(e1.getText().toString()) >= 7)
            {
                flag = flag & false;
            }
            else
            {
                flag = flag & true;
            }
        }
        else
        {
            Toast.makeText(this,"Please fill all fields.",Toast.LENGTH_SHORT).show();
            flag = flag & false;
        }

        if (!e2.getText().toString().isEmpty())
        {
            if(Integer.parseInt(e2.getText().toString()) == 0 || Integer.parseInt(e2.getText().toString()) >= 7)
            {
                flag = flag & false;
            }
            else
            {
                flag = flag & true;
            }
        }
        else
        {
            Toast.makeText(this,"Please fill all fields.",Toast.LENGTH_SHORT).show();
            flag = flag & false;
        }

        if (!e3.getText().toString().isEmpty())
        {
            if(Integer.parseInt(e3.getText().toString()) == 0 || Integer.parseInt(e3.getText().toString()) >= 7)
            {
                flag = flag & false;
            }
            else
            {
                total = total + Integer.parseInt(e3.getText().toString());
                flag = flag & true;
            }
        }
        else
        {
            Toast.makeText(this,"Please fill all fields.",Toast.LENGTH_SHORT).show();
            flag = flag & false;
        }

        if (!e4.getText().toString().isEmpty())
        {
            if(Integer.parseInt(e4.getText().toString()) == 0 || Integer.parseInt(e4.getText().toString()) >= 7)
            {
                flag = flag & false;
            }
            else
            {
                total = total + Integer.parseInt(e4.getText().toString());
                flag = flag & true;
            }
        }
        else
        {
            Toast.makeText(this,"Please fill all fields.",Toast.LENGTH_SHORT).show();
            flag = flag & false;
        }

        if (!e5.getText().toString().isEmpty())
        {
            if(Integer.parseInt(e5.getText().toString()) == 0 || Integer.parseInt(e5.getText().toString()) >= 7)
            {
                flag = flag & false;
            }
            else
            {
                total = total + Integer.parseInt(e5.getText().toString());
                flag = flag & true;
            }
        }
        else
        {
            Toast.makeText(this,"Please fill all fields.",Toast.LENGTH_SHORT).show();
            flag = flag & false;
        }

        if (!e6.getText().toString().isEmpty())
        {
            if(Integer.parseInt(e6.getText().toString()) == 0 || Integer.parseInt(e6.getText().toString()) >= 7)
            {
                flag = flag & false;
            }
            else
            {
                total = total + Integer.parseInt(e6.getText().toString());
                flag = flag & true;
            }
        }
        else
        {
            Toast.makeText(this,"Please fill all fields.",Toast.LENGTH_SHORT).show();
            flag = flag & false;
        }

        if (!e7.getText().toString().isEmpty())
        {
            if(Integer.parseInt(e7.getText().toString()) == 0 || Integer.parseInt(e7.getText().toString()) >= 7)
            {
                flag = flag & false;
            }
            else
            {
                total = total + Integer.parseInt(e7.getText().toString());
                flag = flag & true;
            }
        }
        else
        {
            Toast.makeText(this,"Please fill all fields.",Toast.LENGTH_SHORT).show();
            flag = flag & false;
        }

        if (!e8.getText().toString().isEmpty())
        {
            if(Integer.parseInt(e8.getText().toString()) == 0 || Integer.parseInt(e8.getText().toString()) >= 7)
            {
                flag = flag & false;
            }
            else
            {
                total = total + Integer.parseInt(e8.getText().toString());
                flag = flag & true;
            }
        }
        else
        {
            Toast.makeText(this,"Please fill all fields.",Toast.LENGTH_SHORT).show();
            flag = flag & false;
        }

        if (!e9.getText().toString().isEmpty())
        {
            if(Integer.parseInt(e9.getText().toString()) == 0 || Integer.parseInt(e9.getText().toString()) >= 7)
            {
                flag = flag & false;
            }
            else
            {
                total = total + Integer.parseInt(e9.getText().toString());
                flag = flag & true;
            }
        }
        else
        {
            Toast.makeText(this,"Please fill all fields.",Toast.LENGTH_SHORT).show();
            flag = flag & false;
        }

        if (!e10.getText().toString().isEmpty())
        {
            if(Integer.parseInt(e10.getText().toString()) == 0 || Integer.parseInt(e10.getText().toString()) >= 7)
            {
                flag = flag & false;
            }
            else
            {
                total = total + Integer.parseInt(e10.getText().toString());
                flag = flag & true;
            }
        }
        else
        {
            Toast.makeText(this,"Please fill all fields.",Toast.LENGTH_SHORT).show();
            flag = flag & false;
        }

        if (!e11.getText().toString().isEmpty())
        {
            if(Integer.parseInt(e11.getText().toString()) == 0 || Integer.parseInt(e11.getText().toString()) >= 7)
            {
                flag = flag & false;
            }
            else
            {
                total = total + Integer.parseInt(e11.getText().toString());
                flag = flag & true;
            }
        }
        else
        {
            Toast.makeText(this,"Please fill all fields.",Toast.LENGTH_SHORT).show();
            flag = flag & false;
        }

        if (!e12.getText().toString().isEmpty())
        {
            if(Integer.parseInt(e12.getText().toString()) == 0 || Integer.parseInt(e12.getText().toString()) >= 7)
            {
                flag = flag & false;
            }
            else
            {
                total = total + Integer.parseInt(e12.getText().toString());
                flag = flag & true;
            }
        }
        else
        {
            Toast.makeText(this,"Please fill all fields.",Toast.LENGTH_SHORT).show();
            flag = flag & false;
        }

        if (!e13.getText().toString().isEmpty())
        {
            if(Integer.parseInt(e13.getText().toString()) == 0 || Integer.parseInt(e13.getText().toString()) >= 7)
            {
                flag = flag & false;
            }
            else
            {
                total = total + Integer.parseInt(e13.getText().toString());
                flag = flag & true;
            }
        }
        else
        {
            Toast.makeText(this,"Please fill all fields.",Toast.LENGTH_SHORT).show();
            flag = flag & false;
        }

        if (!e14.getText().toString().isEmpty())
        {
            if(Integer.parseInt(e14.getText().toString()) == 0 || Integer.parseInt(e14.getText().toString()) >= 7)
            {
                flag = flag & false;
            }
            else
            {
                total = total + Integer.parseInt(e14.getText().toString());
                flag = flag & true;
            }
        }
        else
        {
            Toast.makeText(this,"Please fill all fields.",Toast.LENGTH_SHORT).show();
            flag = flag & false;
        }

        if (!e15.getText().toString().isEmpty())
        {
            if(Integer.parseInt(e15.getText().toString()) == 0 || Integer.parseInt(e15.getText().toString()) >= 7)
            {
                flag = flag & false;
            }
            else
            {
                total = total + Integer.parseInt(e15.getText().toString());
                flag = flag & true;
            }
        }
        else
        {
            Toast.makeText(this,"Please fill all fields.",Toast.LENGTH_SHORT).show();
            flag = flag & false;
        }

        return total;
    }
}
