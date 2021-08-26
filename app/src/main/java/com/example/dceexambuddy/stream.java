package com.example.dceexambuddy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class stream extends AppCompatActivity {

    CardView cse_btn;
    CardView mechanical;
    CardView civil;
    CardView EE;
    CardView Ecs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stream);
        cse_btn=findViewById(R.id.cse_btn);
        mechanical=findViewById(R.id.mechanical);
        civil=findViewById(R.id.civil);
        EE=findViewById(R.id.EE);
        Ecs=findViewById(R.id.Ecs);
        getSupportActionBar().setTitle("Syllabus");

        cse_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(stream.this,Computer_btn.class);
                startActivity(intent);
            }
        });
        civil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Available Soon....",Toast.LENGTH_SHORT).show();
            }
        });
        mechanical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(stream.this,Mechanical.class);
                startActivity(intent);
            }
        });
        EE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(stream.this,Elect_Electronics.class);
                startActivity(intent);
            }
        });
        Ecs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(stream.this,ElectComputer.class);
                startActivity(intent);
            }
        });
    }
}