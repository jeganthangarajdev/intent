package com.jegan.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        b1=(Button)findViewById(R.id.button3);
        
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Moving to Page2...", Toast.LENGTH_SHORT).show();

                Intent actPage2=new Intent(MainActivity.this,Page2.class);

                startActivity(actPage2);


            }
        });
        
    }
}
