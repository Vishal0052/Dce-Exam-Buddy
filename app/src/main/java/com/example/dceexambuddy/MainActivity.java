package com.example.dceexambuddy;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    CardView SyllabusCard;
    CardView first_home_card;
    CardView second_home_card;
    CardView first_result_card;
    CardView second_result_card;
    CardView previousPaper;
    CardView notesCard;
    CardView usefulSites;
    DrawerLayout drawerLayout;
    ActionBarDrawerToggle toggle;
    NavigationView navigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        drawerLayout=findViewById(R.id.drawerLayout);
        navigationView=findViewById(R.id.navigationView);
        toggle=new ActionBarDrawerToggle(this,drawerLayout,R.string.start,R.string.close);
       drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        navigationView.setNavigationItemSelectedListener(this);

        SyllabusCard=findViewById(R.id.SyllabusCard);
        first_home_card=findViewById(R.id.first_home_card);
        first_result_card=findViewById(R.id.first_result_card);
        second_home_card=findViewById(R.id.second_home_card);
        second_result_card=findViewById(R.id.second_result_card);
        previousPaper=findViewById(R.id.previousPaper);
        notesCard=findViewById(R.id.notesCard);
        usefulSites=findViewById(R.id.usefulSites);

        usefulSites.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,importantLinks.class);
                startActivity(intent);
            }
        });

        SyllabusCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,syllabus_btn.class);
                startActivity(intent);
            }
        });
        first_home_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,firsthome.class);
                startActivity(intent);
            }
        });
        first_result_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,firstResult.class);
                startActivity(intent);
            }
        });
        second_home_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,secondHome.class);
                startActivity(intent);
            }
        });
        second_result_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,secondResult.class);
                startActivity(intent);
            }
        });
        previousPaper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,previous_paper.class);
                startActivity(intent);
            }
        });
        notesCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,notesStream.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        Intent intent;
        drawerLayout.closeDrawer(GravityCompat.START);
        switch (item.getItemId()){

            case R.id.mdHomeMenu :
                intent=new Intent(MainActivity.this,firsthome.class);
                startActivity(intent);
                break;

            case R.id.sites:
                intent=new Intent(MainActivity.this,importantLinks.class);
                startActivity(intent);
                break;
            case R.id.dceResult :
                intent=new Intent(MainActivity.this,secondResult.class);
                startActivity(intent);
                break;
            case R.id.notes:
                intent=new Intent(MainActivity.this,cse_notes_btn.class);
                startActivity(intent);
                break;

            case R.id.Paper:
                intent=new Intent(MainActivity.this,cse_prev_btn.class);
                startActivity(intent);
                break;

            case R.id.feedback:
                intent=new Intent(Intent.ACTION_SEND);
                intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"bhardwajdeveloper76@gmail.com"});
                intent.putExtra(Intent.EXTRA_SUBJECT,"Dce Exam Buddy Feedback");
                intent.putExtra(Intent.EXTRA_TEXT,"Dear Developer,");
                intent.setType("text/plain");
                startActivity(intent);
                break;

                case R.id.mduResult:
                    String url = "http://result.mdurtk.in/postexam/result.aspx";
                    intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                    break;
            case R.id.about:
                intent=new Intent(MainActivity.this,aboutUs.class);
                startActivity(intent);
                break;

            case R.id.share:
                try {
                    intent=new Intent(Intent.ACTION_SEND);
                    intent.setType("text/plain");
                    intent.putExtra(Intent.EXTRA_SUBJECT,"Dce Exam Buddy");
                    intent.putExtra(Intent.EXTRA_TEXT,"https://play.google.com/store/apps/details?id="+getApplicationContext().getPackageName());
                    startActivity(Intent.createChooser(intent,"Share with"));
                }catch (Exception e){
                    Toast.makeText(MainActivity.this,"Unable to share this app",Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.rating:
                Uri uri=Uri.parse("https://play.google.com/store/apps/details?id="+getApplicationContext().getPackageName());
                intent=new Intent(Intent.ACTION_VIEW,uri);
                try {
                    startActivity(intent);
                }catch (Exception e){
                    Toast.makeText(MainActivity.this,"Unable to open this",Toast.LENGTH_SHORT).show();
                }
                break;
        }

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(toggle.onOptionsItemSelected(item))
            return true;
        Intent intent;
        switch (item.getItemId()){

            case R.id.shareOm:
            try {
                intent=new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_SUBJECT,"Dce Exam Buddy");
                intent.putExtra(Intent.EXTRA_TEXT,"https://play.google.com/store/apps/details?id="+getApplicationContext().getPackageName());
                startActivity(Intent.createChooser(intent,"Share with"));
            }catch (Exception e){
                Toast.makeText(MainActivity.this,"Unable to share this app",Toast.LENGTH_SHORT).show();
            }
            break;
            case R.id.aboutOm:
                intent=new Intent(MainActivity.this,aboutUs.class);
                startActivity(intent);
                break;
            case R.id.feedbackOm:
                intent=new Intent(Intent.ACTION_SEND);
                intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"bhardwajdeveloper76@gmail.com"});
                intent.putExtra(Intent.EXTRA_SUBJECT,"Dce Exam Buddy Feedback");
                intent.putExtra(Intent.EXTRA_TEXT,"Dear Developer,");
                intent.setType("text/plain");
                startActivity(intent);
                break;
            case R.id.ratingOm:
                Uri uri=Uri.parse("https://play.google.com/store/apps/details?id="+getApplicationContext().getPackageName());
                intent=new Intent(Intent.ACTION_VIEW,uri);
                try {
                    startActivity(intent);
                }catch (Exception e){
                    Toast.makeText(MainActivity.this,"Unable to open this",Toast.LENGTH_SHORT).show();
                }
                break;

        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.optionmenu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public void onBackPressed() {
        if(drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START);
        }
        else{
            AlertDialog.Builder builder
                    = new AlertDialog
                    .Builder(MainActivity.this);

            builder.setMessage("if you like this app please give us rating ! it really helps.");


            builder.setTitle("Rate This App");
            builder.setCancelable(false);


            builder
                    .setPositiveButton(
                            "Rate now",
                            new DialogInterface
                                    .OnClickListener() {

                                @Override
                                public void onClick(DialogInterface dialog,
                                                    int which)
                                {
                                    Uri uri=Uri.parse("https://play.google.com/store/apps/details?id="+getApplicationContext().getPackageName());
                                    Intent intent=new Intent(Intent.ACTION_VIEW,uri);
                                    try {
                                        startActivity(intent);
                                    }catch (Exception e){
                                        Toast.makeText(MainActivity.this,"Unable to open this",Toast.LENGTH_SHORT).show();
                                    }

                                }
                            });

            builder
                    .setNegativeButton(
                            "Not now",
                            new DialogInterface
                                    .OnClickListener() {

                                @Override
                                public void onClick(DialogInterface dialog,
                                                    int which)
                                {

                                    MainActivity.super.onBackPressed();
                                }
                            });

            AlertDialog alertDialog = builder.create();
            alertDialog.show();
        }

        }
    }
