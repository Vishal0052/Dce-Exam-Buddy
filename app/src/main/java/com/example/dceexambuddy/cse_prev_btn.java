package com.example.dceexambuddy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class cse_prev_btn extends AppCompatActivity {

    AppCompatButton semOne;
    AppCompatButton semTwo;
    AppCompatButton semThree;
    AppCompatButton semFour;
    AppCompatButton semFive;
    AppCompatButton semSix;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cse_prev_btn);
        semOne=findViewById(R.id.semOne);
        semTwo=findViewById(R.id.semTwo);
        semThree=findViewById(R.id.semThree);
        semFour=findViewById(R.id.semFour);
        semFive=findViewById(R.id.semFive);
        semSix=findViewById(R.id.semSix);
        getSupportActionBar().setTitle("Cse Prev Paper");

        semOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(cse_prev_btn.this,csePrevDrive.class);
                intent.putExtra("url","https://drive.google.com/folderview?id=18OfaYdJkp1LiyuF9K1ITLag0TdsoMf_3");
                startActivity(intent);
            }
        });

        semTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(cse_prev_btn.this,csePrevDrive.class);
                intent.putExtra("url","https://drive.google.com/folderview?id=18OinONgL4PFZm0W0lq0lDJ1r3Px4z40r");
                startActivity(intent);
            }
        });
        semThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(cse_prev_btn.this,csePrevDrive.class);
                intent.putExtra("url","https://drive.google.com/folderview?id=1C7j8LDciDEQYl8cxxbkY6BL1jNCx9AM1");
                startActivity(intent);
            }
        });

        semFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(cse_prev_btn.this,csePrevDrive.class);
                intent.putExtra("url","https://drive.google.com/folderview?id=1DwwqrMfcyzYP4ELiibu7DMFTN9MAHmDN");
                startActivity(intent);
            }
        });

        semFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(cse_prev_btn.this,csePrevDrive.class);
                intent.putExtra("url","https://drive.google.com/folderview?id=1EMHwN3oKLORxdHwPuaTlrWOj_nb3ag52");
                startActivity(intent);
            }
        });

        semSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(cse_prev_btn.this,csePrevDrive.class);
                intent.putExtra("url","https://drive.google.com/folderview?id=1EK-hKnZDuArvkf61GDZRCzsEFIXwinTb");
                startActivity(intent);
            }
        });
    }
}