package com.example.dceexambuddy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NavUtils;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

public class csePrevDrive extends AppCompatActivity {

    WebView webView;
    Context context;
    ImageView noInternet;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cse_prev_drive);
        WebView webView = (WebView) findViewById(R.id.webView);
        noInternet=findViewById(R.id.noInternet);
        getSupportActionBar().setTitle("Cse Previous Paper");
        webView.getSettings().setBuiltInZoomControls(true);
        webView.getSettings().setSupportZoom(true);
        webView.getSettings().setJavaScriptEnabled(true);
        String url = getIntent().getExtras().getString("url");
        webView.loadUrl(url);
        webView.setWebViewClient(new WebViewClient());
        if(!isConnected()){
            noInternet.setVisibility(View.VISIBLE);
            Toast.makeText(this,"No Internet... Pls check Internet connection ",Toast.LENGTH_LONG).show();

        }

    }

    @Override
    public void onBackPressed() {
        finish();
        NavUtils.navigateUpFromSameTask(this);
    }


    private boolean isConnected(){
        ConnectivityManager connectivityManager = (ConnectivityManager) getApplicationContext().getSystemService(context.CONNECTIVITY_SERVICE);
        return connectivityManager.getActiveNetworkInfo()!=null&&connectivityManager.getActiveNetworkInfo().isConnectedOrConnecting();
    }
}