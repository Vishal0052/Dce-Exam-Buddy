package com.example.dceexambuddy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class aboutUs extends AppCompatActivity {

    CardView developer;
    CardView ratingBtn;
    CardView reportBugs;
    ImageView share;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);
        reportBugs=findViewById(R.id.reportBugs);
        developer=findViewById(R.id.developer);
        ratingBtn=findViewById(R.id.ratingBtn);
        share=findViewById(R.id.share);

        reportBugs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_SEND);
                intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"bhardwajdeveloper76@gmail.com"});
                intent.putExtra(Intent.EXTRA_SUBJECT,"Dce Exam Buddy Feedback");
                intent.putExtra(Intent.EXTRA_TEXT,"Dear Developer,");
                intent.setType("text/plain");
                startActivity(intent);
            }
        });
        developer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(aboutUs.this,about_me.class);
                startActivity(intent);
            }
        });
        ratingBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri=Uri.parse("https://play.google.com/store/apps/details?id="+getApplicationContext().getPackageName());
                Intent intent=new Intent(Intent.ACTION_VIEW,uri);
                try {
                    startActivity(intent);
                }catch (Exception e){
                    Toast.makeText(aboutUs.this,"Unable to open this",Toast.LENGTH_SHORT).show();
                }
            }
        });

        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                   Intent intent=new Intent(Intent.ACTION_SEND);
                    intent.setType("text/plain");
                    intent.putExtra(Intent.EXTRA_SUBJECT,"Dce Exam Buddy");
                    intent.putExtra(Intent.EXTRA_TEXT,"https://play.google.com/store/apps/details?id="+getApplicationContext().getPackageName());
                    startActivity(Intent.createChooser(intent,"Share with"));
                }catch (Exception e){
                    Toast.makeText(aboutUs.this,"Unable to share this app",Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}