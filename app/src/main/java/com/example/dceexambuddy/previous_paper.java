package com.example.dceexambuddy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class previous_paper extends AppCompatActivity {

    CardView cse_btn;
    CardView mechanical;
    CardView civil;
    CardView EE;
    CardView Ecs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_previous_paper);
        cse_btn=findViewById(R.id.cse_btn);
        mechanical=findViewById(R.id.mechanical);
        civil=findViewById(R.id.civil);
        EE=findViewById(R.id.EE);
        Ecs=findViewById(R.id.Ecs);
        getSupportActionBar().setTitle("Btech Prev Paper");

        cse_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(previous_paper.this,cse_prev_btn.class);
                startActivity(intent);
            }
        });
        civil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Available Soon....",Toast.LENGTH_SHORT).show();
            }
        });
            EE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Available Soon....",Toast.LENGTH_SHORT).show();
            }
        });
        Ecs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Available Soon....",Toast.LENGTH_SHORT).show();
            }
        });
        mechanical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Available Soon....",Toast.LENGTH_SHORT).show();
            }
        });

    }
}