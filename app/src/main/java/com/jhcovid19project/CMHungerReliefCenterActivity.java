package com.jhcovid19project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;

import com.jhcovid19project.Services.WebViewClientService;

public class CMHungerReliefCenterActivity extends AppCompatActivity {

    private WebView webView;
    private ImageView Back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cmhungerreliefcenter);

        Back = findViewById(R.id.toolbar_icon);
        webView = findViewById(R.id.web_view);
        webView.setWebViewClient(new WebViewClientService(this));
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadData("<iframe src=\"https://www.google.com/maps/d/embed?mid=124Nzwc-DyOAsLE4qMeyxtmQ5mR_yJ9v5\" width=\"640\" height=\"480\"></iframe>","text/html; charset=utf-8", "utf-8");
        Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CMHungerReliefCenterActivity.this, MainActivity.class));
                finish();
            }
        });
        Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }

}