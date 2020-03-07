package com.jegan.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Page2 extends AppCompatActivity
{
    Button b2;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);
        b2=(Button)findViewById(R.id.button2);
        b2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(Page2.this, "go back to main activity...", Toast.LENGTH_SHORT).show();

                Intent mainActivity = new Intent(Page2.this,MainActivity.class);

                startActivity(mainActivity);
            }
        });
    }
}
