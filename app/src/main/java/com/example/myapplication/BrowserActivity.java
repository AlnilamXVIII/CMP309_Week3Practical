package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.Toast;

public class BrowserActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_browser);

        String url = getIntent().getExtras().getString("URL");
        Log.d("Week3Debug", "Extracted URL" + "URL" );

        if(url.isEmpty()){
            Toast.makeText(getApplicationContext(), "No URL provided", Toast.LENGTH_SHORT).show();
        } else {
            //Attach WebChromeClient to WebView and load URL
            WebView webView = findViewById(R.id.webView); //Create webview object and reference id in layout
            webView.setWebChromeClient(new WebChromeClient());
            webView.loadUrl(url);

            //This wont work by itself, you need to create a permission
        }
    }
}