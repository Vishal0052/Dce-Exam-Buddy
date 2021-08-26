package com.example.dceexambuddy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class importantLinks extends AppCompatActivity {

    CardView studentPortal;
    CardView books;
    CardView collegeMail;
    CardView collegeResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_important_links);
        studentPortal=findViewById(R.id.studentPortal);
        books=findViewById(R.id.books);
        collegeMail=findViewById(R.id.collegeMail);
        collegeResult=findViewById(R.id.collegeResult);
        getSupportActionBar().setTitle("Useful Sites");

        studentPortal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://student.mdu.ac.in/index";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });

        collegeMail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://mail.ionos.com/#&ref=folder%3Ddefault0%2FINBOX%26language%3Den_US%26locale%3Den_US%26user_id%3D9828";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });

        books.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://drive.google.com/folderview?id=13Erdvvx9QPj9iesCa4ixc6shhzZvBb3k";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });

        collegeResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "http://result.mdurtk.in/postexam/result.aspx";
               Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });
    }
}