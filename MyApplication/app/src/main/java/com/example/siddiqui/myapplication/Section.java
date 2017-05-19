package com.example.siddiqui.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class Section extends AppCompatActivity {

    Button button;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.section);
    }
    public  void  startTwo(View view)
    {
        startActivity(new Intent(this,MainActivity.class));
    }



    public void Click_funcition1(View v)
    {


        Intent i=new Intent(this,JavaPrograming.class);
        startActivity(i);

    }

    public void Click_funcition2(View v)
    {


        Intent i=new Intent(this,atternprogram.class);
        startActivity(i);

    }


    public void Click_funcition3(View v)
    {


        Intent i=new Intent(this,arraystring.class);
        startActivity(i);

    }
    public void Click_funcition4(View v)
    {


        Intent i=new Intent(this,Oops.class);
        startActivity(i);

    }

    public void Click_funcition5(View v)
    {


        Intent i=new Intent(this,Sort.class);
        startActivity(i);

    }

    public void Click_funcition7(View v)
    {


        Intent i=new Intent(this,Jdbc.class);
        startActivity(i);

    }
    public void Click_funcition8(View v)
    {


        Intent i=new Intent(this,Exeption.class);
        startActivity(i);

    }

    public void Click_funcition9(View v)
    {


        Intent i=new Intent(this,Servlet.class);
        startActivity(i);

    }

    public void Click_funcition10(View v)
    {


        Intent i=new Intent(this,Jsp.class);
        startActivity(i);

    }

    public void Click_funcition11(View v)
    {


        Intent i=new Intent(this,Hibernate.class);
        startActivity(i);

    }

    public void Click_funcition12(View v)
    {


        Intent i=new Intent(this,Struts.class);
        startActivity(i);

    }
}
