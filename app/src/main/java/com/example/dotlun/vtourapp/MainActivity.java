package com.example.dotlun.vtourapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Link WebSite
        String url = "http://vr360vn.com/du-an-360/ihome-pham-van-chieu-can-ho-A209M/";
        WebView view =(WebView) this.findViewById(R.id.webView);

        view.getSettings().setJavaScriptEnabled(true);
        view.loadUrl(url);
    }
}
