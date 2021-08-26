package com.example.dceexambuddy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class cse_notes_btn extends AppCompatActivity {

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
        getSupportActionBar().setTitle("Cse Notes");

        semOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(cse_notes_btn.this,cseNotesDrive.class);
                intent.putExtra("url","https://drive.google.com/folderview?id=13TGrxgdrg51XDgTDX1rpsPmZ0NEkPVlf");
                startActivity(intent);
            }
        });

        semTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(cse_notes_btn.this,cseNotesDrive.class);
                intent.putExtra("url","https://drive.google.com/folderview?id=14jRbwL1VwcsnT05L6Ukpj5Q8HRWaL7Ql");
                startActivity(intent);
            }
        });

        semThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(cse_notes_btn.this,cseNotesDrive.class);
                intent.putExtra("url","https://drive.google.com/folderview?id=165yvsYqVOeMULN2EicUr_ctixA-TgIsc");
                startActivity(intent);
            }
        });

        semFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(cse_notes_btn.this,cseNotesDrive.class);
                intent.putExtra("url","https://drive.google.com/folderview?id=1687IH8JUA1sZ3X2DmFKyqPzHhtN7Xw-s");
                startActivity(intent);
            }
        });

        semSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(cse_notes_btn.this,cseNotesDrive.class);
                intent.putExtra("url","https://drive.google.com/folderview?id=16Aj1pmRvaIH_L6nAB3DLLEBrwTYbbAdD");
                startActivity(intent);
            }
        });

        semFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(cse_notes_btn.this,"Uploaded Soon....",Toast.LENGTH_SHORT).show();
            }
        });


    }
}