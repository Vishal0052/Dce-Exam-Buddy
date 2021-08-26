package com.example.dceexambuddy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class syllabus_btn extends AppCompatActivity {

    CardView cardView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_syllabus_btn);
        cardView=findViewById(R.id.cardView);
        getSupportActionBar().setTitle("Syllabus");
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(syllabus_btn.this,stream.class);
                startActivity(intent);
            }
        });

    }
}